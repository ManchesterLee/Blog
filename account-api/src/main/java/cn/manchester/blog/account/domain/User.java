package cn.manchester.blog.account.domain;

import cn.manchester.blog.account.enums.Sex;
import lombok.Data;

import java.util.Date;

/**
 * @author ManchesterLee  <a href="mailto:man.chester.lee.cn@gmail.com">Contact me.</a>
 * @version 1.0
 * @since 2019-02-16
 */
@Data
public class User {
    private Long id;
    private String username;
    private String nickname;
    private Sex sex;
    private Integer age;
    private Date createTime;
}
