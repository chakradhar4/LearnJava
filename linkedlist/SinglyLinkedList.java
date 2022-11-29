package linkedlist;

public class SinglyLinkedList {
    Node head;

    static class Node {
        int val;
        Node next;
        Node(int val) {
            val = this.val;
            next = null;
        }
    }

    // insert the node in linked list at the start
    public void insertFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node node = head;
        newNode.next = head;
        head = newNode;
    }

    // insert at the last of list
    public void insertLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node node = head;
        while (node.next != null) {
            node = node.next;
        }
        node.next = newNode;
    }

    // print the list
    public void printList() {
        Node node = head;
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
        System.out.println();
        System.out.println("end of the list");
    }

    public static void main(String[] args) {
        SinglyLinkedList ll = new SinglyLinkedList();
        ll.insertFirst(78);
        ll.insertLast(34);
        ll.printList();
    }
}
