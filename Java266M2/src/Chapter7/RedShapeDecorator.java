/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter7;

/**
 *
 * @author minhvu
 */
public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape shape){
        super(shape);
    }
    @Override
    public String draw(){
        return this.shape.draw()+" and " + setRedBorder(shape);
    }
    private String setRedBorder(Shape shape){
        return "Border Color:Red";
    }
}
