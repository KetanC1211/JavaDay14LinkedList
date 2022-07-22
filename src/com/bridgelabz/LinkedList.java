package com.bridgelabz;

public class LinkedList {
	private Node head;
    private Node tail;
    private int size;

    // Represent node of singly Linked-List    
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
        //Used for inserting value at particular index.
        public Node(int value, Node next) { 
            this.value = value;
            this.next = next;
        }
    }
    
    //initial size Zero
    public LinkedList() {
        this.size = 0;
    }

    //To print elements in List
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    
    //To add element from head side    
    public void addFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    //Add elements from tail side  
    public void addLast(int val) {
        if (tail == null) {
            addFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    //Adding Value at given index by using insertBetween method    
    public void insertValAtIndex(int val, int index) {
        if (index == 0) {
            addFirst(val);
            return;
        }
        if (index == size) {
            addLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }
    
}
