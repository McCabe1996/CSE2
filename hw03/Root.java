//Brian McCabe
//HW 3: Root
//2-6-15

//This program will prompt the user to enter a double and then prints out 
//  a crude estimate of the cube root of the number and the value of this 
//  crude guess when cubed. If x is the number entered, then start by guessing 
//  the square root is x/3. Then improve your estimate by replacing “guess” in
//  the following expression with your first estimate, x/3: 
//  (guess*guess*guess+x)/(3*guess*guess) 
//  Improve your estimate four more times by continuing to substitute your 
//  last estimate for “guess” in the expression above.

    import java.util.Scanner; //imports scanner class so the program compiles
    
public class Root {
    
    public static void main(String[] args) {
        
        Scanner myScanner; //declare instance of the scanner object
        myScanner = new Scanner( System.in ); //calls the scanner constructor
        
        //ask user input
        System.out.print("Enter a precise value (double) and I will estimate its cube root: ");
        double rootNumber = myScanner.nextDouble();
        
        double guess = rootNumber / 3; //initial guess
        double guess2 = (guess * guess * guess + rootNumber)/(3 * guess * guess); //next guess
        //next four lines are four more improved guesses
        double guess3 = (guess2 * guess2 * guess2 + rootNumber)/(3 * guess2 * guess2);
        double guess4 = (guess3 * guess3 * guess3 + rootNumber)/(3 * guess3 * guess3);
        double guess5 = (guess4 * guess4 * guess4 + rootNumber)/(3 * guess4 * guess4);
        double guess6 = (guess5 * guess5 * guess5 + rootNumber)/(3 * guess5 * guess5);
        
        double cubeRoot = guess6; //declares variable cubeRoot
        
        //print the cuberoot and the equation to get it
        System.out.println("The cube root is "+cubeRoot+":");
        System.out.println(""+cubeRoot+" * "+cubeRoot+" * "+cubeRoot+" = ");
        System.out.println(""+cubeRoot*cubeRoot*cubeRoot+"");
        
        
        
    }//end of main method
    
    
}//end of class