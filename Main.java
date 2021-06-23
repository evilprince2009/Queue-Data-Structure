public class Main {
    public static void main(String[] args) {

    // Declearing & populating our queue
        int length = 10;
        ArrayQueue customQueue = new ArrayQueue(length);
        for (int i = 1; i <= length; i++) {
            customQueue.enque(i);
        }
    

        
        
        System.out.println(customQueue);
        System.out.println(customQueue.deque());
        System.out.println(customQueue);
    }
}