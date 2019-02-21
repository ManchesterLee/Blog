package cn.manchester.blog.account.controller;

import cn.manchester.blog.account.dto.LoginDTO;
import cn.manchester.blog.account.dto.RegisterDTO;
import cn.manchester.blog.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ManchesterLee  <a href="mailto:man.chester.lee.cn@gmail.com">Contact me.</a>
 * @version 1.0
 * @since 2019-02-17
 */
@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @PostMapping("/registration")
    public ResponseEntity register(@RequestBody RegisterDTO registerDTO) {
        accountService.register(registerDTO);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/login")
    public ResponseEntity login(@RequestBody LoginDTO loginDTO) {
        accountService.login(loginDTO);
        return ResponseEntity.ok().build();
    }

}
