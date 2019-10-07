public class Exercice2 {
    /**
     * Return Kth to Last: Implement an algorithm to find the kth to last element of a singly linked list.
     */
    public static int KthLast(Node Head, int k) {
        int l = lengthOf(Head) - k;
        int n = 0;
        while (n <= l) {
            n++;
        }
        return n;
    }

    public static int lengthOf(Node Head) {
        int n = 0;
        Node node = Head;
        while(node.next != null) {
            n++;
            node = node.next;
        }
        return n;
    }

    /**
     * Recursive Solution
     **/
    public static int KthLastRecursiveGlob(Node head, int k) {
        intRef a = new intRef(0, 1);
        KthLastRecursive(head, k, a);
        System.out.println("Recursive Methode + updating index : The "+ k + "th to last element : " + a.result);
        return a.result;
    }

    public static intRef KthLastRecursive(Node head, int k, intRef a) {
        if ( head == null) return null;
        System.out.println("( " + head.value + " ) -> " + a.index );
        KthLastRecursive( head.next, k, a);
        System.out.println("( " + head.value + " ) " + k +"-> " + a.index );
        if (a.index == k) {
            a.result = head.value;
            a.index++;
            System.out.println(a.result);
        } else {
            a.index++;
        }
        return null;
    }


    public static void main(String[] args) {
        Node Head = new Node(0);
        Head.addNodeTail(Head, 1);
        Head.addNodeTail(Head, 2);
        Head.addNodeTail(Head, 3);
        Head.addNodeTail(Head, 4);
        Head.addNodeTail(Head, 5);
        Head.addNodeTail(Head, 6);
        Head.addNodeTail(Head, 7);
        Head.addNodeTail(Head, 8);

        Head.print();
        int k = 2;
        intRef a = new intRef(0, 0);
        KthLastRecursiveGlob(Head, k);
        System.out.println("The "+ k + "th to last element : " +  KthLast(Head,2));
    }

}

 class intRef{
    int result;
    int index;
    intRef(int r, int i) {
        result = r;
        index = i;
    }
}
