package Hard.LinKedArray;

public class MyLinkedList<T> extends MyList<T> {
    private static class Node<T> {
        T data; //data: это поле хранит значение элемента, Тип данных этого поля является обобщенным (T)
        Node<T> next; //next: это поле хранит ссылку на следующий узел в списке

        public Node(T data) {
            this.data = data;

        }
    }

    private Node<T> head; // Ссылка на первый узел списка
    private int size; // Количество элементов в списке


    @Override
    public void add(T element) { //Метод add используется для добавления нового элемента в конец связного списка.
        Node<T> newNote = new Node<>(element); // В начале метода создается новый узел newNote с переданным в него элементом.
        if (head == null) { // Если список пуст (то есть head == null)
            head = newNote; //новый узел устанавливается как голова списка (head = newNote).
        } else {
            Node<T> current = head;
            while (current.next != null) { //Если список не пуст, мы переходим к последнему узлу в списке
                current = current.next; // перемещаясь от головы до последнего узла.
            }
            current.next = newNote; // После этого новый узел добавляется как следующий после последнего узла.
        }
        size++; // В конце метода размер списка увеличивается на единицу, так как мы добавили новый элемент.
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size) {             //В начале метода проверяется, находится ли индекс в допустимом диапазоне (от 0 до size - 1).
            throw new IndexOutOfBoundsException();    // Если индекс находится вне этого диапазона, генерируется исключение IndexOutOfBoundsException.
        }
        Node<T> current = head;                    // Мы начинаем с головы (head) и последовательно переходим к следующим узлам, пока не достигнем узла с нужным индексом.
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;                // Когда мы достигаем узла с заданным индексом, мы возвращаем его значение (data).
    }

    @Override
    public T remove(int index) {
        if (index < 0 || index >= size) {            //В начале метода проверяется, находится ли индекс в допустимом диапазоне (от 0 до size - 1).
            throw new IndexOutOfBoundsException();  // Если индекс находится вне этого диапазона, генерируется исключение IndexOutOfBoundsException.
        }
        T removedData;
        if (index == 0) {                         // Если индекс равен 0 (то есть элемент, который мы хотим удалить, находится в начале списка),
            removedData = head.data;              // мы удаляем первый узел
            head = head.next;                    // сделав следующий узел после головы новой головой.
        } else {                                  // Если индекс не равен 0, мы переходим к узлу перед тем, который нужно удалить.
            Node<T> previous = head;              // Для этого мы итерируемся по списку от головы до узла перед тем, который нужно удалить,
            for (int i = 0; i < index - 1; i++) {  // на 1 меньше, чем индекс элемента, который мы хотим удалить.
                previous = previous.next;
            }
            removedData = previous.next.data;         // Затем мы обновляем ссылку next предыдущего узла, чтобы она указывала на узел, который следует за удаляемым узлом
            previous.next = previous.next.next;        // тем самым исключая его из списка.
        }
        size--;                                  // В конце метода размер списка уменьшается на единицу, так как мы удалили один элемент.
        return removedData;                      // Возвразаем удаленное значение элемента.
    }
}
