//Brian McCabe
//HW 3: Bicycle
//2-6-15

//This program will prompt the user to enter 2 digits, the first giving the number
//  of counts on a cyclometer and the second giving the number of seconds during which
//  the count occurred.  It will then print out the distance traveled and the average
//   miles per hour.  Wheel diameter is 27 inches


    import java.util.Scanner; //imports scanner class so the program compiles
    
public class Bicycle {
    
    public static void main(String[] args) {
        
        Scanner myScanner; //declare instance of the scanner object
        myScanner = new Scanner( System.in ); //calls the scanner constructor
        
        System.out.print(
            "Enter the number of counts of the cyclometer (an int > 0): "); //asks user input
            int nCounts = myScanner.nextInt(); //calls nextInt method
        
        System.out.print(
            "What was the duration (in seconds) of the count?: ");
            double time = myScanner.nextDouble();
             
        //Enter constant variables
        double wheelDiameter = 27.0; //precise size of wheel
        double PI = 3.14159; //precise definition of pi
        double feetPerMile=5280;  //precise amount of feet in a mile
  	    double inchesPerFoot=12;   //precise amount of inches in a foot
     	double secondsPerMinute=60;  //precise amount of seconds per minute
     	double minutesPerHour = 60; //precise amount of minutes in an hour
     	
     	//calculate distance
     	double distanceTrip = (nCounts * PI * wheelDiameter / inchesPerFoot / feetPerMile) * 100; 
     	int distanceTripInt = (int) distanceTrip; 
     	double distanceTripFinal = distanceTripInt/100.00;//these lines made it so
     	                                                  //number printed has 2 decimals
        double totalTime = (time / secondsPerMinute) * 100;
        int totalTimeInt = (int) totalTime;
        double totalTimeFinal = totalTimeInt / 100.00; //these lines have same idea as above
     	                                          
     	//print distance
     	System.out.println("The total distance traveled was "+distanceTripFinal+" miles and it took "+totalTimeFinal+" minutes.");  
     	
     	//calculate average speed in mph
     	double averageSpeed = (distanceTripFinal) / (time / secondsPerMinute / minutesPerHour)*100;
     	int averageSpeedInt = (int) averageSpeed;
     	double averageSpeedFinal = averageSpeedInt/100.00; //this series of variables again makes it
     	                                                   //so that print is xx.xx
     	//print average speed
     	System.out.println("The average speed was "+averageSpeedFinal+" mph");
            
    }//end of main method

    
}//end of class