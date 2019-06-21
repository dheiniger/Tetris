package com.gmail.daniel.r.heiniger.tetrominoes.actions;

import com.gmail.daniel.r.heiniger.tetrominoes.TetrominoI;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class MovementActionTest{

    @Test
    public void whenMovementTypesAreDifferent_MovementsAreNotEqual(){
        assertNotEquals(new LeftMovementAction(new TetrominoI()),
                                new RightMovementAction(new TetrominoI()));
    }

    @Test
    public void whenMovementTypesMatch_MovementsAreEqual(){
        assertEquals(new LeftMovementAction(new TetrominoI()),
                new LeftMovementAction(new TetrominoI()));
    }
}
