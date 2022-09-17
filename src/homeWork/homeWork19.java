package homeWork;
//Дано : int []a = {1, 2, 3, 4, 5, 6};
//Написать метод, который будет принимать два параметра:
// - Массив данных
// - Число
//Метод должен добавлять в конец принимаемого массива
//число из параметров и возвращать изменённый массив!

//Без использования метода Arrays.copyOf и подобных!


import java.lang.reflect.Array;
import java.util.ArrayList;

public class homeWork19 {
    public static void main(String[] args) {
        ArrayList<Integer> newArr = new ArrayList<>();
        int[] a = {1, 2, 3, 4, 5, 6};
        arrExtension(a, 7);
    }

    public static int[] arrExtension(int[] arr, int number) {
        int[] newArr = new int[0];
        return newArr;
    }
}
