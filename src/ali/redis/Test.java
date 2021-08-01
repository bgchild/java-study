package ali.redis;



import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;

public class Test {
    private static int size = 1000000;//预计要插入多少数据

    private static double fpp = 0.01;//期望的误判率

    private static BloomFilter<Integer> bloomFilter = BloomFilter.create(Funnels.integerFunnel(), size, fpp);

    public static void main(String[] args) {
        //插入数据
        for (int i = 0; i < 1000000; i++) {
            bloomFilter.put(i);
        }
        get(1);
        System.out.println(bloomFilter.mightContain(1));
        int count = 0;
        for (int i = 1000000; i < 2000000; i++) {
            if (bloomFilter.mightContain(i)) {
                count++;
                System.out.println(i + "误判了");
            }
        }
        System.out.println("总共的误判数:" + count);
    }

    public static String get(Integer key) {
//        String value = redis.get(key);
        String value = null;
        if (value  == null) {
            // redis中不存在该缓存
            if(!bloomFilter.mightContain(key)){
                //布隆过滤器也没有,直接返回
                return null;
            }else{
                //布隆过滤器中能查到，不代表一定有,查出来放入redis，同样也可以避免缓存穿透
//                value = db.get(key);
//                redis.set(key, value);
            }
        }
        return value;
    }
}
