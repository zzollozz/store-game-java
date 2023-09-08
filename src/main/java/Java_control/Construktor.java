package Java_control;

public class Construktor extends Toy_standart{
    public Construktor(String name, int quantity, int weight) {
        super(name, quantity, weight);
    }
    @Override
    public String toString() {
        return "Construktor: " + name + "; количество: 1шт; выпал с вероятностью: " + weight + "\n";
    }


}
