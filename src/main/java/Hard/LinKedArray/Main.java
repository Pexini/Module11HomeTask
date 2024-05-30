package Hard.LinKedArray;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> arrayList = new MyArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        System.out.println(arrayList.get(2));
        System.out.println(arrayList.remove(2));
        System.out.println(arrayList.get(2));

        System.out.println("-------------------------");

        MyList<Integer> linkedList = new MyLinkedList<>();
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(7);
        linkedList.add(8);
        System.out.println(linkedList.get(2));
        System.out.println(linkedList.remove(2));
        System.out.println(linkedList.get(2));

    }
}
