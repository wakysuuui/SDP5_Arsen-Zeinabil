import java.util.Objects;

public class Robot {
    private MovementStrategy movementStrategy;

    public Robot(MovementStrategy movementStrategy) {
        setMovementStrategy(movementStrategy);
    }

    public void setMovementStrategy(MovementStrategy movementStrategy) {
        this.movementStrategy = Objects.requireNonNull(
                movementStrategy,
                "Movement strategy cannot be null"
        );
    }

    public double calculateTravelTime(double distance) {
        if (!Double.isFinite(distance) || distance <= 0) {
            throw new IllegalArgumentException(
                    "Distance must be a finite positive number"
            );
        }

        return movementStrategy.calculateTravelTime(distance);
    }
}