//Brian McCabe
//4-24-15
//lab13

//Program. Write a program that creates a two dimensional ragged array of 
//five rows of ints. The length the 0th row should be 5, the 1th row 8, etc.
//The jth row should have length equal to j*3+5. Then:
//Fill the array with random numbers in the range 0...39.
//Display the array.
//Sort each row of the array in ascending order.
//Display the array.
//Convert each member array into a new member array that is the same size as 
//the largest member array, and initialize all new array members to zero.

    import java.util.Random;
    
public class ragged{
    
    public static void main(String[] args) {
        
        int [][] array1 = new int [5][];
        
        for (int i=0; i<array1.length; i++) {
            array1[i] = new int [(i*3)+5];
        }
        
        Random random = new Random();
        
        for (int i=0; i<array1.length; i++) {
            for(int j=0; j<array1[i].length; j++) {
                array1[i][j] = random.nextInt(40);
            }
        }
        System.out.println("The array before sorting:");
        print(array1);
        System.out.println();
        
        int [][] array2 = sort(array1);
        System.out.println("The array after sorting:");
        print(array2);
        System.out.println();
        
        
        int[][] array3 = fill(array2);
        System.out.println("The array after sorting and copying:");
        print(array3);
        
        
        
    }
    
    public static void print(int [][] array) {
        
        for (int i=0; i<array.length; i++) {
            for(int j=0; j<array[i].length; j++) {
                System.out.print(array[i][j]+ " ");
            }System.out.println();
        }
        
    }
    
    public static int[][] sort(int[][]array) {
        
        int [][] returnArray = new int [array.length][];
        for(int i=0; i<array.length; i++) {
            returnArray[i] = new int [array[i].length];
        }
        
        for (int i=0; i<returnArray.length; i++) {
            for (int j=0; j<returnArray[i].length; j++) {
                returnArray[i][j] = array[i][j];
            }
        }
        
        
        
        for (int i=0; i<returnArray.length; i++) {
            for (int j=0; j<returnArray[i].length; j++) {
                int index = j;
                for (int k=j; k<returnArray[i].length; k++) {
                    if (returnArray[i][k] < returnArray[i][index]){
                        index = k;
                    }
                    
                }
                int small = returnArray[i][index];
                returnArray[i][index] = returnArray[i][j];
                returnArray[i][j] = small;
            }
            
        }
        
        return returnArray;
    }
    
    public static int [][] fill(int[][]array) {
        
        int [][] done = new int[array.length][17];
        int count = 5;
        
        for(int i=0; i<done.length; i++) {
            for(int j=0; j<done[i].length; j++) {
                if (j<count) {
                    done[i][j] = array[i][j];
                }else{
                done[i][j] = 0;
                }
                
               
            }count+=3;
        }
        
        return done;
    }
}
