package cn.tycoding.test;

import java.util.List;

/**
 * @author liuklm
 * @Description 测试注解1
 * @create 2019/9/26 10:59
 */
public @interface Addemo1 {
    String  value() default  "hh";
}