public class FlyingStrategy implements MovementStrategy {
    private static final double FLIGHT_SPEED = 10.0;
    private static final double TAKEOFF_TIME = 3.0;
    private static final double LANDING_TIME = 3.0;

    @Override
    public double calculateTravelTime(double distance) {
        return TAKEOFF_TIME + distance / FLIGHT_SPEED + LANDING_TIME;
    }
}