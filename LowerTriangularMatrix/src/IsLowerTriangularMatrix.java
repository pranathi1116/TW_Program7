import java.util.*;
public class IsLowerTriangularMatrix {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int inputMatrix[][];
        int isLower = 0;
        int rowSize = scanner.nextInt();
        int columnSize = scanner.nextInt();
        if (rowSize != columnSize)
            System.out.println("no");
        else {
            inputMatrix = new int[rowSize][columnSize];
            for (int i = 0; i < rowSize; i++) {
                for (int j = 0; j < columnSize; j++) {
                    inputMatrix[i][j] = scanner.nextInt();
                    if (i < j && inputMatrix[i][j] == 0)
                        isLower = 1;
                }
            }
            if (isLower == 1)
                System.out.println("yes");
            else
                System.out.println("no");
        }
    }
}

