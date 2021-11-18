import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random_Stud = new Random();

        String stud1 = "Матвей";
        String stud2 = "Клим";
        String stud3 = "Егор";
        String stud4 = "Денис";
        String stud5 = "Никита";
        String stud6 = "Артем";
        String stud7 = "Петр";
        String stud8 = "Владислав";

        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<String> list = new ArrayList<>();
        list.add(stud1);
        list.add(stud2);
        list.add(stud3);
        list.add(stud4);
        list.add(stud5);
        list.add(stud6);
        list.add(stud7);
        list.add(stud8);
        System.out.println(list);

        for (int i = 0; i <= list.size()+6; i++) {
            int index = random_Stud.nextInt(list.size());
            String item = list.get(index);
            System.out.println("выбран " + item);
            System.out.println("Оценка: ");
            Scanner sc = new Scanner(System.in);
            int mark = sc.nextInt();
            System.out.println(item+ " Получил " + mark);
            if (mark < 0 || mark > 5) {
                System.out.println("Ошибка");
                break;
            }
            list.remove(item);
            list2.add(item);
            System.out.println("Новый список ");
            String prin = sc.nextLine();
            System.out.println("Вывести студентов");
            if(prin == "print"){
                System.out.println(list2);
            }
            System.out.println(list);

        }
    }
}
