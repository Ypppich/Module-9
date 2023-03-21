package Task2;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        System.out.println(myLinkedList.size());
        myLinkedList.add("String");
        myLinkedList.add(3294);
        System.out.println(myLinkedList.size());
        System.out.println(myLinkedList.get(1));
        myLinkedList.add("Black");
        myLinkedList.add(false);
        System.out.println(myLinkedList.size());
        System.out.println(myLinkedList.get(2));
        myLinkedList.remove(2);
        System.out.println(myLinkedList.get(2));
        myLinkedList.clear();
        System.out.println(myLinkedList.size());
        System.out.println(myLinkedList.get(1));
    }
}
