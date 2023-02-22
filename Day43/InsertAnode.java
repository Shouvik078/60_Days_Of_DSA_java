package Day43;

import java.util.*;

class Node {
    int data;
    Node next;

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
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new_node;
    }
}

class Solution {
    static Node insert(Node head, int n, int pos, int val) {
        // Write your code here.

        Node temp = head;
        // basecase // if list is empty
        if (pos == 0) {
            Node x = new Node(val);
            x.next = head;
            return x;
        }
        int count = 1;
        while (count != pos) {
            count++;
            temp = temp.next; // temp indicates pos.next val
        }
        Node y = new Node(val); // val
        y.next = temp.next;
        temp.next = y;
        return head; // bcz for printting from first
    }
}

public class InsertAnode {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList list = new LinkedList();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        int val = sc.nextInt();
        int pos = sc.nextInt();
        Node head = Solution.insert(list.head, n, pos, val);
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        sc.close();
    }
}
