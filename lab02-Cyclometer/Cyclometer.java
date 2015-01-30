//Brian McCabe
//Lab2 Cyclometer; [CSE2]
//1-30-15

//This program records time elapsed in seconds and the number of rotations of the front
//wheel of a bicycle.  

//For two trips, this program will:
//  print the number of minutes per trip
//  print the number of counts per trip
//  print the distance of each trip in miles
//  print the total distance

public class Cyclometer{
    //main method for program
    public static void main (String[] args) {
        
        //input data
        int secsTrip1=480;  //elapsed time of first trip    
       	int secsTrip2=3220;  //elapsed time of second trip
		int countsTrip1=1561;  //rotations of wheel for first trip
		int countsTrip2=9037; //rotations of wheel for second trip
		
		//our intermediate variables and output data
        double wheelDiameter=27.0,  //Precise size of wheel, next 4 lines are type double
  	    PI=3.14159, //precise definition of pi
  	    feetPerMile=5280,  //precise amount of feet in a mile
  	    inchesPerFoot=12,   //precise amount of inches in a foot
     	secondsPerMinute=60;  //precise amount of seconds per minute
    	double distanceTrip1, distanceTrip2,totalDistance;  //sets variable type as doubles

        //print numbers stored in variables that store seconds and count
        System.out.println("Trip 1 took "+
       	     (secsTrip1/secondsPerMinute)+" minutes and had "+
       	      countsTrip1+" counts.");
	    System.out.println("Trip 2 took "+
       	     (secsTrip2/secondsPerMinute)+" minutes and had "+
       	      countsTrip2+" counts.");
       	      
        //Calculate the distance of each trip as well as the total distance
        distanceTrip1 = countsTrip1 * wheelDiameter * PI;
    	// Above gives distance in inches
    	//(for each count, a rotation of the wheel travels
    	//the diameter in inches times PI)
	    distanceTrip1 /= inchesPerFoot * feetPerMile; // Gives distance in miles
	    distanceTrip2 = countsTrip2 * wheelDiameter * PI / inchesPerFoot / feetPerMile;
    	totalDistance = distanceTrip1 + distanceTrip2; //gets total distance
    	
    	//Next, I will print out the output distances
    	System.out.println("Trip 1 was "+distanceTrip1+" miles.");
    	System.out.println("Trip 2 was "+distanceTrip2+" miles.");
    	System.out.println("The total distance was "+totalDistance+" miles.");
        
    } //end of main method
    
}//end of class