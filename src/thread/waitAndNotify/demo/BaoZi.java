package thread.waitAndNotify.demo;

/**
 * @author Ann00
 * @date 2020/8/19
 */

public class BaoZi {
    String pier ;
    String xianer ;
    boolean flag = false ;//包子资源 是否存在 包子资源状态

    public String getPier() {
        return pier;
    }

    public void setPier(String pier) {
        this.pier = pier;
    }

    public String getXianer() {
        return xianer;
    }

    public void setXianer(String xianer) {
        this.xianer = xianer;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
