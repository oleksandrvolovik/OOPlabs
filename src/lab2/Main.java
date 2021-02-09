package lab2;

/*
    Номер залікової - 0206
    C5 = 206 % 5 = 1 -> Дія з матрицею(ями) - C=Bт (Транспонування)
    C7 = 206 % 7 = 3 -> Тип елементів матриці - int
    C11 = 206 % 11 = 8 -> Дія з матрицею С - Знайти середнє значення елементів кожного рядка матриці
 */

public class Main {

    public static void main(String[] args) {
        int [][] B = {{2,4,3,8}, {1,4,6,5}, {9,4,6,5}};     // Матриця B
        int [][] C = new int[B[0].length][B.length];        // Матриця C
        System.out.println("Початкова матриця B:");
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                System.out.print(B[i][j]+" ");
            }
            System.out.print("\n");
        }

        for (int i = 0; i< B.length; i++) {
            for (int j = 0; j< B[i].length; j++) {
                C[j][i] = B[i][j];
            }
        }
        System.out.println("\nC = Bт:(транспонування)");
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[i].length; j++) {
                System.out.print(C[i][j]+" ");
            }
            System.out.print("\n");
        }

        double sum = 0;
        System.out.println("\nРядок C - середнє значення елементів рядка");
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[i].length; j++) {
                sum = sum + C[i][j];
                System.out.print(C[i][j]+" ");
            }
            System.out.print("- "+sum/C[i].length+"\n");
            sum = 0;
        }
    }
}
