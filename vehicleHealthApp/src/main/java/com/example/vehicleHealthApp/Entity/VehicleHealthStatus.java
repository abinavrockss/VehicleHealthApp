pacakage com.example.vehicleHealthApp.Entity;

import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
public class VehicleHealthStatus {
    @Id
    @GeneratedValue
    private Long id;

    private double healthScore;         // between 0 and 1
    private boolean serviceNeeded;

    private LocalDateTime checkedAt;

    @ManyToOne
    private Vehicle vehicle;
}
