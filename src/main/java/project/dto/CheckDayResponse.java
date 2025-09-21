package project.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CheckDayResponse {
    private String requestedDate;
    private String dayType;
    private boolean isWorking;
}
