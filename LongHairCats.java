public class LongHairCats extends Cats{

     int breed;     // Represents the cat breed. 1: Maine Coon; 2: Persian; Other: Mixed Breed

     public LongHairCats(int age, String name, String color, int breed){
         super(age, name, color);
         this.breed = breed;
     }

     public String getBreed(){

         if(breed == 1){
             return "Maine Coon";
         }else if(breed == 2){
             return "Persian";
         }else{
             return "Mixed Breed";
         }
     }


    public String adoptionPapers(){
        String papers = "This " + this.color + " " + getBreed() +  " cat's name is " + this.name + ", and it is " + this.age + " years old.";

        return papers;
    }
}
