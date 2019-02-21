package cn.manchester.blog.account.service;

import cn.manchester.blog.account.domain.User;

import java.util.List;

/**
 * @author ManchesterLee  <a href="mailto:man.chester.lee.cn@gmail.com">Contact me.</a>
 * @version 1.0
 * @since 2019-02-16
 */
public interface UserService {

    void save(User user);

    User get(Long id);

    User getByLoginId(String loginId);

    List<User> listByUsername(String username);

    List<User> listByNickname(String nickname);

}
