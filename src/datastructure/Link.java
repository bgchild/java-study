package datastructure;

import jdk.nashorn.internal.runtime.regexp.joni.ast.StringNode;
import org.w3c.dom.Node;

import java.util.LinkedList;

public class Link {

    private static class Node<E> {
        E item;
        Link.Node<E> next;

        public Node(E item) {
            this.item = item;
        }

        Node(E element, Link.Node<E> next) {
            this.item = element;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        Node<String> stringNode = new Node<>("1");
        Node<String> stringNode1 = new Node<>("2", stringNode);
        System.out.println(stringNode1.next.item);
    }
}
