package Hard.LinKedArray;

public class MyArrayList implements MyList<T> {
    private Object[] array;
    private int size;

    public MyArrayList(Object[] array, int size) {
        this.array = array;
        this.size = size;
    }

    @Override
    public void add(T element) {
        if (size == array.length) {
            Object[] newArray = new Object[array.length * 2]; //Увеличение размера массива в два раза (Если увеличивать массив по одному элементу, каждая вставка потребует O(n)O(n) времени,
            // где nn - текущий размер массива, что делает операции очень дорогими.)
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
        array[size++] = element;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        return (T) array[index];
    }

    @Override
    public T remove(int index) {
        if (index <0 || index >= size){
            throw  new IndexOutOfBoundsException();
        }
        T removedElements = (T) array[index];
        System.arraycopy(array, index, - 1, array, index, size - index - 1);
        size --;
        return removedElements;
    }
}

