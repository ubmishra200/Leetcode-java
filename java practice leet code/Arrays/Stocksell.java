public class Stocksell {
    public static int profit(int[] p) {
        if (p == null || p.length <= 1) {
            return 0;
        }
        int minprise = p[0];
        int maxprofit = 0;
        for (int i = 1; i < p.length; i++) {
            int currpri = p[i];
            if (currpri < minprise) {
                minprise = currpri;
            } else {
                int profites = currpri - minprise;
                if (maxprofit < profites) {
                    maxprofit = profites;
                }
            }
        }
        return maxprofit;

    }

    public static void main(String[] args) {
        int[] pri = { 7, 1, 5, 3, 6, 4 };
        System.out.println(profit(pri));
    }

}
