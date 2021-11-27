public class SLList {
    private IntNode first;

    public SLList(int x) {
        this.first = new IntNode(x, null);
    }
    public void addFirst(int x) {
        this.first = new IntNode(x, first);
    }

    public void addLast(int x) {
        IntNode last = new IntNode(x, null);
        IntNode temp = first;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = last;
    }

    public int getFirst() {
        return this.first.item;
    }

    /*public int size() {
        if (first == null) {return 0;}
        int size = 1;
        while (first.next != null) {
            size++;
        }
        return size;
    }*/

    private int size(IntNode p) {
        if (p.next == null) {
            return 1;
        }
        return 1 + size(p.next);
    }

    public int size() {
        return size(first);
    }

    //An alternate approach is to create a non-static helper method in the IntNode class itself. Either approach is fine, though I personally prefer not having any methods in the IntNode class.
    public int sizeByRecursive() {
        return first.size();
    }



    public static class IntNode {
        public int item;
        public IntNode next;

        public IntNode(int item, IntNode next) {
            this.item = item;
            this.next = next;
        }

        public int size() {
            if (next != null) {
                return 1 + next.size();
            }
            return 1;
        }

    }

}
