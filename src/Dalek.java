

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author naylj6470
 */
public class Dalek {
    
    private int row;
    private int col;
    private boolean hasCrashed;

    
    public Dalek(int startRow, int startCol){
        startRow = (int)(Math.random()*8);
        startCol = (int)(Math.random()*8);  
        row = startRow;
        col = startCol;
    }
    
    public void advanceTowards(Doctor doc){
        
    }
    
    public void crash(){
        hasCrashed = true;
        System.out.println(hasCrashed);
        
    }
    
    public boolean hasCrashed(){
        if(hasCrashed == true){
            return true;
        }else{
            return false;
        }
    }
    
    public int getRow(){
        return this.row;
    }
    
    public int getCol(){
        return this.col;
    }
    
}
