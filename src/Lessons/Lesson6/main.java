package Lessons.Lesson6;

public class main {
    public static void main(String[] args) {

//        int[][] twoDimArray = new int[3][4];
//        twoDimArray[0][0] = 5;
//        twoDimArray[0][1] = 4;
//        twoDimArray[0][2] = 4;
//        twoDimArray[0][3] = 4;
//
//        System.out.println(twoDimArray[0][1]);
//        System.out.println(twoDimArray[1][1]);
//
//        int[][] twoDimArray2 = {{2, 5, 7, 13},
//                                {7, 4, 2, 3},
//                                {2, 3, 4, 7}};
//        for (int i = 0; i < twoDimArray2.length; i++) {
//            for (int j = 0; j < twoDimArray2[i].length; j++) {
//                System.out.print(" " + twoDimArray2[i][j] + " ");
//            }
//            System.out.println();
//        }
//        Method lenght():
        String name = "Yuliia bobo";
        System.out.println(name.length());

//        Method concat():
        String text1 = "Hello";
        String text2 = " I am Yullia";
        System.out.println(text1.concat(text2));

//        Method trim():
        String text3 = "   UUU   ";
        System.out.println(text3.trim());

//        Method endsWith():
        String text4 = "My name is Yullia";
        boolean end = text4.endsWith("UU");
        System.out.println(end);

//        Method toUpperCase()/ toLowerCase():
        String text5 = "hello, hi".toUpperCase();
        System.out.println(text5);

//        Method equals():
        String text6 = "hi";
        String text7 = "hello";
        System.out.println(text6.equals(text7));

//        Method contains():
        String text8 = "Hello and hi";
        String text9 = "and";
        System.out.println(text8.contains(text9));

//        Method charAt():
        String text10 = "Hi and hello";
        System.out.println(text10.charAt(0));

//        Method indexOf():
        String text11 = "Hello";
        System.out.println(text11.indexOf("o"));

//        Method substring():
        String text12 = "Yes, no and maybe";
        System.out.println(text12.substring(4));

//        Method replace():
        String text13 = "Hello and hi";
        System.out.println(text11.replace("hi", "good morning"));

//


    }
}
