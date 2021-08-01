package leetcode.enums.demo4;

/**
 * 覆盖枚举的方法
 *
 * @author laok
 * @date 2021/7/29
 */
public enum Color {
    RED("红色", 1), BLACK("黑色", 2);
    private int index;
    private String name;

    Color(String name, int index) {
        this.index = index;
        this.name = name;
    }

    @Override
    public String toString() {
        return this.index + "_" + this.name;
    }
}
