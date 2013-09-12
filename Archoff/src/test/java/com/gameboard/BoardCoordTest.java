/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gameboard;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Vadim
 */
public class BoardCoordTest {
    BoardCoord coord;
    int initx, inity = 0;
    public BoardCoordTest() {  
    }
    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() throws Exception {
        coord = new BoardCoord(initx, inity);
    }

    @After
    public void tearDown() {
    }
    @Test
    public void initialCaseReturnsOrigo() {
        assertTrue(coord.getX() == 0 && coord.getY() == 0);
    }
    @Test
    public void creatingNewCoordReturnsCorrectPos() {
        BoardCoord newCoord = new BoardCoord(25, -78);
        assertTrue(newCoord.getX() == 25 && newCoord.getY() == -78);
    }
    @Test
    public void settingNewCoordReturnsCorrectValues() {
        int newx = 73;
        int newy = -8889;
        coord.setCoord(newx, newy);
        assertTrue(coord.getX() == newx && coord.getY() == newy);
    }
    @Test
    public void straightXDistanceReturnsCorrectly() {
        int newx = 10;
        BoardCoord dest = new BoardCoord(newx, inity);
        assertEquals(newx, coord.getManhattan(dest));
    }
    @Test
    public void straightYDistanceReturnsCorrectly() {
        int newy = -8;
        BoardCoord dest = new BoardCoord(initx, newy);
        assertEquals(Math.abs(newy), coord.getManhattan(dest));
    }
    @Test
    public void northeastDistanceReturnsCorrectly() {
        int newx = 5;
        int newy = 5;
        BoardCoord dest = new BoardCoord(newx, newy);
        assertEquals(Math.abs(newy+newx), coord.getManhattan(dest));
    }
    @Test
    public void southwestDistanceReturnsCorrectly() {
        int newx = -10;
        int newy = -15;
        BoardCoord dest = new BoardCoord(newx, newy);
        assertEquals(Math.abs(newx) + Math.abs(newy), coord.getManhattan(dest));
    }
    @Test
    public void southeastDistanceReturnsCorrectly() {
        int newx = 67;
        int newy = -12;
        BoardCoord dest = new BoardCoord(newx, newy);
        assertEquals(Math.abs(newx)+Math.abs(newy), coord.getManhattan(dest));
    }
    @Test
    public void twoPositivePointsDistanceReturnsCorrectly() {
        BoardCoord dest = new BoardCoord(11, 7);
        coord.setCoord(13, 17);
        assertEquals(12, coord.getManhattan(dest));
    }
    @Test
    public void twoNegativePointsDistanceReturnsCorreclty() {
        BoardCoord dest = new BoardCoord(-23, -5);
        coord.setCoord(-111, -79);
        assertEquals(88+74, coord.getManhattan(dest));
    }
    @Test
    public void twoMixedPointsDistanceReturnsCorreclty() {
        BoardCoord dest = new BoardCoord(8, 16);
        coord.setCoord(-2, -4);
        assertEquals(10+20, coord.getManhattan(dest));
    }
}
