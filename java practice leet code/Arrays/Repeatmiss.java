import java.util.Arrays;

public class Repeatmiss {
    public static int[] check(int[] n) {
        int num = n.length;
        int sum = 0;
        int[] result = new int[2];
        int squactualsum = 0;
        for (int i = 0; i < num; i++) {
            sum += n[i];
            squactualsum += n[i] * n[i];
        }
        int expecsum = num * (num + 1) / 2;
        int expecsqsum = num * (num + 1) * (2 * num + 1) / 6;
        int diffsum = expecsum - sum;
        int diffsqsum = expecsqsum - squactualsum;
        int repeate = (diffsqsum - diffsum * diffsum) / (2 * diffsum);
        int miss = repeate + diffsum;
        result[0] = repeate;
        result[1] = miss;
        return result;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 3, 5 };
        int[] arr1 = check(arr);

        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
    }
}
