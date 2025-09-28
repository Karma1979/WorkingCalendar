package project.model;

import lombok.Data;
import project.entity.DayType;

@Data
public class UpdateDayRequest {
    private String date;
    private DayType dayType;
}