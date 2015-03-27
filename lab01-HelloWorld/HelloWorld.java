//Brian McCabe
//Demo 0
//Hello World Java Program
//
//first compile the program
//      javac HelloWorld.java
//  run the program
//      java HelloWorld//

//define a class


        

    import java.util.Scanner;
public class HelloWorld {
    
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in);
        
        while (true) {
        
            int dice1 = (int)(Math.random()*6 + 1);
            int dice2 = (int)(Math.random()*6 + 1);
        
            int sum = result(dice1, dice2);
            
            System.out.println("You rolled "+dice1+" + "+dice2+" = "+sum);
            
            if (sum == 2 || sum == 3 || sum == 12) {
                System.out.println("You lose");
                return;
            }else if (sum==7||sum==11) {
                System.out.println("You win");
                return;
            }else {
                System.out.println("Point is: "+sum);
                
                while (true) {
                    dice1 = (int)(Math.random()*6 + 1);
                    dice2 = (int)(Math.random()*6 + 1);
                    int sum1 = result(dice1, dice2);
                    System.out.println("You rolled "+dice1+" + "+dice2+" = "+sum1);
                
                    if(sum1 == sum){
                        System.out.println("You win");
                        return;
                    }else if(sum1 == 7) {
                        System.out.println("You lose");
                        return;
                    }else {
                        continue;
                    }
                }
            }
            
            
        
        
        }
        
        
    }
    
    public static int result(int x, int y) {
        
        int answer = x + y;
        return answer;
        
    }
    
    
    
}  
