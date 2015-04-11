//Brian McCabe
//4-10-15
//hw11

//Write a program called CSE2Linear.java that prompts the user to enter 15 
//ints for students’ final grades in CSE2. Check that the user only enters 
//ints, and print an error message if the user enters anything other than an 
//int.  Print a different error message for an int that is out of the range 
//from 0-100, and finally a third error message if the int is not greater 
//than or equal to the last int.  Print the final input array.  Next, prompt
//the user to enter a grade to be searched for. implement a binary search 
//to find the entered grade. Indicate if the grade was found or not, and 
//print out the number of iterations used. 
//Next, scramble the sorted array randomly, and print out the scrambled array.
//Prompt the user again to enter an int to be searched for, and use linear 
//search to find the grade. Indicate if the grade was found or not, and 
//how many iterations it took. 

    //import stuff
    import java.util.Scanner;
    import java.util.Random;
    
public class CSE2Linear {
    
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in);
        
        int [] inputArray = new int[15]; //declare / allocate
        //prompt user input
        System.out.println("Enter 15 integers (for grades) of increasing size between 0-100: ");
        
        double x = 0; // check to make sure first number is valid
                    //i use double and convert to int because its easier than hasNextInt
        x =  myScanner.nextDouble();
        while (x<0||x>100||x%1 != 0) {
            System.out.println("Must be an int between 0-100, enter again: ");
            x = myScanner.nextDouble();
        }
        int n = (int)x;
        
        inputArray[0] = n; //declare first element of array
        double number = 0;
        for (int i=1; i<inputArray.length; i++) { //this for loop fills the rest of the 
                                            //array with user input. again, work with double, replace with ints
            number = myScanner.nextDouble();
            if (number<0||number>100||number%1 != 0||number<=inputArray[i-1]) {
                System.out.println("Must be an int between 0-100 and greater than the last int, enter again");
                i--;
                continue;
            }
            int numberUse = (int)number;
            inputArray[i] = numberUse;
        }
        
        System.out.print("The grades, sorted, are: "); //this prints array
        for(int j=0; j<inputArray.length; j++) {
            System.out.print(inputArray[j]);
            System.out.print(" ");
        }
        
        
        System.out.println();
        System.out.print("Enter a grade to search for: "); //ask user input for target
        int searchFor = myScanner.nextInt();
        int low = 0; //low bound
        int high = 14;//up bound
        binarySearch(inputArray, low, high, searchFor); //call the method for binary search
        
        
        int [] scrambledArray = new int[15]; //declare new array that is scrambled
        scrambledArray = scramble(inputArray); //call method to scramble the original and store as new array
        
        System.out.print("The scrambled array is: "); //print scrambled array
        for (int l=0; l<scrambledArray.length; l++) {
            System.out.print(scrambledArray[l]);
            System.out.print(" ");
        }
        System.out.println(); //formatting
        System.out.print("Enter a grade to search for: "); //user input for target
        int searchFor2 = myScanner.nextInt();//input
        
        linearSearch(scrambledArray, searchFor2); //call the linear search method
        
        
        
        
        
            
        
    }
    
    public static void binarySearch(int [] list, int lowerbound, int upperbound, int target) {
        int position = (upperbound+lowerbound)/2; //start halfway
        int iterations = 0; //begin with 0
        
        while (list[position] != target && lowerbound <= upperbound) { //this while loop exits when target = array[i] or we went through everythign
            iterations++;
            if (list[position] > target) {
                upperbound = position - 1; //if target is under, upperbound is lowered
            }else {
                lowerbound = position + 1; //vice versa
            }
            position = (upperbound+lowerbound)/2; //new position to repeat the while loop
        }
        if (lowerbound<=upperbound) { //means we found the target before lowerbound became upperbound (exiting early means we found it)
            System.out.println("The grade " +target+ " was found in the list with "+iterations+" iterations.");
        }else { //if we didnt find it
            System.out.println("The grade "+target+" was not found in the list with "+iterations+" iterations.");
        }
    }
    
    public static int [] scramble(int [] list) {
        
        Random randomGenerator = new Random();
        
        int index, temp;
        
        for (int i=list.length - 1; i>0; i--) {
            index = randomGenerator.nextInt(i+1); //picks random int element within range of array
            temp = list[index]; //temp is then stored at this location
            list[index]=list[i]; //this location is then stored at whatever i value we are at in loop
            list[i] = temp; //array at i is then made = to temp, so we dont repeat values
        }
        return list;
        
    }
    
    public static void linearSearch(int [] list, int target) {
        int iterations = 0;
        for(int i=0; i<list.length; i++) {
            if (list[i] != target) { //if not the number, iterations goes up and we continue the loop
                iterations++;
                continue;
            }
            if (list[i] == target) { //when it equals, we exit and print
                System.out.println(target+" was found with "+iterations+" iterations.");
                return;
            }
            
        }
    }
    
    
}
