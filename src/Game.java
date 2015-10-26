
import java.awt.Color;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lamonta
 */

public class Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GameBoard board = new GameBoard();
        
        Doctor doc = new Doctor(3,5);
        Dalek d1 = new Dalek(1,1);
        Dalek d2 = new Dalek(4,7);
        Dalek d3 = new Dalek(7,2);
        
        
        int row = doc.getRow();
        int col = doc.getCol();
        board.putPiece(row, col, Color.BLUE);
        
        int rowD1 = d1.getRow();
        int colD1 = d1.getCol();
        board.putPiece(rowD1, colD1, Color.YELLOW);
        
        int rowD2 = d2.getRow();
        int colD2 = d2.getCol();
        board.putPiece(rowD2, colD2, Color.YELLOW);
        
        int rowD3 = d3.getRow();
        int colD3 = d3.getCol();
        board.putPiece(rowD3, colD3, Color.YELLOW);
        
        
        
        if(rowD1 == rowD2||rowD1 == rowD3 && colD1 == colD2||colD1 == colD3){
            d1.crash(); 
            board.removePiece(rowD1,colD1);
            int rowC1 = rowD1;
            int colC1 = colD1;
            board.putPiece(rowC1, colC1, Color.RED);
        }
        
//        board.putPiece(row,col,Color.GREEN);
        
        
        
    }
}
