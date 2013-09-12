/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gameboard;

import java.util.List;

/**
 *
 * @author Vadim
 */
public interface GamePieceInterface {
    public int getHP();
    public int[] getBoardPos();
    public int[] getFieldPos();
    public Status getStatus();
    public List<BoardCoord> getMoves();
    public boolean move(BoardCoord dest);
}
