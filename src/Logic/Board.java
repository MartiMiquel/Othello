/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

/**
 *
 * @author marti
 */
public class Board {
    
    static OthelloData data;
    static OthelloMove move;
    
    public Board()
    {
        data = new OthelloData();
        move = new OthelloMove(data);
    }
    
    public int[][] get_tauler()
    {
        return data.board;        
    }
    
    
    
    
    
    
}
