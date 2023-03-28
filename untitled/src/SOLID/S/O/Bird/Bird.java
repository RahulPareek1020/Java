package SOLID.S.O.Bird;

public class Bird {
    //String name;
    String type;
    //String color;

    Bird(String t) {
        this.type = t;
    }

    void Fly() {
        if(this.type == "sparrow") {
            System.out.println(this.type + " flies");
        }
        else if(this.type == "pigeon") {
            System.out.println(this.type + " flies");
        }
    }

    void Eat() {
        if(this.type == "sparrow") {
            System.out.println(this.type + " eats");
        }
        else if(this.type == "pigeon") {
            System.out.println(this.type + " eats");
        }
    }
}
