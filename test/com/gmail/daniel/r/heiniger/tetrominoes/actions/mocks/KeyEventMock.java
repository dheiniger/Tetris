package com.gmail.daniel.r.heiniger.tetrominoes.actions.mocks;

import com.gmail.daniel.r.heiniger.utilities.DefaultComponent;

import java.awt.*;
import java.awt.event.KeyEvent;

public class KeyEventMock extends KeyEvent {

    private int keyCode;

    public KeyEventMock(int keyCode){
        super(new DefaultComponent(), 1, 1, 1, 1, '0');
        this.keyCode = keyCode;
    }

    public KeyEventMock(Component source, int id, long when, int modifiers, int keyCode, char keyChar, int keyLocation) {
        super(source, id, when, modifiers, keyCode, keyChar, keyLocation);
    }

    @Override
    public int getKeyCode() {
        return keyCode;
    }
}
