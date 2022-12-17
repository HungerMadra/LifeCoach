import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;
public class taskManager{

    // Create HashMap object with LifeCoach object Values
    HashMap<String, LifeCoach> tasks = new HashMap<>();

    // Initialize Scanner
    Scanner myScanner = new Scanner(System.in);

    // CreateTask Method
    public void createTask() {

// While loop for task creation
        System.out.println("Would You Like To Create A New Task");
        System.out.println("Answer Yes or No");
        String response = myScanner.nextLine();

// Catch non Yes or No responses
        while (!response.equalsIgnoreCase("Yes") && !response.equalsIgnoreCase("No")){
            System.out.println("Answer Yes or No");
            response = myScanner.nextLine();
        }

// Catch response No scenario
        if(response.equalsIgnoreCase("No")){
            System.out.println("Thank You, Have a Great Day");
        }

// Initializing while loop
        while (response.equalsIgnoreCase("Yes")) {
            Scanner myScanner = new Scanner(System.in);

// Start Creating Task Using Prompts
        System.out.println("Lets Create a New Task !");
        System.out.println("Please Enter Unique Task keyID");
        String taskKey = myScanner.nextLine();

// Loop to ensure that Task Key is always unique
            while (tasks.containsKey(taskKey)) {
                System.out.println("keyID " + taskKey + " is already in use");
                System.out.println("Please Enter A Unique Task keyID");
                taskKey = myScanner.nextLine();
            }

// Create task Details
        System.out.println("Who Is In Charge Of Managing This Task");
        String taskMan = myScanner.nextLine();
        System.out.println("Please Enter Task Description");
        String taskDescription = myScanner.nextLine();
        System.out.println("Please Enter Task Priority Color Code");
        String priorityColor = myScanner.nextLine();
// Loop to make sure color codes are red, yellow or green
            while (!priorityColor.equalsIgnoreCase("Red") && !priorityColor.equalsIgnoreCase("Yellow")
                    && !priorityColor.equalsIgnoreCase("Green")){
                System.out.println("Please Choose between - Red, Yellow and Green");
                priorityColor = myScanner.nextLine();
            }
        System.out.println("Please Enter Task Start Date");
        System.out.println("Use Date Format: YYYY-MM-DD ");
        LocalDate startDate = LocalDate.parse(myScanner.next());
        System.out.println("Please Enter Task Deadline");
        System.out.println("Use Date Format: YYYY-MM-DD ");
        LocalDate deadline = LocalDate.parse(myScanner.next());

//Catch deadline before start date Error
        if (deadline.compareTo(startDate) < 0){
            System.out.println("Your Deadline Date Cannot Come Before Project Start Date");
            System.out.println("Please Enter Task Start Date");
            System.out.println("Use Date Format: YYYY-MM-DD ");
            startDate = LocalDate.parse(myScanner.next());
            System.out.println("Please Enter Task Deadline");
            System.out.println("Use Date Format: YYYY-MM-DD ");
            deadline = LocalDate.parse(myScanner.next());
        }

// Create temporary location for tasks
        LifeCoach tempTask = new LifeCoach(taskMan,taskDescription,priorityColor,startDate,deadline);

// Store the information in a HashMap
        tasks.put(taskKey,tempTask);

// reinitialize loop with prompts
            System.out.println("Would You Like To Create A New Task");
            System.out.println("Answer Yes or No");
            response = myScanner.next();
    }

// print task
        System.out.println(tasks.keySet() + " " + tasks.values().toString());
        Serializer.serializeHashMap(tasks);

}

//Create Flow for Reminders/Logs That are Called Once App is Opened

}
