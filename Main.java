public class Main {
    public static void main(String[] args) {

    // Declearing & populating our queue
        int length = 10;
        ArrayQueue customQueue = new ArrayQueue(length);

    // peek() can be tested by taking out and putting back this for loop    
        for (int i = 1; i <= length; i++) {
            customQueue.enque(i);
        }

        int i = customQueue.peek();
        System.out.println(customQueue);
        System.out.println(i);
    }
}