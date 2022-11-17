class Shape {
    void draw(){
        System.out.println("Drawing Shape");
    }
    void erase(){
        System.out.println("Erasing Shapes");
    }
    }
    class Circle extends Shape{
     @Override
        void draw() {
         System.out.println("Drawing Circle");
     }
     @Override
        void erase(){
         System.out.println("Erasing Circle");
     }
}
class Triangle extends Shape{
    @Override
    void draw() {
        System.out.println("drawing triangle");
    }
    @Override
    void erase() {
        System.out.println("Erasing Triangle");
    }
}
class Square extends Shape{
    @Override
    void draw() {
        System.out.println("Drawing Square");
    }
    @Override
    void erase() {
        System.out.println("Erasing Square");
    }
}
class Solution {
    public static void main(String args[]) {
        Shape c = new Circle();
        Shape t = new Triangle();
        Shape s = new Square();
        c.draw();
        c.erase();
        t.draw();
        t.erase();
        s.draw();
        s.erase();
    }
}





