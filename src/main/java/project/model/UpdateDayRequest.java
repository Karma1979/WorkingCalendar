package project.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import project.entity.DayType;

@Getter
@Setter
@NoArgsConstructor
public class UpdateDayRequest {
    private String date;
    private DayType dayType;
}