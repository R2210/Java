class Test { 
int maxSpeed = 120; 
}   
 class Car extends Test {
 int maxSpeed = 180;
 void display() {                
System.out.println("Maximum Speed: " + super.maxSpeed); } }   
class Vehicle { 
public static void main(String[] args) {
Car small = new Car(); 
small.display(); } } 
