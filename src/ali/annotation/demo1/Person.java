package ali.annotation.demo1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

/**
 * @author laok
 * @date 2021/7/31
 */
@Data
@ToString
@AllArgsConstructor
public class Person {
    @MyAnno
    private String stra;
    private String strb;
    private String strc;
}
