package algorithm.datastructure.link;


class ILinkImpl<E> implements ILink<E> {
    class Node {
        private E data;
        private Node next;

        public Node(E data) {
            this.data = data;
        }

        void addNode(Node node) {
            if (this.next == null) {
                this.next = node;
            } else {
                this.next.addNode(node);
            }
        }

        void toArray() {
            ILinkImpl.this.arrRes[ILinkImpl.this.index++] = this.data;
            if (this.next != null) {
                this.next.toArray();
            }
        }

        E getNode(int index) {
            if (ILinkImpl.this.index++ == index) {
                return this.data;
            } else {
                return this.next.getNode(index);
            }
        }

        boolean contains(E e) {
            if (this.data == e) {
                return true;
            } else {
                return this.next.contains(e);
            }
        }

        public void removeNode(Node PrvNode, E e) {
            if (this.data.equals(e)) {
                PrvNode.next = this.next;
                ILinkImpl.this.count--;
            } else {
                if (this.next != null) {
                    this.next.removeNode(this, e);
                }
            }
        }

        public void setNode(int index, E e) {
            if (index == ILinkImpl.this.index++) {
                this.data = e;
            } else {
                this.next.setNode(index, e);
            }
        }
    }

    private Node root;
    private int count;
    private int index;
    private Object[] arrRes;

    @Override
    public void add(E e) {
        if (e == null) {
            return;
        }
        final Node node = new Node(e);
        if (this.root == null) {
            this.root = node;
        } else {
            this.root.addNode(node);
        }
        this.count++;
    }

    @Override
    public int size() {
        return this.count;
    }

    @Override
    public boolean isEmpty() {
        return this.count == 0;
    }

    @Override
    public Object[] toArray() {
        if (this.root == null) {
            return null;
        }
        this.arrRes = new Object[this.count];
        this.index = 0;
        //设置数据值
        this.root.toArray();
        return this.arrRes;
    }

    @Override
    public E get(int index) {
        if (index >= this.count) {
            return null;
        }
        this.index = 0;
        return this.root.getNode(index);
    }

    @Override
    public void set(int index, E e) {
        if (index >= this.count) {
            return;
        }
        this.index = 0;
        this.root.setNode(index, e);
    }

    @Override
    public boolean contains(E data) {
        if (data == null) {
            return false;
        }
        return this.root.contains(data);
    }

    @Override
    public void remove(E date) {
        if (date == null) {
            return;
        }
        if (this.root.data.equals(date)) {
            this.root = this.root.next;
            this.count--;
        } else {
            this.root.removeNode(this.root, date);
        }
    }

    @Override
    public void clean() {
        this.root = null;
        this.count = 0;
    }
}
