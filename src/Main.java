import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("==== To Do App ====");
        TodoList lista = new TodoList();

        boolean loopStatus = true;

        while(loopStatus){
            System.out.println("1. View the entire tasks list");
            System.out.println("2. Add new task");
            System.out.println("3. Edit task");
            System.out.println("4. Mark as completed");
            System.out.println("5. Delete task");
            System.out.println("6. Quit");

            int userInput = 0;
            Scanner s = new Scanner(System.in);
            s.nextInt();
            s.close();

            switch(userInput){
                case 1: {
                    lista.print();
                    break;
                }
                case 2: {
                    System.out.println("Insert name for a new task");
                    String title = "";

                    Scanner sc = new Scanner(System.in);
                    title = sc.nextLine();
                    sc.close();

                    lista.addTask(title);
                    break;
                }
                case 3: {
                    int id;
                    break;
                }
                case 4: {
                    lista.print();
                    System.out.println("Please choose a task that you completed");

                    int id = 0;
                    Scanner scc = new Scanner(System.in);
                    scc.nextInt();
                    scc.close();

                    lista.markDone(id);
                    break;
                }
                case 5: {
                    lista.print();
                    System.out.println("Please choose a task that you need to delete");

                    int id = 0;
                    Scanner scca = new Scanner(System.in);
                    scca.nextInt();
                    scca.close();

                    lista.removeTask(id);
                    break;
                }
                case 6: {
                    loopStatus = false;
                }
                default: {
                    System.out.println("Invalid option. Choose between 1-6");
                    }
            }
        }

    }

}