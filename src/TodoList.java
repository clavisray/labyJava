import java.util.ArrayList;
import java.util.List;

public class TodoList {
    private List<Task> tasks = new ArrayList<>();
    private int nextId = 1;

    private Task findById(int id) {
        for (Task t : tasks) {
            if (t.getId() == id) {
                return t;
            }
        }
        return null;
    }

    public void print() {
        if (tasks.isEmpty()) {
            System.out.println("Task list is empty");
            return;
        }

        for (Task t : tasks) {
            System.out.println(t);
        }
    }

    public void addTask(String title) {
        tasks.add(new Task(nextId++, title));
    }

    public boolean markDone(int id) {
        Task t = findById(id);
        if (t == null) return false;
        t.markDone();
        return true;
    }

    public boolean removeTask(int id) {
        return tasks.removeIf(task -> task.getId() == id);
    }

    // poprawić pod walidację czy newTitle jest pusty, póki co niezależnie od rezultatu wynik jest true

    public boolean editTitle(int id, String newTitle) {
        Task t = findById(id);
        if (t == null) return false;

        if (newTitle == null || newTitle.trim().isEmpty()) { return false; }

        t.setTitle(newTitle);
        return true;
    }
}