//Brian McCabe
//Lab 6 Smile Generator
//2-27-15

//This program will use loops to print out smile faces in a variety of ways

    

public class SmileGenerator {
    
    public static void main(String[] args){
        
        System.out.println("Start Step 1");
        
        String smile = ":)"; //declare string to be used throughout program
        
        //part 1: print out 5 smileys using non-nested for loops
        
        for (int i = 1; i < 6; i++) {
            
            System.out.print(""+smile+"");
            
             }//end of for loop
       
       System.out.println(); //this print statement creates new line in terminal after the smiles
        
        //----------------------------------------------------------------------
        //part 2: print out 5 smileys using while loops
        
        int counter = 0; // counter for while and do while loops
        while (counter < 5) {
            System.out.print(""+smile+"");
            counter ++;
            
        };
        
        System.out.println();//again, makes new line in terminal
        
        //---------------------------------------------------------------------
        //part 3: print out 5 smileys using do while loops
        
        counter = 0; //bring value of counter back to 0 
        
        do {
            System.out.print(""+smile+"");
            counter ++;
        }while (counter < 5);
        
        System.out.println();//new line in terminal
        
        
        //---------------------------------------------------------------------
        //Step 2 print random number smiles 1-100 on one line
        
        System.out.println("Start Step 2");
        
        int randomSmiles = (int)(Math.random()*99) + 1;
        
        for (int x = 1; x <= randomSmiles; x++ ) {
            
            System.out.print(""+smile+"");
            
        }//end of for loop
        
        System.out.println(); //new line in terminal
        
        //---------------------------------------------------------------------
        //Step 3: number of smiles per line <=30
        
        System.out.println("Start Step 3");
       
       
        int lineCount = 0; //initialize line count for loop
        for (int n = 1; n <= randomSmiles; n++) {
            
            System.out.print(""+smile+"");
            lineCount++;
            
            if (lineCount == 30) {
                System.out.println();
                lineCount = 0;
            }//end if
            
        }//end for
        System.out.println();//new line in terminal
        
        //---------------------------------------------------------------------
        //Step 4: smile per line increases by 1 per line
        
        System.out.println("Start Step 4");
    
        
            
        
        int counter1 = 1; //declare variable
        int counter2 = 1;//declare variable
        int numberLines = (int)(Math.random()*10) + 4; //number of lines, random
        
        while (counter1 < numberLines) {
            
            
            if (counter2 > 0) {
                System.out.print(smile);
                counter2--;
            }
            else {
                System.out.println();
                counter1++;
                counter2 = counter1; 
            }
        }
                
            

        
        
        
    }//end of main method
    
    
}//end of class