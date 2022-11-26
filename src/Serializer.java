import java.io.*;
import java.util.HashMap;

public class Serializer {

//Methods to manage my serialization and deserialization

    public static void serializeHashMap(HashMap<String, LifeCoach> tasksHashMap) {
        try {
            FileOutputStream fileOut = new FileOutputStream("taskHashMap.ser");
            // ^ opening a connection to a new file and allowing to connect
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            // ^ streaming data from an object into a file
            out.writeObject(tasksHashMap);
            // take this object I'm lobbing it
            out.close();
            // close it once we are done with the file
            fileOut.close();
            // close it once we are done with the file
            System.out.println("Serialized data is saved!");


        } catch (IOException i) {
            i.printStackTrace();
            // history of all the methods that were called - allows us to see where the code went wrong.
            //principle of a stack is similar to pringles - last in, first out
        }

    }


// we need to read from the file object.ser the data for our employee
// and if possible create a new employee otherwise return null

    public static void deserializeHashMap(){
// we need to read from the file object.ser the data for our employee
// and if possible create a "new employee". Otherwise, return null.

        HashMap<String, LifeCoach> tasksHashMap;
        // this creates an object of type employee to receive data from file or return

        try {
            // read object from a file
            FileInputStream file = new FileInputStream("taskHashMap.ser");
            // create a connection to a file
            ObjectInputStream in = new ObjectInputStream(file);

            // method for deserialization for an object
            tasksHashMap = (HashMap<String, LifeCoach>) in.readObject();
            // ^ read object and convert data to type Employee

            in.close();
            file.close();

            System.out.println("Object has been deserialized");
            System.out.println(tasksHashMap.size());

        } catch (IOException i){
            i.printStackTrace();

        }catch (ClassNotFoundException c){
            c.printStackTrace();
        }


    }
}


