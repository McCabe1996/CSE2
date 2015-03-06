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
        
        double number = myScanner.nextDouble(); //input number, double to check for int later
        int factorial = 1; //factorial of number
        int counter = 1;//used to count loop
        
        while(number > 16 || number < 9){ //limits
            System.out.println("Inavalid try again");
            number = myScanner.nextDouble();
        }
        
        while (number %1 != 0) { //good wait to check if not an int
            System.out.println("Inavalid try again");
            number = myScanner.nextDouble();
        }
        
        while (number < 0) { //more limits    might not need this but whatevs
             System.out.println("Inavalid try again");
            number = myScanner.nextDouble();
            
        }
        
        
        while (counter <= number) {
            
            
            if (number <= 16 && number >= 9) {
                factorial = factorial * counter; //equation for factorial to be looped
                
                counter ++; //adds one to counter until we reach input number
            
            }
            
            
        }//end of while
        //print result
        System.out.println("Input accepted, "+number+"! = "+factorial);
        
            
          
            
            
            
        
        
        
    }//end of main method
    
    
    
}//end of class