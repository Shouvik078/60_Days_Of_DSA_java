package Day45;

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int key) {
        data = key;
        next = null;
    }
}

public class QuickSortInLinkedList {
    static Node head;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a1 = sc.nextInt();
        Node head = new Node(a1);
        addToTheLast(head);

        for (int i = 1; i < n; i++) {
            int a = sc.nextInt();
            addToTheLast(new Node(a));
        }

        Solution abc = new Solution();
        Node node = abc.quickSort(head);

        printList(node);
        System.out.println();

        sc.close();
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void addToTheLast(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = node;
        }
    }
}

class Solution {

    public static Node[] partition(Node head) {
        Node pivot = head;
        Node d1 = new Node(-1);
        Node d2 = new Node(-1);
        Node l1 = d1;
        Node l2 = d2;
        Node temp = head;
        while (temp != null) {
            if (temp != pivot) {
                if (temp.data <= pivot.data) {
                    l1.next = temp;
                    l1 = l1.next;
                } else {
                    l2.next = temp;
                    l2 = l2.next;
                }
            }
            temp = temp.next;
        }
        l1.next = null;
        l2.next = null;
        pivot.next = null;
        Node[] arr = { d1.next, pivot, d2.next };
        return arr;
    }

    public static Node quickSort(Node node) {
        // Your code here
        if (node == null || node.next == null) {
            return node;
        }
        Node arr[] = partition(node);
        // arr[0] -> left
        // arr[1] -> pivot
        // arr[2] -> right
        Node hleft = quickSort(arr[0]);
        Node hright = quickSort(arr[2]);
        arr[1].next = hright;
        if (hleft == null) {
            return arr[1];
        }
        Node temp = hleft;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = arr[1];
        return hleft;
    }

}
