public class Cats extends Pets {


    // Creates a new cat
    public Cats(int age, String name, String color){
        super(age, name, color);
    }

    // Returns the cats age
    public int getAge(){
        return age;
    }

    // Returns the cats name
    public String getName(){
        return name;
    }

    // Returns the cats color
    public String getColor(){
        return color;
    }

    // Returns the animal breed
    public String getBreed(){
        return "cat";
    }

    // Returns a string with a description of the cat
    public String adoptionPapers(){
        String papers = "This " + color + " cat's name is " + name + ", and it is " + age + " years old.";

        return papers;
    }
}
