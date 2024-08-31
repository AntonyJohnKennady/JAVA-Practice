class Rectangle{
    int length,breadth;
    Rectangle(int Inputlength,int Inputbreath){
        this.length=Inputlength;
        this.breadth=Inputbreath;
    }

    int  calculateArea()
    {
        return length * breadth;
    }
    int calculatePerimeter(){
        return  2 * (length * breadth);
    }
}
public class Solution {
    public static void main(String[] args) {
        Rectangle rectangle2x3=new Rectangle(2,3);
        Rectangle rectangle5x6=new Rectangle(5,6);
        System.out.println("Area of Rectangle (2 x 3) is: "+rectangle2x3.calculateArea());
        System.out.println("Perimeter of Rectangle(2x3) is :"+rectangle2x3.calculatePerimeter());
        System.out.println("Area of Rectanlge(5x6) is :"+rectangle5x6.calculateArea());
        System.out.println("Perimeter of Rectangle(5x6) is: "+rectangle5x6.calculatePerimeter());
    }
}
