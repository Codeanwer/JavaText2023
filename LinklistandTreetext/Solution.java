package LinklistandTreetext;

/**
 * @BelongsProject:
 * @BelongsPackage: Linklisttext
 * @Author: CatherineSS
 * @CreateTime: 2022-11-16  10:07
 * @Description: TODO
 * @Version: 1.0
 */

public class Solution {
    //给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
//    public ListNode reverseList(ListNode head) {
//        Stack<ListNode> stack = new Stack<>();
//        //把链表节点全部摘掉放到栈中
//        while (head != null) {
//            stack.push(head);
//            head = head.next;
//        }
//        if (stack.isEmpty())
//            return null;
//        ListNode node = stack.pop();
//        ListNode dummy = node;
//        //栈中的结点全部出栈，然后重新连成一个新的链表
//        while (!stack.isEmpty()) {
//            ListNode tempNode = stack.pop();
//            node.next = tempNode;
//            node = node.next;
//        }
//        //最后一个结点就是反转前的头结点，一定要让他的next
//        //等于空，否则会构成环
//        node.next = null;
//        return dummy;
//    }






}
