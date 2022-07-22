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

    
}
