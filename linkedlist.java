import java.util.*;
class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
        next = null;
    }
}
public class linkedlist {
     ListNode reverseList(ListNode head){
        ListNode curr = head;
        ListNode prev =  null;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ListNode head = new ListNode(sc.nextInt());
        ListNode curr = head;
        for(int i = 1; i < n; i++){
            curr.next = new ListNode(sc.nextInt());
            curr = curr.next;
        }
        linkedlist list = new linkedlist();
        ListNode reverseList = list.reverseList(head);
        printlist(reverseList);
        sc.close();



    }
    static void printlist(ListNode head) {
        ListNode curr = head;
        while(curr != null){
            System.out.print(curr.val+" ");
            curr = curr.next;
        }
        System.out.println();
    }
}
