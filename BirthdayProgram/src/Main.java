public class Main {
    public static void main(String[] args) throws Exception {

        Person run = new Person();

        System.out.println("Simulation results: " + run.calculateBirthdayProbability(33, 10000) + "%");
    }
}
