package Task1;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("String");
        myArrayList.add(700);
        myArrayList.add(true);
        myArrayList.add(7.3);
        System.out.println(myArrayList.size());
        myArrayList.add(12);
        myArrayList.add("point");
        myArrayList.add("text");
        myArrayList.add(5);
        myArrayList.add("shocked");
        myArrayList.add(false);
        myArrayList.add("7.3");
        System.out.println(myArrayList.size());
        System.out.println(myArrayList.get(7));
        myArrayList.remove(7);
        System.out.println(myArrayList.get(7));
        myArrayList.remove(7);
        myArrayList.remove(7);
        myArrayList.remove(7);
        myArrayList.remove(7);
        System.out.println(myArrayList.get(7));
        System.out.println(myArrayList.size());
        myArrayList.clear();
        System.out.println(myArrayList.size());
        System.out.println(myArrayList.get(0));
        myArrayList.add("Roma");
        System.out.println(myArrayList.get(0));
    }

}
