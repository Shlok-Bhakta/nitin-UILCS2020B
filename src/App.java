import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(new File("nitin.dat"));
        ArrayList<String> cats = new ArrayList<String>();
        ArrayList<String> dogs = new ArrayList<String>();
        ArrayList<String> catPerson = new ArrayList<String>();
        ArrayList<String> dogPerson = new ArrayList<String>();
        int animalLoop = scan.nextInt();

        for (int i = 0; i < animalLoop; i++) {
            String petName = scan.next();
            String petType = scan.next();
            System.out.println(petType);
            if (petType.equals("D")) {
                dogs.add(petName);
            }
            if (petType.equals("C")) {
                cats.add(petName);
            }

           System.out.println(dogs);
           System.out.println(cats);
        }

        int peopleLoop = scan.nextInt();

        for (int i = 0; i < peopleLoop; i++) {

        }

    }
}
