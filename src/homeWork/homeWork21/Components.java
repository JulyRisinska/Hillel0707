package homeWork.homeWork21;

import java.beans.IntrospectionException;
import java.util.HashMap;
import java.util.Map;

public enum Components {
    sauce(1, 10),
    cheese(2, 20),
    cutlet(3, 30);

    private int numComponent;
    private int price;

    Components(int numComponents, int price) {
        this.numComponent = numComponent;
        this.price = price;
    }

    private static Map<Integer, Components> map = null;

    static {
        map = new HashMap<Integer, Components>();
        for (Components v : Components.values()) {
            map.put(v.numComponent, v);
        }
    }

    public static Components findByKey(int i) {
        return map.get(i);
    }

    public int getNumComponents() {
        int numComponents = 0;
        return numComponents;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        String numComponents = null;
        return "Components{" +
                "numComponents=" + numComponents +
                ", price=" + price +
                '}';
    }
}
