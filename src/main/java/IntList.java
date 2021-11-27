public class IntList {
    public int first;
    public IntList rest;

    public IntList(int f, IntList r) {
        first = f;
        rest = r;
    }

    public int size() {
        if (rest == null) {return 1;}
        return 1 + rest.size();
    }

    public int iterativeSize() {
        IntList temp = this.rest;
        int size = 1;
        while (temp != null) {
            size ++;
            temp = temp.rest;
        }
        return size;
    }

    public int get(int i) {
        if (i == 0) {
            return first;
        }
        return  rest.get(i - 1);
    }

    public int iterativeGet(int i) {
        if (i >= size() || i < 0) {
            throw new RuntimeException("index is not correct!");
        }
        IntList temp = this;
        while (i > 0) {
            if (temp != null) {
                temp = temp.rest;
                i--;
            } else {
                throw new RuntimeException("index is not correct!");
            }
        }
        return temp.first;
    }
    public IntList addFirst(int x) {
        return new IntList(x, this);
    }
}
