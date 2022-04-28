package expbase;

public class Car {
    final String model;
    final String producer;
    Double engine;
    Integer age;
    Double millage;
    public Double value;
    public Car(String model, String producer) {
        this.model = model;
        this.producer = producer;
}
        public Double getValue(){
        return value;
    }
    public Double setValue(Double value){
        return this.value=value;
    }
}
