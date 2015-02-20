//Brian McCabe
//Demo 0
//Hello World Java Program
//
//first compile the program
//      javac HelloWorld.java
//  run the program
//      java HelloWorld//

//define a class
public class HelloWorld{
//  add main method
    public static void main(String[] args) {
        
// print the statement with box around it
    System.out.println("#########################");
    System.out.println("#########################");
    System.out.println("#                       #");
    System.out.println("#   Hello World 2014!!  #");
    System.out.println("#                       #");
    System.out.println("#########################");
    System.out.println("#########################");
    System.out.println("test");
    
    //test/testtest
    
    
    
    
    char x = 0;
    int k = 22;
    switch (x){
  case 'y':
    System.out.println('y');
  case 'Y': 
    System.out.println('Y'); 
    k /= 2;
  case 'n':
    break;
  case 'N':
    System.out.println('N');
    k += 5;
    break;
  default:
    System.out.println("default ");
    k *= 5;
}
System.out.printf("k = %2.2f\n", (double)k);
 
    }    
}