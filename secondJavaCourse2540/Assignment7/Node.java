package secondJavaCourse2540.Assignment7;

import java.util.Objects;

public class Node<E> {
    private E item;
    private Node<E> next;

    public Node(E item, Node<E> next) {
        this.item = item;
        this.next = next;
    }

    public E getItem() {
        return item;
    }

    public Node<E> getNext() {
        return next;
    }

    @Override
    public String toString() {
        return item.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Node) {
            @SuppressWarnings("unchecked")
            Node<E> temp = (Node<E>) obj;
            return Objects.equals(item, temp);
        }
        return false;
    }
}

