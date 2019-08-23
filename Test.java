package ImmutableQueue;

import java.util.Scanner;

public class Test {
    @SuppressWarnings("unchecked")
    public static <T> void main(String[] args) {
        Queue<T> jobQueue = new ImmutableQueue<>();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
                jobQueue = jobQueue.enQueue((T) scan.next());
            } else if (operation == 2) { // dequeue
                jobQueue = jobQueue.deQueue();
            } else if (operation == 3) { // print/peek
                System.out.println(jobQueue.head());
            }
        }
        scan.close();
    }
}
