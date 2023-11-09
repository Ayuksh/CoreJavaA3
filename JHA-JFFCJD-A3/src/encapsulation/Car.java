package encapsulation;

public class Car {
    public void accelerate(){
        System.out.println("CAR  SPEED WILL INCREASE !!");
    }

    public void ABS(){
        System.out.println("CAS SPEED WILL DECREASE !!");
    }

    class Engine{
        public void combustion(){
            System.out.println("4 STROKE COMBUSTION ");
        }

        public void fuelType(){
            System.out.println("HYDROGEN FUEL");
        }
    }

    class Tyres{
        public void tyresType(){
            System.out.println("TUBE LESS TYRES!!");
        }

        public void airType(){
            System.out.println("NITROGEN !!");
        }
    }


}
