public class Exercice3 {

    /**
     *  Implement an algorithm to delete a node in the middle (Any node but the first and last node, not necessarily the exact middle)
     *  of a singly linked list, given only access to that node
     * */
    static public void deleteMid(Node node) {
        Node flag = node.next;
        node.value = flag.value;
        node.next = flag.next;
    }


    public static void main(String[] args) {
        Node node5 = new Node(55, null);
        Node node4 = new Node(44, node5);
        Node node3 = new Node(33, node4);
        Node node2 = new Node(22, node3);
        Node node1 = new Node(11,node2);
        Node Head = new Node(0, node1);

        Head.print();
        deleteMid(node2);
        Head.print();

    }
}
