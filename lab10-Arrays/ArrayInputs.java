//Brian McCabe
//4-3-15
//Lab 10 Arrays

//1)    Ask the user to enter the size of an one-dimensional array
//2)    Ask the user to fill up the array with integers
//3)    Write a method to check if the input is a positive integer. If the input is not an integer or not positive, the method will return an error message. Re-prompt the user to enter a new input, until the array is completely filled.
//4)    Print out the array

    import java.util.Scanner;//
    
public class ArrayInputs {
    
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in);
        
        System.out.print("Please enter an integer for the size of an array: ");
        double arraySize = myScanner.nextDouble();
        
        while (valid(arraySize) == false) {
            System.out.print("You need to enter a positive integer, enter again: ");
            arraySize = myScanner.nextDouble();
        } 
        
        int arraySizeUse = (int)arraySize;
        
        int [] arrayNumber;
        arrayNumber = new int[arraySizeUse];
        
        if (valid(arraySize) == true) {
            
            int x = 0;
            
            System.out.println("Please enter "+arraySizeUse+" positive integers: ");
            
            double eachArrayNumber = 0;
            int eachArrayNumberUse = 0;
            for (x=0; x<arraySizeUse; x++) {
                eachArrayNumber = myScanner.nextDouble();
                
                    
                
                    if(valid(eachArrayNumber)==false){
                        System.out.println("You must enter a positive integer, enter again: ");
                        x--;
                    }
                    if (valid(eachArrayNumber) == true) {
                        eachArrayNumberUse = (int)eachArrayNumber;
                        
                        arrayNumber[x] = eachArrayNumberUse;
                        
                        
                        
                    }
                    
                    
                    
                
                }
            System.out.println("The array is: "); 
            System.out.print("[ ");
            for (x=0; x<arraySizeUse; x++) {
                System.out.print(arrayNumber[x]+" ");
            }
            System.out.println("]");

                
                
                
              
            }
        
    }
    
    public static boolean valid(double x) {
        boolean answer = true;
        if (x<=0 || x%1 != 0) {
            answer = false;
            
        }else {
            answer = true;
        }
        return answer;
    }
    
}
