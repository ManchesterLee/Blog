package cn.manchester.blog.account.service;

import cn.manchester.blog.account.dto.LoginDTO;
import cn.manchester.blog.account.dto.RegisterDTO;

/**
 * @author ManchesterLee  <a href="mailto:man.chester.lee.cn@gmail.com">Contact me.</a>
 * @version 1.0
 * @since 2019-02-17
 */
public interface AccountService {

    void register(RegisterDTO registerDTO);

    void login(LoginDTO loginDTO);

}
