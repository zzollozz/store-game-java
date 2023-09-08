package Java_control;

import java.util.Scanner;

public class Dol extends Toy_standart{
    public Dol(String name, int quantity, int weight) {
        super(name, quantity, weight);
    }

    @Override
    public String toString() {
        return "Dol:"  + name + "; количество: 1шт; выпала с вероятностью: " + weight + "\n";
    }

}
