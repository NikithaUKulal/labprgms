/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1;

/**
 *
 * @author smv
 */
class Shape{
    public void draw(){
        System.out.println("Draw a shape ");
    }
    public void erase(){
        System.out.println("Erase a shape ");
    }
}
class Circle extends Shape{
    @Override
    public void draw(){
        System.out.println("Drawing a circle ");
    }
    public void erase(){
        System.out.println("Erasing a circle ");
    }
}
class Triangle extends Shape{
    @Override
    public void draw(){
        System.out.println("Drawing a triangle");
    }
    public void erase(){
        System.out.println("Erasing a triangle ");
    }
}
class Square extends Shape{
    @Override
    public void draw(){
        System.out.println("Drawing a square");
    }
    public void erase(){
        System.out.println("Erasing a square ");
    }
}

public class TestShape {
    public static void main(String[] args){
        Shape[] shapes=new Shape[3];
        shapes[0]=new Circle();
        shapes[1]=new Triangle();
        shapes[2]=new Square();
        for(int i=0;i<shapes.length;i++){
            shapes[i].draw();
            shapes[i].erase();
            System.out.println("--------------");
        }
    }
    
}
