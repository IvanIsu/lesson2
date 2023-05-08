package lesson2;

public class Main {
    public static void main(String[] args) {

        CustomLinkedList<String> list = new CustomLinkedList<>();

        list.addLast("a");
        list.addLast("b");
        list.addLast("c");
        list.addLast("d");
        list.addLast("e");
        list.addLast("f");
        System.out.println("LL:" + list);
        list.addFirst("12");
        System.out.println("LL:" + list);


        CustomArrayList arrayList = new CustomArrayList();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("d");
        arrayList.add("e");
        arrayList.printArrayList();
        arrayList.delete(2);
        System.out.println();
        arrayList.printArrayList();
        System.out.println();
        arrayList.add(2,"g");
        arrayList.printArrayList();


    }
}
