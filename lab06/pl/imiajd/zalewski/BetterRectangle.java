package pl.ozalewski.po.lab06.pl.imiajd.zalewski;

import java.awt.Rectangle;

public class BetterRectangle extends Rectangle{

    public BetterRectangle(int a, int b){
        this.setLocation(a, b);
        this.setSize(a, b);
    }

    public double getPerimeter(){
        return (2*x)+(2*y);
    }

    public double getArea(){
        return x*y;
    }
}
