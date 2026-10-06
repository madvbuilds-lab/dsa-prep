public class SpiralPrint {

    public void spiral(int[][] arr) {
        int fr = 0;
        int fc = 0;
        int lr = arr.length - 1;
        int lc = arr[0].length - 1;

        while (fr <= lr && fc <= lc) {
            for (int j = fc; j <= lc; j++) {
                System.out.print(arr[fr][j] + " ");
            }
            fr++;

            for (int i = fr; i <= lr; i++) {
                System.out.print(arr[i][lc] + " ");
            }
            lc--;

            if (fr <= lr) {
                for (int j = lc; j >= fc; j--) {
                    System.out.print(arr[lr][j] + " ");
                }
                lr--;
            }

            if (fc <= lc) {
                for (int i = lr; i >= fr; i--) {
                    System.out.print(arr[i][fc] + " ");
                }
                fc++;
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
            { 1,  2,  3,  4},
            { 5,  6,  7,  8},
            { 9, 10, 11, 12}
        };

        SpiralPrint sp = new SpiralPrint();
        sp.spiral(arr);
    }
}