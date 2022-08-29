package CommonDSUtility.SingleLinkedList;

public class SingleLinkedList {
    public int data;
    public SingleLinkedList next;

    public SingleLinkedList() {
    }

    public SingleLinkedList(int data) {
        this.data = data;
    }

    public SingleLinkedList(int data, SingleLinkedList next) {
        this.data = data;
        this.next = next;
    }

    @Override
    public String toString() {
        return "[" + data + ", -]--->" + (next == null ? "null" : next.toString());
    }
}