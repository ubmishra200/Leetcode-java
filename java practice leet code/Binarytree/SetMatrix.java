class SetMatrix {
    public static int[][] setval(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        boolean isrow = false;
        boolean iscol = false;
        for (int i = 0; i < m; i++) {
            if (mat[i][0] == 0) {
                isrow = true;
            }
        }
        for (int j = 0; j < m; j++) {
            if (mat[0][j] == 0) {
                iscol = true;
            }
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (mat[i][j] == 0) {
                    mat[0][j] = 0;
                    mat[i][0] = 0;
                }
            }
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (mat[i][0] == 0 || mat[0][j] == 0) {
                    mat[i][j] = 0;
                }
            }
        }
        if (isrow) {
            for (int i = 0; i < m; i++) {
                mat[i][0] = 0;
            }
        }
        if (iscol) {
            for (int j = 0; j < n; j++) {
                mat[0][j] = 0;
            }
        }
        return mat;
    }

    public static void main(String[] args) {
        int[][] n = { { 0, 1, 2, 0 }, { 3, 4, 0, 2 }, { 1, 3, 1, 5 } };
        setval(n);
        int m = n.length;
        int p = n[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                System.out.print(n[i][j] + "  ");

            }
            System.out.println();
        }
    }
}