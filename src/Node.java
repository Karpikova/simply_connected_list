/*
 * ${Classname}
 * 
 * Version 1.0 
 * 
 * 14.01.2018
 * 
 * Karpikova
 */
public class Node<E> {
    private E item;
    private Node<E> next;

    Node(E element, Node<E> next) {
        this.item = element;
        this.next = next;
    }

    public E getItem() {
        return item;
    }

    public void setItem(E item) {
        this.item = item;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }
}