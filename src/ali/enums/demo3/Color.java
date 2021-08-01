package leetcode.enums.demo3;

/**
 * 向枚举中添加新方法
 * @author laok
 * @date 2021/7/29
 */
public enum Color {
    RED("红色", 1), YELLOW("黄色", 2);
    private int index;
    private String name;

    Color(String name, int index) {
        this.index = index;
        this.name = name;
    }

    /**
     * 普通方法
     *
     * @param index
     * @return
     */
    public static String getName(int index) {
        for (Color c : Color.values()) {
            if (c.getIndex() == index) {
                return c.name;
            }
        }
        return null;
    }

    public int getIndex() {
        return index;
    }

    public String getName() {
        return name;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setName(String name) {
        this.name = name;
    }
}
