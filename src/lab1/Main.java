package lab1;

/*
    Номер залікової - 0206
    C2 = 206 % 2 = 0 -> O1 - "+"
    C3 = 206 % 3 = 2 -> C = 2
    C5 = 206 % 5 = 1 -> O2 - "/"
    C7 = 206 % 7 = 3 -> Тип індексів i та j - long
 */

public class Main {

    public static void main(String[] args) {
        double S = 0;
        final int C = 2;
        int a = 1;
        int b = 1;
        int n = 5;
        int m = 5;
        try {
            for (long i = a; i <= n; i++) {
                for (long j = b; j <= m; j++) {
                    S = S + ((double) (i / j) / (i + C));
                }
            }
            System.out.println(S);
        } catch (Exception exc) {
            System.out.println("Caught exception:");
            System.out.println(exc.getMessage());
        }
    }
}