import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(new File("nitin.dat"));
        ArrayList<String> cats = new ArrayList<String>();
        ArrayList<String> dogs = new ArrayList<String>();
        ArrayList<String> allPeople = new ArrayList<String>();
        ArrayList<String> allPeopleTypes = new ArrayList<String>();
        ArrayList<String> allPetsTypes = new ArrayList<String>();
        ArrayList<String> allPets = new ArrayList<String>();        
        ArrayList<String> catPerson = new ArrayList<String>();
        ArrayList<String> dogPerson = new ArrayList<String>();
        int animalLoop = scan.nextInt();

        for (int i = 0; i < animalLoop; i++) {
            String petName = scan.next();
            String petType = scan.next();

            if (petType.equals("D")) {
                dogs.add(petName);
            }
            if (petType.equals("C")) {
                cats.add(petName);
            }
            allPets.add(petName);
            allPetsTypes.add(petType);
        }

        int peopleLoop = scan.nextInt();

        for (int i = 0; i < peopleLoop; i++) {
            String personName = scan.next();
            String personType = scan.next();

            if (personType.equals("D")) {
                dogPerson.add(personName);
            }
            if (personType.equals("C")) {
                catPerson.add(personName);
            }
            allPeople.add(personName);
            allPeopleTypes.add(personType);

        }

        
        for(int i = 0; i < allPeople.size(); i++){
            //checks for all of the arrays
            String outputString = "";
            if(allPeopleTypes.get(i).equals("C")){
                outputString+=allPeople.get(i);
                outputString = outputString + " CAT ";
                for(int j = 0; j<cats.size(); j++){
                    if(!(cats.get(j) == null)){
                        outputString+=cats.get(j);
                        cats.set(j, null);
                        break;
                    }
                }
                

            }
            if(allPeopleTypes.get(i).equals("D")){
                outputString+=allPeople.get(i);
                outputString = outputString + " DOG ";
                for(int j = 0; j<dogs.size(); j++){
                    if(!(dogs.get(j) == null)){
                        outputString+=dogs.get(j);
                        dogs.set(j, null);
                        break;
                    }
                }
            }
            System.out.println(outputString);
        }




    }
}
