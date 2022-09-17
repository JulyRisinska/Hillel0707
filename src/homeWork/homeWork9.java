package homeWork;

public class homeWork9 {
    public static void main(String[] args) {
//        С помощью Цикл в цикле

        char[][] chars = new char[3][4];
        char[][] chars2 = {{'*', '*', '*', '*', '*'}, {'*', '*', '*', '*', '*'}, {'*', '*', '*', '*', '*'}};

        for (int i = 0; i < chars2.length; i++) {
            for (int j = 0; j < chars2[i].length; j++) {
                System.out.print(" " + chars2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
