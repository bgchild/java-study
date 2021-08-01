package leetcode.enums.demo1;

/**
 * @author laok
 * @date 2021/7/29
 */
public enum Season2 {
    SPRING(1), SUMMER(2), AUTUMN(3), WINTER(4);

    private int code;

    Season2(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
