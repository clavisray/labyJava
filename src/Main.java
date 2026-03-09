import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("==== To Do App ====");
        TodoList lista = new TodoList();

        boolean loopStatus = true;

        Scanner s = new Scanner(System.in);

        while(loopStatus){
            System.out.println("1. View the entire tasks list");
            System.out.println("2. Add new task");
            System.out.println("3. Edit task");
            System.out.println("4. Edit title");
            System.out.println("5. Mark as completed");
            System.out.println("6. Delete task");
            System.out.println("7. Quit");

            int userInput = s.nextInt();

            switch(userInput){
                case 1: {
                    lista.print();

                    break;
                }
                case 2: {
                    System.out.println("Insert name for a new task");
                    s.nextLine();

                    String title = s.nextLine();

                    lista.addTask(title);

                    break;
                }
                case 3: {
                    System.out.println("Choose a task that you need to delete");
                    lista.print();

                    int id = s.nextInt();
                    s.nextLine();

                    System.out.println("Enter new title");
                    String newTitle = s.nextLine();

                    System.out.println("Pick prio");
                    int newPrio = s.nextInt();
                    s.nextLine();

                    boolean ok = lista.editTask(id, newTitle, newPrio);
                    if (!ok) {
                        System.out.println("Task not found or title invalid.");
                    }

                    break;
                }
                case 4: {
                    System.out.println("Please select task, that needs a new title");
                    lista.print();

                    int id = s.nextInt();
                    s.nextLine();

                    System.out.println("Enter new title");
                    String newTitle = s.nextLine();

                    boolean ok = lista.editTitle(id, newTitle);
                    if (!ok) {
                        System.out.println("Task not found or title invalid.");
                    }

                    break;
                }
                case 5: {
                    System.out.println("Please choose a task that you completed");
                    lista.print();

                    int id = s.nextInt();
                    s.nextLine();

                    boolean ok = lista.markDone(id);
                    if(!ok) {
                        System.out.println("Task not found");
                    }

                    break;
                }
                case 6: {
                    System.out.println("Please choose a task that you need to delete");
                    lista.print();

                    int id = s.nextInt();
                    s.nextLine();

                    boolean ok = lista.removeTask(id);
                    if(!ok) {
                        System.out.println("Task not found");
                    }

                    break;
                }
                case 7: {
                    loopStatus = false;

                    break;
                }
                default: {
                    System.out.println("Invalid option. Choose between 1-7");
                    }
            }
        }

        s.close();

    }

}