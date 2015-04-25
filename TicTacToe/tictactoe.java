    import java.util.Scanner;
    import java.util.Random;
    
public class tictactoe {
    
    public static void main(String[]args) {
        
        Scanner myScanner = new Scanner(System.in);
        Random random = new Random();
        
        int [][] board = new int [3][3];
        int x=1;
        for (int i=0; i<board.length; i++) {
            for (int j=0; i<board[i].length; j++) {
                board[i][j] = x;
                x++;
                
            }
        }
        
        for (int i=0; i<board.length; i++) {
            for (int j=0; j<board[i].length; j++) {
                System.out.print(board[i][j] + "\t");
            }
            System.out.println();
        }
    
    }

    
}