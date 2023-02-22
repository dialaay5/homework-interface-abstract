package org.example;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MovePoint extends Movement{

    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;

    public MovePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public int moveUp() {
        return (y -= ySpeed);
    }

    @Override
    public int moveDown() {
        return (y += ySpeed);
    }

    @Override
    public int moveLeft() {
        return (x -= xSpeed);
    }

    @Override
    public int moveRight() {
        return (x += xSpeed);
    }

    @Override
    public String toString() {
        return "MovePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
}
