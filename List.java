import java.util.Iterator;

public class List implements Iterable<Object> {

    int size = 0;
    private Node first;
    private Node last;

    void addLast(Object data) {
        Node<Object> nextNode = new Node<>(data);
        Node currentNode = first;


        if (first == null) {
            first = nextNode;
            last = nextNode;
        } else {
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = nextNode;
        }
        size += 1;
    }

    void addFirst(Object data) {
        {
            Node<Object> nextNode = new Node<>(data);
            Node currentNode = last;


            if (last == null) {
                first = nextNode;
                last = nextNode;
            } else {
                nextNode.next = first;
                first = nextNode;
            }
        }
        size += 1;
    }



    public int getSize() {
        return size;
    }

    @Override
    public Iterator<Object> iterator() {
        return new Iterator<>() {
            Node<Object> iterNode = first;
            int index = 0;

            @Override
            public boolean hasNext() {
                return index < getSize();
            }

            @Override
            public Object next() {
                Object value = iterNode.getData();
                iterNode = iterNode.next;
                index++;
                return value;
            }
        };
    }
}