public class LLlist01 {
    public static class Node {
        int data;
        Node next = null;

        public Node(int x , Node y  ){
            this.data = x;
            this.next = y;

        }    
    }
    public static void main(String[] args) {

      // Start from the tail
        Node c = new Node(47, null); // last node points to null
        Node b = new Node(34, c);
        Node a = new Node(12, b);

        System.out.println(a.data);
        System.out.println(b.data);
        System.out.println(c.data);
        
    }
}
