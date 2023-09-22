
class Roatatearray {
    public void Roatate(int n[], int k) {

        int[] resulte = new int[n.length];

        for (int i = 0; i < k; i++) {
            resulte[i] = n[n.length - k + i];

        }
        int j = 0;
        for (int i = k; i < n.length; i++) {
            resulte[i] = n[j];
            j++;
        }

        for (int i = 0; i < n.length; i++) {
            System.out.print(resulte[i]);
        }
    }

    public static void main(String[] args) {
        int[] n = { 0, 1, 2, 3, 6, 5, 4 };
        int k = 3;
        Roatatearray m = new Roatatearray();

        m.Roatate(n, k);
    }
}
