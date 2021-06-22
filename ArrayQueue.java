import java.util.Arrays;

public class ArrayQueue {
    private int[] items;
    private int rear;
    private int count;

    public ArrayQueue(int capacity) {
       this.items = new int[capacity]; 
    }

    public void enque(int item) {
        if (count == items.length)
            throw new QueueOverflowException();
        items[rear++] = item;
        count++;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }
}