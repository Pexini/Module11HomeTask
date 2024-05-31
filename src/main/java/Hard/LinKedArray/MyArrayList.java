package Hard.LinKedArray;

public class MyArrayList <T> extends MyList<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private static final int GROWTH_FACTOR = 2;

    private Object[] array;

    public MyArrayList() {
        this.array = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }


    @Override
    public void add(T element) {
        if (size == array.length) {
            Object[] newArray = new Object[array.length * GROWTH_FACTOR]; //Увеличение размера массива в два раза (Если увеличивать массив по одному элементу, каждая вставка потребует O(n)O(n) времени,
            // где nn - текущий размер массива, что делает операции очень дорогими.)
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
        array[size++] = element; // добавдяем элемент
    }

    @Override
    public T get(int index) {
        checkIndex(index);
        return (T) array[index];   //Если индекс находится в допустимом диапазоне, возвращается элемент, хранящийся в массиве array по указанному индексу.
    }  // Поскольку массив может содержать элементы различных типов (объекты типа Object), необходимо выполнить приведение типа элемента к типу T.

    @Override
    public T remove(int index) {
        checkIndex(index);
        T removedElements = (T) array[index]; //  сохраняем значение удаляемого элемента в переменной removedElements.
        System.arraycopy(array, index + 1, array, index, size - index - 1); // используем метод System.arraycopy для копирования элементов массива array в новый массив, пропуская удаленный элемент.
        // метод копирует часть массива, начиная с позиции index + 1 до конца массива, в новую позицию, начиная с позиции index.
        size--;  //  уменьшаем размер списка на единицу.
        return removedElements;
    }

}

