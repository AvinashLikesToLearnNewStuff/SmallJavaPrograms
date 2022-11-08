public class Practice_qn {
    static class Waterbottle
    {
        static int capacity = 5;
        {
            System.out.println("store water");
        }

        public static void storage() {
        }

        class Program1{
            static String colour = "green";
            static float height = 8.9f;
            static void cool(){
                System.out.println("store cool water");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(Waterbottle.Program1.colour);
        System.out.println(Waterbottle.Program1.height);
        Waterbottle.Program1.cool();
        System.out.println(Waterbottle.capacity);
        Waterbottle.storage();
    }
}
