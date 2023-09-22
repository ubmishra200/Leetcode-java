import java.util.PriorityQueue;

public class Kthlargest {
    public static int largest(int[] n, int k) {
        PriorityQueue<Integer> p = new PriorityQueue<>();
        for (int i : n) {
            p.add(i);
            if (p.size() > k) {
                p.poll();
            }
        }
        return (p.peek());
    }

    public static void main(String[] args) {
        int[] n = { 1, 26, 58, 6, 4, 7 };
        int k = 3;
        System.out.println(largest(n, k));
    }
}
