package homeWork;

public class homeWork10 {
    public static void main(String[] args) {
//        С помощью циклов FOR вывести в консоль пирамиду из звездочек

        char[][] chars = new char[4][4];
        char space = ' ';
        char[][] chars2 = {{' ', ' ', ' ', ' ', '*', ' ', ' '}, {' ', ' ', ' ', '*', ' ', '*', ' '}, {' ', ' ', '*', ' ', '*', ' ', '*', ' '}, {' ', '*', ' ', '*', ' ', '*', ' ', '*'}, {'*', ' ', '*', ' ', '*', ' ', '*', ' ', '*'}};

        for (int i = 0; i < chars2.length; i++) {
            for (int j = 0; j < chars2[i].length; j++) {
                System.out.print(" " + chars2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
