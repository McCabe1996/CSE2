//Brian McCabe
// 4-3-15
//hw10 RemoveElements

//given a main method
//  The randomInput() method generates an array of 10 random integers 
    //between 0 to 9.  Implement randomInput so that it fills the array 
    //with random integers and returns the filled array.
    
//The method delete(list,pos) takes, as input, an integer array called 
    //list and an integer called pos.  It should create a new array that 
    //has one member fewer than list, and be composed of all of the same 
    //members except the member in the position pos. 
    
//Method remove(list,target) deletes all the elements that are equal to 
    //target, returning a new list without all those new elements.
    
    import java.util.Scanner;
    import java.util.Random;
    

public class RemoveElements {
    
    //main method given to us
    public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
    int num[]=new int[10];
    int newArray1[];
    int newArray2[];
    int index,target;
	String answer="";
	do{
  	System.out.print("Random input 10 ints [0-9]: ");
  	
  	num = randomInput();
  	System.out.println();
  	
  	String out = "The original array is: ";
  	out += listArray(num);
  	System.out.println(out);
 
  	System.out.print("Enter the index ");
  	index = scan.nextInt();
  	
  	
  	
    //this will test whether or not the index input is valid
    if (index<0||index>9) {
        System.out.println("Invalid index");
    }else{
        System.out.println("Index element "+index+" removed");
    }
  	newArray1 = delete(num,index);
  	String out1="The output array is ";
  	out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out1);
  	

 
      System.out.print("Enter the target value ");
  	target = scan.nextInt();
  	int count = 1; //used in loop so that print statement is only said once
  	int count2 = 0; //used to make sure we only test if not = on last run through
  	
  	//tests whether or not the target number is in the array
  	int k=0;
  	for (k=0; k<newArray1.length; k++) {
  	    
  	    if (newArray1[k] == target) {
  	        while (count>0){
  	            System.out.println("Target "+target+" found");
  	            count--;
  	            
  	        }
  	        break;
  	    }else if (count2 == 8 && newArray1[k] != target) {
  	        System.out.println("Target not found");
  	        break;
  	    }
  	    
  	    count2++;  
  	}
  	
  	
  	
  	
  	newArray2 = remove(newArray1,target);
  	
  	
  	  
  	String out2="The output array is ";
  	out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out2);
  	 
  	System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
  	answer=scan.next();
	}while(answer.equals("Y") || answer.equals("y"));
  }
 
  public static String listArray(int num[]){
	String out="{";
	for(int j=0;j<num.length;j++){
  	if(j>0){
    	out+=", ";
  	}
  	out+=num[j];
	}
	out+="} ";
	return out;
  }

    
    
    
    public static int [] randomInput() {
        
        int [] randomArray = new int[10]; //allocates space
        Random randomGenerator = new Random(); //declare random gen
        
        //this loops runs through 10 times, each time generating a random number for the array
        int i=0;
        for (i=0; i<randomArray.length; i++) {
            randomArray[i] = randomGenerator.nextInt(10);
            System.out.print(randomArray[i]);
            System.out.print(" ");
        }
        return randomArray; //returns the array
    }
    
    public static int [] delete (int [] list, int pos) {
        
        if (pos<0||pos>9) { //if the array position is not within the bounds, we return the array the method received
            return list;
        }
        int [] returnArray = new int [list.length - 1]; //declare/allocate space for new array
        
        for (int i=0, j=0; i<list.length; i++) {
            if (i==pos) { //if i = pos, we skip the next part of the loop that takes index i as part of array
                            //therefore, this element is not included
                continue;
            }
            returnArray[j] = list[i]; //allows acceptible numbers from old array into new one
            j++;
        }
        return returnArray;
       
        
    }
    
    public static int [] remove(int [] list, int target)  {
        
        
        int [] targetArray; //declare
        
        int sum = 0; //used to determine new allocation space
        for (int i=0; i<list.length; i++) {
            if (list[i] == target) {
                sum += 1; //everytime index number = target, sum increases
            }
        }
        
        targetArray = new int [(list.length)-sum]; //original length minus sum is new length
        
        for (int z=0, x=0; z<list.length; z++) {
            if (list[z] == target) { //continue to not include index z in array if target = index z
                continue;
            }
            targetArray[x] = list[z]; //allows acceptible numbers from old array into new one
            x++;
        }
        return targetArray;
    }
}
