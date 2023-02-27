package Day45;

import java.util.*;

class Solution {

    public static Node merge(Node head1, Node head2) {
        Node dummy = new Node(-1);
        Node t = dummy;
        Node t1 = head1;
        Node t2 = head2;
        while (t1 != null && t2 != null) {
            if (t1.data <= t2.data) {
                t.next = t1;
                t = t.next;
                t1 = t1.next;
            } else {
                t.next = t2;
                t = t.next;
                t2 = t2.next;
            }
        }
        if (t1 != null) {
            t.next = t1;
        } else {
            t.next = t2;
        }
        return dummy.next;
    }

    public static Node getMid(Node head) {
        Node fast = head;
        Node slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public static Node mergesort(Node head) {
        // Write your code here
        if (head == null || head.next == null) {
            return head;
        }
        Node mid = getMid(head);
        Node head2 = mid.next;
        Node temp = head;
        mid.next = null;
        Node hLeft = mergesort(head);
        Node hRight = mergesort(head2);
        Node ans = merge(hLeft, hRight);
        return ans;
    }
}

class Node {
    int data;
    Node next = null;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

class LinkedList {
    Node head;

    void add(int data) {
        Node new_node = new Node(data);
        if (head == null) {
            head = new_node;
            return;
        }
        Node curr = head;
        while (curr.next != null)
            curr = curr.next;
        curr.next = new_node;
    }
}

public class mergeSortInLinkedIn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        LinkedList a = new LinkedList();
        for (int i = 0; i < n; i++) {
            a.add(input.nextInt());
        }
        Solution Obj = new Solution();
        a.head = Obj.mergesort(a.head);
        Node h = a.head;
        while (h != null) {
            System.out.print(h.data + " ");
            h = h.next;
        }
    }
}
