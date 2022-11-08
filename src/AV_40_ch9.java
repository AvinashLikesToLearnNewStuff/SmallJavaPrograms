class Circle{
    private int radius;
//    private String name;

    public void setRadius(int n){
        boolean is_valid = false;
        int num = n;
        while (is_valid){
            if (num == n){
//                is_valid==true
            }
            else {
                System.out.println("please enter valid number");
            }

        }

        this.radius = n;
    }
    public int getRadius(){
        return radius;
    }

//    public void setId(int m) {
//       id = m;
//    }
//
//    public int getId() {
//        return id;
//    }
//}
//public class AV_40_ch9 {
//    public static void main(String[] args) {
//    myEmployee riya = new myEmployee();
//    //riya.id = 45;
//    //riya.name = "Riya Mahnedru";
//    riya.setName("Riya Mahendru");
//    riya.setId(23);
//    System.out.println(riya.getName());
//    System.out.println(riya.getId());
//    }
}