public class SLListWithCacheSize {
    private IntNode first;
    private int size;

    public SLListWithCacheSize() {
        first = null;
        size = 0;
    }

    public SLListWithCacheSize(int x) {
        this.first = new IntNode(x, null);
        size = 1;
    }

    public void addFirst(int x) {
        this.first = new IntNode(x, first);
        size++;
    }

    /*This solution works, but special case code like that shown above should be avoided when necessary.
    Human beings only have so much working memory, and thus we want to keep complexity under control wherever possible.
    For a simple data structure like the SLList, the number of special cases is small. More complicated data structures like trees can get much, much uglier.
    A cleaner, though less obvious solution, is to make it so that all SLLists are the "same", even if they are empty.
    We can do this by creating a special node that is always there, which we will call a sentinel node.
    The sentinel node will hold a value, which we won't care about.*/

    public void addLast(int x) {
        size++;
        IntNode last = new IntNode(x, null);
        if (first == null) {
            first = last;
            size++;
            return;
        }
        IntNode temp = first;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = last;
    }

    public int getFirst() {
        return this.first.item;
    }


    private int size(IntNode p) {
        return size;
    }


    public static class IntNode {
        public int item;
        public IntNode next;

        public IntNode(int item, IntNode next) {
            this.item = item;
            this.next = next;
        }

    }

}
