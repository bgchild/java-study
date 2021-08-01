package leetcode.generics.demo2;

/**
 * @author laok
 * @date 2021/7/29
 */
public class NumericValue implements Comparable<NumericValue> {
    private byte value;

    public NumericValue(byte value) {
        this.value = value;
    }

    public byte getValue() {
        return value;
    }

    @Override
    public int compareTo(NumericValue that) {
        return this.value - that.value;
    }
}
