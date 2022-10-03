package homeWork.homeWork21;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Burger {
    public static void main(String[] args) {
        List<String> components = new ArrayList<>();
        String yesNo = "";
        do {
            System.out.println("Do you want add additional ingredients? Please, choose \"yes\" or \"no\" ");
            yesNo = getYesNo();
            if (yesNo.equals("yes")) {
                System.out.println("Choose additional ingredients: \n1. sauce \n2. cheese \n3. cutlet \n" +
                        "Enter number or name component and tap \"Enter\"");
                components.add(getNameComponents());
            }
        } while (!yesNo.equals("no"));

        int result = sumComponents(components);
        System.out.println("Burger cost " + result);
    }

    private static String getNameComponents() {
        Scanner scanner = new Scanner(System.in);
        String getNameComponent = scanner.nextLine();
        return getNameComponent;
    }

    private static String getYesNo() {
        Scanner scanner = new Scanner(System.in);
        String getYesNo = scanner.nextLine();
        return getYesNo;
    }


    public static int sumComponents(List<String> components) {
        int price = 50;
        String getNameComponent = null;
        System.out.println("Base price : " + price);
        for (String item : components) {
            Components ingredient = Components.findByKey(Integer.parseInt(item));
            System.out.println(ingredient.name() + " : " + ingredient.getPrice());
            price += Components.findByKey(Integer.parseInt(item)).getPrice();
        }
        System.out.println("___________________");
        return price;
    }

}
