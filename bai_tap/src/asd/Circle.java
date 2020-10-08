package asd;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle(){
    }
    public Circle(double radius){
        this.radius = radius;
    }
    //pulic

    public double getRadius() {
        return this.radius;
    }
    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }

    //private

//    private double getRadius(){
//        return this.radius;
//    }
//    private double getArea(){
//        return this.radius*this.radius*Math.PI;
//    }

    //protected

//    protected double getRadius() {
//        return this.radius;
//    }
//    protected double getArea(){
//        return this.radius*this.radius*Math.PI;
//    }

    //default


//    double getRadius() {
//        return this.radius;
//    }
//    double getArea(){
//        return this.radius*this.radius*Math.PI;
//    }
}
class TessCircle{
    public static void main(String[] args) {
        Circle cc1 = new Circle(5);
        System.out.println("circle has radius: "+cc1.getRadius()+"\ncircle area: "+cc1.getArea());
    }
}
