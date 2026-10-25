public class Main {
    public static void main(String[] args) {
        double distance = 100.0;

        Robot robot = new Robot(new WalkingStrategy());
        System.out.printf(
                "Walking: %.2f seconds%n",
                robot.calculateTravelTime(distance)
        );

        robot.setMovementStrategy(new WheeledStrategy());
        System.out.printf(
                "Wheeled: %.2f seconds%n",
                robot.calculateTravelTime(distance)
        );

        robot.setMovementStrategy(new FlyingStrategy());
        System.out.printf(
                "Flying: %.2f seconds%n",
                robot.calculateTravelTime(distance)
        );
    }
}