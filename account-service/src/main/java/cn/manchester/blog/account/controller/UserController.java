package cn.manchester.blog.account.controller;

import cn.manchester.blog.account.domain.User;
import cn.manchester.blog.account.service.UserService;
import cn.manchester.blog.account.validate.UserSaveGroup;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @author ManchesterLee  <a href="mailto:man.chester.lee.cn@gmail.com">Contact me.</a>
 * @version 1.0
 * @since 2019-02-16
 */
@Slf4j
@RestController
@RequestMapping("/account")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public ResponseEntity save(@Validated(UserSaveGroup.class) @RequestBody User user) {
        userService.save(user);
        return ResponseEntity.ok(user.toString());
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<User> get(@PathVariable("id") Long id) {
        return ResponseEntity.ok(userService.get(id));
    }

    @GetMapping("/user")
    public ResponseEntity getByLoginId(@RequestParam(value = "loginId", required = false) String loginId,
                                       @RequestParam(value = "username", required = false) String username,
                                       @RequestParam(value = "nickname", required = false) String nickname) {
        if (loginId != null) {
            return ResponseEntity.ok(userService.getByLoginId(loginId));
        }
        if (username != null) {
            return ResponseEntity.ok(userService.listByUsername(username));
        }
        if (nickname != null) {
            return ResponseEntity.ok(userService.listByNickname(nickname));
        }
        return ResponseEntity.notFound().build();
    }
}
