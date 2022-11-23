import java.util.Stack;

public class LinkedList {
    // Creating a class Node
    class Node {
        public int val;
        Node next;

        Node(int val) {
            this.val = val;
            next = null;
        }
    }

    public Node head = null;
    public Node tail = null;
    public int size = 0;

    public void addNode(int val) {
        Node newnode = new Node(val);

        if (head == null) {
            head = newnode;
            tail = newnode;
            return;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
            tail = newnode;
        }
        size++;
    }

    // 2) Java Program to create and display a singly linked list
    public void printll() {
        if (head == null) {
            System.out.print("List is Empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.print("null\n");
    }

    // 3) Java program to create a singly linked list of n nodes and count the
    // number of nodes
    public void countnodes() {
        int count = 0;
        if (head == null) {
            System.out.println("No. of Nodes: " + count);
        } else {
            Node temp = head;

            while (temp != null) {
                count += 1;
                temp = temp.next;
            }
            System.out.println("No. of nodes: " + count);
        }
    }

    // 4) Java program to create a singly linked list of n nodes and display it in
    // reverse order
    public void reverse(Node head) {
        if (head == null) {
            return;
        }
        reverse(head.next);
        System.out.print(head.val + "->");

    }

    // 5) Java program to delete a node from the beginning of the singly linked list
    public void deletefirst() {
        if (head == null) {
            System.out.println("list is empty");
        } else {
            Node temp = head.next;
            head.next = null;
            head = temp;
            System.out.println("\nDeleting the node successful\n");
        }
    }

    // 6) Java program to delete a node from the middle of the singly linked list
    public void deletemiddle() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
        }
        Node slow = head;
        Node fast = head;
        Node temp = null;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            temp = slow;
            slow = slow.next;

        }
        temp.next = slow.next;

    }

    // 7) Java program to delete a node from the end of the singly linked list
    public void deletelast() {
        if (head == null) {
            System.out.println("list is empty");
        }
        if (head.next == null) {
            head = null;
        } else {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
    }

    // 8) Java program to determine whether a singly linked list is the palindrome
    public boolean isPalindrome(Node head) {
        Node slow = head;
        boolean ispalindrome = true;
        Stack<Integer> stack = new Stack<Integer>();
        while (slow != null) {
            stack.push(slow.val);
            slow = slow.next;
        }

        while (head != null) {

            int i = stack.pop();
            if (head.val == i) {
                ispalindrome = true;
            } else {
                ispalindrome = false;
                break;
            }
            head = head.next;
        }
        return ispalindrome;
    }

    // 9) Java program to find the maximum and minimum value node from a linked list

    public void minimum() {
        Node temp = head;
        int min;

        if (head == null) {
            System.out.println("List is empty");
        }

        min = head.val;
        while (temp != null) {
            if (min > temp.val) {
                min = temp.val;
            }
            temp = temp.next;
        }
        System.out.println("Minimum value of the list is" + min);
    }

    public void maxNode() {
        Node temp = head;
        int maximum;

        if (head == null) {
            System.out.println("List is empty");
        }
        maximum = head.val;
        while (temp != null) {
            if (maximum < temp.val) {
                maximum = temp.val;
            }
            temp = temp.next;
        }
        System.out.println("Maximum value of the list is " + maximum);
    }

    // 10) Java Program to insert a new node at the middle of the singly linked list

    public void addInMid(int val) {

        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            Node temp, current;
            int count = (size % 2 == 0) ? (size / 2) : ((size + 1) / 2);

            temp = head;
            current = null;
            for (int i = 0; i < count; i++) {

                current = temp;
                temp = temp.next;
            }
            current.next = newNode;
            newNode.next = temp;
        }
        size++;
    }

    // 11) Java program to insert a new node at the beginning of the singly linked
    // list
    public void addAtStart(int data) {
        // Creating a new node
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            Node temp = head;
            head = newNode;
            head.next = temp;
        }
    }

    // 12) Java program to insert a new node at the end of the singly linked list

    public void addAtEnd(int data) {
        // Create a new node
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // 13) Java program to remove duplicate elements from a singly linked list

    public void removeDuplicate() {
        Node current = head, index = null, temp = null;
        if (head == null) {
            return;
        } else {
            while (current != null) {
                temp = current;
                index = current.next;
                while (index != null) {
                    if (current.val == index.val) {
                        temp.next = index.next;
                    } else {
                        temp = index;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }

    // 14) Java Program to search an element in a singly linked list
    public void search(int a) {
        if (head == null) {
            System.out.println("List is empty");
        }
        Node temp = head;
        while (temp != null) {
            if (temp.val == a) {
                System.out.println("Element is present");
                break;
            }
            temp = temp.next;

        }
    }
    public static void main(String[] args) {
        LinkedList lk = new LinkedList();
        lk.addNode(5);
        lk.addNode(9);
        lk.addNode(8);
        lk.addNode(6);
        lk.addNode(7);
        lk.addNode(5);
        lk.printll();
        lk.countnodes();
        lk.reverse(lk.head);
        lk.deletefirst();
        lk.deletemiddle();
        lk.deletelast();
        lk.printll();
        lk.isPalindrome(lk.head);
        lk.maxNode();
        lk.minimum();
        lk.addAtStart(10);
        lk.addInMid(15);
        lk.addAtEnd(20);
        lk.removeDuplicate();
        lk.search(15);
        lk.printll();
    }
}
