public class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(double side1, double side2, double side3, String color, boolean filled){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        setFilled(filled);
        setColor(color);

    }

    public Triangle(){
    }

    public double getSide1(){
        return side1;
    }

    public double getSide2(){
        return side2;
    }

    public double getSide3(){
        return side3;
    }
    //Getting area using Heron's formula when knowing three sides.
    public double getArea(){
        double a = this.getPerimeter() / 2;
        return Math.sqrt(a * (a - side1) * (a - side2) * (a - side3));
    }

    public double getPerimeter(){
        return side1 + side2 + side3;
    }
    //Returns true if triangle is real
    public static boolean isTriangle(double side1, double side2, double side3){
        return ((side1 + side2 > side3) && (side1 + side3 > side2) && (side3 + side2 > side1));
    }
    //This modifies the toString method
    public String toString(){
         return super.toString() + "\nTriangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3; 
     }

    public static void main(String[] args){
        Triangle t1 = new Triangle(1,1.5,1);
        t1.setColor("Yellow");
        t1.setFilled(true);

        System.out.println(t1.toString());
        System.out.println("Is T1 a real triangle? : " + isTriangle(t1.getSide1(),t1.getSide2(),t1.getSide3()));
        
    if(isTriangle(t1.getSide1(),t1.getSide2(),t1.getSide3())){
        System.out.println("The area of T1 : " + t1.getArea());
        System.out.println("The perimeter of T1: " + t1.getPerimeter());
    }
    else
        System.out.println("Error: triangle is not real, please input the approriate side lengths.");
    
        
    }
}
