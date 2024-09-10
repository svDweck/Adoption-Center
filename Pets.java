public class Pets {

    int age;
    String name;
    String color;

    public Pets(int age, String name, String color){
        this.age = age;
        this.name = name;
        this.color = color;
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
        return "pet";
    }
}
