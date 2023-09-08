package Java_control;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.PriorityQueue;

public interface Toy_machine {

    ArrayList <Toy_standart> list = new ArrayList<>();
    ArrayList <Toy_standart> list2 = new ArrayList<>();

    void input_toy (Toy_standart toy);

    void raffle (ArrayList <Toy_standart> list, ArrayList <Toy_standart> list2);

    void extradition (ArrayList <Toy_standart> list) throws IOException;

    void toys_in_machite (ArrayList <Toy_standart> list);

    void toys_not_extradition (ArrayList <Toy_standart> list2);

    void add_toys (int number, int quentity, int weight);
}
