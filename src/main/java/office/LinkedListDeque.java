package office;

public class LinkedListDeque<T> {
    private int size;
    private Node<T> sentinel;//hide from the outside
    private Node<T> first;
    private Node<T> last;

    public LinkedListDeque() {
        sentinel = new Node<>();
        size = 0;
    }

    public LinkedListDeque(T element) {
        sentinel = new Node<>();
        setFirstNode(element);
    }

    private void setFirstNode(T element) {
        first = new Node<>(element);
        last = first;
        sentinel.next = first;
        sentinel.prev = last;
        first.prev = sentinel;
        first.next = sentinel;
        size = 1;
    }

    public void addFirst(T item) {
        if (size == 0) {
            setFirstNode(item);
        } else {
            Node node = new Node(item);
            node.prev = sentinel;
            node.next = first;
            sentinel.next = node;
            first.prev = node;
            size ++;
        }
    }

    public void addLast(T item) {
        if (size == 0) {
            setFirstNode(item);
        } else {
            Node node = new Node(item);
            node.prev = last;
            node.next = sentinel;
            sentinel.prev = node;
            last.next = sentinel;
            size ++;
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void printDeque() {

    }

    public T removeFirst() {
        if (size == 0) {
            throw new IllegalArgumentException();
        } else {
            Node oldFirstNode = first;
            Node node = first.next;
            sentinel.next = node;
            node.prev = sentinel;
            if (first == last) {last = first.next;}
            first = first.next;
            size --;
            return (T) oldFirstNode.item;
        }
    }

    public T removeLast() {
        if (size == 0) {
            throw new IllegalArgumentException();
        } else {
            Node oldLastNode = last;
            Node node = last.prev;
            sentinel.prev = node;
            node.next = sentinel;
            if (first == last) {first = last.prev;}
            last = last.prev;
            size --;
            return (T) oldLastNode.item;
        }
    }

    public T get(int index) {
        return null;
    }


}
