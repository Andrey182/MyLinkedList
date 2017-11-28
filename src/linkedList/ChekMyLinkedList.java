package linkedList;

public class ChekMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList<String > list =new MyLinkedList<String>();
        list.addFirst("это первый объект");
        list.addFirst("а нет, теперь этот");
        list.addLast("а это последний");
        System.out.println(list.getFirst());
        System.out.println(list.removeFirst());
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
    }
}
