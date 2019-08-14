package io.firecode;

/**
 * Given a circular linked list, implement a method to delete its head node. Return the list's new head node.
 *
 * *x = indicates head node
 * 1->2->3->4->*1 ==> 2->3->4->*2
 */
public class DeleteHeadCircular {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = head;

        deleteAtHead(head);
        System.out.println(head);
    }

    public static ListNode deleteAtHead(ListNode head) {
        if (head == null || head.next == null || head == head.next) return null;

        ListNode element = head;

        while (element.next != head) {
            element = element.next;
        }
        element.next = head.next;
        head.next = null;
        head = element.next;

        return head;
    }

    private static class ListNode {
        int data;
        ListNode next;
        ListNode(int data) { this.data = data; }
    }
}
