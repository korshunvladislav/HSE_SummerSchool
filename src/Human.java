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
        Human vlad = new Human("Vladislav", "Korshun", 18);
        System.out.println("Human 1 с именем " + elon.name + " " + elon.surname);
        System.out.println("Human 2 с именем " + vlad.name + " " + vlad.surname);
    }
}
