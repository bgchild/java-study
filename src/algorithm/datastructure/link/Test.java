package algorithm.datastructure.link;

public class Test {
    public static void main(String[] args) {
        ILink<Integer> integerILink = new ILinkImpl<>();
        System.out.println("增加之前：" + integerILink.size() + "、是否为空：" + integerILink.isEmpty());
        integerILink.add(1);
        integerILink.add(2);
        integerILink.add(3);
        System.out.println("增加之后：" + integerILink.size() + "、是否为空：" + integerILink.isEmpty());
        integerILink.remove(3);
        final Integer integer = integerILink.get(1);
        integerILink.set(1, 8);
        final Object[] objects = integerILink.toArray();
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }


    }
}
