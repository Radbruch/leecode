class MyLinkedList {

    class Node {
        int val;
        Node next;
        private Node(){

        }
        private Node(int val){
            this.val = val;
            this.next = null;
        }
        private Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
    }
    Node sentinal;
    Node tail;
    int length = 0;

    public MyLinkedList() {
        sentinal = new Node(0);
        tail = sentinal;
    }

    public int get(int index) {
        if (index >= length) return -1;
        Node pointer = sentinal;
        for (int i = 0; i < index+1; i++) {
            pointer = pointer.next;
        }
        return pointer.val;
    }

    public void addAtHead(int val) {

        Node newNode = new Node(val, sentinal.next);
        sentinal.next = newNode;
        if (tail == sentinal) {
            tail = sentinal.next;
        }
        length+=1;
    }

    public void addAtTail(int val) {
        Node newNode = new Node(val, null);
        tail.next = newNode;
        tail = tail.next;
        length+=1;
    }

    public void addAtIndex(int index, int val) {
        if (index == 0) {addAtHead(val);}
        else if (index == length) {addAtTail(val);}
        else if (index > length) {return;}
        else {
            Node pointer = sentinal;
            for (int i = 0; i < index; i++) {
                pointer = pointer.next;
            }
            Node newNode = new Node(val, pointer.next);
            pointer.next = newNode;
            length+=1;
        }

    }

    public void deleteAtIndex(int index) {
        if (index >= length) {return;}
        else if (index == length - 1) {
            Node pointer = sentinal;
            for (int i = 0; i < index; i++) {
                pointer = pointer.next;
            }
            tail = pointer;
            pointer.next = null;
            length-=1;
        }
        else {
            Node pointer = sentinal;
            for (int i = 0; i < index; i++) {
                pointer = pointer.next;
            }
            pointer.next = pointer.next.next;
            length-=1;
        }

    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
