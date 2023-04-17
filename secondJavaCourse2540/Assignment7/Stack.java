package secondJavaCourse2540.Assignment7;

public class Stack<E> implements StackInterface<E> {
    private Node<E> top;

    public Stack() {
        top = null;
    }


    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public void popAll() {
        top = null;
    }

    @Override
    public void push(E newItem) {
        top = new Node<>(newItem, top);
    }

    @Override
    public E pop() throws StackException {
        E removed = top.getItem();
        top = top.getNext();
        return removed;
    }

    @Override
    public E peek() throws StackException {
        return top.getItem();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node<E> temp = top;
        while (temp != null) {
            String str = temp.getItem().toString();
            sb.append(temp.getNext() == null ? str : str + ", ");
            temp = temp.getNext();
        }
        sb.append("]");
        return sb.toString();
    }
}
