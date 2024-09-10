public class Cats extends Pets {

    public Cats(int age, String name, String color){
        super(age, name, color);
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public String getColor(){
        return color;
    }

    public String getBreed(){
        return "cat";
    }

    public String adoptionPapers(){
        String papers = "This " + color + " cat's name is " + name + ", and it is " + age + " years old.";

        return papers;
    }
}
