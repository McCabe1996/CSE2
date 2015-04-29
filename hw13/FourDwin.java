//Brian McCabe
//HW 13
//4-24-15

//This hw deals with using and manipulating 4D arrays

    import java.util.Random;
    import java.util.Scanner;
    import java.util.Arrays;
    
public class FourDwin {
    
    public static void main(String[] args){
        
        Scanner myScanner = new Scanner(System.in);
        
        //ask user input
        System.out.print("Enter an integer X: ");
        int x=0;
        
        //this loop is for x, it will keep running until we have a positive int
        while(true){
            if(myScanner.hasNextInt()) {
                x = myScanner.nextInt();
                while(x<0){
                    System.out.print("Invalid, enter again: ");
                    if(myScanner.hasNextInt()){
                        x = myScanner.nextInt();
                    }else{
                        System.out.print("Must be an int, enter again: ");
                        myScanner.next();
                    }
                }
                break;
            }else {
                System.out.print("Must be an int, enter again: ");
                myScanner.next();
            }
            
        }
        
        System.out.print("Enter an integer Y where Y>X: ");
        int y=0;
        
        //this loop is for y, it will keep running until y is an integer > x
        while(true){
            if(myScanner.hasNextInt()){
                y = myScanner.nextInt();
                while(y<=x || y<0){
                    System.out.print("Invalid, enter again: ");
                    if(myScanner.hasNextInt()) {
                        y=myScanner.nextInt();
                        
                    }else{
                        System.out.print("Must be an int, enter again: ");
                        myScanner.next();
                    }
                }
                break;
            }else{
                System.out.print("Must be an int, enter again: ");
                myScanner.next();
                
            }
            
        }
       
        
        Random random = new Random(); //declare the random class
         //these lines will get the length allowed of each member array
        
       
        //call the methods
        double [][][][] fourD = make(x,y);
        
        fourD = fillArray(fourD);
        
        
        System.out.println("Original Array:");
        print(fourD);
        
        System.out.println("Sorted Array:");
        fourD = sort4DArray(fourD);
        fourD = sort3DArray(fourD);
        
        print(fourD);
        
        statArray(fourD);
        
        
        
        
    }
    
    public static int random(int x, int y) {
        //generates a random number
        int ran = (int)(Math.random()*(y-x+1)+x);
        return ran;
    }
    
    public static double[][][][] make(int x, int y){
        
        //this method will make the array/allocate space
        double [][][][] myArray = new double[3][][][];
       
        
        //allocate
        for (int i=0; i<myArray.length; i++) {
            myArray[i] = new double[random(x,y)][][];
            for (int j=0; j<myArray[i].length; j++) {
                myArray[i][j] = new double [random(x,y)][];
                for (int k=0; k<myArray[i][j].length; k++) {
                    myArray[i][j][k] = new double [random(x,y)];
                    
                }
            }
        }
        return myArray;
        
    }
    
    public static double[][][][] fillArray(double[][][][]myArray){
        
        //this method will fill the array, using the random method 
        double[][][][]array = myArray;
        for (int i=0; i<array.length; i++) {
            for (int j=0; j<array[i].length; j++) {
                for (int k=0; k<array[i][j].length; k++) {
                    for (int l=0; l<array[i][j][k].length; l++) {
                        double num = (Math.random()*31);
                        int num2 = (int)(num*100);
                        num = (num2/100);
                        array[i][j][k][l] = num;

                    }
                }
            }
        }
        return array;
        
    }
    
    public static void statArray(double [][][][] array){
        
        //this method does the stats thing
        //members and sum increases each time
        
        int members = 0;
        double sum = 0;
        double mean = 0;
        
        for (int i=0; i<array.length; i++) {
            
            for (int j=0; j<array[i].length; j++) {
                
                for (int k=0; k<array[i][j].length; k++) {
                    
                    for (int l=0; l<array[i][j][k].length; l++) {
                        members += 1;
                        sum += array[i][j][k][l];
                    }
                }
            }
        }
        
        double membersDouble = (double) members;
        
        mean = sum / membersDouble;
        //calulations
        
        System.out.println("Members "+members);
        System.out.printf("Sum \t%.1f\n",sum);
        System.out.printf("Mean \t%.1f\n",mean);
        
        
        
    }
    
    public static double [][][][] sort4DArray (double [][][][] array) {
        
        //this method creates a new array and uses insertion sort to sort
        
        double[][][] key;
        double [][][][] sorted = array;
        
        
        //loop starts...lots of fors because 4D...
        for (int i=1; i<array.length; i++) {
            key = sorted[i];
            int c = i-1;
            while ((c>-1)&&sorted[c].length>key.length) {
                sorted[c+1] = sorted[c];
                c--;
            }
            if((c>-1)&&(sorted[c].length==key.length)) {
                double hi = 40;
                for (int j=0; j<sorted[i].length; j++) {
                    for(int k=0; k<sorted[i][j].length; k++) {
                        for (int l=0; l<sorted[i][j][k].length; l++) {
                            if (sorted[i][j][k][l] < hi) {
                                hi = sorted[i][j][k][l];
                            }
                        }
                    }
                }
                double hey = 40;
                for (int q=0; q<sorted[c].length; q++) {
                    for (int j=0; j<sorted[c][q].length; j++) {
                        for (int k=0; k<sorted[c][q][j].length; k++) {
                            if (sorted[c][q][j][k] < hey) {
                                hey = sorted[c][q][j][k];
                            }
                        }
                    }
                }
                if (hi < hey) {
                    sorted[c+1] = sorted[c];
                    c--;
                }
            }
            else {
                sorted[c+1] = key;
            }
            
            
        }
        
        return sorted;
        
        
        
    }
    
    public static double [][][][] sort3DArray (double [][][][] array) {
        
        
        //this method takes the sorted 4D array and then sorts it again in 3d
        double [][][][] sorted = array;
        
        for (int i=0; i<sorted.length; i++) {
            for (int j=0; j<sorted[i].length; j++) {
                for (int k=0; k<sorted[i][j].length; k++) {
                    for (int l=0; l<sorted[i][j][k].length-1; l++) {
                        int ref = 1;
                        for (int h=l+1; h<sorted[i][j][k].length; h++) {
                            if (sorted[i][j][k][h]<sorted[i][j][k][ref]){
                                ref = h;
                            }
                        }
                        double small = sorted[i][j][k][ref];
                        sorted[i][j][k][ref] = sorted[i][j][k][l];
                        sorted[i][j][k][l] = small;
                    }
                }
            }
        }
        
        return sorted;
    }
    
    public static void print(double [][][][] array) {
        
        //formatting for the printing
        
        double [][][][]printArray = array;
        System.out.println("{");
        for (int i=0; i<printArray.length; i++) {
            System.out.println("\t{");
            for (int j=0; j<printArray[i].length; j++) {
                System.out.print("\t\t{");
                for (int k=0; k<printArray[i][j].length; k++) {
                    System.out.print("{");
                    for (int l=0; l<printArray[i][j][k].length; l++) {
                        System.out.print(printArray[i][j][k][l]+",");
                    }
                    System.out.print("}");
                }
                System.out.println("},");
            }
            System.out.println("\t},");
        }
        System.out.println("}");
        
        
    }
}

