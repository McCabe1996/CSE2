//Brian McCabe
//Lab7 zigzag
//3-5-15

//This program will use nested loops to create a zigzag of *s using user input


    import java.util.Scanner; //import scanner class

public class zigzag {
    
    public static void main(String[] args) {
        
        
        Scanner myScanner = new Scanner(System.in); //declare input device
        
        
        //part 1
        
        int nStars = 10; //declare and assign value to start the lab
        String star = "*";
        
        //use loop to print nStars # of *s on a line
        
        for (int i = 1; i <= nStars; i++){
            
            System.out.print(star); 
        }
        
        System.out.println(); //new line for terminal
        
        //---------------------------------------------------------------
        
        //part 2
        int counter = 0;
        for (int i = 1; i <= nStars; i++) {
            if(counter > 0) {
                for(int j = 0; j < counter; j++) {
                    System.out.print(" ");
                }
            }
            System.out.println(star);
            counter++;
            
            
        }
        
        //-----------------------------------------------------------------
        
        //part 3
        
        //strings to be used for infinite loop
        String Y = new String("Y");
        String y = new String("y");
    
    while (true) {    
        for (int i = 1; i <= nStars; i++) {
            
            System.out.print(star);
        }
        System.out.println(); //new line in terminal
        
        //-----------------------------------------------------------------
        
        
        //Now do it with user input
        
        System.out.println("Enter an integer in [3,33]");
        
        double nStars2 = 0;
        nStars2 = myScanner.nextDouble(); 
        
        if (nStars2 >= 3 && nStars2 <= 33){
            if (nStars2%1 == 0) {
                for (int i = 0; i < nStars2; i++){
                    System.out.print(star);
                }
            }else {
                System.out.println("You need to enter an integer");
            }
        } else{
            System.out.println("You need to enter an integer in [3,33]");
        }
        System.out.println(); //new line for terminal
        
        
        //now the swuiggly part
        
        int count = 0;
        
        if (nStars2 >= 3 && nStars2 <= 33){
            if (nStars2%1 == 0) {
                for (int i = 0; i < nStars2; i++){
                    if(count > 0) {
                        for (int j = 1; j <= count; j++){
                            System.out.print(" ");
                        }
                    } System.out.println(star);
                    count++;
                }
            
            }else{
                System.out.println("You must enter an integer");
            }
            
        }else {
            System.out.println("You must enter an integer in [3,33]");
        }
        
        //repeat first part
        
        
        
        
        
        if (nStars2 >= 3 && nStars2 <= 33){
            if (nStars2%1 == 0) {
                for (int i = 0; i < nStars2; i++){
                    System.out.print(star);
                }
            }else {
                System.out.println("You need to enter an integer");
            }
        } else{
            System.out.println("You need to enter an integer in [3,33]");
        }
        System.out.println(); //new line for terminal
   
   
    //ask the suer if he wants to continue
    System.out.print("Enter a Y or a y to go again: ");
    String cont = myScanner.next();
    if (cont.equals(Y) || cont.equals(y)) {
        
    }else {
        break;
    }
    }
    
   
    }//end of main method
    
    
    
    
    
}//end of class