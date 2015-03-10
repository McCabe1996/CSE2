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
public class HelloWorld{
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in);
        
        int number = myScanner.nextInt();
        String print = "";
        for (int i=1; i<=number; i++){
            if(i%2 == 0) {
                for (int a=1; a<=i; a++) {
                    for (int b=1; b<=a; b++){
                        print = print + i;
                        
                    }
                    System.out.println(print);
                }
            }else{
                for (int c=1; c<=i; c++){
                    for (int d=1; d<=c; d++){
                        print = print + i;
                    }
                    System.out.println(print);
                }
            }
        }
    }
}