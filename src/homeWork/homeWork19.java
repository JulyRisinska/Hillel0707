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
        int[] array = {1, 2, 3, 4, 5, 6};
        int[] arrNew = arrExtension(array, 7);
        for (int a : arrNew) {
            System.out.println(a + " ");
        }
    }

    public static int[] arrExtension(int[] arr, int number) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[arr.length] = number;
        return newArr;
    }
}
