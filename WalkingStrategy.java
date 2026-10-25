public class WalkingStrategy implements MovementStrategy {
    private static final double STEP_LENGTH = 0.5;
    private static final double STEP_DURATION = 0.8;

    @Override
    public double calculateTravelTime(double distance) {
        double steps = Math.ceil(distance / STEP_LENGTH);
        return steps * STEP_DURATION;
    }
}