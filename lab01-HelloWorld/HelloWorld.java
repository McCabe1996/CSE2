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
    
    public static void main(String arg[]){ //main method
    int mat3d[][][];
    mat3d=buildMat3d(); //builds the array
    show(mat3d); //shows the array
    System.out.println("The smallest entry in the 3D matrix is "+
  			findMin(mat3d)); //finds minimum value in array
    System.out.println("After sorting the 3rd matrix we get");
    sort(mat3d[2]); //sorts the 3rd slab of array
    show(mat3d); //shows the new array
   }
   
   public static int [][][] buildMat3d() { //method to build the 3d array
       int[][][] mat3d = new int [10][10][10];
        for(int i = 0; i < 3; i++) { //for loop for each slab
            for(int j = 0; j < (2*i) + 3; j++ ) {
                for(int k = 0; k < (i + j + 1); k++) {
                    mat3d[i][j][k] = (int) ((Math.random() * 100) + 1);
                }
            }
        }
        return mat3d;
   }
   
   public static void show(int[][][] array) { //method to display the 3d array by slab
       for(int i = 0; i < 3; i++) {
           System.out.println("----------------Slab " + (i+1)); //shows different slabs
           for(int j = 0; j < (2*i) + 3; j++) {
               for(int k = 0; k < (i + j + 1); k++) {
                   System.out.print(array[i][j][k] + " ");
               }
               System.out.println();
           }
       }
   }
   
   public static int findMin(int[][][] array) { //method to find the minimum value in array
       int min = 100;
       for(int i = 0; i < 3; i++) {
           for(int j = 0; j < (2*i) + 3; j++) {
               for(int k = 0; k < (i + j + 1); k++) {
                   if(array[i][j][k] < min) {
                       min = array[i][j][k];
                   }
               }
           }
       }
       return min;
   }
   
   public static int[][] sort(int[][] array) { //sorts the 3rd slab in ascending order 
       int min, temp, temp2;
        
       for(int i = 0; i < 7; i++) {
            boolean test = true;
            while(test) {
           
                test = false;
                for(int k = 0; k < (i + 3) - 1; k++) {
                    if(array[i][k] > array[i][k+1]) {
                        temp = array[i][k];
                        array[i][k] = array[i][k+1];
                        array[i][k+1] = temp;
                        test = true;
                    }
                }
           }
           boolean test2 = true;
           while(test2) {
               test2 = false;
               for(int m = 0; m < 6; m++) {
                   if(array[m][0] > array[m+1][0]) {
                       temp2 = array[m][0];
                       array[m][0] = array[m+1][0];
                       array[m+1][0] = temp2;
                       test2 = true;
                   }
               }
           }
           
       }
       return array;
   }

}