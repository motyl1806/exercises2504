package expbase;

public class Animal {
    private static final Double DEFAULT_DOG_WEIGHT=9.0;
    static final Double DEFAULT_WEIGHT=5.0;
    static final Double DEFAULT_CAT_WEIGHT=2.5;

    final String species;
    Double weight;
    boolean isAlive;
    public String name;

    public Animal(String species) {
        this.isAlive= true;
        this.species = species;

        switch (this.species){
            case "felis":this.weight = DEFAULT_CAT_WEIGHT; break;
            case "canis":this.weight = DEFAULT_DOG_WEIGHT; break;
            default: this.weight = DEFAULT_WEIGHT; break;
        }
    }
    void feed() {
        if (isAlive){
            weight+=1.0;
            System.out.println("Thanks for feeding me");
        } else {
            System.out.println("Your pupy is dead");
        }
    }
    void walkTime(){
        weight-=1.0;
        System.out.println("Thank for walk");
        if (weight<= 0.0){
            isAlive=false;
            System.out.println("You have just killed your pupy... Feed him now!");
        }
    }
}
