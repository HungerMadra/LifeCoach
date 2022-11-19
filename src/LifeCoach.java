import java.time.LocalDate;

public class LifeCoach {
    String taskName;
    String taskDescription;
    String taskManager;
    LocalDate startDate;
    LocalDate deadline;


    public LifeCoach (String taskName, String taskDescription, String taskManager, LocalDate startDate, LocalDate deadline) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskManager = taskManager;
        this.startDate = startDate;
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return "LifeCoach{" +
                "taskName='" + taskName + '\'' +
                ", taskDescription='" + taskDescription + '\'' +
                ", taskManager='" + taskManager + '\'' +
                ", startDate=" + startDate +
                ", deadline=" + deadline +
                '}';
    }
}

