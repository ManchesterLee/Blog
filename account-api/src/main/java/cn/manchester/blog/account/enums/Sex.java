package cn.manchester.blog.account.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.Getter;

/**
 * @author ManchesterLee  <a href="mailto:man.chester.lee.cn@gmail.com">Contact me.</a>
 * @version 1.0
 * @since 2019-02-16
 */
@Getter
public enum Sex {
    /**
     *
     */
    MALE(0),
    /**
     *
     */
    FEMALE(1);

    @EnumValue
    private final int value;

    Sex(int value) {
        this.value = value;
    }

}
