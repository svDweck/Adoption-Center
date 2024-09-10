public class SmallDogs extends Dogs{

    int breed;      // Represents the dog breed. 1: Poodle; 2: Chihuahua; Other: Mixed Breed

    public SmallDogs(int age, String name, String color, int breed){
        super(age, name, color);
        this.breed = breed;
    }

    public String getBreed(){

        if(breed == 1){
            return "Poodle";
        }else if(breed == 2){
            return "Chihuahua";
        }else{
            return "Mixed Breed";
        }
    }

    public String adoptionPapers(){
        String papers = "This " + color + " " + getBreed() + " dog's name is " + name + ", and it is " + age + " years old.";

        return papers;
    }
}
