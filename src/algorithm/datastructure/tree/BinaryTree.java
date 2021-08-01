package algorithm.datastructure.tree;

class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        return this.age - o.age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

/**
 * 二叉树
 *
 * @author laok
 */
public class BinaryTree<T extends Comparable<T>> {
    class Node {
        private Node parent;
        private Node left;
        private Node right;
        private Comparable<T> data;

        public Node(Comparable<T> data) {
            this.data = data;
        }

        private void addNode(Node newNode) {
            if (newNode.data.compareTo((T) this.data) > 0) {
                if (this.right == null) {
                    this.parent = this;
                    this.right = newNode;
                } else {
                    this.right.addNode(newNode);
                }
            } else {
                if (this.left == null) {
                    this.left = newNode;
                    this.parent = this;
                } else {
                    this.left.addNode(newNode);
                }
            }
        }

        public void toArrNode() {
            if (this.left != null) {
                this.left.toArrNode();
            }
            BinaryTree.this.resArr[BinaryTree.this.foot++] = this.data;
            if (this.right != null) {
                this.right.toArrNode();
            }
        }

        public Node getRemoveNode(Comparable<T> newNode) {
            if (newNode.compareTo((T) this.data) == 0) {
                return this;
            } else if (newNode.compareTo((T) this.data) < 0) {
                if (this.left != null) {
                    return this.left.getRemoveNode(newNode);
                } else {
                    return null;
                }
            } else {
                if (this.right != null) {
                    return this.right.getRemoveNode(newNode);
                } else {
                    return null;
                }
            }
        }
    }

    //根节点
    private Node root;
    //节点数量
    private int count;
    //转换数组
    private Object[] resArr;
    //数组角标
    private int foot;

    //添加节点
    public void add(Comparable<T> newNode) {
        Node node = new Node(newNode);
        if (this.root == null) {
            this.root = node;
        } else {
            //处理添加逻辑（按照二叉树的数据特征）
            this.root.addNode(node);
        }
        count++;
    }

    //转换成数组展示
    public Object[] toArr() {
        if (count <= 0) {
            return null;
        }
        this.foot = 0;
        this.resArr = new Object[this.count];
        this.root.toArrNode();
        return this.resArr;
    }

    public void remove(Comparable<T> date) {
        //根节点
        if (this.root == null) {
            return;
        } else {
            if (this.root.data.compareTo((T) date) == 0) {
//                Node moveNode = this.root.right;
//                while (moveNode.left!=null){
//                    moveNode = moveNode.left;
//                }
//                moveNode.left = this.root.left;
//                moveNode.right = this.root.right;
//                moveNode.parent.left = null;
//               this.root = moveNode;
            } else {
                Node reMoveNode = this.root.getRemoveNode(date);
                if (reMoveNode != null) {
                    //没有子节点的情况
                    if (reMoveNode.left == null && reMoveNode.right == null) {
                        //父节点直接断开引用
                        reMoveNode.parent = null;
                    } else if (reMoveNode.left != null && reMoveNode.right == null) {
                        reMoveNode.parent.left = reMoveNode.left;
                        reMoveNode.left.parent = reMoveNode.parent;
                    } else if (reMoveNode.left == null && reMoveNode.right != null) {
                        reMoveNode.parent.left = reMoveNode.right;
                        reMoveNode.right.parent = reMoveNode.parent;
                    } else {
                        Node moveNode = reMoveNode.right;
                        while (moveNode.left != null) {
                            moveNode = moveNode.left;
                        }
                        reMoveNode.parent.left = moveNode;
                        moveNode.parent.left = null; // 断开原本连接
                        moveNode.parent = reMoveNode.parent;
                        moveNode.right = reMoveNode.right;
                        moveNode.left = reMoveNode.left;
                    }
                }
            }
           // count--;
        }
    }

    public static void main(String[] args) {
        final Person xmm = new Person("小秘密", 18);
        final Person xcc = new Person("小成成", 6);
        final Person xyy = new Person("小月月", 16);
        final Person xxx = new Person("小小", 13);
        final Person dd = new Person("大苏打", 12);
        final BinaryTree<Person> tBinaryTree = new BinaryTree<>();
        tBinaryTree.add(xmm);
        tBinaryTree.add(xcc);
        tBinaryTree.add(xyy);
        tBinaryTree.add(xxx);
        tBinaryTree.add(dd);
        tBinaryTree.remove(dd);
        final Object[] objects = tBinaryTree.toArr();
        for (Object object : objects) {
            System.out.println(object.toString());
        }
    }
}
