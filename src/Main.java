/*
 * ${Classname}
 * 
 * Version 1.0 
 * 
 * 14.01.2018
 * 
 * Karpikova
 */
public class Main {
    public static void main(String[] args) {
        boolean looping = Handler.isLooping(createTestNotLooping());
        System.out.println(looping);

        looping = Handler.isLooping(createTestLooping());
        System.out.println(looping);
    }

    private static Node createTestLooping() {
        Node<Integer> q1 = new Node(1, null);
        Node<Integer> q2 = new Node(2, null);
        Node<Integer> q3 = new Node(3, null);
        Node<Integer> q4 = new Node(4, null);
        Node<Integer> q5 = new Node(5, null);
        q1.setNext(q2);
        q2.setNext(q3);
        q3.setNext(q4);
        q4.setNext(q5);
        q5.setNext(q2);
        return q1;
    }

    private static Node createTestNotLooping() {
        Node<Integer> q1 = new Node(1, null);
        Node<Integer> q2 = new Node(2, null);
        Node<Integer> q3 = new Node(3, null);
        Node<Integer> q4 = new Node(4, null);
        Node<Integer> q5 = new Node(5, null);
        q1.setNext(q2);
        q2.setNext(q3);
        q3.setNext(q4);
        q4.setNext(q5);
        q5.setNext(null);
        return q1;
    }
}
