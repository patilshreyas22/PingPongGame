package com.c2w.createtable;

import java.awt.*;

public interface Paddle {
    public void draw(Graphics g);
    public void move();
    public int getY();
}
