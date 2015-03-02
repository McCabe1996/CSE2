//Brian McCabe
//HW 6 RunFactorial
//2-27-15

// This program will use a while-loop to solve factorial programs. Using
//scanner, you will first input an integer that is between 9 and 16
//inclusively. Then you need to calculate the factorial of the input number.

    import java.util.Scanner; //imports scanner class
    
public class RunFactorial {
    
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in); //declares scanner to be used
        
        //prompt user input
        System.out.println("Please enter an integer between 9 and 16 inclusive:");
        
        int number = 1;//declare
        int factorial = 1; //factorial of number
        int counter = 1;//used to count loop
        
        
        
        
        while (counter <= number) {
            
            number = myScanner.nextInt(); //input number
            
            if (number <= 16 && number >= 9) {
                factorial = factorial * counter; //equation for factorial to be looped
                
                counter ++; //adds one to counter until we reach input number
            
                
            }if (number < 9 || number > 16) {
                System.out.println("Invalid input, enter again!");
                
             }
            
            
        }//end of while
        
        System.out.println("Input accepted, "+number+"! = "+factorial);
        
            
          
            
            
            
        
        
        
    }//end of main method
    
    
    
}//end of class