//Brian McCabe
//hw12 multiplying matrices
//4-19-15

//This hw makes us manipulate multi dimensional arrays to multiply matrices

    import java.util.Scanner;
    import java.util.Random;
    
public class Multiply {
    
    public static void main(String [] args) {
        //ask user for width of the first matrix
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter a width for the matrix: ");
        int width = myScanner.nextInt();
        while (width<=0) { //makes sure its above 0
            System.out.print("Must be positive, enter again: ");
            width = myScanner.nextInt();
        }
        //do the same for height
        System.out.print("Enter a height for the matrix: ");
        int height = myScanner.nextInt();
        while (height<=0) {
            System.out.print("Must be positive, enter again: ");
            height = myScanner.nextInt();
        }
        
        //use these values and call the method to make the matrix
        int [][] matrixA = randomMatrix(width, height);
        
        
        //do it again for a second width
        System.out.print("Enter a width for a second matrix: ");
        int width2 = myScanner.nextInt();
        while(width2<=0) {
            System.out.print("Must be positive, enter again: ");
            width2 = myScanner.nextInt();
        }
        
        //again for a second height
        System.out.print("Enter a height for a second matrix: ");
        int height2 = myScanner.nextInt();
        while(height2<=0) {
            System.out.print("Must be positive, enter again: ");
            height2 = myScanner.nextInt();
        }
        
        //makes sure that width = height2 so that multiplication is possible
        while (width != height2) {
            System.out.print("The second heigth must be equal to the first width, enter again: ");
            height2 = myScanner.nextInt();
        }
        
        //call matrix maker method 
        int [][]matrixB = randomMatrix(width2, height2);
        
        //this part prints out the final output, calling a print method
        System.out.println("The first matrix: ");
        print(matrixA);
        System.out.println("Times the second: ");
        print(matrixB);
        System.out.println("Is equal to: ");
        
        
        int [][] matrixC = multiply(matrixA, matrixB);
        print(matrixC); //final answer
        
        
        
    }
    
    public static int[][] randomMatrix(int w, int h) {
        
        Random random = new Random();
        int[][]matrix = new int[h][w]; //2d array portion is width which is like the collumns going down
        int min = -10;
        
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[i].length; j++) {
                matrix[i][j] = min + random.nextInt(21); //-10 plus a random number that can make it up to 10
            }
        }
        return matrix; //return the matrix we made
        
    }
    
    public static void print(int[][]array) {
        
        int[][]matrix = array; //matrix is what we'll return
        for(int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t"); //printing with a tab for formatting
            }
            System.out.println(); //new line
        }
    }
    
    public static int[][] multiply(int[][]arrayA, int[][]arrayB) {
        
        int rowsInA = arrayA.length; //length of array
        int collumnInA = arrayA[0].length; //length of member array
        int collumnInB = arrayB[0].length;//length of member array
        
        int [][] matrix = new int [rowsInA][collumnInB]; //new array to return, has rows in a length and collumns in B member length to allow multiplication
        
        for (int i=0; i<rowsInA; i++) { //runs through length of arrayA
            for (int j=0; j<collumnInB; j++) { //runs through length of member array of arrayB
                for (int k=0; k<collumnInA; k++) {//runs through length of member array of arrayA
                    matrix[i][j] = matrix[i][j] + arrayA[i][k]*arrayB[k][j];
                }
            }
        }
        return matrix;
        
    }
}
    