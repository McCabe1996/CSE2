//Brian McCabe
//Lab 4 Cookies
//2-13-15

//The user is responsible for bringing cookies to an event. This program
//uses the Scanner class to obtain from users how many cookies they want, how many
//people they are buying for, and at least how many cookies they want each person to 
//get. Then determine if the number of cookies is 
//evenly divisible among the people and if there is enough for each person. 
//If there are not enough cookies tell the user how many more are need.

    import java.util.Scanner; //imports scanner class so the program compiles
    
public class Cookies {
    
   public static void main(String[] args){
        
        
        Scanner myScanner; //declare instance of scanner object
        myScanner = new Scanner( System.in );// calls the scanner constructor
        
        //declare variables
        int numberPeople;
        int numberCookies;
        int numberDesired;
        int remainder = 0;
        int difference; //this will be used to determine amount needed if not enough cookies
        
        //ask user input for number of people
        
        System.out.print("Enter the number of people: ");
        
        //use if statement to test what user says
        if(myScanner.hasNextInt()) { //this will check if user enters an int
           
            numberPeople = myScanner.nextInt(); //if boolean is true, we have an int
                
                if(numberPeople <= 0) { //makes sure user enters positive number
                    System.out.println("You did not enter an int > 0");
                    return; //terminate program
                }
                
             } else {
                 
                 System.out.println("You did not enter an int");
                 return; //terminate program if not an int
             }
             
        //ask user input for how many cookies they want to buy
        
        System.out.print("How many cookies are you planning to buy: ");
        //initialize if statement to test what user says
        if (myScanner.hasNextInt()) { //checks if user enters int using boolean
        
            numberCookies = myScanner.nextInt(); //if boolean is true, we have an int
            
                if (numberCookies < 0){ //makes sure we have positive number cookies
                System.out.println("You did not enter an int > 0");
                return; //termintates program
                
                }
                    
            } else {
        
                System.out.println("You did not enter an int");
                return;
                
            }
            
        //find out how many cookies each person wants
        
        System.out.print("How many cookies do you each want: ");
        //if statement to test input
        if (myScanner.hasNextInt() ) { //checks if user enters int
        
            numberDesired = myScanner.nextInt();//if boolean is true, we have int
            
                if(numberDesired < 0){ //makes sure people want a positive number
                System.out.println("You did not enter an int > 0");
                return;
                
                }
                
        } else { 
            
            System.out.println("You did not enter an int");
            return;
                    
                    
                }
                
        //determine if there are enough cookies
        if ((numberDesired*numberPeople) > numberCookies) {
            //remainder = (numberDesired*numberPeople)%numberCookies; //finds remainder
            difference = (numberPeople*numberDesired) - numberCookies;
            System.out.print("You do not have enough cookies for everyone. ");
            System.out.println("You need at least "+difference+" more.");
            return;
       
        }
        //determine if they divide evenly if there is enough
        if ((numberDesired*numberPeople) < numberCookies) {  
            
            if ((numberCookies%numberPeople)==0) {
                
                System.out.println("You have enough cookies and they divide evenly");
            }else {
                
                System.out.println("You have enough cookies, but they do not divide evenly");
                
            }
        }

    }//end of main method
    
}//end of class
