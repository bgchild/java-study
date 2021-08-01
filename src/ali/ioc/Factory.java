package ali.ioc;

public class Factory {
    public static Furit getInstance(String className) throws Exception {
        Furit furit;
        try {
            Object o = Class.forName(className).newInstance();
            furit = (Furit) o;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        return furit;
    }
}
