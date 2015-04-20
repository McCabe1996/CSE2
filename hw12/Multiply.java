//Brian McCabe
//hw12 multiplying matrices
//4-19-15

//This hw makes us manipulate multi dimensional arrays to multiply matrices

    import java.util.Scanner;
    import java.util.Random;
    
public class Multiply {
    
    public static void main(String [] args) {
        
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter a width for the matrix: ");
        int width = myScanner.nextInt();
        while (width<=0) {
            System.out.print("Must be positive, enter again: ");
            width = myScanner.nextInt();
        }
        
        System.out.print("Enter a height for the matrix: ");
        int height = myScanner.nextInt();
        while (height<=0) {
            System.out.print("Must be positive, enter again: ");
            height = myScanner.nextInt();
        }
        

        int [][] matrixA = randomMatrix(width, height);
        
        
        
        System.out.print("Enter a width for a second matrix: ");
        int width2 = myScanner.nextInt();
        while(width2<=0) {
            System.out.print("Must be positive, enter again: ");
            width2 = myScanner.nextInt();
        }
        
        System.out.print("Enter a height for a second matrix: ");
        int height2 = myScanner.nextInt();
        while(height2<=0) {
            System.out.print("Must be positive, enter again: ");
            height2 = myScanner.nextInt();
        }
        
        
        while (width != height2) {
            System.out.print("The second heigth must be equal to the first width, enter again: ");
            height2 = myScanner.nextInt();
        }
        
        int [][]matrixB = randomMatrix(width2, height2);
        
        System.out.println("The first matrix: ");
        print(matrixA);
        System.out.println("Times the second: ");
        print(matrixB);
        System.out.println("Is equal to: ");
        
        
        int [][] matrixC = multiply(matrixA, matrixB);
        print(matrixC);
        
        
        
    }
    
    public static int[][] randomMatrix(int w, int h) {
        
        Random random = new Random();
        int[][]matrix = new int[h][w];
        int min = -10;
        
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[i].length; j++) {
                matrix[i][j] = min + random.nextInt(21);
            }
        }
        return matrix;
        
    }
    
    public static void print(int[][]array) {
        
        int[][]matrix = array;
        for(int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
    public static int[][] multiply(int[][]arrayA, int[][]arrayB) {
        
        int rowsInA = arrayA.length;
        int collumnInA = arrayA[0].length;
        int collumnInB = arrayB[0].length;
        
        int [][] matrix = new int [rowsInA][collumnInB];
        
        for (int i=0; i<rowsInA; i++) {
            for (int j=0; j<collumnInB; j++) {
                for (int k=0; k<collumnInA; k++) {
                    matrix[i][j] = matrix[i][j] + arrayA[i][k]*arrayB[k][j];
                }
            }
        }
        return matrix;
        
    }
}
    