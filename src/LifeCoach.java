import java.time.LocalDate;

public class LifeCoach {

    public String taskKey;
    public String taskMan;
    public String taskDescription;
    public String priorityColor;
    public LocalDate startDate;
    public LocalDate deadline;

    public LifeCoach(String taskMan, String taskDescription, String priorityColor, LocalDate startDate, LocalDate deadline) {
        this.taskMan = taskMan;
        this.taskDescription = taskDescription;
        this.priorityColor = priorityColor;
        this.startDate = startDate;
        this.deadline = deadline;


    }

    @Override
    public String toString() {
        return  "Task Manager: " + taskMan +
                ", Task Description: " + taskDescription +
                ", Priority: " + priorityColor +
                ", Start Date: " + startDate +
                ", Deadline: " + deadline;
    }


    public void print(){
        System.out.println(taskMan + " " + taskDescription + " " + startDate + " " + deadline);
    }
}

