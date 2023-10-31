// Unique Main class for Threads - AirportTrafficController
class AirportTrafficController {
    public static void main(String[] args) {
        // A simple threading example - Simulating two runways in an airport
        Thread runway1 = new Thread(() -> {
            System.out.println("Flight is landing on Runway 1.");
            // Some runway landing operations
            System.out.println("Flight has landed on Runway 1.");
        });

        Thread runway2 = new Thread(() -> {
            System.out.println("Flight is landing on Runway 2.");
            // Some runway landing operations
            System.out.println("Flight has landed on Runway 2.");
        });

        runway1.start();
        runway2.start();
    }
}
