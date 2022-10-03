package homeWork.homeWork20.main;

import homeWork.homeWork20.cat_dog.animal.Animal;
import homeWork.homeWork20.cat_dog.cat.Cat;
import homeWork.homeWork20.cat_dog.dog.Dog;

import java.util.ArrayList;
import java.util.List;

public class Practice_cat_dog {
    public static void main(String[] args) {
        List< Animal> animals = new ArrayList<Animal>();
//        animals.add(new Dog("Tyzik"));
//        animals.add(new Cat("Vasya"));

        for (Animal animal : animals) {
//            animal.sound();
//            expected: I'm a Dog. My name is Tuzik. Gav
//            expected: I'm a Cat. My name Vasya. May
        }
    }
}
