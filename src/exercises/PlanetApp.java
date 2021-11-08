package exercises;

public class PlanetApp {
    public static void main(String[] args) {
        Planet[] planet=Planet.values();
        for (Planet p:planet){
            System.out.println(p);
        }
    }
}
