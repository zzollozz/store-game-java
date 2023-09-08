package Java_control;

import java.io.IOException;
import java.util.Scanner;

public class View {
    public static void Start() throws IOException {
        Machine machine = new Machine();
        boolean flag = true;
        while (flag == true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Выберите пункт меню:\n 1) Добавить игрушку\n 2) Розыграть игрушку\n" +
                    " 3) Забрать игрушку\n 4) Просмотреть сколько игрушек осталось в машине\n " +
                    "5) Просмотреть сколько игрушек еще не забрали\n 6) Выход");
            int nomber = sc.nextInt();
            switch (nomber){
                case 1:
                    System.out.println("Выберите какую игрушку хотите добавить:\n 1) Куклу\n 2) Робота\n 3) Конструктор");
                    int number2 = sc.nextInt();
                    System.out.println("Введите количество игрушек:");
                    int quan = sc.nextInt();
                    System.out.println("Введите вероятность выпадения игрушки:");
                    int wein = sc.nextInt();
                    if (wein > 100 || 0 > wein){
                        System.out.println("Вероятность выпадения должна быть от 1 до 100");
                        break;
                    }
                    machine.add_toys(number2, quan, wein);
                    break;
                case 2:
                    machine.raffle(machine.list, machine.list2);
                    break;
                case 3:
                    machine.extradition(machine.list2);
                    break;
                case 4:
                    machine.toys_in_machite(machine.list);
                    break;
                case 5:
                    machine.toys_not_extradition(machine.list2);
                    break;
                case 6:
                    flag = false;
                    break;
            }
        }
    }
}
