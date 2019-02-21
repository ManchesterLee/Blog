package cn.manchester.blog.account.service.impl;

import cn.manchester.blog.account.domain.User;
import cn.manchester.blog.account.mapper.UserMapper;
import cn.manchester.blog.account.service.UserService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ManchesterLee  <a href="mailto:man.chester.lee.cn@gmail.com">Contact me.</a>
 * @version 1.0
 * @since 2019-02-16
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public void save(User user) {
        if (log.isInfoEnabled()) {
            log.info("New User: " + user);
        }
        userMapper.insert(user);
    }

    @Override
    public User get(Long id) {
        return userMapper.selectById(id);
    }

    @Override
    public User getByLoginId(String loginId) {
        return userMapper.selectOne(new QueryWrapper<User>().eq("login_id", loginId));
    }

    @Override
    public List<User> listByUsername(String username) {
        return userMapper.selectList(new QueryWrapper<User>().likeRight("username", username));
    }

    @Override
    public List<User> listByNickname(String nickname) {
        return userMapper.selectList(new QueryWrapper<User>().likeRight("nickname", nickname));
    }

}
