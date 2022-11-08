   class circle{
        static int radius;
        public static double getPerimeter() {
            return (2 * 3.14 * radius);
        }

        public static double getArea(){
            return (3.14*radius*radius);
            }
        }


public class AV_39_practice_questions {



    public static void main(String[] args) {
        circle sq = new circle();
        sq.radius = 2;
        System.out.println(sq.radius);
        System.out.println(sq.getPerimeter());
        System.out.println(sq.getArea());

    }
}