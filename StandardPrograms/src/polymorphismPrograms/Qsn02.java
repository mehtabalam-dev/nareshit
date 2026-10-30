package polymorphismPrograms;

public class Qsn02 {

    public static void main(String[] args) {

        Ride r;

        r = new BikeRide(10);
        System.out.println(r.calculateFare());

        r = new AutoRide(10);
        System.out.println(r.calculateFare());

        r = new CabRide(10);
        System.out.println(r.calculateFare());
        
        BikeRide bk = new BikeRide(20);
        System.out.println(bk.calculateFare(2));
        

        CabRide c = new CabRide(10);
        System.out.println(c.calculateFare(1.5));
    }
}


abstract class Ride {

    protected double distance;

    public Ride(double distance) {
        this.distance = distance;
    }

    public abstract double calculateFare();
}


class BikeRide extends Ride {

    public BikeRide(double distance) {
        super(distance);
    }

    @Override
    public double calculateFare() {
        return distance * 5;
    }

    public double calculateFare(double surgeMultiplier) {
        return calculateFare() * surgeMultiplier;
    }
}


class AutoRide extends Ride {

    public AutoRide(double distance) {
        super(distance);
    }

    @Override
    public double calculateFare() {
        return distance * 10;
    }

    public double calculateFare(double surgeMultiplier) {
        return calculateFare() * surgeMultiplier;
    }
}


class CabRide extends Ride {

    public CabRide(double distance) {
        super(distance);
    }

    @Override
    public double calculateFare() {
        return (distance * 15) + 50;
    }

    public double calculateFare(double surgeMultiplier) {
        return calculateFare() * surgeMultiplier;
    }
}