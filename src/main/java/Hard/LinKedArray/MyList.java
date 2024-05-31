package Hard.LinKedArray;

abstract class MyList <T> {
    protected int size;

    abstract void add(T element);
    abstract T get (int index);
    abstract T remove (int index);

    protected void checkIndex(int index) {
        if (index < 0 || index >= size) {           // В начале метода проверяется, находится ли индекс в допустимом диапазоне (от 0 до size - 1).
            throw new IndexOutOfBoundsException();  // Генерируем иселючение если индекс вне нащего диапазона
        }
    }
}
