package newone;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class LinkedList {
    public static void main(String[] args) {
        List<Integer> items = Arrays.asList(10,9,8,7,6,5,4,3,2,1);

        ListNode head = null;
        for (Integer item: items){
            ListNode node = null;
            if(Objects.nonNull(head)){
                node = new ListNode(item, null, head);
                head.setPrevious(node);
            }else{
                node = new ListNode(item);
            }
            head = node;
        }

        printFromLast(head, " - ", true);
        reverterList(head);
    }

    private static void printFromLast(ListNode node, String append, Boolean isHead) {
        if(Objects.nonNull(node)){
            System.out.printf("%s%d\n",append,node.getValue());
            if(isHead){
                printFromLast(node.getNext(),new StringBuilder(append).append(" - ").toString(), isHead);
            }else{
                printFromLast(node.getPrevious(),new StringBuilder(append).append(" - ").toString(), isHead);
            }

        }else{
            System.out.printf("End \n");
        }
    }

    private static void reverterList(ListNode head){
        ListNode current = head;
        ListNode newTail = head;

        ListNode last = null;
        while(current != null){
            ListNode temp = current.getNext();
            current.setNext(current.getPrevious());
            current.setPrevious(temp);

            // Move to the previous node
            newTail = current;
            current = temp; // Move backwards
        }

        printFromLast(newTail, " - ", true);
    }
}
