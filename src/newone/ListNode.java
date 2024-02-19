package newone;

public class ListNode {
    private Integer value;
    private ListNode previous;
    private  ListNode next;

    public ListNode(Integer value, ListNode previous, ListNode next){
        this.value = value;
        this.previous = previous;
        this.next = next;
    }

    public ListNode(Integer value){
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public ListNode getNext() {
        return next;
    }

    public ListNode getPrevious() {
        return previous;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public void setPrevious(ListNode previous) {
        this.previous = previous;
    }
}
