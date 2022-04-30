package com.coding.fundamentals.datastructures.listbased;

/**
 * Created by davidchains on 10/13/16.
 */
public class LinkedListSimple {

    private static int counter;
    private Node head;

    public LinkedListSimple() {}

    /*
    *
    * Adds a elements
    */
    public void add(Object data){
        // If next head its null - Initialize Node only incase of 1st element
        if (head == null){
            head = new Node(data);
        }
        Node tempNode = new Node(data);
        Node current = head;
        // check for NPE before iterate over current
        if(current != null){
            // starting at the head node, crawl to the end of the list and then add element after last node
            while(current.getNext() != null){
                current = current.getNext();
            }
            // the last node's "next" reference set to our new node
            current.setNext(tempNode);
        }
        //increment number of elements of the variable
        incrementCounter();
    }

    /*
     *
     * returns the element at the specified position in this list.
     */
    public void add(Object data, int index) {
        // create new node with the data obecjt
        Node tempNode = new Node(data);
        // this will be the current node that with point
        Node currentNode = head;
        //Check for null pointer before iterate
        if (currentNode != null){
            // crawl to the requested index or the last element in the list, whichever comes first
            for(int i=0; i < index && currentNode.getNext() != null ; i++){
                currentNode = currentNode.getNext();
            }
        }
        // set the new node's next-node reference to this node's next-node reference
        tempNode.setNext(currentNode.getNext());
        // now set this node's next-node reference to the new node
        currentNode.setNext(tempNode);
        // increment the number of elements variable
        incrementCounter();
    }

    /*
     *
	 * returns the element at the specified position in this list.
     */
    public Object get(int index) {
        // index must be 1 or higher
        if(index < 0){
            return null;
        }
        // initialize on null the current node
        Node currentNode = null;

        if(head != null){
            currentNode = head.getNext();
            for (int i = 0 ; i < index; i++){
                if (currentNode.getNext() == null){
                    return null;
                }
                currentNode = currentNode.getNext();
            }
            return currentNode.getData();
        }
        return currentNode;
    }

    /*
     *
	 * removes the element at the specified position in this list.
     */
    public boolean remove(int index) {
        // if the index is out of range, exit
        if (index < 1 || index > size())
            return false;

        Node currentNode = head;
        if (head != null) {
            for (int i = 0; i < index; i++) {
                if (currentNode.getNext() == null)
                    return false;

                currentNode = currentNode.getNext();
            }
            currentNode.setNext(currentNode.getNext().getNext());
            // decrement the number of elements variable
            decrementCounter();
            return true;
        }
        return false;
    }

    /*
	 *
	 * returns the number of elements in this list.
     */
    public int size() {
        return getCounter();
    }


    private static int getCounter(){
        return counter;
    }

    private static void incrementCounter() {
        counter++;
    }

    private void decrementCounter() {
        counter--;
    }

    public String toString() {
        String output = "";

        if (head != null) {
            Node currentNode = head.getNext();
            while (currentNode != null) {
                output += "[" + currentNode.getData().toString() + "]";
                currentNode = currentNode.getNext();
            }

        }
        return output;
    }
    private class Node {
        // reference to the next node in the chain, or null if there isn't one.
        Node next;
        // data carried by this node. could be of any type you need.
        Object data;
        // Node constructor
        public Node(Object dataValue) {
            next = null;
            data = dataValue;
        }
        // another Node constructor if we want to specify the node to point to.
        @SuppressWarnings("unused")
        public Node(Object dataValue, Node nextValue) {
            next = nextValue;
            data = dataValue;
        }
        // these methods should be self-explanatory
        public Object getData() {
            return data;
        }

        @SuppressWarnings("unused")
        public void setData(Object dataValue) {
            data = dataValue;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node nextValue) {
            next = nextValue;
        }

    }
}
