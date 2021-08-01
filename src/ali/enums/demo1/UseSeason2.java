package leetcode.enums.demo1;

/**
 * 枚举案例
 * @author laok
 * @date 2021/7/29
 */
public class UseSeason2 {
    public String getChineseSeason(Season2 season) {
        StringBuffer result = new StringBuffer();
        switch (season) {
            case SPRING:
                result.append("[中文：春天，枚举常量:" + season.name() + "，数据:"
                        + season.getCode() + "]");
                break;
            case AUTUMN:
                result.append("[中文：秋天，枚举常量:" + season.name() + "，数据:"
                        + season.getCode() + "]");
                break;
            case SUMMER:
                result.append("[中文：夏天，枚举常量:" + season.name() + "，数据:"
                        + season.getCode() + "]");
                break;
            case WINTER:
                result.append("[中文：冬天，枚举常量:" + season.name() + "，数据:"
                        + season.getCode() + "]");
                break;
            default:
                result.append("地球没有的季节 " + season.name());
                break;
        }
        return result.toString();
    }

    public void doSomething() {
        for (Season2 s : Season2.values()) {
            //这是正常的场景
            System.out.println(getChineseSeason(s));
        }
        //System.out.println(getChineseSeason(5));
        //此处已经是编译不通过了，这就保证了类型安全
    }

    public static void main(String[] arg) {
        UseSeason2 useSeason = new UseSeason2();
        useSeason.doSomething();
    }
}
