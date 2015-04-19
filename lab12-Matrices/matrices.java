//Brian McCabe
//lab12 matrices
//4-17-15

//this lab will use multi dimensional arrays to make matrices

    import java.util.Scanner;
    import java.util.Random;
    
public class matrices {
    
    public static void main(String [] args) {
        
        Random random = new Random();
        int width = random.nextInt(5)+1;
        int height = random.nextInt(5)+1;
        int width2 = random.nextInt(5)+1;
        int height2 = random.nextInt(5)+1;
        
        boolean format = true;
        
        int [][] arrayA;
        
        arrayA = increasingMatrix(width, height, format);
        System.out.println("Matrix A: ");
        printMatrix(arrayA, true);
        
        format = false;
        int[][] arrayB;
        
        arrayB = increasingMatrix(width, height, format);
        System.out.println("Matrix B: ");
        printMatrix(arrayB, true);
        
        format = true;
        int[][] arrayC;
        
        arrayC = increasingMatrix(width2, height2, format);
        System.out.println("Matrix C: ");
        printMatrix(arrayC, true);
        
        
        System.out.println("Matrix A translated: ");
        int [][] arrayATrans = translate(arrayA);
        printMatrix(arrayATrans, true);
        
        System.out.println("Matrix B translated: ");
        int [][] arrayBTrans = translate(arrayB);
        printMatrix(arrayBTrans, true);
        
        System.out.println("Matrix C translated: ");
        int [][] arrayCTrans = translate(arrayC);
        printMatrix(arrayCTrans, true);
        
        
        
        System.out.println("Addition: ");
        printMatrix(arrayA, true);
        System.out.println("to... ");
        printMatrix(arrayC, false);
        System.out.println("equals: ");
        addition(arrayA, true, arrayC, false);
        
        
        
    }
    
    public static int [][] increasingMatrix(int w, int h, boolean format) {
        
        int[][] matrix = new int[h][w];
        
        int q=0;
        if (format == true) {
            for(int i=0; i<matrix.length; i++) {
                for(int j=0; j<matrix[i].length; j++) {
                    matrix[i][j] = q;
                    q++;
                }
                
            }
        }
        if (format == false) {
            int z=1;
            for(int i=0; i<matrix.length; i++){
                for(int j=0; j<matrix[i].length; j++) {
                    matrix[i][j] = q;
                    q+=(h);
                }
                q=z++;
            }
        }
        return matrix;
        
        
    }
    
    public static void printMatrix(int[][] array, boolean format) {
        
        int [][]matrix = array;
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        
        
    }
    
    public static int[][] translate(int[][] array) {
        
        int[][]matrix1 = array;
        int width = matrix1.length;
        int height = matrix1[0].length;
        int[][] matrix2 = new int [height][width];
        for(int i=0; i<matrix1.length; i++) {
            for(int j=0; j<matrix1[i].length; j++){
                matrix2[j][i] = matrix1[i][j];
            }
        }
        return matrix2;
        
    }
    
    public static void addition(int[][]m1, boolean formata, int [][]m2, boolean formatb) {
        
        int[][] matrixa = m1;
        int[][] matrixb = m2;
        int h1 = matrixa.length;
        int h2 = matrixb.length;
        int w1 = matrixa[0].length;
        int w2 = matrixb[0].length;
        
        if(h1==h2&&w1==w2) {
            int[][]matrixc = new int[h1][w1];
            
            for(int i=0; i<matrixa.length; i++){
                for(int j=0; j<matrixa[i].length; j++) {
                    matrixc[i][j] = (matrixa[i][j] + matrixb[i][j]);
                }
            }
            printMatrix(matrixc, true);
            
            
        }else{
            System.out.println("Cannot add these");     
        }
    
    }
    
}