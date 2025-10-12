package project.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CheckDayResponse {
    private String requestedDate;
    private String dayType;
    private boolean isWorking;
}
