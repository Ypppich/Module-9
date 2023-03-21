package Task4;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack myStack = new MyStack(10);
        myStack.push(300);
        myStack.push("String");
        myStack.peek();
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.size());
        myStack.push("String");
        myStack.push("Black");
        myStack.push(true);
        System.out.println(myStack.peek());
        myStack.clear();
        System.out.println(myStack.peek());
    }
}
