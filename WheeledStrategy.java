public class WheeledStrategy implements MovementStrategy {
    private static final double MAX_SPEED = 5.0;
    private static final double ACCELERATION = 2.0;

    @Override
    public double calculateTravelTime(double distance) {
        double accelerationTime = MAX_SPEED / ACCELERATION;
        double accelerationDistance =
                0.5 * ACCELERATION * accelerationTime * accelerationTime;

        if (distance <= 2 * accelerationDistance) {
            return 2 * Math.sqrt(distance / ACCELERATION);
        }

        double cruisingDistance = distance - 2 * accelerationDistance;
        double cruisingTime = cruisingDistance / MAX_SPEED;

        return 2 * accelerationTime + cruisingTime;
    }
}