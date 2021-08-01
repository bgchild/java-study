package ali.annotation.demo2;

import java.lang.annotation.*;

/**
 * 自定义注解
 * @author laok
 * @date 2021/7/31
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface EnableAuth {
    String name() default "赵日天";
}
