
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author naylj6470
 */
public class Doctor {
    private int row;
    private int col;
    
    
    public Doctor(int startRow, int startCol){
        startRow = (int)(Math.random()*8);
        startCol = (int)(Math.random()*8);
        row = startRow;
        col = startCol;        
    }
    
    public void move(int row, int col){
//        Coordinate c = board.getClick();
//        if(){
            
//        }
    }
    
    public void caught(){
        
    }
    
    public int getRow(){
        return this.row;
    }
    
    public int getCol(){
        return this.col;
    } 
}