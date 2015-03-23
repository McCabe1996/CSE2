//Brian McCabe
//Lab8 Factorials
//3-16-15

//This program calculates a super factorial
// 5! + 4! + 3! + 2! + 1! ...
//this lab introduces the use of separate methods

    import java.util.Scanner; //import scanner class
    
public class Factorials {
    
    public static void main(String[] args) { //main method
        System.out.print("Please enter a number: ");
        Scanner myScanner = new Scanner(System.in);
        int sum = 0;
        int number = myScanner.nextInt();
        for (int i = 1; i<=number; i++){
            sum += factorial(i); //calls factorial class (each i is the 
                                //returned x value)
            
        }
        print(number, sum); //calls print method
                            //number goes with input, and sum is still sum
                            //(if u looked at print method)
    }
    
    
    public static int factorial(int input) { //method to get factorial
        int x = 1;
        for (int j=1; j<=input; j++){
            x*=j;
        }
        System.out.println(x);
        return x; //returns the factorial as x
    }
    
    public static void print(int input, int sum) { //method for print
        System.out.println("The super factorial of "+input+ " is equal to "+sum);
    
    }
    
    
}