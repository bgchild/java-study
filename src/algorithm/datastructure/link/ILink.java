package algorithm.datastructure.link;

public interface ILink<E> {
    //增加数据
    void add(E e);

    //获取数据个数
    int size();

    //判断集合是否为空
    boolean isEmpty();

    //将集合元素以数组的方式返回
    Object[] toArray();

    //根据索引获取数据
    E get(int index);

    //修改索引数据
    void set(int index, E e);

    //判断是否存在
    boolean contains(E data);

    //数据删除
    void remove(E date);

    //清空数据
    void clean();
}
