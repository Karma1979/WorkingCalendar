package project;

import org.junit.jupiter.api.Test;
import project.entity.DayType;
import project.model.UpdateDayRequest;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ModelTest {

    @Test
    void updateDayRequest_shouldCorrectlySetAndGetFields() {

        UpdateDayRequest request = new UpdateDayRequest();
        String expectedDate = "31.12.2025";
        DayType expectedDayType = DayType.DAY_OFF;

        request.setDate(expectedDate);
        request.setDayType(expectedDayType);

        assertEquals(expectedDate, request.getDate());
        assertEquals(expectedDayType, request.getDayType());
    }
}
