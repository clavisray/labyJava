public class Task {

    private final int id;
    private String title;
    private int priority = 1;
    private boolean done = false;

    public Task(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public boolean isDone() { return done; }
    public int getPriority() { return priority;}

    public void toggleDone() { done = !done; }
    public void markDone() { done = true; }

    public void setTitle(String newTitle) {
        if(newTitle != null && !newTitle.trim().isEmpty()) {
            this.title = newTitle;
        }
    }

    @Override
    public String toString() {
        return "[" + id + "]" + ", title: " + title + " ,priority: " + priority + " | status " + (done ? "[x]" : "[ ]");
    }
}
