//Brian McCabe
//HW7 Waves
//3-5-15

//This program will print out "waves" of numbers using user input

    import java.util.Scanner; //import scanner class to be used

public class waves {
    
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in);
        
        //---------------------------------------------------------------------
        //part 1 - for loop
        
        
        System.out.print("Enter a number between 1-30: "); //prompt user input
        
        
        
        double number = myScanner.nextDouble(); //declare user input variable
        
         //make sure number is valid input
        if (number<1 || number>30) {
            System.out.println("You must enter a number [1,30]");
            return;
        }
        
        if (number%1 != 0) {
            System.out.println("You must enter an integer");
            return;
        }
        
        System.out.println();
        System.out.println("Using For Loops: ");
        System.out.println();
        
         
       
       
        
        
    
        
        
        for (int i = 1; i <= number; i++){ //outer for loop
                                            // i increases from 1 to the input
                                            //conditions for when i is even or odd
                                            //are below
        
                
            if (i%2 != 0) { //if i is odd
                    
                    int j=0; //define outside loop so I can use in if statement
                   
                    for (j=i; j>0; j-- ){ //this loop controls number of lines
                                            //vertically. prints new line whenever
                                            //it is about to start over again
                        
                        
                        for (int n=j; n>0; n--) { //this loop controls the amount
                                                //of numbers per line
                            System.out.print(i);
                        
                        }
                        if (j==1){ //this if makes sure we don't get an extra line
                                    //between i values
                            break;
                        }
                        System.out.println(); //prints new line when needed
                        
                    }
                    
                
                
            }
            if (i%2 ==0) { //if i is even
                
                int k = 0; //define outside loop so I can use in if statement
                
                for (k=1; k<=i; k++){ //controls number of lines vertically
                                        //same as if odd, but it starts from 1
                                        //and increases to i
                        
                        for (int m=1; m<=k; m++){//this loop controls the amount
                                                //of numbers per line
                            System.out.print(i);
                        }
                        
                        if(k==i){ //prevents that extra space between i's
                            
                            break;
                        }
                        
                        System.out.println(); //new line when needed
                    
                    }
                
            }
                
            
        System.out.println(); //new line for new i value   
        }
        
        
        
    //------------------------------------------------------------------------
    
    //now with while loops
    System.out.println();
    System.out.println("Using While Loops: ");
    System.out.println();
    
    int count = 1; //define counter for while loop
   
    //2 counts per even / odd
    int count1 = 0;
    int count2= 0;
    int count3 = 0;         
    int count4= 0;
            
            
    while (count <= number) { //set bounds for the loop. Count increases by 1
                            //whenever each number's "requirements" are met
        
        
        if (count%2 != 0) { //if count is odd
            
            count1 = count;
            
            while (count1 > 0) {  //this while loop will control lines vertically
                count2 = count1;
                while (count2 > 0) { //this while loop will print out correct number
                                    //of numbers per line
                    System.out.print(count);
                    count2--;
                }
                
            if (count1 == 1){  //doesn't allow us to reach next line print, because
                                //it's time for the next even number sequence
                break;
            }  
            System.out.println();  //prints new line 
                
            count1 --;    
            }
            
            
        }
        
        if (count%2 == 0) {//if even
            
            count3 = 1;
            
            while(count3<=count){ //controls number of lines vertically
                count4 = 1;
                while(count4<=count3){ //this while loop will print out correct number
                                    // of numbers per line
                    System.out.print(count);
                    count4++;
                }
                
            if(count3==count){ //doesn't allow us to reach next line print, because
                                //it's time for the next odd number sequence
                break;
            }
            System.out.println(); //prints new line
            count3++;
            }
            
            
        }
        
        
    System.out.println();  //prints new line when changing even/odd  
    count ++; //increment count to increase by 1 at the end of each loop    
    } 
    
    
    
//------------------------------------------------------------------------------

//now with do-while loops

    System.out.println();
    System.out.println("Using Do While Loops: ");
    System.out.println();

    //reset count values
    count = 1; 
    count1 = 0;
    count2 = 0;
    count3 = 0;
    count4 = 0;
    
    do { //this do while increments count by 1 each time
        
        if(count%2 != 0) { //if the count is odd
            
            count1 = count; 
            
            do { //this do while manages lines vertically
                count2 = count1;
                do { //this do while keeps track of count number per line
                    System.out.print(count);
                    count2--; //decreases each time
                    
                }while(count2 > 0);
                
                if (count1 == 1){ //breaks the new line thing before we get to even
                    break;
                }
                
                System.out.println(); //prints new line while still in odd range
                count1--; //decreases each time
            }while(count1 > 0);
            
            
            
        }
        
        
        if (count%2 == 0) { //if even
            
            count3 = 1;
            
            do{ //this do while manages lines vertically
                count4 = 1;
                
                do{ //this do while keeps track of count number per line
                    System.out.print(count);
                    count4++; //increases each time 
                    
                    
                }while(count4<=count3);
                
                if (count3 == count){ //breaks before we get back to odd
                    break;
                }
                
                count3++; //prints new line before first do while repeats (ie the vertical lines)
                System.out.println(); //same concept as for odd
                
            }while(count3<=count);
            
            
            
            
            
        }
        
        
        
        System.out.println(); //prints new line when changing even/odd
        count++; //increments up
        }while (count<=number);
    
    
    }
}


