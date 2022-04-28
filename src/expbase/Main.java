package expbase;

public class Main {

    public static void main(String[] args) {
    Animal dog = new Animal ("canis");
    dog.isAlive=true;
    dog.name="Szarik";

        System.out.println(dog.name);
        System.out.println("species: " +dog.species + " name: "+dog.name);
        /* spacer/karmienie musi być przed wyświetleniem wagi psa */
        System.out.println("dog weight is: "+dog.weight);


        Human marcin = new Human();
        marcin.firstName="Marcin";
        marcin.lastName="Motyl";
        marcin.age=29;

        /* Car mustang = new Car("Mustang","Ford");
        mustang.age=5;
        mustang.engine=280.0;
        mustang.millage=10000.0; */

        marcin.setSalary(10000.0);
        System.out.println(marcin.getSalary());

        Car Lambo = new Car("Diablo","Lamborghini");
        Lambo.setValue(1000000.0);
        System.out.println("Wartosc Lambo to: "+Lambo.getValue());
        System.out.println(marcin.getCar());
    }
}
