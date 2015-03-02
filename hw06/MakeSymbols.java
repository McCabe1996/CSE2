//Brian McCabe
//HW 6 MakeSymbols
//3-2-15

//For this program, you need to use do-while loops and the random number 
//generator to generate an integer between 0 and 100. You will first need 
//to print out the number. If the number is even, you will then print out 
//that number of “*” characters; if the number is odd, then you will print 
//out that number of “&” characters.

public class MakeSymbols {
    
    public static void main(String[] args){
        
        int randomNumber = (int)(Math.random()*101); //random 0-100
         
        String numberSymbol = ""; //declare string variable
        
        
        //set conditions for the string to be used        
        if (randomNumber % 2 == 0) { //if even
            numberSymbol = ("*");
            
        }else { //if not even
            numberSymbol = ("&");
        }
         
         
        
        System.out.print("Random number generated: "+randomNumber+ "\nThe output pattern: ");
        
        int counter = 0; //declare counter
        
        do { 
            System.out.print(numberSymbol);
            counter ++;
        }while (counter < randomNumber);
        
        System.out.println();//new line for terminal
            
            
         
         
        
        
        
    }//end of main method
    
    
}//end of class