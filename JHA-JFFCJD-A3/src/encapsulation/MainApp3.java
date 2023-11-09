package encapsulation;

public class MainApp3 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.accelerate();
        c1.ABS();

        Car.Engine e1 = c1.new Engine();    // reference of outer class
        e1.combustion();
        e1.fuelType();

        Car.Tyres t1 = c1.new Tyres();      // reference of outer class
        t1.airType();
        t1.tyresType();
    }
}
