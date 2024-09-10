import java.util.*;

public class Main {

    // Prints out a message when the user chooses a pet.
    public static void adopt(Pets pet){
        System.out.println("Congratulations! You adopted " + pet.getName() + ", the " + pet.getAge() +
                " year old " + pet.getColor() + " " + pet.getBreed());
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Creating new pets
        LongHairCats Shadow = new LongHairCats(2, "Shadow", "white", 1);
        LongHairCats Garf = new LongHairCats(3, "Garf", "orange", 2);
        SmallDogs Stella = new SmallDogs(7, "Stella", "black", 1);
        SmallDogs Beverly = new SmallDogs(4, "Beverly", "tan", 2);


        // Prints the pet selection
        System.out.println("Here are the available pets:");
        System.out.println("1: " + Shadow.adoptionPapers() +
        "\n2: " + Garf.adoptionPapers() +
        "\n3: " + Stella.adoptionPapers() +
        "\n4: " + Beverly.adoptionPapers());

        int pet = scanner.nextInt();

        // Determines which pet the user selected, and prints the corresponding adoption message
        switch(pet){
            case 1:
                adopt(Shadow);
                break;

            case 2:
                adopt(Garf);
                break;

            case 3:
                adopt(Stella);
                break;

            case 4:
                adopt(Beverly);
                break;

            default:
                System.out.println("Please choose a valid pet.");
                break;
        }


    }
}
