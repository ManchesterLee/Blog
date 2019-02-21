package cn.manchester.blog.account.facade;

import cn.manchester.blog.account.domain.User;
import cn.manchester.blog.account.dto.RegisterDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author ManchesterLee  <a href="mailto:man.chester.lee.cn@gmail.com">Contact me.</a>
 * @version 1.0
 * @since 2019-02-16
 */
@FeignClient(name = "account")
public interface AccountFacade {

    @PostMapping("/account/registration")
    void register(@RequestBody RegisterDTO registerDTO);

    @PostMapping("/account/user")
    void saveUser(@RequestBody User user);

    @GetMapping("/account/user/{id}")
    User getUser(@PathVariable("id") Long id);

    @GetMapping("/account/user")
    User getUserByLoginId(@RequestParam("loginId") String loginId);

    @GetMapping("/account/user")
    List<User> listUsersByUsername(@RequestParam("username") String username);

    @GetMapping("/account/user")
    List<User> listUsersByNickname(@RequestParam("nickname") String nickname);

}
