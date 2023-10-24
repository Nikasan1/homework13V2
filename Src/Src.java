import java.util.Random;
import java.util.Scanner;

public class Src {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть розміри матриці :");
        int lengthArrayNumA = scanner.nextInt();
        int lengthArrayNumB = scanner.nextInt();
        int[][] matrix = new int[lengthArrayNumA][lengthArrayNumB];
        int[][] matrix2 = new int[lengthArrayNumB][lengthArrayNumA];
        Random random = new Random();
        System.out.println("Матриця");
        for (int i = 0; i < lengthArrayNumA; i++) {
            for (int j = 0; j < lengthArrayNumB; j++) {
                matrix[i][j] = random.nextInt(10);
            }
        }
        for (int i = 0; i < lengthArrayNumA; i++) {
            for (int j = 0; j < lengthArrayNumB; j++) {
                System.out.print(matrix[i][j] + ", ");
            }
            System.out.println();
        }
        System.out.println("Транспонована матриця");
        for (int i = 0; i < lengthArrayNumB; i++) {
            for (int j = 0; j < lengthArrayNumA; j++) {
                matrix2[i][j] = matrix[j][i];
            }
        }
        for (int i = 0; i < lengthArrayNumB; i++) {
            for (int j = 0; j < lengthArrayNumA; j++) {
                System.out.print(matrix2[i][j] + ", ");
            }
            System.out.println();
        }
    }
}
