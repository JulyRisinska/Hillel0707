package homeWork;

public class homeWork11 {
    public static void main(String[] args) {
//        С помощью цикла и условного оператора вывести в консоль:
//  Это 1-й урок!
//      Я выполнил все домашние задания 1-го урока.
//  Это 2-й урок!
//      Я выполнил все домашние задания 2-го урока.
//  Это 3-й урок!
//       Я не выполнил домашние задания 3-го урока.
        for (int i = 1; i <= 3; i++) {
            if (i == 1) {
                System.out.println("Это 1-й урок!\n" + " Я выполнил все домашние задания 1-го урока.");
            } else if (i == 2) {
                System.out.println("Это 2-й урок!\n" + " Я выполнил все домашние задания 2-го урока.");
            } else {
                System.out.println("Это 3-й урок!\n" + " Я не выполнил все домашние задания 3-го урока.");
            }
        }
    }
}