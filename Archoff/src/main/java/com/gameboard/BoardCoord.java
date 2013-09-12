/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gameboard;

/**
 *
 * @author Vadim
 */
public class BoardCoord {
    private int x, y;
    public BoardCoord(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public int getManhattan(BoardCoord destination) {
        return Math.abs(this.x -destination.getX()) + Math.abs(this.y - destination.getY());
    }
    public void setCoord(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
