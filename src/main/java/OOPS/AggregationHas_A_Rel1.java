package OOPS;
class Square{
    int side=5;
}
class Circle {
    Square sq = new Square();
    public void circleArea(int radius) {
        System.out.println("circle area using side of square as circle's radius is: " + Math.PI*radius * radius);
    }
}


public class AggregationHas_A_Rel1 {
        public static void main(String[] args) {

            Circle c = new Circle();
            c.circleArea(c.sq.side);

        }
    }
