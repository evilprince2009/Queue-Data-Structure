public class Main {
    public static void main(String[] args) {
        int length = 3;
        ArrayQueue customQueue = new ArrayQueue(length);
        customQueue.enque(1);
        customQueue.enque(2);
        customQueue.enque(3);
        System.out.println(customQueue);
        customQueue.deque();
        System.out.println(customQueue.isEmpty());
        System.out.println(customQueue.isFull());
    }
}