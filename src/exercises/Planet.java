package exercises;

import java.time.LocalDate;

public enum Planet {

    MERCURY(1,5),
    VENUS(2.5,10.5),
    EARTH(3,7),
    MARS(4.2,3.6),
    JUPITER(9,15),
    SATURN(9,5),
    URANUS(3.2,6),
    NEPTUNE(4.1,9),
    PLUTO(8,8*Math.pow(10,28)-45);

    private final double mass;

    private final double distanceSun;

    Planet(double mass,double distanceSun){
        this.mass=mass;
        this.distanceSun=distanceSun;
    }

    public double getMass() {
        return mass;
    }

    public double getDistanceSun() {
        return distanceSun;
    }

    LocalDate

    @Override
    public String toString() {
        return "Planet{" +
                "mass=" + mass +
                ", distanceSun=" + distanceSun +
                '}'+super.toString();
    }
}
