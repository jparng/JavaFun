public class GeometricObject {
    private String color = "White";
    private boolean filled;
    private java.util.Date dateCreated;

    //default geometric object
    public  GeometricObject() {
        dateCreated = new java.util.Date();
    }
    //constructs specific geometric object
    public GeometricObject(String color, boolean filled){
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    //return color
    public String getColor(){
        return color;
    }
    //sets new color
    public void setColor(String color){
        this.color = color;
    }

    public boolean isFilled(){
        return filled;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }

    public java.util.Date getDateCreated(){
        return dateCreated;
    }

    //return string rep of object
    public String toString(){
        return "created on " + dateCreated +  "\nColor: " + color + 
            " and is it filled?: " + filled;
    }

}
