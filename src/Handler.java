/*
 * ${Classname}
 * 
 * Version 1.0 
 * 
 * 14.01.2018
 * 
 * Karpikova
 */
public class Handler {
    static boolean isLooping(Node root) {
        Node current = root.getNext();
        boolean result = false;
        while (current != null && !result) {
            result = loopingFound(root, current);
            current = current.getNext();
        }
        return result;
    }

    private static boolean loopingFound(Node root, Node next) {
        Node current = root;
        while (!current.equals(next)) {
            if (current.getNext().equals(next.getNext())) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }
}
