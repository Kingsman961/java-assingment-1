public class CircularLinkedList {

    class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    public Node head = null;
    public Node tail = null;
    public int size = 0;

    public void addNode(int val) {

        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;

        } else {

            tail.next = newNode;
            tail = newNode;
            tail.next = head;

        }
        size += 1;
    }

    // 1) Java program to create and display a Circular Linked List

    public void display() {
        Node cur = head;
        if (head == null) {
            System.out.println("List is empty");
        } else {
            System.out.println("The circular linked list ");
            do {
                System.out.print(" " + cur.val);
                cur = cur.next;
            } while (cur != head);
            System.out.println();
        }
    }

    // 2) Java program to create a Circular Linked List of N nodes and count the
    // number of nodes
    public void count() {
        Node current = head;
        int count = 0;
        do {
            count++;
            current = current.next;
        } while (current != head);
        System.out.println("No. of Nodes in the list is: " + count);
    }

    // 3) Java program to create a Circular Linked List of n nodes and display it in
    // reverse order

    public void reverseprint(Node cur) {

        if (cur.next == head) {
            System.out.print(" " + cur.val);
            return;
        }

        reverseprint(cur.next);
        System.out.print(" " + cur.val);
    }

    // 4) Java program to delete a node from the beginning of the Circular Linked
    // List

    public void deletefirst() {
        if (head == null) {
            return;
        } else {
            if (head != tail) {
                head = head.next;
                tail.next = head;
            } else {
                head = tail = null;
            }
        }
    }

    // 5) Java program to delete a node from the end of the Circular Linked List
    public void deleteEnd() {

        if (head == null) {
            return;
        } else {
            if (head != tail) {
                Node cur = head;
                while (cur.next != tail) {
                    cur = cur.next;
                }
                tail = cur;
                tail.next = head;
            } else {
                head = tail = null;
            }
        }
    }
    // 6) Java program to delete a node from the middle of the Circular Linked List

    public void deleteMid() {
        Node current, temp;
        // Checks whether list is empty
        if (head == null) {
            return;
        } else {

            int count = (size % 2 == 0) ? (size / 2) : ((size + 1) / 2);

            if (head != tail) {

                temp = head;
                current = null;

                for (int i = 0; i < count - 1; i++) {
                    current = temp;
                    temp = temp.next;
                }

                if (current != null) {
                    current.next = temp.next;
                    temp = null;
                }

                else {
                    head = tail = temp.next;
                    tail.next = head;

                    temp = null;
                }
            }

            else {
                head = tail = null;
            }
        }
        size--;
    }
    // 7) Java program to find the maximum and minimum value node from a circular
    // linked list

    public void min() {
        Node cur = head;
        int min = head.val;
        if (head == null) {
            System.out.println("List is empty");
        } else {
            do {
                if (min > cur.val) {
                    min = cur.val;
                }
                cur = cur.next;
            } while (cur != head);
            System.out.println("Minimum value node in the list: " + min);
        }
    }

    public void max() {
        Node cur = head;
        int max = head.val;
        if (head == null) {
            System.out.println("List is empty");
        } else {
            do {

                if (max < cur.val) {
                    max = cur.val;
                }
                cur = cur.next;
            } while (cur != head);

            System.out.println("Maximum value in this list: " + max);
        }
    }

    // 8) Java program to insert a new node at the beginning of the Circular Linked
    // List
    public void addAtFirst(int val) {

        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            Node temp = head;
            newNode.next = temp;
            head = newNode;
            tail.next = head;
        }
    }

    // 9) Java program to insert a new node at the end of the Circular Linked List
    public void addAtLast(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    // 10) Java program to insert a new node at the middle of the Circular Linked
    // List
    public void addinmid(int val) {

        Node New_node = new Node(val);
        if (head == null) {
            head = New_node;
            tail = New_node;
            New_node.next = head;
        }

        else {

            Node temp;
            Node cur;

            int mid = (size % 2);

            if (mid == 0) {
                size = size / 2;
            }

            else {
                size = (size + 1) / 2;
            }

            temp = head;
            cur = null;
            while (size > 0) {
                cur = temp;
                temp = temp.next;
                size -= 1;
            }
            cur.next = New_node;
            New_node.next = temp;
        }

        size++;
    }

    // 11) Java program to remove duplicate elements from a Circular Linked List

    public void removeDuplicate() {

        Node current = head, index = null, temp = null;
        if (head == null) {
            System.out.println("List is empty");
        } else {
            do {

                temp = current;

                index = current.next;
                while (index != head) {

                    if (current.val == index.val) {

                        temp.next = index.next;
                    } else {

                        temp = index;
                    }
                    index = index.next;
                }
                current = current.next;
            } while (current.next != head);
        }
    }

    // 12) Java program to search an element in a Circular Linked List

    public void search(int element) {
        Node current = head;
        int i = 1;
        boolean flag = false;
        if (head == null) {
            System.out.println("List is empty");
        } else {
            do {
                if (current.val == element) {
                    flag = true;
                    break;
                }
                current = current.next;
                i++;
            } while (current != head);
            if (flag)
                System.out.println("Element is at the position " + i);
            else
                System.out.println("Element is not present");
        }
    }

    // 13) Java program to sort the elements of the Circular Linked List
    public void sortList() {
        Node cur = head, index = null;
        int temp;
        if (head == null) {
            System.out.println("List is empty");
        } else {
            do {
                index = cur.next;
                while (index != head) {
                    if (cur.val > index.val) {
                        temp = cur.val;
                        cur.val = index.val;
                        index.val = temp;
                    }
                    index = index.next;
                }
                cur = cur.next;
            } while (cur.next != head);
        }
    }
    public static void main(String[] args) {
        CircularLinkedList ckl = new CircularLinkedList();
        ckl.addNode(6);
        ckl.addNode(5);
        ckl.addNode(7);
        ckl.addNode(2);
        ckl.addNode(5);
        ckl.addNode(9);
        ckl.display();
        ckl.count();
        ckl.deletefirst();
        ckl.deleteMid();
        ckl.deleteEnd();
        ckl.display();
        ckl.addAtFirst(10);
        ckl.addAtLast(20);
        ckl.addinmid(15);
        ckl.display();
        ckl.min();
        ckl.max();
        ckl.sortList();
        ckl.removeDuplicate();
        ckl.display();
        ckl.search(15);
        ckl.reverseprint(ckl.head);
    }
}
