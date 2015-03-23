//Brian McCabe
//HW 8 Game
//3-17-15

//This program is a game that utilizes many methods. 
//details about complicated methods in the methods

    import java.util.Scanner; //import scanner class
    
public class HW8 {
    
    public static void main(String[] args) {
        char option;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        String input = getInput(scan, "Cc");
        System.out.println("You are in a dead valley.");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You walked and walked and walked and you saw a cave!");
        cave();
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You entered a cave!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("Unfortunately, you ran into a GIANT!");
        giant();
        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
        input = getInput(scan, "AaEe", 10);
        System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
        System.out.println("There are three 3 tressure box in front of you! Enter the box number you want to open!");
        box();
        input = getInput(scan);
        System.out.println("Hero! Have a good day!");
    }

    
    
    public static void giant() {
        
        System.out.println("                                 ---------                    ");
        System.out.println("                                |  /    \\|                   ");
        System.out.println("                      ZZZZZH    |    O    |    HZZZZZ             ");
        System.out.println("                           H     -----------   H              ");
        System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ                   ");
        System.out.println("                           H    HHHHHHHHHHH    H                      ");
        System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ               ");
        System.out.println("                                HHHHHHHHHHH                   ");
        System.out.println("                                HHH     HHH                   ");
        System.out.println("                               HHH       HHH                   ");
    }
    
    
    public static void cave() {
        
        System.out.println("                              *****   * * * * * * * *        ");
        System.out.println("                         ***         ***                      ");
        System.out.println("                      ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("             O __|__  ***               ***                   ");
        System.out.println("           ******l    ***               ***                   ");
        System.out.println("            * *       ***               ***                   ");
        System.out.println("           *   *      ********************* * * * * * *       ");
    }
    
    
    public static void box() {
        
        System.out.println("                      *********************     *********************    *********************             ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     *********************     *********************    *********************               "); 
    }
    
    
    public static String getInput (Scanner scan, String string) { 
        
        //this function takes in a scanner and a string “Cc”. It is used to 
        //continue the game. If the user enter ‘C’ or ‘c’, the game continue. 
        //ANY OTHER KEY results in “Yea right LOSER!” and quit the game.
        
        String answer; //string that I will return to main method
        
        if (scan.hasNext()) { //tests for a string to be input
            String x = scan.next(); //x will be the string to test for conditions
                                        //then depending on what happens, answer will vary
            
            if (x.equals("C")||x.equals("c")) {   //tests to see whether user enters C or c
                                                //if not, we get a print message and end of program
                answer = "";
            }
            else {
                answer = "Yea right LOSER";
                System.out.println(answer);
                System.exit(0);
            }
        }
        else {
            answer = "Yea right LOSER";
            System.out.println(answer);
            System.exit(0);
        }
        
        return answer;
    }
         
        
        

    
    
    
    public static String getInput (Scanner scan, String string, int trial) {
        
        //If the user enter ‘A’ or ‘a’, it means attack, trial is used to 
        //record the number of critical hit. You may either give a critical 
        //hit or miss! This is determined by a random number that either 
        //yields 0 or 1. When you have 10 critical hits, you kill the GIANT 
        //and get to move on. 
        
        //If the user enter ‘E’ or ‘e’, it means escape. Everytime the user 
        //tries escape, a random number from 1-10 is generated, if the number
        //equals to 0, the user escape successfully. Otherwise, the user 
        //faces the “AaEe” option again.

        //Any key other than ‘A’ ‘a’ ‘E’ ‘e’ means “Executed by the GIANT!
        //Game Over! ”
        
        String answer2 = ""; //declare answer2 string to be returned
        int count = trial; //declare count to monitor the loop
        
        while (count>0) { //count starts at 10, so we will run until 10 crits
                        //an escape, or an invalid input
                        
            if (scan.hasNext()) { //tests for string
                String n = scan.next(); //string n will be tested for A's, E's, etc
                
                    if (n.equals("A")||n.equals("a")) {
                        int critHit = (int)(Math.random()*2); //1/2 chancee of a crit
                        
                        if (critHit == 1) {
                            System.out.println("Critical hit!");
                            count --; //brings count down to keep track of crits
                            
                        }
                        else {
                            System.out.println("You missed!");
                        }
                        
                    }else if (n.equals("E")||n.equals("e")) {
                        int escape = (int)(Math.random()*10);
                        
                        if (escape == 9) { // 1/10 chance of escaping (range is 0-9) -> range=(10)
                            
                            System.out.println("You escaped!");
                            count = 0; //ends loop as you escape the giant
                        }
                        else {
                            System.out.println("You couldn't escape!");
                            
                        }
                        
                        
                        
                        
                    }else { //if you did not enter E or e
                        answer2 = "You were executed by the giant";
                        System.out.println(answer2);
                        System.exit(0); //exits if you die
                    }
                
                
                
                
            } else { //if you did not enter a string
                System.out.println("You were executed by the giant");
                System.exit(0); //exits if you die
            }
            
            if (count > 0) {
                //if crit hits is still under 10, will repeat the process
                System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
            }
            
            
            
            
            
            
            
        }
        
        return answer2;
        
        
        
    }
    
    
    public static String getInput (Scanner scan) {
        
        //the user chooses to open a treasury box from 1 of the 3. Use 
        //SWITCH statement to assign rewards and set default case as A 
        //Wrong Number! You get nothing! Better restart the game LOL”
        //Make sure you print out what the reward is.
        
        double input = 0; //declare and initialize
        String answer3; //declare string to be returned to main
        int decision = 0; //declare and initialize what the user will choose
        int count = 1; //declare the control for the loop
        
        while (count>0) {
            
            if (scan.hasNextDouble()) { //tests for a double
                
                input = scan.nextDouble();
                
                if ((input == 1 || input == 2 || input ==3) && input%1 == 0 ) { //tests if user enters right number
                                                                        //and if its an integer
                    decision = (int)input; //will be used in switch statement
                    count --; //will end the loop
                    
                } else {
                    
                    decision = 0; //0 is arbitrary...its out of range 1-3 of boxes
                    count --; //ends the loop
                }
            }else {
                decision = 0;
                count --; //ends loop
            }
        }
        
        //begin the switch statement
        
        switch (decision) {
            case 1: 
                System.out.println("You recieved an A in CSE 002");
                answer3 = "I dont see the point of these returns if we never use the variable input";
                break;
            case 2:
                System.out.println("You recieved 50 dining dollars");
                answer3 = "I dont see the point of these returns if we never use the variable input";
                break;
            case 3:
                System.out.println("You recieved a Ferrari");
                answer3 = "I dont see the point of these returns if we never use the variable input";
                break;
            default: 
                System.out.println("A wrong number! You get nothing! Better restart the game LOL");
                answer3 = "seriously...";
        }  
        
        
        return answer3; //returns the answer3 to the main method
    
    }

    
    
    
    
    
    
}