package JavaHomeWork.Zadaha;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        PrintPlaner printPlaner = new PrintPlaner();
        ArrayList<String> planer = printPlaner.planerArrayList();
        ArrayList<String[]> planerSplite = printPlaner.planerSplite(planer);
        PrintTaskInPlaner printTaskInPlaner = new PrintTaskInPlaner(planerSplite);
        AddTask addTask = new AddTask();
        Talking ask = new Talking();
        Scanner in = new Scanner(System.in);
        ask.firstQuestion();
        int chois = in.nextInt();
        if (chois == 1) { // "1. Распечатать планер"
            printPlaner.printPlaner(planerSplite);
        } else if (chois == 2) { // "2. Вывести на экран задачи с определнным уровнем приоритета"
            ask.choisTask();
            int choisTask = in.nextInt();
            printTaskInPlaner.printTask(choisTask);
        } else if (chois == 3) { // "3. Добавить задачу в планер"
            addTask.writeInPlaner();
        } else
            System.out.println("Выш вбор непонятен");
    }
}
