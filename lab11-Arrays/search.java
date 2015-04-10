//Brian McCabe
//4-10-15
//Lab11 Arrays Searching

//Create two integer arrays (array1 and array2) of size 50.
//Fill array1 with random integers between 0 and 100
//Use linear search to print out the minimum and maximum values of array1.
//Add increasing random numbers to array2. (The first number should be between 0 and 100).
//Print out the minimum and maximum values of array2.
//Prompt the user to enter an int >= 0, and exit the program if they do not enter an int >= 0.
//Use binary search to search the array for the inputted value.
//Say if the number was found or not found.
//If the number was not found, print out the numbers below and above the searched for number.

    import java.util.Scanner;
    import java.util.Random;
    
public class search {
    
    public static void main(String[] args) {
        
        int [] array1 = new int[50];
        int [] array2 = new int[50];
        
        Scanner myScanner = new Scanner(System.in);
        Random randomGenerator = new Random();
        
        for (int i=0; i<array1.length; i++) {
            array1[i] = randomGenerator.nextInt(100);
        }
        
        int max = array1[0];
        int min = array1[0];
        for (int k=1; k<array1.length; k++) {
            if (array1[k]>max){
                max = array1[k];
            }
            if (array1[k] > min) {
                continue;
            }else {
                min = array1[k];
            }
        }
        System.out.println("The maximum of array1 is: "+max);
        System.out.println("The minimum of array1 is: "+min);
        
        
        array2[0] = randomGenerator.nextInt(100);
        for (int j=1; j<array2.length; j++) {
            array2[j] = array2[j-1] + randomGenerator.nextInt(100);
            
        }
        
        
        int max2 = array2[0];
        int min2 = array2[0];
        for (int l=1; l<array2.length; l++) {
            if (array2[l]>max2) {
                max2 = array2[l];
            }
            if (array2[l]>min2) {
                continue;
            }else {
                min2 = array2[l];
            }
        }
        System.out.println("The maximum of array2 is: "+max2);
        System.out.println("The minimum of array2 is: "+min2);
        
        System.out.print("Enter an int: ");
        int target = 0;
        if (myScanner.hasNextInt()) {
            target = myScanner.nextInt();
            
        
            if (target<0) {
                System.out.println("You did not enter an int > 0");
                System.exit(0);
            }
        }else {
            System.out.println("You did not enter an int");
            System.exit(0);
        }
        int low = 0;
        int high = 49;
        
        binarySearch(array2, low, high, target);
        
        
        
    }
    
    public static void binarySearch(int [] list, int lowerbound, int upperbound, int key) {
        int position = (lowerbound+upperbound)/2;
        int iterations = 0;
        
        while (list[position] != key && lowerbound<=upperbound) {
            iterations ++;
            if (list[position] > key) {
                upperbound = position - 1;
            }else {
                lowerbound = position + 1;
            }
            position = (lowerbound+upperbound)/2;
            
        }
        if (lowerbound<=upperbound) {
            System.out.println("The number was found in array subscript "+position);
            System.out.println("The binary search went through "+iterations+" iterations");
        }else {
            System.out.println("The target number is not in the array.");
            System.out.println("The number above the target was "+list[lowerbound]);
            System.out.println("The number below the target was "+list[upperbound]);
        }
    }
    
    
    
    
    
}
