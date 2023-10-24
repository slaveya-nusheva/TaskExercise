package bg.smg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    List<Animal> animals = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int numberAnimals = sc.nextInt();

        for(int i = 0 ; i< numberAnimals; i++) {
            Animal animal;
            System.out.println("Въведете данни за животно: <тип-Cat/Dog/Duck/Fish/HummingBird/Zebra/Tiger> <име> <възраст> <цвят> <пол> <вид храна-МЕАТ/NUTS/FISH_FOOD/GRASS> <диво ли е> <бр крака>");
            AnimalType type = AnimalType.valueOf(sc.next().toUpperCase());
            switch(type) {
                case CAT: animal = new Cat(); break;
                case DOG: animal = new Dog(); break;
                case DUCK: animal = new Duck(); break;
                case FISH: animal = new Fish(); break;
                case HUMMING_BIRD: animal = new HummingBird(); break;
                case ZEBRA: animal = new Zebra(); break;
                case TIGER: animal = new Tiger(); break;
                default: animal = new Animal();
            }
            animal.setType(type);
            animal.setName(sc.next());
            animal.setAge(sc.nextInt());
            animal.setColor(sc.next());
            animal.setGender(sc.next());
            FoodType foodType = FoodType.valueOf(sc.next().toUpperCase());
            animal.setFood(foodType);
            animal.setWild(sc.nextBoolean());
            animal.setNumberOfLegs(sc.nextShort());
            animals.add(animal);
        }

        for(int i =0;i<numberAnimals;i++) {
            animals.get(i).feed();
            animals.get(i).speak();
        }
        sc.close();

    }
}
