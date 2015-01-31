//Brian McCabe
//HW 2 Arithmetic Calculations
//1-31-15

//This homework gives practice in manipulating data stored in variables, in running
//simple calculations, and in printing the numerical output.

public class Arithmetic {
    //main method for program
    public static void main (String[] args) {
        
        //assumed input variables
        //Number of pairs of socks
        int nSocks=3;
        //Cost per pair of socks
        //(‘$’ is part of the variable name)
        double sockCost$=2.58;

        //Number of drinking glasses
        int nGlasses=6;
        //Cost per glass
        double glassCost$=2.29;

        //Number of boxes of envelopes
        int nEnvelopes=1;
        //cost per box of envelopes
        double envelopeCost$=3.25;
        double taxPercent=0.06; //tax for all items
        
        //Print item being bought, how many, and cost per
        System.out.println("3 socks were purchased for $2.58 per sock");
        System.out.println("6 glasses were purchased for $2.29 per glass");
        System.out.println("1 envelope was purchased for $3.25");
        
        //declare variables for total cost of items as doubles
        double totalSockCost$;
        double totalGlassCost$;
        double totalEnvelopeCost$;
        
        //compute values without tax
        totalSockCost$ = nSocks * sockCost$;
        totalGlassCost$ = nGlasses * glassCost$;
        totalEnvelopeCost$ = nEnvelopes * envelopeCost$;
        
        //Find sales tax cost for each item
        double sockSales$, glassSales$, envelopeSales$; //sets values as doubles
        sockSales$ = totalSockCost$ * taxPercent * 100;
        int sockSalesInt = (int) sockSales$; //casts to integer
        glassSales$ = totalGlassCost$ * taxPercent * 100;
        int glassSalesInt = (int) glassSales$;
        envelopeSales$ = totalEnvelopeCost$ * taxPercent * 100;
        int envelopeSalesInt = (int) envelopeSales$;
        
        
        
        //Print out cost of each item and the sales tax associated with it
        System.out.println("The total sock cost is $"+
            totalSockCost$+" and its sales tax is $"+sockSalesInt/100.0+"");
        System.out.println("The total glasses cost is $"+
            totalGlassCost$+" and its sales tax is $"+glassSalesInt/100.0+"");
        System.out.println("The total envelope cost is $"+
            totalEnvelopeCost$+" and its sales tax is $"+envelopeSalesInt/100.0+"");
            
        //declare variables for total cost(no tax), total cost, and total sales tax
        double totalNoTax, totalCost, totalSalesTax; //sets variables as doubles
        totalNoTax = totalSockCost$ + totalGlassCost$ + totalEnvelopeCost$;
        totalSalesTax = (sockSalesInt/100.0) + (glassSalesInt/100.0) + 
            (envelopeSalesInt/100.0);
        totalCost = totalNoTax + totalSalesTax;
        
        //print out the totals
        System.out.println("The total cost with out tax is $"+totalNoTax+" ");
        System.out.println("The total sales tax is $"+totalSalesTax+" ");
        System.out.println("The total cost with tax is $"+totalCost+"0 ");
        
        
        
    } //end of main method
    
    
}//end of class