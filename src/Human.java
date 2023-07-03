public class Human {
    int age;
    String name;
    String surname;

    Human(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public static void main(String[] args) {
        Human elon = new Human("Elon", "Musk", 52);
        System.out.println("Human 2 с именем " + elon.name + " " + elon.surname);
    }
}
