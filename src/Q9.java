import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row,col;
        System.out.print("Enter number of rows: ");
        if(input.hasNextInt())
        {
            row = input.nextInt();
        }
        else return;
        System.out.print("Enter number of cols: ");
        if(input.hasNextInt())
        {
            col = input.nextInt();
        }
        else return;
        // Create a 2D array with dimension as mXn
        int matrixA[][] = new int[row][col];
        int matrixB[][] = new int[row][col];
        // Take input from user for matrixA elements
        for(int i=0; i<row; i++)
        {
            System.out.print("Enter elements of A, row["+(i)+"]: ");
            for(int j=0; j<col; j++)
            {
                if(input.hasNextInt())
                {
                    matrixA[i][j] = input.nextInt();
                }
            }
        }
        // Take input from user for matrixB elements
        for(int i=0; i<row; i++)
        {
            System.out.print("Enter elements of B, row["+(i)+"]: ");
            for(int j=0; j<col; j++)
            {
                if(input.hasNextInt())
                {
                    matrixB[i][j] = input.nextInt();
                }
            }
        }


        // Now perform addition of matrices
        System.out.println("Addition: ");
        print(addition(matrixA, matrixB));
        System.out.println("Subtraction");
        print(subtraction(matrixA, matrixB));

    }
    public static int[][] addition(int matrixA[][], int matrixB[][])
    {
        int row = matrixA.length, col=matrixA[0].length;
        int finalMatrix[][] = new int[row][col];
        for(int i=0; i<row; i++)
        {
            for (int j=0; j<col; j++)
            {
                finalMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return finalMatrix;
    }
    public static int[][] subtraction(int matrixA[][], int matrixB[][])
    {
        int row = matrixA.length, col=matrixA[0].length;
        int finalMatrix[][] = new int[row][col];
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                finalMatrix[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }
        return finalMatrix;
    }
    public static void print(int matrix[][])
    {
        int row=matrix.length, col=matrix[0].length;

        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
