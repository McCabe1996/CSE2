//Brian McCabe
//HW 4 Banking
//2-13-15

//Write a program using switch statements that allows users to process banking transactions. 
//Start the user off with a random amount between 1,000 and 5,000 in their bank account using 
//the java.util.Random library or the Random function in the java.lang.Math library. 
//Then offer them the choice of depositing money, withdrawing money, or viewing their 
//balance. If they choose to deposit, ask them how much they want to deposit and make 
//sure they enter a positive number. Then print their resulting balance. If they choose to 
//withdraw, ask them how much they want to withdraw and make sure it is a positive number
//no more than the amount in their account. Then print the resulting balance.

    import java.util.Scanner; //declares scanner class so program compiles

public class Banking {
    
    public static void main(String[] args) {
        
        Scanner myScanner; //declares scanner instance
        myScanner = new Scanner( System.in );//calls the scanner constructor
        
        double randomBalance = Math.random()*5000 + 1000; //gets a random value b/w 1000-5000
        
  
        int choice; //variable used for switch statement.  THere are 3 choices, so 3 switches
        

        
        //give the user three options (typing 1 gives case 1, etc...)
        System.out.print("Type 1 to withdraw, 2 to deposit, or 3 to check balance: ");
        choice = myScanner.nextInt();
        
        //switch statement for choosing withdraw, deposit, or view
        switch (choice) {
            
            case 1: System.out.print("How much would you like to withdraw: "); //first case
                double withdraw = myScanner.nextDouble();
                
                if(withdraw >= randomBalance){//sets limit
                  
                    System.out.println("You do not have enough money");
                    return;//terminates
                    
                }//end of if statement about limit
                else if (withdraw < 0) { //makes sure you dont request (-) number
                    
                    System.out.println("You can't withdraw a negative amount");
                    return;//terminates
                }//end of else if
                
                //print balance
                System.out.printf("You have $%4.2f in your account\n", randomBalance - withdraw);
                break;
                
            case 2: System.out.print("How much would you like to deposit: "); //second case
                double deposit = myScanner.nextDouble();
                
                if(deposit < 0) { //makes sure you deposit a (+) number
                    
                    System.out.println("You can't deposit a negative number");
                    return;//terminates
                }//end of if 
                
                System.out.printf("You have $%4.2f in your account\n", randomBalance + deposit);
                break;
                
            case 3: System.out.printf("You have $%4.2f in your account\n", randomBalance);
                break;
            
            
        }//end of switch statement
        
        
        
        
        
    }//end of main method
    
    
}//end of class