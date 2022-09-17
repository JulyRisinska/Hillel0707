package Lessons.Lesson8;

public class main {
    public static void main(String[] args) {

//        Method equalIgnore Case():
        String text = "Hello I am Yuliia";

        if (text.equalsIgnoreCase("Hello I am Yuliia")) {
            System.out.println("hello");
        } else {
            System.out.println("Fall");
        }

//        Method valueOf():
        int num = 123;
        String temp = String.valueOf(num);
        System.out.println(num);

//        Method parseInt():
        String a = "11";
        int b = Integer.parseInt(a);
        System.out.println(b);

    }
}
