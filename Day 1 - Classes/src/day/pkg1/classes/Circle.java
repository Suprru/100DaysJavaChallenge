package day.pkg1.classes;
class Circle {
    
    //The radius of this circle
    double radius;
    
    //Construct a circle object 
    Circle(){
    }
    
    //Constructs a circle object
    Circle (double newRadius ){
            radius = newRadius;
    }
    
    //Returns the a;rea of the circle
    double getArea(){
        return (3.142 * Math.pow(radius,2));
    }
    
    //Set new radius for the circle
    public void setRadius (double newRadius ){
        radius = newRadius;
    }
}
