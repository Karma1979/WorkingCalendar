package project;

import org.junit.jupiter.api.Test;
import project.model.CheckDayRequest;
import project.model.CheckDayResponse;
import project.service.CalendarService;
import project.service.CalendarServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalendarServiceImplTest {
    @Test
    void checkDay_shouldReturnDayOff_onSunday() {
        CalendarService calendarService = new CalendarServiceImpl();
        CheckDayRequest request = new CheckDayRequest();
        request.setDate("28.09.2025");

        CheckDayResponse response = calendarService.checkDay(request);

        assertEquals("DAY_OFF", response.getDayType());
        assertEquals(false, response.isWorking());
    }
}
