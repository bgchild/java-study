package leetcode.enums.demo5;

/**
 * 实现接口
 *
 * @author laok
 * @date 2021/7/29
 */
public enum Color implements Behaviour {
    RED("红色", 1), BLACK("黑色", 2);

    private String name;
    private int index;

    Color(String name, int index) {
        this.name = name;
        this.index = index;
    }

    @Override
    public void print() {
        System.out.println(this.name + "__" + this.index);
    }

    @Override
    public String getInfo() {
        return this.name;
    }
}
