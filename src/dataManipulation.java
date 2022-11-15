import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class dataManipulation {
    public static void main(String[] args) throws FileNotFoundException {
        File dataset = new File("person_data.csv");

        Scanner scan = new Scanner(dataset);
        ArrayList<User> users = new ArrayList<>();

        while (scan.hasNextLine()){
            String row = scan.nextLine();
            String[] parts = row.split(",");
            int id = Integer.parseInt(parts[0]);
            String firstName = parts[1];
            String lastName = parts[2];
            String email = parts[3];
            String gender = parts[4];

            User user = new User(id,firstName,lastName,email,gender);

            users.add(user);
        }
        ArrayList<User> femaleList = new ArrayList<>();

        for(User user:users){
            if (user.getGender().equals("Female")){
                femaleList.add(user);
            }
        }
        System.out.println("Number of females in the dataset: " + femaleList.size());
    }
}