public class Productsubarr {
    public static void arr(int[] ar) {
        int maxpro = ar[0];
        int premaxpro = ar[0];
        int preminpro = ar[0];
        for (int i = 1; i < ar.length; i++) {
            int num = ar[i];
            int crpremax = Math.max(num, Math.max(premaxpro * num, preminpro * num));
            int crpremin = Math.min(num, Math.min(premaxpro * num, preminpro * num));
            maxpro = Math.max(maxpro, premaxpro);
            premaxpro = crpremax;
            preminpro = crpremin;
        }
        System.out.println(maxpro);
    }

    public static void main(String[] args) {
        int[] m = { -2, 0, -1 };
        arr(m);
    }

}
