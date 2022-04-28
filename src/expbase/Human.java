package expbase;

public class Human {
    public expbase.Car Car;
    String firstName;
    String lastName;
    Integer age;
    private Double salary;
    Phone mobile;
    private Car car;


    public Car getCar() {
        return this.car;
    }

    public void setCar(Car car){
        if(this.salary>car.value) {
            System.out.println("Kupiles auto");
            this.car=car;
        }else if (this.salary > car.value /12.0) {
            System.out.println("Kupiles na raty");
            this.car=car;
        }else{
            System.out.println("Nie stac Cie");
        }
    }

    public Double getSalary() {
        System.out.println("Dane o wyplacie byly pobrane " + java.time.LocalDateTime.now());
        return salary;
    }

    public void setSalary(Double salary) {
        if (salary < 0) {
            System.out.println("Kwota nie moze byc nizsza niz 0");
        } else {
            System.out.println("nowa wypłata wysłana do systemu księgowego");
            System.out.println("odbierz aneks od pani Hani");
            System.out.println("nie ukrywaj dochodów, ZUS i US i tak cie znajdą");
            this.salary = salary;

        }
    }
}
