//Brian McCabe
//HW 3: Four Digits
//2-9-15

//Write a program that prompts the user to enter a double and  then prints 
//  out the first four digits to the right of the decimal point

    import java.util.Scanner; //imports scanner class so the program compiles
    
public class FourDigits {
    
    public static void main(String[] args) {
        
        Scanner myScanner; //declare instance of the scanner object
        myScanner = new Scanner( System.in ); //calls the scanner constructor
        
        //ask user input
        System.out.print("Enter a double and I will print the first four decimal digits: ");
        double number = myScanner.nextDouble();
        
        //declare digit variables
        int digit1 = (int)(number*10)%10;
        int digit2 = (int)(number*100)%10;
        int digit3 = (int)(number*1000)%10;
        int digit4 = (int)(number*10000)%10;
        
        //print result
        System.out.println("The first four digits are "+digit1+" "+digit2+" "+digit3+" "+digit4+"");
        
        
        
        
        
    }//end of main method
    
}//end of class