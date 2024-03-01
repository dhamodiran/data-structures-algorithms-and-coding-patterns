package com.coding.datastructures.linkedlists;

public class SinglyLinkedList {

    /**
     *  Node inner class which has
     *  data and next pointer
     *  data -> ptr for next node.
     */
    static class Node {

        int data;
        Node next;

    }

    //Head node  to point the first node
    Node headNode;
    int size;

    SinglyLinkedList(){
        headNode = null;
        size = 0;
    }

    /**
     * Insert node at head position
     * @param data input data
     */
    public void insertAtHead(int data){
       Node newNode = new Node();
       newNode.data = data;
       newNode.next = headNode;
       headNode = newNode;
       size++;
    }

    /**
     * Insert node at end position
     * @param data input data
     */
    public void insertAtEnd(int data){
        // if list is empty use head to insert first node
        if(isEmpty()){
            insertAtHead(data);
            return;
        }

        //create a new node
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        // pointer for last node
        Node last = headNode;
        while (last.next != null){
            last = last.next;
        }
        last.next = newNode;
        size++;
    }

    /**
     * insert the node after the given value
     * @param data input data
     * @param after input data
     */
    public void insertAfter(int data, int after){

        Node currentNode = headNode;
        while(currentNode != null && currentNode.data != after){
            currentNode = currentNode.next;
        }
        if(currentNode != null){
            Node newNode = new Node();
            newNode.data = data;
            newNode.next = currentNode.next;
            currentNode.next = newNode;
        }else{
            System.out.println(after + " data is not found");
        }


    }

    /**
     * Delete node from head position
     * @return Boolean
     */
    public boolean deleteAtHead(){
        if(isEmpty()){
            System.out.println("Delete : List is empty");
            return false;
        }
        Node tempNode = headNode;
        if(tempNode != null){
            headNode = tempNode.next;
            tempNode.next = null;
        }
        return true;
     }

    /**
     * Delete node from end position
     * @return Boolean
     */
     public boolean deleteAtEnd(){
         if(isEmpty()){
             System.out.println("Delete at end : List is empty");
             return false;
         }
         Node currentNode = headNode;
         while(currentNode !=null){
             //currentNode
         }
        return true;
     }

    /**
     * print the list
     */
    public void printList(){
        if(isEmpty()){
            System.out.println("Print : List is empty");
        }
        Node temp = headNode;
        while(temp != null){
            System.out.print("->"+ temp.data);
            temp = temp.next;
        }
        System.out.println(" ");
    }

    /**
     * Check if the list is empty or not
     * @return Boolean
     */
    public Boolean isEmpty(){
        if(headNode == null){
            return true;
        }
        return false;
    }
}
