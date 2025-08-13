package com.hmall.user.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.hmall.common.exception.BadRequestException;
import lombok.Getter;

@Getter
public enum UserStatus {
    FROZEN(0, "禁止使用"),
    NORMAL(1, "已激活"),
    ;
/**
 * 枚举值注解
 * 用于标识枚举类型的值字段
 */
    @EnumValue
    int value;

/**
 * 描述信息
 * 用于存储枚举值的描述文本
 */
    String desc;


    UserStatus(Integer value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public static UserStatus of(int value) {
        if (value == 0) {
            return FROZEN;
        }
        if (value == 1) {
            return NORMAL;
        }
        throw new BadRequestException("账户状态错误");
    }
}