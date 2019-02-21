package cn.manchester.blog.account.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author ManchesterLee  <a href="mailto:man.chester.lee.cn@gmail.com">Contact me.</a>
 * @version 1.0
 * @since 2019-02-17
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserServiceTest {
    @Autowired
    private UserService userService;

    @Test
    @Rollback
    public void save() {

    }

    @Test
    public void get() {
        Assert.assertNotNull(userService.get(1096964920321318914L));
    }

    @Test
    public void getByLoginId() {
        Assert.assertNotNull(userService.getByLoginId("test"));
    }

    @Test
    public void listByUsername() {
        Assert.assertFalse(userService.listByUsername("haha").isEmpty());
    }

    @Test
    public void listByNickname() {
        Assert.assertFalse(userService.listByNickname("nickname").isEmpty());
    }
}