import java.time.LocalDate;

public class LifeCoach {
    String taskManager;
    String taskDescription;

    String priorityColor;
    LocalDate startDate;
    LocalDate deadline;

    public LifeCoach(String taskManager, String taskDescription, String priorityColor, LocalDate startDate, LocalDate deadline) {
        this.taskManager = taskManager;
        this.taskDescription = taskDescription;
        this.priorityColor = priorityColor;
        this.startDate = startDate;
        this.deadline = deadline;


    }

    @Override
    public String toString() {
        return "LifeCoach{" +
                "taskManager='" + taskManager + '\'' +
                ", taskDescription='" + taskDescription + '\'' +
                ", priorityColor='" + priorityColor + '\'' +
                ", startDate=" + startDate +
                ", deadline=" + deadline +
                '}';
    }
}

