package day.pkg1.classes;

public class Day1Classes {
    /*Main Method*/
    public static void main(String[] args) {
        // Creating circle with radius 2
        Circle Circle1 = new Circle();
        Circle1.setRadius(2);
        System.out.println("The area of the circle of radius "+ Circle1.radius+ " is " + Circle1.getArea());
        
        // Creating circle with radius 25
        Circle Circle2 = new Circle();
        Circle2.setRadius(25);
        System.out.println("The area of the circle of radius "+ Circle2.radius+ " is " + Circle2.getArea());
        
        // Creating circle with radius 10
        Circle Circle3 = new Circle();
        Circle3.setRadius(10);
        System.out.println("The area of the circle with radius "+Circle3.radius+" is "+ Circle3.getArea());
    }
    
}
