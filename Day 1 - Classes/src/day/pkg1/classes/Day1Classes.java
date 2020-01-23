package day.pkg1.classes;

public class Day1Classes {

    public static void main(String[] args) {
        Circle Circle1 = new Circle();
        Circle1.setRadius(2);
        System.out.println("The area of the circle of radius "+ Circle1.radius+ " is " + Circle1.getArea());
        
        Circle Circle2 = new Circle();
        Circle2.setRadius(25);
        System.out.println("The area of the circle of radius "+ Circle2.radius+ " is " + Circle2.getArea());
        
        Circle Circle3 = new Circle();
        Circle3.setRadius(10);
        System.out.println("The area of the circle with radius "+Circle3.radius+" is "+ Circle3.getArea());
    }
    
}
