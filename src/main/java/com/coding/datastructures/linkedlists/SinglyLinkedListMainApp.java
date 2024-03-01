package com.coding.datastructures.linkedlists;

public class SinglyLinkedListMainApp {

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtHead(30);
        list.printList();
        list.deleteAtHead();
        list.printList();
        list.deleteAtHead();
        list.deleteAtHead();
        list.deleteAtHead();
        list.printList();

        // Insert at the End

        SinglyLinkedList list2 = new SinglyLinkedList();
        list2.insertAtEnd(100);
        list2.insertAtEnd(300);
        list2.insertAtEnd(200);
        list2.printList();
        list2.insertAfter(400,300);
        list2.printList();
        list2.insertAfter(401,500);
        list2.printList();

    }

}
