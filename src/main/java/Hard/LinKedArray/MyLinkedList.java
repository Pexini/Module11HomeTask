package Hard.LinKedArray;

public class MyLinkedList<T> extends MyList<T> {
    private static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;

        }
    }

    private Node<T> head;
    private int size;


    @Override
    public void add(T element) {
        Node<T> newNote = new Node<>(element);
        if (head == null) {
            head = newNote;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNote;
        }
        size++;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    @Override
    public T remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        T removedData;
        if (index == 0) {
            removedData = head.data;
            head = head.next;
        } else {
            Node<T> previous = head;
            for (int i = 0; i < index -1; i++) {
                previous = previous.next;
            }
            removedData = previous.next.data;
            previous.next = previous.next.next;
        }
        size--;
        return removedData;
    }
}
