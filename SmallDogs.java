public class SmallDogs extends Dogs{

    int breed;      // Represents the dog breed. 1: Poodle; 2: Chihuahua; Other: Mixed Breed

    // Creates a new small dog
    public SmallDogs(int age, String name, String color, int breed){
        super(age, name, color);
        this.breed = breed;
    }

    // Returns the breed of the dog in String form
    public String getBreed(){

        if(breed == 1){
            return "Poodle";
        }else if(breed == 2){
            return "Chihuahua";
        }else{
            return "Mixed Breed";
        }
    }

    // Returns a string with a description of the dog
    public String adoptionPapers(){
        String papers = "This " + color + " " + getBreed() + " dog's name is " + name + ", and it is " + age + " years old.";

        return papers;
    }
}
