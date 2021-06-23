import java.util.Arrays;

public class ArrayQueue {
    private int[] items;
    private int rear;
    private int count;
    private int front;

    public ArrayQueue(int capacity) {
       this.items = new int[capacity]; 
    }

    public void enque(int item) {
        if (count == items.length)
            throw new QueueOverflowException();
        items[rear] = item;
        rear = (rear + 1) % items.length;
        count++;
    }

    public int deque() {
        int item = items[front];
        items[front] = 0;
        front = (front + 1) % items.length;
        count--;
        return item;
    }

    public int peek() {
        if (count == 0)
            throw new QueueEmptyException();
        return items[0];
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }
}