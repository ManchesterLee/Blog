package cn.manchester.blog.account.service.impl;

import cn.manchester.blog.account.domain.Account;
import cn.manchester.blog.account.dto.LoginDTO;
import cn.manchester.blog.account.dto.RegisterDTO;
import cn.manchester.blog.account.mapper.AccountMapper;
import cn.manchester.blog.account.service.AccountService;
import cn.manchester.blog.account.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ManchesterLee  <a href="mailto:man.chester.lee.cn@gmail.com">Contact me.</a>
 * @version 1.0
 * @since 2019-02-17
 */
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;
    @Autowired
    private UserService userService;

    @Override
    public void register(RegisterDTO registerDTO) {

    }

    @Override
    public void login(LoginDTO loginDTO) {

    }
}
