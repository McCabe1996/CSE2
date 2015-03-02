//Brian McCabe
//HW 4 WhichNumber
//2-13-15

//Write a program that prompts the user to think of an int between 1 and 10 inclusive. 
//Then the program proceeds to ask the user questions in an attempt to guess what 
//number the user is thinking of.

    import java.util.Scanner; //imports scanner class so the program compiles
    
public class WhichNumber {
    
    public static void main(String[] args) {
        
        Scanner myScanner; //declares scanner instance
        myScanner = new Scanner( System.in );//calls the scanner constructor
        
        //declare strings for yes or no answers
        String Y = new String("Y");
        String y = new String("y");
        String N = new String("N");
        String n = new String("n");
        String divisibleThree;
        
        
        //prompt user to think of an integer between 1-10 inclusive
        System.out.println("Think of a number between 1 and 10 inclusive");
        
        System.out.print("Is your number even: ");//asks if number is even
        String even = myScanner.nextLine();
            if(even.equals(Y) || even.equals(y)) { //if statement for if number is even
            
                System.out.print("Is it divisible by 3: "); //asks if divisible by 3
                
                divisibleThree = myScanner.nextLine(); // string divisible by 3 user input
                    
                    //if statement for divisible by 3?
                    if(divisibleThree.equals(N) || divisibleThree.equals(n)) { 
                        
                        System.out.print("Is the number divisible by 4: ");//continue the questions
                       
                        String divisibleFour = myScanner.nextLine(); //declares string divisible by 4
                        
                        //if statement for divisible by 4
                        if(divisibleFour.equals(n) || divisibleFour.equals(N)) { //if 4 = no
                            
                            System.out.print("Is it divisible by 5: ");
                            
                            String divisibleFive = myScanner.nextLine();//declares string divisible by 5
                            
                            //if for divisible by 5
                            if(divisibleFive.equals(Y) || divisibleFive.equals(y)) {
                                System.out.println("Your number is 10");
                                return;
                            }else if (divisibleFive.equals(N) || divisibleFive.equals(n)) {
                                System.out.println("Your number is 2");
                                return;
                            } else { //else for divisible by 5
                                System.out.println("Sorry that it not a valid input");
                                return;
                            }
                        
                        } else if(divisibleFour.equals(Y) || divisibleFour.equals(y)) { //if 4 = yes
                            
                            System.out.print("Is the number divided by 4 greater than 1: ");
                            
                            String dividedByFourBig = myScanner.nextLine();//string if divided by 4 > 1
                            
                            if(dividedByFourBig.equals(Y) || dividedByFourBig.equals(y)) {
                                System.out.println("Your number is 8");
                                return;
                            }else if (dividedByFourBig.equals(N) || dividedByFourBig.equals(n)){
                                System.out.println("Your number is 4");
                            } else {
                                System.out.println("Sorry that is not a valid input");
                                return;
                            }
                            
                            
                        } else { //else for divisible by 4
                            System.out.println("Sorry that is not a valid input");
                        }
                        
                    } else if (divisibleThree.equals(Y) || divisibleThree.equals(y)){ 
                        System.out.println("Your number is 6");
                        return;
                        
                    }else { //if not proper input for divisible 3    
                        
                        System.out.println("Sorry that is not a valid input");
                        return;//terminates program if number is 6
                        
                    }
                
                
            }else if (even.equals(N) || even.equals(n)) { //chain of events for if its odd
            
                System.out.print("Is it divisible by 3: ");//asks if divisible by 3
                
                divisibleThree = myScanner.nextLine(); // divisible by 3 user input
                
                if (divisibleThree.equals(Y) || divisibleThree.equals(y)) { //if divisible by 3 chain
                
                    System.out.print("When divided by 3 is the result greater than 1: "); //another user question
                
                    String divThreeGreaterOne = myScanner.nextLine();//user input if > 1
                    
                    if (divThreeGreaterOne.equals(Y) || divThreeGreaterOne.equals(y)) {
                        System.out.println("Your number is 9");
                        return;
                    } else if (divThreeGreaterOne.equals(N) || divThreeGreaterOne.equals(n)) {
                        System.out.println("Your number is 3");
                        return;
                    
                    }else { //else for if x/3 > 1
                        System.out.println("Sorry that is not a valid input");
                        return;
                    }
                    
                    
                } else if (divisibleThree.equals(N) || divisibleThree.equals(n)) {
                    
                    System.out.print("Is the number greater than 6: ");
                    
                    String numGreaterSix = myScanner.nextLine();//user input if >6
                    
                    if (numGreaterSix.equals(Y) || numGreaterSix.equals(y)) { //if greater than 6
                        System.out.println("Your number is 7");
                        return;
                    
                        
                    } else if (numGreaterSix.equals(N) || numGreaterSix.equals(n)) {//if not greater 6
                        
                        System.out.print("Is it less than 3: ");
                        
                        String lessThanThree = myScanner.nextLine();//user input for less than 3
                        
                        if(lessThanThree.equals(Y) || lessThanThree.equals(y)) { //if yes
                            System.out.println("Your number is 1");
                            return;
                        }else if (lessThanThree.equals(N) || lessThanThree.equals(n)) {//if not
                            System.out.println("Your number is 5");
                            return;
                        } else {//not a valid input part
                            System.out.println("Sorry that is not a valid input");
                            return;
                        
                    }
                    
                    
                }else { //else for divisible by 3
                    System.out.println("Sorry that is not a valid input");
                    return;
                } 
                
                
                
                
            } else {
                System.out.println("Sorry that is not a valid input");
                return;
            }
            
        
    }else {//else for if not correct input for even/odd
        System.out.println("Sorry that is not a valid input");
        return;
    
}

}//end of main method

}//end of class
  