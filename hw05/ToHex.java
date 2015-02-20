//Brian McCabe
//HW 5 ToHex
//2-18-15

//Your laptop display or computer monitor use tiny pixels to display what you
//see on your screen. Pixels consist of three colors: Red, Green, and Blue 
//(RGB) which are mixed together to produce all of the possible colors that
//your screen can display. RGB are represented by 8-bits, so their values 
//can range from 0 - 255. For example, the color white is represented in 
//(R,G,B) as (255, 255, 255) respectively.  You will develop a program which
//takes decimal RGB values (three inputs) and convert them to hexadecimal.
//For example, the color white is represented in hexadecimal as FFFFFF. 

    import java.util.Scanner; //imports scanner class so the program compiles
    
public class ToHex {
    
    public static void main(String[] args) {
        
        Scanner myScanner; //declares scanner
        myScanner = new Scanner (System.in); //calls scanner constructor
        
        //declare variables
        int firstNumber;
        int secondNumber;
        int thirdNumber;
        
        //ask for user input
        System.out.println("Please enter three numbers (integers 0-255) representing RGB values: ");
        
        if(myScanner.hasNextInt()) { //check if user enters int for first number
            
            firstNumber = myScanner.nextInt();
            
            if(myScanner.hasNextInt()) {
           
                secondNumber = myScanner.nextInt();
          
                    }else {
                    System.out.println("Sorry, you need to enter an integer");
                    return;//terminates
           
                    }//end of if and else for second number
            
                        if(myScanner.hasNextInt()) {
            
                            thirdNumber = myScanner.nextInt();
                                
                            
                        }else {
                        System.out.println("Sorry, you need to enter an integer");
                        return;//terminates
                        }//end of if and else for third number
                
                if ( ( (firstNumber < 0) || (firstNumber > 255) )||( (secondNumber < 0) || (secondNumber > 255) )|| ( (thirdNumber < 0) || (thirdNumber > 255) ) ){ //makes sure all 0 - 255
                    
                    System.out.println("You must enter numbers between 0 - 255 inclusive"); 
                    return; //terminates
                } //end of if about being (+) numbers
        
        
        } //end of has next int if
        
       
       
        else {
            System.out.println("Sorry, you need to enter an integer");
            return; //terminates
        } //end of else for if about being an int
        
        
       
       
        //first section making sure user enters both numbers 0-255
        // and integers is complete.
        
        
        //-----------------------------------------------------------------------
        //convert to hexadecimal 
        
        //first part of print statement
        System.out.print("The numbers R:"+firstNumber+", G:"+secondNumber+", and B:"+thirdNumber+", is represented in hexadecimal as: " );
        
       
        //declare variables for first segment of numbers
        int firstNumberDivision = firstNumber / 16; String firstNumberDivisionString = "";
        int secondNumberDivision = secondNumber / 16; String secondNumberDivisionString = "";
        int thirdNumberDivision = thirdNumber / 16; String thirdNumberDivisionString = "";
        
         //declare variables for second segment of numbers
        int firstNumberModulus = firstNumber % 16;  String firstNumberModulusString = "";
        int secondNumberModulus = secondNumber % 16; String secondNumberModulusString = "";
        int thirdNumberModulus = thirdNumber % 16; String thirdNumberModulusString = "";
        
        
        
        //commence setting the conditions...
        
        if(firstNumberDivision > 9) {
            
            switch (firstNumberDivision) {
                
                case 10: firstNumberDivisionString = ("A");
                    break;
                    
                case 11: firstNumberDivisionString = ("B");
                    break;
                    
                case 12: firstNumberDivisionString = ("C");
                    break;
                    
                case 13: firstNumberDivisionString = ("D");
                    break;
                    
                case 14: firstNumberDivisionString = ("E");
                    break;
                    
                case 15: firstNumberDivisionString = ("F");
                    break;
                    
            }//end switch
            
            System.out.print(""+firstNumberDivisionString+"");
        }
        
            else {
                
                switch (firstNumberDivision) {
                    
                    case 0: firstNumberDivisionString = ("0");
                    break;
                    
                    case 1: firstNumberDivisionString = ("1");
                    break;
                    
                    case 2: firstNumberDivisionString = ("2");
                    break;
                    
                    case 3: firstNumberDivisionString = ("3");
                    break;
                    
                    case 4: firstNumberDivisionString = ("4");
                    break;
                    
                    case 5: firstNumberDivisionString = ("5");
                    break;
                    
                    case 6: firstNumberDivisionString = ("6");
                    break;
                    
                    case 7: firstNumberDivisionString = ("7");
                    break;
                    
                    case 8: firstNumberDivisionString = ("8");
                    break;
                    
                    case 9: firstNumberDivisionString = ("9");
                    break;
                    
                }//end of switch
                
                System.out.print(""+firstNumberDivisionString+"");
                
            }//end of else for first number
            
       
        if (firstNumberModulus > 9) {
            
           switch (firstNumberModulus) {
               
               case 10: firstNumberModulusString = ("A");
               break;
               
               case 11: firstNumberModulusString = ("B");
               break;
               
               case 12: firstNumberModulusString = ("C");
               break;
               
               case 13: firstNumberModulusString = ("D");
               break;
               
               case 14: firstNumberModulusString = ("E");
               break;
               
               case 15: firstNumberModulusString = ("F");
               break;
               
           }
           
           System.out.print(""+firstNumberModulusString+"");
        }
           
           
           else {
               
               switch (firstNumberModulus) {
                   
                   case 0: firstNumberModulusString = ("0");
                   break;
                   
                   case 1: firstNumberModulusString = ("1");
                   break;
                   
                   case 2: firstNumberModulusString = ("2");
                   break;
                   
                   case 3: firstNumberModulusString = ("3");
                   break;
                   
                   case 4: firstNumberModulusString = ("4");
                   break;
                   
                   case 5: firstNumberModulusString = ("5");
                   break;
                   
                   case 6: firstNumberModulusString = ("6");
                   break;
                   
                   case 7: firstNumberModulusString = ("7");
                   break;
                   
                   case 8: firstNumberModulusString = ("8");
                   break;
                   
                   case 9: firstNumberModulusString = ("9");
                   break;
                 
                   
               }//end of switch
               
               System.out.print(""+firstNumberModulusString+"");
               
           }//end of else
            
            //now do the next number
            
            
        
        
        if(secondNumberDivision > 9) {
            
            switch (secondNumberDivision) {
                
                case 10: secondNumberDivisionString = ("A");
                    break;
                    
                case 11: secondNumberDivisionString = ("B");
                    break;
                    
                case 12: secondNumberDivisionString = ("C");
                    break;
                    
                case 13: secondNumberDivisionString = ("D");
                    break;
                    
                case 14: secondNumberDivisionString = ("E");
                    break;
                    
                case 15: secondNumberDivisionString = ("F");
                    break;
                    
            }//end switch
            
            System.out.print(""+secondNumberDivisionString+"");
        }
        
            else {
                
                switch (secondNumberDivision) {
                    
                    case 0: secondNumberDivisionString = ("0");
                    break;
                    
                    case 1: secondNumberDivisionString = ("1");
                    break;
                    
                    case 2: secondNumberDivisionString = ("2");
                    break;
                    
                    case 3: secondNumberDivisionString = ("3");
                    break;
                    
                    case 4: secondNumberDivisionString = ("4");
                    break;
                    
                    case 5: secondNumberDivisionString = ("5");
                    break;
                    
                    case 6: secondNumberDivisionString = ("6");
                    break;
                    
                    case 7: secondNumberDivisionString = ("7");
                    break;
                    
                    case 8: secondNumberDivisionString = ("8");
                    break;
                    
                    case 9: secondNumberDivisionString = ("9");
                    break;
                    
                }//end of switch
                
                System.out.print(""+secondNumberDivisionString+"");
                
            }//end of else for second number
            
     if (secondNumberModulus > 9) {
            
           switch (secondNumberModulus) {
               
               case 10: secondNumberModulusString = ("A");
               break;
               
               case 11: secondNumberModulusString = ("B");
               break;
               
               case 12: secondNumberModulusString = ("C");
               break;
               
               case 13: secondNumberModulusString = ("D");
               break;
               
               case 14: secondNumberModulusString = ("E");
               break;
               
               case 15: secondNumberModulusString = ("F");
               break;
               
           }
           
           System.out.print(""+secondNumberModulusString+"");
        }
           
           
           else {
               
               switch (secondNumberModulus) {
                   
                   case 0: secondNumberModulusString = ("0");
                   break;
                   
                   case 1: secondNumberModulusString = ("1");
                   break;
                   
                   case 2: secondNumberModulusString = ("2");
                   break;
                   
                   case 3: secondNumberModulusString = ("3");
                   break;
                   
                   case 4: secondNumberModulusString = ("4");
                   break;
                   
                   case 5: secondNumberModulusString = ("5");
                   break;
                   
                   case 6: secondNumberModulusString = ("6");
                   break;
                   
                   case 7: secondNumberModulusString = ("7");
                   break;
                   
                   case 8: secondNumberModulusString = ("8");
                   break;
                   
                   case 9: secondNumberModulusString = ("9");
                   break;
                 
                   
               }//end of switch
               
               System.out.print(""+secondNumberModulusString+"");
               
           }//end of else
            
            
            
            
            
            
            
            
            //now do the next number
            
            
            
            
            
        if(thirdNumberDivision > 9) {
            
            switch (thirdNumberDivision) {
                
                case 10: thirdNumberDivisionString = ("A");
                    break;
                    
                case 11: thirdNumberDivisionString = ("B");
                    break;
                    
                case 12: thirdNumberDivisionString = ("C");
                    break;
                    
                case 13: thirdNumberDivisionString = ("D");
                    break;
                    
                case 14: thirdNumberDivisionString = ("E");
                    break;
                    
                case 15: thirdNumberDivisionString = ("F");
                    break;
                    
            }//end switch
            
            System.out.print(""+thirdNumberDivisionString+"");
        }
        
            else {
                
                switch (thirdNumberDivision) {
                    
                    case 0: thirdNumberDivisionString = ("0");
                    break;
                    
                    case 1: thirdNumberDivisionString = ("1");
                    break;
                    
                    case 2: thirdNumberDivisionString = ("2");
                    break;
                    
                    case 3: thirdNumberDivisionString = ("3");
                    break;
                    
                    case 4: thirdNumberDivisionString = ("4");
                    break;
                    
                    case 5: thirdNumberDivisionString = ("5");
                    break;
                    
                    case 6: thirdNumberDivisionString = ("6");
                    break;
                    
                    case 7: thirdNumberDivisionString = ("7");
                    break;
                    
                    case 8: thirdNumberDivisionString = ("8");
                    break;
                    
                    case 9: thirdNumberDivisionString = ("9");
                    break;
                    
                }//end of switch
                
                System.out.print(""+thirdNumberDivisionString+"");
                
            }//end of else for third number
            
            
            
   
        
       if (thirdNumberModulus > 9) {
            
           switch (thirdNumberModulus) {
               
               case 10: thirdNumberModulusString = ("A");
               break;
               
               case 11: thirdNumberModulusString = ("B");
               break;
               
               case 12: thirdNumberModulusString = ("C");
               break;
               
               case 13: thirdNumberModulusString = ("D");
               break;
               
               case 14: thirdNumberModulusString = ("E");
               break;
               
               case 15: thirdNumberModulusString = ("F");
               break;
               
           }
           
           System.out.println(""+thirdNumberModulusString+"");
        }
           
           
           else {
               
               switch (thirdNumberModulus) {
                   
                   case 0: thirdNumberModulusString = ("0");
                   break;
                   
                   case 1: thirdNumberModulusString = ("1");
                   break;
                   
                   case 2: thirdNumberModulusString = ("2");
                   break;
                   
                   case 3: thirdNumberModulusString = ("3");
                   break;
                   
                   case 4: thirdNumberModulusString = ("4");
                   break;
                   
                   case 5: thirdNumberModulusString = ("5");
                   break;
                   
                   case 6: thirdNumberModulusString = ("6");
                   break;
                   
                   case 7: thirdNumberModulusString = ("7");
                   break;
                   
                   case 8: thirdNumberModulusString = ("8");
                   break;
                   
                   case 9: thirdNumberModulusString = ("9");
                   break;
                 
                   
               }//end of switch
               
               System.out.println(""+thirdNumberModulusString+"");
               
           }//end of else
        
        
        
    
    }//end of main method
    
    
}//end of class