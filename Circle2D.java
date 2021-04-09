
public class Circle2D {
    private double x;
    private double y;
    private double radius;

    //Constructor for x,y, and radius
    public Circle2D(double x, double y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    //no-arg constructor for default circle.
    public Circle2D(){
        this(0,0,1);
    }
    //getter method for x
    public double getX(){
        return x;
    }
    //mutator method for x
    public void setX(double x){
        this.x = x;
    }
    public double getY(){
        return y;
    }
    public void setY(double y){
        this.y = y;
    }

    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
    //If a point is inside the circle, return true, otherwise return false
    public boolean points(double x, double y){
        double distance = Math.hypot(x,y);
        if( distance <= radius) 
            return true;
        else 
            return false;
    }
    //If a circle is inside another circle, return true, otherwise return false
    public boolean contains(Circle2D circle2D){
        //Math.hypot calculates the distance between points
        double distance = Math.hypot(circle2D.x, circle2D.y);

        if(distance <= Math.abs(this.radius - circle2D.radius))
            return true;
        else 
            return false;
        
    }

    //If a circle overlaps another circle, return true, otherwise return false
    public boolean overlaps(Circle2D circle2D){
        double distance = Math.hypot(circle2D.x, circle2D.y);

        if(distance <= this.radius + circle2D.radius)
            return true;
        else
            return false;
    }

    public static void main(String[] args){
        Circle2D c1 = new Circle2D(2, 2, 5.5);

        System.out.println("C1 area is: " + c1.getArea() + " and C1 perimeter is: " + c1.getPerimeter());
        System.out.println("True/False: C1 contains the coordinates (3,3): " + c1.points(3,3));
        System.out.println("True/False: C1 contain C2 (4,5,10.5): " + c1.contains(new Circle2D(4,5,10.5)));
        System.out.println("True/False: C1 overlap C2(3,5,2.3): " + c1.overlaps(new Circle2D(3,5,2.3)));
        System.out.println("True/False: C1 contains coordinates(40,50): " + c1.points(40,50));
        System.out.println("True/False: C1 contains coordinates(1.4,2.3): " + c1.points(1.4,2.3));
        System.out.println("True/False: C1 overlaps C2(40,20, 20.4): " + c1.overlaps(new Circle2D(40,20,20.4)));
        System.out.println("True/False: C1 contains C2(34,2,20): " + c1.contains(new Circle2D(34,2,20)));
    }

}
