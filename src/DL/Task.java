package DL;

public class Task {
    private static int idCounter = 1;
    private int id;
    private String title;
    private Status status;
    private int storyPoints;
    private Priority priority;

    public Task(String title, Status status, int storyPoints, Priority priority) {
        this(idCounter++, title, status, storyPoints, priority);
    }

    public Task(int id, String title, Status status, int storyPoints, Priority priority) {
        this.id = id;
        this.title = title;
        this.status = status;
        setStoryPoints(storyPoints);
        this.priority = priority;
    }

    public void setStoryPoints(int v) {
        this.storyPoints = (v >= 1 && v <= 10)? v : 10;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCSV(){
        return String.format("%d,%s,%s,%d,%s",
                this.id,
                this.title,
                this.status,
                this.storyPoints,
                this.priority
        );
    }

    @Override
    public String toString() {
        return String.format(
                "№%d %s (сложность: %d приоритет: %s)",
                this.id,
                this.title,
                this.storyPoints,
                this.priority
        );
    }
}


