public class Exercice4 {

    public static Node partition(Node head, int k) {
        Node HeadLeft = null;
        Node HeadRight = null;
        Node EndLeft = null;
        Node EndRight = null;

        Node node = head;
        while (node != null) {
            if(node.value < k) {
                if ( EndLeft == null) {
                    HeadLeft = node;
                    EndLeft = HeadLeft;
                } else {
                    EndLeft.next = node;
                    EndLeft = node;
                }
            } else if(node.value >= k) {
                if ( EndRight == null) {
                    HeadRight = node;
                    EndRight = HeadRight;
                } else {
                    EndRight.next = node;
                    EndRight = node;
                }
            }
            Node next = node.next;
            node.next = null;
            node = next;

        }
        EndRight.next = null;
        EndLeft.next = HeadRight;
        if (EndLeft == null) return HeadRight;
        return HeadLeft;
    }


    public static void main(String[] args) {
        Node Head = new Node(3);
        Head.addNodeTail(Head, 5);
        Head.addNodeTail(Head, 8);
        Head.addNodeTail(Head, 5);
        Head.addNodeTail(Head, 10);
        Head.addNodeTail(Head, 2);
        Head.addNodeTail(Head, 1);

        Head.print();
        int k = 5;
        Node Result = partition(Head, k);
        Result.print();
    }
}
