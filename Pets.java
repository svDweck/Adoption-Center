public class Pets {

    int age;        // The pets age
    String name;    // The pets name
    String color;   // The color of the pet

    // Creates a new pet
    public Pets(int age, String name, String color){
        this.age = age;
        this.name = name;
        this.color = color;
    }

    // Returns the pets age
    public int getAge(){
        return age;
    }

    // Returns the pets name
    public String getName(){
        return name;
    }

    // Returns the pets color
    public String getColor(){
        return color;
    }

    // Returns the animal breed
    public String getBreed(){
        return "pet";
    }
}
