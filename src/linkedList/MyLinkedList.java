package linkedList;

public class MyLinkedList<E> {
    private Node<E> firstNode;
    private Node<E> lastNode;
    private boolean isFirstInit = true;

    public void addLast(E object) {
        if (isFirstInit) {
            firstInitial(object);
            return;
        }

        Node<E> newLastNode = new Node<E>();
        newLastNode.object = object;
        newLastNode.priviousNode = this.lastNode;
        this.lastNode.nextNode = newLastNode;
        this.lastNode = newLastNode;
    }


    public void addFirst(E object) {
        if (isFirstInit) {
            firstInitial(object);
            return;
        }
        Node<E> newFirstNode = new Node<E>();
        newFirstNode.object = object;
        newFirstNode.nextNode = this.firstNode;
        this.firstNode.priviousNode = newFirstNode;
        this.firstNode = newFirstNode;
    }

    public E removeFirst() {
        if (this.firstNode == null) return null;
        Node<E> node = this.firstNode;
        if (this.lastNode == this.firstNode) {
            this.firstNode = this.lastNode = null;
            isFirstInit = true;
        } else {
            this.firstNode = this.firstNode.nextNode;
            this.firstNode.priviousNode = null;
        }

        return node.object;
    }

    public E removeLast() {
        if (this.lastNode == null) return null;
        Node<E> node = this.lastNode;
        if (this.lastNode == this.firstNode) {
            this.lastNode = this.firstNode = null;
            isFirstInit = true;
        }
        this.lastNode = this.lastNode.priviousNode;
        this.lastNode.nextNode = null;

        return node.object;
    }

    public E getLast() {
        return this.lastNode.object;
    }

    public E getFirst() {
        return this.firstNode.object;
    }

    private void firstInitial(E object) {
        if (firstNode == null) {
            firstNode = lastNode = new Node<E>();
            lastNode.object = object;
        }
        isFirstInit = false;
    }

    private class Node<E> {
        public Node nextNode;
        public Node priviousNode;
        public E object;

    }
}

