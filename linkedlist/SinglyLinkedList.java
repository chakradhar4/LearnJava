package linkedlist;

public class SinglyLinkedList {
    static Node head;
    static int size;

    // keep track of the size of list
    public SinglyLinkedList() {
        this.size = 0;
    }

    static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
            size++;
        }
    }

    // insert node at the start of the list
    public void insertFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
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
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // delete the first element
    public void deleteFirst() {
        Node temp = head;
        head = temp.next;
        temp.next = null;
        size--;
    }

    // delete last element
    public void deletLast() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node temp = head.next;
        Node currNode = head;
        while (temp.next != null) {
            temp = temp.next;
            currNode = currNode.next;
        }
        currNode.next = null;
        size--;
    }

    public static int getSize() {
        return size;
    }

    // print the list
    public void printList() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
    }


    //Iterate the list
    
    public static void main(String[] args) {
        SinglyLinkedList ll = new SinglyLinkedList();
        ll.insertFirst(4);
        ll.insertFirst(44);
        ll.insertFirst(33);
        ll.insertFirst(67);
        ll.insertLast(78);
        ll.insertLast(90);
        System.out.println();
        // ll.printList();
        ll.deleteFirst();
        ll.deletLast();
        ll.printList();
        System.out.println(ll.getSize());
    }
}
