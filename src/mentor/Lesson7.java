package mentor;

public class Lesson7 {
    //    Task 1:  5 тварин- гуси та вівці. Вивести усі комбінації, за умовою мінімальної кількості = 1
    public static void main(String[] args) {
        int ship = 4;
        for (int i = 1; i < 5; i++) {
            System.out.println("В хатинці є" + i + "гуска" + ship-- + "вівці");
        }

//        Task 2: 5 тварин- гуси та вівці. Вивести усі комбінації, за умовою мінімальної кількості = 1
//        + змінити закінчення слів
        int shipCount = 4;
        for (int i = 1; i < 5; i++) {
            String duckOne = "duck";
            String sheepOne = "sheep";
            if (i > 1) {
                duckOne="ducks";
            }
            if (shipCount >1){
                sheepOne="sheeps";
            }
            System.out.println("In bilding we have " + i + " " + duckOne + " " + shipCount-- + " " + sheepOne);
            }
//  Порахувати кількість ніг у кожного з розрахунку : гуск має 2 ноги + віця 4 ноги
        int shipCount2 = 4;
        int duckleg = 2;
        int sheepleg = 4;
        for (int i = 1; i < 5; i++) {
            String duckOne = "duck";
            String sheepOne = "sheep";
            if (i > 1) {
                duckOne="ducks";
            }
            if (shipCount >1){
                sheepOne="sheeps";
            }
            System.out.println("In bilding we have " + i + " " + duckOne + " " + shipCount2-- + " " + sheepOne + "number of legs: ");
        }
        }
    }
