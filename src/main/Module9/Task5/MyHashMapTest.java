package Task5;

public class MyHashMapTest {
    public static void main(String[] args) {
        MyHashMap<Integer, String> myHashMap = new MyHashMap(16);
        myHashMap.put(1, "823");
        myHashMap.put(5464, "Volodymyr");
        myHashMap.put(21, "15");
        myHashMap.put(425, "false");
        myHashMap.put(329, "Black");
        System.out.println(myHashMap.get(21));
        System.out.println(myHashMap.get(425));
        System.out.println(myHashMap.size());
        myHashMap.remove(425);
        System.out.println(myHashMap.get(425));
        myHashMap.clear();
        System.out.println(myHashMap.size());
    }
}
