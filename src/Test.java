import Collections.*;

public class Test {
    public static void main(String[] args) {
        // MyArrayList
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(2424);
        myArrayList.add(34422414);
        System.out.println("myArrayList = " + myArrayList);
        myArrayList.remove(0);
        System.out.println("myArrayList = " + myArrayList + "\n");
        myArrayList.clear();

        // MyLinkedList
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(2424);
        System.out.println("myLinkedList = " + myLinkedList);
        System.out.println("myLinkedList.get(0) = " + myLinkedList.get(0) + "\n");
        myLinkedList.clear();

        // MyStack
        MyStack myStack = new MyStack();
        myStack.add(403);
        myStack.add(2);
        myStack.add(13);
        myStack.add("fs");
        System.out.println("myStack = " + myStack);
        System.out.println("myStack.pop() = " + myStack.pop());
        System.out.println("myStack = " + myStack);
        System.out.println("myStack.peek() = " + myStack.peek());
        System.out.println("myStack = " + myStack + "\n");

        // MyQueue
        MyQueue myQueue = new MyQueue();
        myQueue.add("fd24f");
        myQueue.add("Dima");
        myQueue.add("jdf");
        myQueue.add("939");
        System.out.println("myQueue = " + myQueue);
        System.out.println("myQueue.poll() = " + myQueue.poll());
        System.out.println("myQueue = " + myQueue);
        System.out.println("myQueue.peek() = " + myQueue.peek() + "\n");


        // MyHashMap
        MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
        myHashMap.put("Junior", 600);
        myHashMap.put("Middle", 2000);
        myHashMap.put("Senior", 3400);
        System.out.println("myHashMap = " + myHashMap);
        System.out.println("myHashMap.get(\"Junior\") = " + myHashMap.get("Junior"));

    }
}
