package cn.tycoding.test;

import java.util.List;

/**
 * @author liuklm
 * @Description 测试注解1
 * @create 2019/9/26 10:59
 */
public @interface Addemo1 {
    String  value() default  "hh";
    String  value2() default  "hh2";

    String  value3() default  "hh345678";
    
    String  value4() default  "hh345678ahskj";
    String  value6() default  "hh345678ahskjasdasdh";

}
