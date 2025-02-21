package dev.magadiflo.app.record03;

public class Main {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Hola", 2023);
        System.out.println("pair = " + pair);
        System.out.println(pair.first());
        System.out.println(pair.second());

        Person person = new Person("Romy", 65, new Person.Contact("romy@gmail.com", "943858588"));
        System.out.println("person = " + person);
    }
}
