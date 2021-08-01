package algorithm.datastructure.hash;


public class ZsHashMap<K, V> {
    //存储头节点的数组
    private Node<K, V>[] nodes;
    //元素个数
    private int size;
    //默认容量
    private static int defaultCapacity = 16;
    //扩展因子
    private static float defaultLoadFactor = 0.75f;

    public ZsHashMap() {
    }

    public ZsHashMap(int capacity, int loadFactor) {
        defaultCapacity = capacity;
        defaultLoadFactor = loadFactor;
    }

    //添加元素
    public V put(K key, V value) {
        //初始化数组
        if (nodes == null) {
            nodes = new Node[defaultCapacity];
        }
        int index = hash(key);//计算存储角标
        //获取到数组角标元素，可视为头结点
        Node<K, V> node = nodes[index];
        //遍历链表中节点对象
        while (node != null) {
            //存在重复key将value替换
            if (node.key.equals(key)) {
                node.value = value;
                return value;
            } else {
                node = node.next;
            }
        }
        //判断是否需要扩展defaultCapacity为数组长度，
        //defaultLoadFactor为扩展因子默认0.74
        if (size >= defaultCapacity * defaultLoadFactor) {
            resize();
        }
        //将新添加的数据作为头结点添加到数组中
        nodes[index] = new Node<>(key, value, nodes[index]);
        size++;
        return value;
    }

    //获取元素
    public V get(K key) {
        //获取角标位置
        int index = hash(key);
        //获取头结点
        Node<K, V> node = nodes[index];
        if (node != null) {
            //遍历链表
            while (node != null && !node.key.equals(key)) {
                node = node.next;
            }
            if (node == null) {
                return null;
            } else {
                return node.value;
            }
        }
        return null;
    }

    //扩展数组
    public void resize() {
        //扩容后要对元素重新put(重新散列)，所以要将size置为0
        size = 0;
        //记录先之前的数组
        Node<K, V>[] oldNodes = nodes;
        defaultCapacity = defaultCapacity * 2;
        nodes = new Node[defaultCapacity];
        //遍历散列表中每个元素
        for (int i = 0; i < oldNodes.length; i++) {
            //扩容后hash值会改变，所以要重新散列
            Node<K, V> node = oldNodes[i];
            while (node != null) {
                Node<K, V> oldNode = node;
                put(node.key, node.value);//重新散列
                node = node.next;//指针往后移
                oldNode.next = null;//将当前散列的节点next置为null
            }
        }
    }

    //hash算法
    public int hash(K key) {
        int code = key.hashCode();
        return code % (defaultCapacity - 1);
    }

    //节点对象
    public class Node<K, V> {
        K key;
        V value;
        Node<K, V> next;

        public Node(K key, V value, Node<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }
}
