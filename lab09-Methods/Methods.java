//Brian McCabe
//lab9 methods
//3-27-15

//This lab utilizes methods to generate a random sentence

    import java.util.Random; //imports random number class
    import java.util.Scanner;//import scanner

public class Methods {
    
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in);
        
        
        System.out.print("Type 'C' or 'c' to generate a random sentence, anything else to quit: ");
        String C = new String ("C");
        String c = new String ("c");
        String generate = myScanner.next();
        
        
        
        
        while (generate.equals(C)||generate.equals(c)) {
            
            System.out.println("The "+adjective()+", "+adjective()+" "+subject()+" "+verb()+" the "+adjective()+" "+object()+".");
            System.out.println();
            System.out.print("Type 'C' or 'c' to go again, anything else to quit: ");
            generate = myScanner.next();
        }
        
        
    }
    
    public static String adjective() {
        
        //random numbers for stuff
        Random randomGenerator = new Random();
        int x = randomGenerator.nextInt(10);
        
        String adjective = "";
        
        switch (x) {
            case 0:
                adjective = "happy";
                break;
            case 1: 
                adjective = "troubled";
                break;
            case 2:
                adjective = "smelly";
                break;
            case 3: 
                adjective = "sweet";
                break;
            case 4:
                adjective = "evil";
                break;
            case 5:
                adjective = "mighty";
                break;
            case 6:
                adjective = "tiny";
                break;
            case 7: 
                adjective = "funny";
                break;
            case 8:
                adjective = "fat";
                break;
            case 9:
                adjective = "yellow";
                break;
        }
        
        return adjective;
        
    }
    
    public static String verb() {
        
        //random numbers for stuff
        Random randomGenerator = new Random();
        int x = randomGenerator.nextInt(10);
        
        String verb = "";
        
        switch (x) {
            case 0: 
                verb = "ran";
                break;
            case 1:
                verb = "jumped";
                break;
            case 2:
                verb = "hiked";
                break;
            case 3: 
                verb = "destroyed";
                break;
            case 4:
                verb = "lathered";
                break;
            case 5:
                verb = "shimmied";
                break;
            case 6:
                verb = "launched";
                break;
            case  7: 
                verb = "swatted";
                break;
            case 8: 
                verb = "adjusted";
                break;
            case 9:
                verb = "bathed";
                break;
                
        }
        
        return verb;
    }
    
    public static String subject() {
        
        //random numbers for stuff
        Random randomGenerator = new Random();
        int x = randomGenerator.nextInt(10);
        
        String subject = "";
        
        switch (x) {
            case 0:
                subject = "dog";
                break;
            case 1:
                subject = "dragon";
                break;
            case 2:
                subject = "wizard";
                break;
            case 3:
                subject = "llama";
                break;
            case 4:
                subject = "fairy";
                break;
            case 5:
                subject = "monster";
                break;
            case 6:
                subject = "professor";
                break;
            case 7:
                subject = "fishy";
                break;
            case 8:
                subject = "angel";
                break;
            case 9: 
                subject = "gnome";
                break;
        }
        
        return subject;
        
    }
    
    public static String object() {
        
        //random numbers for stuff
        Random randomGenerator = new Random();
        int x = randomGenerator.nextInt(10);
        
        String object = "";
        
        switch (x) {
            case 0:
                object = "refridgerator";
                break;
            case 1:
                object = "cookie";
                break;
            case 2:
                object = "fire";
                break;
            case 3:
                object = "lemonade";
                break;
            case 4:
                object = "knife";
                break;
            case 5:
                object = "lamp";
                break;
            case 6:
                object = "calculator";
                break;
            case 7:
                object = "snickers";
                break;
            case 8:
                object = "mousepad";
                break;
            case 9:
                object = "teddybear";
                break;
        }
        
        return object;
    }
    
}