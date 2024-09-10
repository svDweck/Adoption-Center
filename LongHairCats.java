public class LongHairCats extends Cats{

     int breed;     // Represents the cat breed. 1: Maine Coon; 2: Persian; Other: Mixed Breed

    // Creates a new long haired cat
     public LongHairCats(int age, String name, String color, int breed){
         super(age, name, color);
         this.breed = breed;
     }

     // Returns the breed of the cat in String form
     public String getBreed(){

         if(breed == 1){
             return "Maine Coon";
         }else if(breed == 2){
             return "Persian";
         }else{
             return "Mixed Breed";
         }
     }

    // Returns a string with a description of the cat
    public String adoptionPapers(){
        String papers = "This " + this.color + " " + getBreed() +  " cat's name is " + this.name + ", and it is " + this.age + " years old.";

        return papers;
    }
}
