package Oops;
class Rect{
    private double height;
    private double width;

    public Rect(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double areaOfRectangle(){
        return height * width;
    }
    public double periMeterOfRectangle(){
        return 2 * (height + width);
    }
}
public class Rectangle {
    public static void main(String[] args) {
        Rect rect1 =new Rect(5,4);
        Rect rect2=new Rect(6,2);
        System.out.println("Area of Rectangle1 : "+rect1.areaOfRectangle());
        System.out.println("Perimeter of Rectangle1 : "+rect1.periMeterOfRectangle());
        System.out.println("Area of Rectangle2 : "+rect2.areaOfRectangle());
        System.out.println("Perimeter of Rectangle2 : "+rect2.periMeterOfRectangle());
    }
}
