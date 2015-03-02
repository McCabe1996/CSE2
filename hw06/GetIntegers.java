//Brian McCabe
//HW 6 Get Integers
//2-25-15

//This program Ask the user for 5 non-negative integers (if an invalid 
//value is entered, then ask again, using a loop), and print out the sum 
//of the 5 integers.

    import java.util.Scanner; //import scanner class
    
public class GetIntegers {
    
    public static void main(String[] args){
        
        Scanner myScanner = new Scanner(System.in); //declare scanner
        
        //tell user what's up...
        System.out.println("Please enter 5 non-negative integers:");
        
        double integer; //declare as double
        double sum = 0;//declare sum as double for later
        
        for (int i = 0; i < 5; i++) { //for loop to run 5 times
        
            integer = 0; //initialize
            
                
            integer = myScanner.nextDouble(); //user input
                
                if (integer < 0) {
                    System.out.println("You must enter a non-negative integer");
                    i--;
                    integer = 0; //sets integer to 0 so its not counted in sum
                    //this if gives error message if less than o
                    //i-- sets count back 1 so as to keep the 5 number limit
                }
                
                if (integer%1 != 0) {
                    System.out.println("You must enter a non-negative integer");
                    i--;
                    integer = 0; //sets integer to 0 so not counted in sum
                    //error if not an integer (integer%1 !=0 means if 1 doesnt
                    //go in perfectly its not an int)
                    
                }
                
            
                sum = sum + integer; //adds more to sum each loop
             
            
           
        }//end of for loop
        
        
        int sumInt = (int)sum; //casts sum to an int
        System.out.println("The sum is: "+sumInt);//adds up sum in print statement
        
        
    }//end of main method
    
    
}//end of class