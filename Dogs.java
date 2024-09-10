public class Dogs extends Pets {

    // Creates a new dog
    public Dogs(int age, String name, String color){
        super(age, name, color);
    }

    // Returns the dogs age
    public int getAge(){
        return age;
    }

    // Returns the dogs name
    public String getName(){
        return name;
    }

    // Returns the dogs color
    public String getColor(){
        return color;
    }

    // Returns the animal breed
    public String getBreed(){
        return "dog";
    }

    // Returns a string with a description of the dog
    public String adoptionPapers(){
        String papers = "This " + color + " dog's name is " + name + ", and it is " + age + " years old.";

        return papers;
    }
}
