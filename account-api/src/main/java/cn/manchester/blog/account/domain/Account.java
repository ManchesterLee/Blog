package cn.manchester.blog.account.domain;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Date;

/**
 * @author ManchesterLee  <a href="mailto:man.chester.lee.cn@gmail.com">Contact me.</a>
 * @version 1.0
 * @since 2019-02-17
 */
@Data
public class Account {
    private Long id;
    private Long userId;
    private String loginId;
    private String password;
    private Date registerTime;
    private Status status;
    @TableLogic
    private Integer deleted;

    @Getter
    @RequiredArgsConstructor
    public enum Status {
        /**
         *
         */
        NORMAL(0),
        FROZEN(1)
        ;

        @EnumValue
        private final int value;
    }
}
