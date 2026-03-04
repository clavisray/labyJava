import java.util.ArrayList;
import java.util.List;

public class TodoList {
    private List<Task> tasks = new ArrayList<Task>();
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

    // dodać void setTitle/editTitle/editTask
}