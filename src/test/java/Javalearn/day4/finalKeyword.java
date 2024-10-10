package Javalearn.day4;


    class ord {
       final int x=100;
    }

    public class finalKeyword {
        public static void main(String[] args) {
            ord objAb = new ord();
//            objAb.x = 200;
            System.out.println(objAb.x);
        }
    }