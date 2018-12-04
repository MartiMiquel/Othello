/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import Util.Color;
import Util.Direction;
import Util.Point;
import java.util.Random;
import java.util.Vector;

/**
 *
 * @author itiel
 */
public class OthelloData {
    
    int[][] board;
    int[] pieces;
    Vector<Point> WPieces;
    Vector<Point> BPieces;
    
    public OthelloData()
    {
        board = new int[8][8];
        pieces = new int[3];
        WPieces = new Vector();
        BPieces = new Vector();
        
        pieces[0] = pieces[2] = 2;
        pieces[1] = 60;

        Random rnd = new Random();
        
        if ((1+rnd.nextInt(2))==1) {
            board[3][3]=Color.BLACK.getColor(); 
            board[3][4]=Color.WHITE.getColor();
            board[4][3]=Color.WHITE.getColor();
            board[4][4]=Color.BLACK.getColor();
            
            WPieces.add(new Point(3,4));
            WPieces.add(new Point(4,3));
            
            BPieces.add(new Point(3,3));
            BPieces.add(new Point(4,4));
            
        }else{
            board[3][3]=Color.WHITE.getColor(); 
            board[3][4]=Color.BLACK.getColor();
            board[4][3]=Color.BLACK.getColor();
            board[4][4]=Color.WHITE.getColor();
            
            BPieces.add(new Point(3,4));
            BPieces.add(new Point(4,3));
            
            WPieces.add(new Point(3,3));
            WPieces.add(new Point(4,4));
        }
    }
    
    
    /**
    * Looks if the piece given is valid for the policies
    * established.
    * 
    * @param  color of piece
    * @return   true if is a valid color of piece, false otherwise.
    */
    private boolean validColor(int color)
    {
        return color==Color.BLACK.getColor() && color==Color.WHITE.getColor();
    }
    
    /**
    * Looks if movement is valid from given position.
    * 
    * @param  p is a point which contains x abcissa coordinate
    *         and y ordinate coordinate.
    * @return   true if can effect movement, false otherwise.
    */
    public boolean isEmpty(Point p)
    {
        return this.board[p.getX()][p.getY()]==0;
    }
    
    /**
    * Given a point, function will change the color of all pieces between the given
    * piece and the same color that function will find in the given direction.
    * 
    * @param p is a empty point of the board
    * @param dir is in which direction it can be effect the movement.
    * @param color is the color of piece which it will put in the board.
    */
    public void changeColor(Point p, int dir, int color)
    {
        int i=p.getX(), j=p.getY();
        
        boolean found = false;
        
        Point pt;
        
        while (!found) {

            if (dir == Direction.LEFT.getVal()) {
                j--;
            }else if(dir == Direction.RIGHT.getVal()) {
                j++;
            }else if(dir == Direction.UP.getVal()) {
                i--;
            }else if(dir == Direction.DOWN.getVal()) {
                i++;
            }else if(dir == Direction.LEFTDUP.getVal()) {
                i--;
                j--;
            }else if(dir == Direction.RIGHTDUP.getVal()) {
                i--;
                j++;
            }else if(dir == Direction.LEFTDDOWN.getVal()) {
                i++;
                j--;
            }else if(dir == Direction.RIGHTDDOWN.getVal()) {
                i++;
                j++;
            }
            
            pt = new Point(i, j);
            
            if (getColor(pt) == color) {
                found = true;
            }else{
                this.board[pt.getX()][pt.getY()]=color*(-1);
                this.pieces[color+1]++;
                this.pieces[(color*(-1))+1]--;
                
                if(color==Color.BLACK.getColor()) {
                    BPieces.add(pt);
                    WPieces.remove(pt);
                }else{
                    WPieces.add(pt);
                    BPieces.remove(pt);                   
                }
            }        
        }
    }
    
    /**
    * Add a given piece into the board.
    * 
    * @param  p is a point which contains x abcissa coordinate
    *         and y ordinate coordinate.
    * @param color piece
    */
    public void add(Point p, int dir, int color)
    {
        if (validColor(color)) {
            
            this.board[p.getX()][p.getY()] = color;
            
            if (color == Color.BLACK.getColor()) BPieces.add(p);
            else WPieces.add(p);
            
            pieces[color+1]++;
            pieces[1]--;
            
            int mask=0x1;
            
            for (int i=0; i<8; i++) {

               if ((dir & mask) != 0) changeColor(p, mask, color);
               mask = (mask << 1);
           }
        }
    }
    
    /**
    * Get the color of piece in a given position.
    * 0 for empty positions.
    * 1 for black color.
    * -1 for white color.
    * 
    * @param  p is a point which contains x abcissa coordinate
    *         and y ordinate coordinate.
    * @return color of piece
    */
    public int getColor(Point p)
    {
        return this.board[p.getX()][p.getY()];
    }
    
    /**
    * Board is square, therefore the size is the same in height
    * and width so returns any of them.
    * 
    * @return size of board in one way.
    */
    public int getSize()
    {
        return 8;
    }
    
    /**
    * Obtain the quantity of pieces for the given color.
    * 
    * @return size of board
    */
    public int getQuantityOfPieces(int color)
    {
        return pieces[color+1];
    }
    
    /**
    * Obtain the quantity of pieces in the board.
    * 
    * @return size of board
    */
    public int getQuantityOfPiecesOnBoard()
    {
        return pieces[Color.BLACK.getColor()+1]+pieces[Color.WHITE.getColor()+1];
    }
    
    /**
    * Spaces where do not exists pieces.
    * 
    * @return Empty positions in the board
    */
    public int getEmptyPositions()
    {
        return pieces[1];
    }
    
    /**
    * Returns a vector with positions of black pieces in the board.
    * 
    * @return Array with black pieces position
    */
    public Vector<Point> getBlackPieces()
    {
        return BPieces;
    }
    
    /**
    * Returns a vector with positions of black pieces in the board.
    * 
    * @return Array with black pieces position
    */
    public Vector<Point> getWhitePieces()
    {
        return WPieces;
    }
    
    /**
    * Draw the board in the system output.
    * 
    */
    public void drawBoard()
    {
        System.out.print("   ");
        for (int i=0; i<getSize(); i++) System.out.print(i+" ");
        
        System.out.println("\n   - - - - - - - -");
        
        for (int i=0; i<getSize(); i++) {
            System.out.print(i+"| ");
            for (int j=0; j<getSize(); j++) {
                System.out.print(getColor(new Point(i,j))+" ");
            }
            System.out.println("");
        }
    }
}