//Brian McCabe
//Lab 5 Space Exploration
//2-20-15

//This program outputs a timeline of significant space exploration advances 
//from 2000 - 2010. Use a random number generator to select a year within that
//decade. Then, output all events in the timeline that have occurred from 2000 
//up until the year that has been randomly selected (ex. output all events 
//from 2000 to 2004). Reference the table below in order to output events that 
//have occurred within a certain range. If a year is not listed in the chart
//below, output “N/A” for events that occurred during that year.


    
public class SpaceExploration {
    
    public static void main(String[] args) {
        
        int randomYear = (int)(Math.random()*11) + 2000;// random number, adds [0,10] to 2000
        
        //print statement for what's happening
         System.out.println("Here is a timeline of space exploration events from " +randomYear+ " to 2000: ");
       
       
       //declare and define strings to be used
        String year2010 = ("2010: SpaceX successfuly sends aircraft to orbit and back");
        String year2009 = ("2009: NA");
        String year2008 = ("2008: Kepler launched to study deep space");
        String year2007 = ("2007: NA");
        String year2006 = ("2006: Spacecraft returns with collections from a comet");
        String year2005 = ("2005: Spacecraft collides with comet");
        String year2004 = ("2004: NA");
        String year2003 = ("2003: Largest infrared telescope releaseed");
        String year2002 = ("2002: NA");
        String year2001 = ("2001: First spacecraft lands on asteroid");
        String year2000 = ("2000: First spacecraft orbits an asteroid");


        //start the switch statement
        //highest number case has all strings added together, and they decrease by 1 each time
        
        switch (randomYear) {
            
            case 2010: System.out.println(""+year2010+"\n"+year2009+"\n"+year2008+"\n"+year2007+"\n"+year2006+"\n"+year2005+"\n"+year2004+"\n"+year2003+"\n"+year2002+"\n"+year2001+"\n"+year2000+"");
                break;
                
            case 2009: System.out.println(""+year2009+"\n"+year2008+"\n"+year2007+"\n"+year2006+"\n"+year2005+"\n"+year2004+"\n"+year2003+"\n"+year2002+"\n"+year2001+"\n"+year2000+"");
                break;
                
            case 2008: System.out.println(""+year2008+"\n"+year2007+"\n"+year2006+"\n"+year2005+"\n"+year2004+"\n"+year2003+"\n"+year2002+"\n"+year2001+"\n"+year2000+"");
                break;
                
            case 2007: System.out.println(""+year2007+"\n"+year2006+"\n"+year2005+"\n"+year2004+"\n"+year2003+"\n"+year2002+"\n"+year2001+"\n"+year2000+"");
                break;
                
            case 2006: System.out.println(""+year2006+"\n"+year2005+"\n"+year2004+"\n"+year2003+"\n"+year2002+"\n"+year2001+"\n"+year2000+"");
                break;
                
            case 2005: System.out.println(""+year2005+"\n"+year2004+"\n"+year2003+"\n"+year2002+"\n"+year2001+"\n"+year2000+"");
                break;
                
            case 2004: System.out.println(""+year2004+"\n"+year2003+"\n"+year2002+"\n"+year2001+"\n"+year2000+"");
                break;
                
            case 2003: System.out.println(""+year2003+"\n"+year2002+"\n"+year2001+"\n"+year2000+"");
                break;
                
            case 2002: System.out.println(""+year2002+"\n"+year2001+"\n"+year2000+"");
                break;
                
            case 2001: System.out.println(""+year2001+"\n"+year2000+"");
                break;
                
            case 2000: System.out.println(""+year2000+"");
                break;
            
        }//end of switch statement
        
        
    }//end of main method
    
    
}//end of class
