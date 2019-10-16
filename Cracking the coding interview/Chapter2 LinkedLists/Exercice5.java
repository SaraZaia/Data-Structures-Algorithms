public class Exercice5 {

    /**
     * Sum Mists: You have two numbers represented by a linked list, where each node contains a single digit.
     * The digits are stored in reverse order, such that the 1's digit is at the head of the list.
     * write a function that adds the two numbers and returns the sums as a linked list.
     * EXAMPLE:
     * Input: (6 -> 1 -> 7) + (5 -> 9 -> 2).That is, 617 + 295.
     * Output: 2 -> 1 -> 9. That is, 912.
     **/
    public static Node sumLists(Node numb1, Node numb2) {
        Node node1 = numb1;
        Node node2 = numb2;
        int valeur;

        Node result = new Node(( node1.value + node2.value ) % 10, null);

        Node node = result.addNodeTail(result, ( node1.value + node2.value )/10 );

        node1 = node1.next;
        node2 = node2.next;

        while (node1 != null || node2 != null) {

            if (node1 != null && node2 != null )
            {
                result.print();
                valeur = (node.value + node1.value + node2.value );
                node.value = valeur % 10 ;
                if ((node1 != null && node1.next != null) || (node2 != null && node2.next != null)  ) {
                    node = result.addNodeTail(result, valeur/10 );
                }
            }

            if (node1 == null && node2 != null ) {
                result.print();
                valeur = (node.value + node2.value );
                node.value = valeur % 10;
                if ((node1 != null && node1.next != null) || (node2 != null && node2.next != null)  ) {
                    node = result.addNodeTail(result, valeur /10 );
                }
            }
            if (node1 != null && node2 == null ) {
                valeur = (node.value + node1.value );
                node.value = valeur % 10 ;
                if ((node1 != null && node1.next != null) || (node2 != null && node2.next != null)  ) {
                    node = result.addNodeTail(result, valeur/10 );
                }
            }

            if (node1 != null )
            {
                node1 = node1.next;
            }
            if (node2 != null )
            {
                node2 = node2.next;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        Node Node1 = new Node(7);
        Node1.addNodeTail(Node1, 1);
        Node1.addNodeTail(Node1, 6);

        Node Node2 = new Node(5);
        Node2.addNodeTail(Node2, 9);
        Node2.addNodeTail(Node2, 2);

        sumLists(Node1, Node2).print();
    }
}
