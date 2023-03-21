package Task3;

public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue(4);
        myQueue.add("Simon");
        myQueue.add(700);
        myQueue.add(true);
        myQueue.add(false);
        System.out.println(myQueue.peek());
        System.out.println(myQueue.size());
        System.out.println(myQueue.poll());
        System.out.println(myQueue.poll());
        System.out.println(myQueue.poll());
        System.out.println(myQueue.poll());
        myQueue.add("Julia");
        myQueue.add(298573);
        System.out.println(myQueue.size());
        myQueue.clear();
        System.out.println(myQueue.poll());
    }
}
