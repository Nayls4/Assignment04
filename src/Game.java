
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
        
        Doctor doc = new Doctor(0,0);
        Dalek d1 = new Dalek(0,0);
        Dalek d2 = new Dalek(0,0);
        Dalek d3 = new Dalek(0,0);
        
        
        int rowC1 = 0;
        int rowC2 = 0;
        int rowC3 = 0;
        int colC1 = 0;
        int colC2 = 0;
        int colC3 = 0; 
        
        int row = doc.getRow();
        int col = doc.getCol();
        board.putPiece(row, col, Color.GREEN);
        
        int rowD1 = d1.getRow();
        int colD1 = d1.getCol();
        board.putPiece(rowD1, colD1, Color.YELLOW);
        
        int rowD2 = d2.getRow();
        int colD2 = d2.getCol();
        board.putPiece(rowD2, colD2, Color.YELLOW);
        
        int rowD3 = d3.getRow();
        int colD3 = d3.getCol();
        board.putPiece(rowD3, colD3, Color.YELLOW);
            
        while(true){
            //if 1 and 2 crash
            if(rowD1 == rowD2 && colD1 == colD2){
                d1.crash(); 
                d2.crash();
                board.removePiece(rowD1,colD1);
                board.removePiece(rowD2,colD2);
                rowC1 = rowD1;
                colC1 = colD1;
                board.putPiece(rowC1, colC1, Color.RED);         
            }
            //if 2 and 3 crash
            else if(rowD2 == rowD3 && colD2 == colD3){
                d2.crash();
                d3.crash();
                board.removePiece(rowD2,colD2);
                board.removePiece(rowD3,colD3);
                rowC2 = rowD2;
                colC2 = colD2;
                board.putPiece(rowC2, colC2, Color.RED);
            }
            //if 1 and 3 crash
            else if(rowD1 == rowD3 && colD1 == colD3){
                d1.crash();
                d3.crash();
                board.removePiece(rowD1,colD1);
                board.removePiece(rowD3,colD3);
                rowC3 = rowD3;
                colC3 = colD3;
                board.putPiece(rowC3, colC3, Color.RED);
            }

//            if(rowD1 == row && colD1 == col || rowD2 == row && colD2 == col || rowD3 == row && colD3 == col || rowC1 == row && colC1 == col || rowC2 == row && colC2 == col || rowC3 == row && colC3 == col){
//                doc.caught();
//                board.removePiece(row,col);
//                board.removePiece(rowD1,colD1);
//                rowC3 = rowD3;
//                colC3 = colD3;
//                board.putPiece(rowC3, colC3, Color.RED);
//                
//                System.out.println("caught");
//            }


            Coordinate c = board.getClick();
            if(c.getRow() > row+1 || c.getRow() < row-1 || c.getCol() > col+1 || c.getCol() < col-1){
                //remove old piece                
                board.removePiece(row, col);
                //figure out where they clicked
                row = (int)(Math.random()*8);
                col = (int)(Math.random()*8);
                //put piece where clicked
                board.putPiece(row, col, Color.GREEN);            
                }else{
                //remove old piece                
                board.removePiece(row, col);
                //figure out where they clicked
                row = c.getRow();
                col = c.getCol();
                //put piece where clicked
                board.putPiece(row, col, Color.GREEN); 
            }



            if(row > rowD1){
                //remove old piece                
                board.removePiece(rowD1, colD1);
                //figure out where they clicked
                rowD1++;
                //put piece where clicked
                board.putPiece(rowD1, colD1, Color.YELLOW);
            }else if(row < rowD1){
                //remove old piece                
                board.removePiece(rowD1, colD1);
                //figure out where they clicked
                rowD1--;
                //put piece where clicked
                board.putPiece(rowD1, colD1, Color.YELLOW);
            }
            if(col > colD1){
                //remove old piece                
                board.removePiece(rowD1, colD1);
                //figure out where they clicked
                colD1++;
                //put piece where clicked
                board.putPiece(rowD1, colD1, Color.YELLOW);
            }else if(col < colD1){
                //remove old piece                
                board.removePiece(rowD1, colD1);
                //figure out where they clicked
                colD1--;
                //put piece where clicked
                board.putPiece(rowD1, colD1, Color.YELLOW);
            }
            
            
            if(row > rowD2){
                //remove old piece                
                board.removePiece(rowD2, colD2);
                //figure out where they clicked
                rowD2++;
                //put piece where clicked
                board.putPiece(rowD2, colD2, Color.YELLOW);
            }else if(row < rowD2){
                //remove old piece                
                board.removePiece(rowD2, colD2);
                //figure out where they clicked
                rowD2--;
                //put piece where clicked
                board.putPiece(rowD2, colD2, Color.YELLOW);
            }
            if(col > colD2){
                //remove old piece                
                board.removePiece(rowD2, colD2);
                //figure out where they clicked
                colD2++;
                //put piece where clicked
                board.putPiece(rowD2, colD2, Color.YELLOW);
            }else if(col < colD2){
                //remove old piece                
                board.removePiece(rowD2, colD2);
                //figure out where they clicked
                colD2--;
                //put piece where clicked
                board.putPiece(rowD2, colD2, Color.YELLOW);
            }
        }    
    }
}