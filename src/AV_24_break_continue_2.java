//public class AV_24_break_continue_2 {
//    public static void main(String[] args) {
//       for (int i = 0; i < 50 ; i++){
//       if (i == 2){
//           System.out.println("skipping the next two lines in the code and iterating the loop ");
//           continue;
//       }
//           System.out.println(i);
//           System.out.println("java is great");
//
//
//        }
//
//    }
//}


public class AV_24_break_continue_2 {
    public static void main(String[] args) {

        for(int i=7;i>0;i--){
            if(i==3){
                continue;//continue skips the rest statement
            }
            System.out.println(i);
        }
    }
}