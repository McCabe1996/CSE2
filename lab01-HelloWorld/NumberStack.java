
//
//
//
//
//Michael Diaz
//10.27.14
//

//import scanner
import java.util.Scanner;
    
    //call class
    public class NumberStack    {
    
        //main method
        public static void main (String [] args)    {
    
            //def scanner
            Scanner input;
            input = new Scanner (System.in);
            
            //ask the question
            System.out.println("input an int between 1 and 9: ");
          
                //def variables
                  int userNum=input.nextInt();
                  int counter=0;
                  int x=1;
                  int y=1;
                  int w=userNum;
                  
                  //only works if the number is between 1 and 9 
                    if (userNum<9 && userNum>1)                     {
                        
                        //outer loop, counter increases to print out the right series vertically
                        for (counter=0; counter<userNum; counter++)     { 
                            //i increases until it equals x and prints the spaces dependent on the lower loop
                            for (int i=0; i<x; i++){
                                //prints spaces
                                for (int q=w; q>0; q--){
                                
                                System.out.print(" ");
                                
                                        
                                    }
                                   //defines z and increments it to print out x however many times the loop runs
                                    for (int z=0; z<y; z++){
                                  
                                  
                                    System.out.print(+x);
                                       
                                        }
                                       System.out.println("");
                                        }
                                        //redefines the input and counts down on q to get fewer spaces
                                        for (int q=w; q>0; q--){
                                            
                                            System.out.print(" ");
                                        
                                        
                                    }
                                //increments z to count an appropriate number of -'s
                                  for (int z=0; z<y;z++){
                                
                                    System.out.print("-");
                           
                                }
                                //prints the enters
                                    System.out.println("");
                           
                           
                           //in the loop, raises each number every time the loop runs to
                           //make it such that all the variables that are incrementing up
                           //raise to the appropriate quantity
                             x=x+1;
                             y=y+2;
                             w=w-1;
                            
                        }
                            //reset vars
                                 counter=0;
                                 x=1;
                                 y=1;
                                 w=userNum;
                             
                                int i=0;
                                int z=0;
                                int q=w;
                                //same as the big loop above
                                while (counter<userNum) { 
                                    i=0;
                                    //nested loop raising i until it hits x
                                	while (i<x) {
                                    	
                                    	//redefines q to play with a new variable, w
                                		q=w;
                                		while (q>0) { 
                                        
                                    		System.out.print(" ");
                                        //increment down
                                    		q--;
                                    		
                                    	}
                                		
                                		z=0;
                                		//same as above, raising z until it hits y
                                    	while (z<y) { 
                                  
                                    		System.out.print(x);
                                        //increment up
                                    		z++;
                                        
                                    	}
                                    
                                    	System.out.println("");
                                    
                                        i++;
                                        
                                    }
                                    
                                    
                                    q=w; 
                                    i=0;
                                    z=0;
                                    
                                    //lessen q when q is bigger than 0 until it hits 0 to print apprpriate number of spaces
                                    while (q>0){ 
                                        
                                        System.out.print(" ");
                                        
                                        q--;
                                    }
                                    //print dashes
                                    while (z<y){ 
                                
                                    	System.out.print("-");
                                    
                                    	z++;
                                    }
                                    
                                    //print enters
                                    System.out.println("");
                           
                                    counter++;
                                    
                                    //raise (or lower) a value so the incrementations above hit the right numbers
                                    x=x+1;
                                    y=y+2;
                                    w=w-1;
                             
                             }
                                
                            //reset  
                            counter=0;
                            i=0;
                            z=0;
                            q=w;
                            w=userNum;
                            x=1;
                            y=1;
                           
                           
                           //big loop
                        do      {  
                            
                        	i=0; 
                            //sets q to w then moves checks to execute the rest of it lik
                            do { 
                            
                            	q=w; 
                                //spaces
                                do { 
                                	
                                	System.out.print(" ");
                                
                                	q--;
                                
                                } 
                                
                                //when q's greater than 0, z=0--loops to print multiple times
                                while(q>0);
                            
                                z=0; 
                                
                                //increments c then checks to move forward
                                do { 
                          
                                    System.out.print(x);
                            
                                    z++;
                                    
                                } 
                                
                                //increment i if z is less than y, part of the do-while like every other
                                //loop in this section
                                while (z<y);
                               
                              i++;
                              
                              System.out.println("");
                                
                              } 
                              //end of another do-while
                              while (i<x);
                          
                            
                            q=w; 
                            i=0;
                            z=0;
                      
                            do { 
                                
                                System.out.print(" ");
                                
                                q--;
                            } 
                            
                            while (q>0);
                          
                            do { 
                        
                            	System.out.print("-");
                            
                            	z++;
                            } 
                            
                            while (z<y);
                            
                            System.out.println("");
                      
                      
                            //increase numbers to get the right values to increment to
                            x=x+1;
                            y=y+2;
                            w=w-1;
                            
                            counter++;
                         
           
                        } 
                        //end of a do-while
                        while  (counter<userNum);
                  
                             
                    }//close big if
                    
                }//close method
                                
        }//close class