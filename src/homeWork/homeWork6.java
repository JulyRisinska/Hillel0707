package homeWork;

public class homeWork6 {
    public static void main(String[] args) {
//  Необходимо вывести на экран вот такую последовательность чисел с помощью цикла while:
//  1 2 4 8 16 32 64 128 256 512
        int i = 1;
        while (i < 513) {
            System.out.println(i);
            i *= 2;
        }
    }
}
