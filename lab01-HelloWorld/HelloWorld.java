//Brian McCabe
//Demo 0
//Hello World Java Program
//
//first compile the program
//      javac HelloWorld.java
//  run the program
//      java HelloWorld//

//define a class


        

    import java.util.Scanner;
    import java.util.Random;
public class HelloWorld {
    
    public static void main(String[] args) {
        
        Random random = new Random();
        int [] a = {1,2,3,4,5,6,7,8,9,10};
        
        int index, temp;
        
        for (int i=a.length-1; i>0; i--) {
            index = random.nextInt(i+1);
            temp = a[index];
            a[index] = a[i];
            a[i] = temp;
        }
        
        for(int i=0; i<a.length; i++) {
            System.out.print(a[i]+ " ");
        }System.out.println();
        
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
    
}