import java.util.*;

public class Exercice1 {

    /**
     * Write code to remove duplicates from an unsorted linked list  With a temporary buffer
     **/
    static void removeDupWithBuffer(Node head) {
        Node node = head;
        HashSet<Integer> table = new HashSet<>();
        while (node != null) {
            if(table.contains(node.value)) {
                head.deleteNode(head, node.value);
            } else {
                table.add(node.value);
            }
            node = node.next;
        }
    }
    /**
     * Without a temporary buffer
     **/
    static void removeDup(Node head) {
        Node nodeFirst = head;
        Node nodeLast;
        while (nodeFirst != null) {
            nodeLast = nodeFirst.next;
            while (nodeLast != null) {
                if (nodeFirst.value == nodeLast.value) {
                    head.deleteNode(head, nodeLast.value);
                }
                nodeLast = nodeLast.next;
            }
            nodeFirst = nodeFirst.next;
        }
    }


    public static void main(String[] args) {
        Node Head = new Node(0);
        Head.addNodeTail(Head, 1);
        Head.addNodeTail(Head, 2);
        Head.addNodeTail(Head, 1);
        Head.addNodeTail(Head, 1);
        Head.addNodeTail(Head, 4);
        Head.addNodeTail(Head, 5);
        Head.addNodeTail(Head, 5);
        Head.addNodeTail(Head, 5);
        Head.addNodeTail(Head, 5);
        Head.addNodeTail(Head, 5);
        Head.addNodeTail(Head, 5);

        Head.print();

        removeDupWithBuffer(Head);
        removeDup(Head);

        Head.print();
    }
}

class Node {
    int value;
    Node next;

    public Node (int value) {
        this.value = value;
    }

    public void addNodeTail(Node head, int value) {
        Node node = head;
        while (node.next != null) {
            node = node.next;
        }
        node.next = new Node(value);
    }

    public Node deleteNode (Node head, int value) {
        Node node = head;
        int first = 0;
        if (node == null) return null;
        if (node.value == value) return node.next;
        while (node.next != null) {
            if (node.next.value == value) {
                if (first == 1)
                {
                    node.next = node.next.next;
                    return head;
                }

                first++;
            }
            node = node.next;
        }

        return head;
    }

    public void print() {
        Node node = this;
        while (node != null && node.next != null) {
            System.out.print(" " + node.value + " -> ");
            node = node.next;
        }
        System.out.println(node.value );
    }

}
