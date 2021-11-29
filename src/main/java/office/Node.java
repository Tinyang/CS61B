package office;

public class Node<T> {
    public T item;
    public Node<T> next;
    public Node<T> prev;

    public Node() {

    }

    public Node(T element) {
        item = element;
    }


}
