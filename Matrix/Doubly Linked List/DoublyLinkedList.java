public class DoublyLinkedList {
    class Node {
        Node next;
        Node prev;
        int val;

        Node(int val) {
            this.val = val;
            next = null;
            prev = null;

        }
    }

    public Node head, tail;

    public int size = 0;

    // 5) Java program to create and display a doubly linked list

    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            head.prev = null;
            tail.next = null;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            tail.next = null;
        }
        size++;
    }

    public void display() {
        Node current = head;
        if (head == null) {
            System.out.println("\nList is empty");
            return;
        }
        System.out.println("\nNodes of doubly linked list: ");
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }

    // 3) Java program to create a doubly linked list of n nodes and count the
    // number of nodes
    public int countNodes() {
        int counter = 0;
        Node current = head;
        while (current != null) {
            counter++;
            current = current.next;
        }
        System.out.println("\nNo. of nodes: " + counter);
        return counter;
    }

    // 4) Java program to create a doubly linked list of n nodes and display it in
    // reverse order
    public void reverse() {
        Node current = head, temp = null;
        while (current != null) {
            temp = current.next;
            current.next = current.prev;
            current.prev = temp;
            current = current.prev;
        }
        temp = head;
        head = tail;
        tail = temp;
    }

    // 6) Java program to delete a new node from the beginning of the doubly linked
    // list
    public void deleteFromStart() {
        if (head == null) {
            return;
        } else {
            if (head != tail) {
                head = head.next;
                head.prev = null;
            }

            else {
                head = tail = null;
            }
        }
    }
    // 7) Java program to delete a new node from the end of the doubly linked list

    public void deleteFromEnd() {

        if (head == null) {
            return;
        } else {
            if (head != tail) {

                tail = tail.prev;
                tail.next = null;
            }

            else {
                head = tail = null;
            }
        }
    }

    // 8) Java program to delete a new node from the middle of the doubly linked
    // list

    void deleteFromMid() {

        if (head == null) {
            return;
        } else {

            Node cur = head;
            int mid = (size % 2 == 0) ? (size / 2) : ((size + 1) / 2);
            for (int i = 1; i < mid; i++) {
                cur = cur.next;
            }
            if (cur == head) {
                head = cur.next;
            } else if (cur == tail) {
                tail = tail.prev;
            } else {
                cur.prev.next = cur.next;
                cur.next.prev = cur.prev;
            }

            cur = null;
        }
        size--;
    }

    // 9) Java program to find the maximum and minimum value node from a doubly
    // linked list
    public int minimumNode() {

        Node cur = head;
        int min;
        if (head == null) {
            System.out.println("\nList is empty");
            return 0;
        } else {

            min = head.val;
            while (cur != null) {

                if (min > cur.val)
                    min = cur.val;
                cur = cur.next;
            }
        }
        return min;
    }

    public int maximumNode() {
        Node current = head;
        int max;
        if (head == null) {
            System.out.println("\nList is empty");
            return 0;
        } else {
            max = head.val;
            while (current != null) {
                if (current.val > max)
                    max = current.val;
                current = current.next;
            }
        }
        return max;
    }

    // 10) Java program to insert a new node at the beginning of the Doubly Linked
    // list
    public void addAtStart(int val) {

        Node newNode = new Node(val);
        if (head == null) {
            head = tail = newNode;
            head.prev = null;
            tail.next = null;
        }

        else {
            head.prev = newNode;
            newNode.next = head;
            newNode.prev = null;
            head = newNode;
        }
    }

    // 11) Java program to insert a new node at the end of the Doubly Linked List
    public void addAtEnd(int val) {

        Node newNode = new Node(val);
        if (head == null) {

            head = tail = newNode;
            head.prev = null;
            tail.next = null;
        }

        else {

            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            tail.next = null;
        }
    }

    // 12) Java program to insert a new node at the middle of the Doubly Linked List
    public void addInMid(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            head.prev = null;
            tail.next = null;
        } else {

            Node current = head, temp = null;
            int mid = (size % 2 == 0) ? (size / 2) : ((size + 1) / 2);

            for (int i = 1; i < mid; i++) {
                current = current.next;
            }

            temp = current.next;
            temp.prev = current;
            current.next = newNode;
            newNode.prev = current;
            newNode.next = temp;
            temp.prev = newNode;
        }
        size++;
    }

    // 13) Java program to remove duplicate elements from a Doubly Linked List
    public void removeDuplicateNode() {
        Node current, index;

        if (head == null) {
            return;
        } else {
            for (current = head; current != null; current = current.next) {
                for (index = current.next; index != null; index = index.next) {
                    if (current.val == index.val) {
                        index.prev.next = index.next;
                        if (index.next != null)
                            index.next.prev = index.prev;
                    }
                }
            }
        }
    }

    // 14) Java program to rotate doubly linked list by N nodes
    public void rotate(int n) {
        if (n == 0)
            return;

        Node current = head;

        int count = 1;
        while (count < n && current != null) {
            current = current.next;
            count++;
        }

        if (current == null) {
            return;
        }
        Node NthNode = current;

        while (current.next != null)
            current = current.next;

        current.next = head;
        (head).prev = current;

        head = NthNode.next;

        (head).prev = null;
        NthNode.next = null;
    }

    // 15) Java program to search an element in a doubly linked list
    public void searchNode(int value) {
        int i = 1;
        boolean flag = false;

        Node current = head;
        if (head == null) {
            System.out.println("\nList is empty");
            return;
        }
        while (current != null) {
            if (current.val == value) {
                flag = true;
                break;
            }
            current = current.next;
            i++;
        }
        if (flag)
            System.out.println("\nNode is at the position " + i);
        else
            System.out.println("\nNode is not present in the list");
    }

    // 16) Java program to sort the elements of the doubly linked list
    public void sortList() {
        Node current = null, index = null;
        int temp;
        if (head == null) {
            return;
        } else {
            for (current = head; current.next != null; current = current.next) {
                for (index = current.next; index != null; index = index.next) {
                    if (current.val > index.val) {
                        temp = current.val;
                        current.val = index.val;
                        index.val = temp;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.addNode(6);
        dll.addNode(9);
        dll.addNode(5);
        dll.addNode(6);
        dll.addNode(11);
        dll.addNode(4);
        dll.display();
        dll.countNodes();
        dll.reverse();
        dll.display();
        dll.deleteFromStart();
        dll.deleteFromMid();
        dll.deleteFromEnd();
        dll.display();
        dll.addAtStart(10);
        dll.addInMid(15);
        dll.addAtEnd(20);
        dll.display();
        dll.maximumNode();
        dll.minimumNode();
        dll.searchNode(15);
        dll.sortList();
        dll.removeDuplicateNode();
        dll.rotate(5);
        dll.display();
    }
}
