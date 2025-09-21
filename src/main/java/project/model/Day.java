package project.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "days")
public class Day {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date", nullable = false, unique = true)
    private LocalDate date;

    @Enumerated(EnumType.STRING)
    @Column(name = "day_type", nullable = false)
    private DayType dayType;
}
