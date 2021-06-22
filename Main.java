public class Main {
    public static void main(String[] args) {

    // Declearing & populating our queue
        int length = 10;
        ArrayQueue customQueue = new ArrayQueue(length);
        for (int i = 0; i < length; i++) {
            customQueue.enque(i);
        }
    // Printing out queue
        System.out.println(customQueue);

    // Offering extra member than capacity
    // Throws custom built exception
        customQueue.enque(7);
        System.out.println(customQueue);
    }

    // private static void reverse(Queue<Integer> queue) {
    //     Stack<Integer> stack = new Stack<>();
    //     while (!queue.isEmpty()) stack.push(queue.remove());
    //     while (!stack.isEmpty()) queue.add(stack.pop());
    // }
}