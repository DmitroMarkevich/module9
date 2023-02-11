import Collections.*;

public class Test {
    public static void main(String[] args) {
        // MyArrayList
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(3);
        myArrayList.add(233);
        myArrayList.add(53);
        myArrayList.add(317);
        System.out.println("myArrayList = " + myArrayList);
        System.out.println("myArrayList.size() = " + myArrayList.size());
        myArrayList.remove(3);
        System.out.println("myArrayList = " + myArrayList);
        System.out.println("myArrayList.size() = " + myArrayList.size());
        myArrayList.clear();
        System.out.println("myArrayList = " + myArrayList);
        System.out.println("myArrayList.size() = " + myArrayList.size() + "\n");

//        // MyLinkedList
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(2424);
        System.out.println("myLinkedList = " + myLinkedList);
        System.out.println("myLinkedList.get(0) = " + myLinkedList.get(0) + "\n");
        myLinkedList.clear();

//        // MyStack
        MyStack<Integer> myStack = new MyStack<>();
        myStack.push(403);
        myStack.push(2);
        myStack.push(13);
        System.out.println("myStack = " + myStack);
        System.out.println("myStack.pop() = " + myStack.pop());
        System.out.println("myStack = " + myStack);
        System.out.println("myStack.peek() = " + myStack.peek());
        System.out.println("myStack = " + myStack);
        myStack.remove(1);
        System.out.println("myStack removed index elem 1 = " + myStack + "\n");

//        // MyQueue
        MyQueue<String> myQueue = new MyQueue<>();
        myQueue.add("fd24f");
        myQueue.add("Dima");
        myQueue.add("jdf");
        myQueue.add("939");
        System.out.println("myQueue = " + myQueue);
        System.out.println("myQueue.poll() = " + myQueue.poll());
        System.out.println("myQueue = " + myQueue);
        System.out.println("myQueue.peek() = " + myQueue.peek());
        System.out.println("myQueue = " + myQueue + "\n");


//        // MyHashMap
        MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
        myHashMap.put("Junior", 600);
        myHashMap.put("Junior", 6000);
        myHashMap.put("Middle", 2000);
        myHashMap.put("Senior", 3400);
        myHashMap.remove("Junior");
        System.out.println("myHashMap.size() = " + myHashMap.size());
        System.out.println(myHashMap);
    }
}
