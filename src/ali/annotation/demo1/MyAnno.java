package ali.annotation.demo1;

import java.lang.annotation.*;

/**
 * 自定义注解
 *
 * @author laok
 * @date 2021/7/31
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Documented
@Inherited
public @interface MyAnno {
    String value() default "有注解";
}
