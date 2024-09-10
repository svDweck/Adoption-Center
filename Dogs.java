public class Dogs extends Pets {


    public Dogs(int age, String name, String color){
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
        return "dog";
    }

    public String adoptionPapers(){
        String papers = "This " + color + " dog's name is " + name + ", and it is " + age + " years old.";

        return papers;
    }
}
