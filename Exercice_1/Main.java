import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        DogOwner dogOwner = new DogOwner();

        dogOwner.setAge(30);
        dogOwner.setFirstName("Coulibaly");
        dogOwner.setLastName("Mouhamed");

        Dog dog = new Dog();

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Entrez l'heure ");

            int time = scanner.nextInt();

            dog.setDrinkTime(time);

            System.out.println(dog.getDrinkTime());

            if (dog.needsToGo() == true) {

                System.out.println("Un chien de " + dogOwner.getFirstName() + " " + dogOwner.getLastName() +
                        " " + dogOwner.getAge() + " " + "doit être promené");

            } else {

                System.out.println("Un chien de " + dogOwner.getFirstName() + " " + dogOwner.getLastName() +
                        " " + dogOwner.getAge() + " " + " ne doit être promené");

            }
        } catch (Exception e) {

            // TODO: handle exception
        }

    }
}
