package com.gmail.daniel.r.heiniger.tetrominoes.actions;

import com.gmail.daniel.r.heiniger.tetrominoes.Tetromino;
import com.gmail.daniel.r.heiniger.tetrominoes.TetrominoI;
import com.gmail.daniel.r.heiniger.tetrominoes.actions.mocks.KeyEventMock;
import com.gmail.daniel.r.heiniger.utilities.DefaultComponent;
import org.junit.Before;
import org.junit.Test;

import java.awt.event.KeyEvent;

import static org.junit.Assert.assertEquals;

public class KeyEventActionTest {

    private Tetromino tetromino;
    private KeyEvent unboundKey;

    @Before
    public void setup(){
        tetromino = new TetrominoI();
        unboundKey = new KeyEvent(new DefaultComponent(), 1, 1, 1, 1, '0');
    }

    @Test(expected = KeyEventAction.InvalidKeyPressed.class)
    public void nullKeyEventThrowsInvalidKeyPressed(){
        KeyEventAction.getMovementActionFromKeyCode(null, tetromino);
    }

    @Test
    public void unboundKeyMapsToDefaultAction(){
        assertEquals(new DefaultMovementAction(tetromino), KeyEventAction.getMovementActionFromKeyCode(unboundKey, tetromino));
    }

    @Test
    public void whenZIsPressed_returnLeftAction(){
        assertEquals(new LeftMovementAction(tetromino), KeyEventAction.getMovementActionFromKeyCode(new KeyEventMock(KeyEvent.VK_Z), tetromino));
    }

}
