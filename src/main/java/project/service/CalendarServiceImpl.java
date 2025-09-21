package project.service;

import org.springframework.stereotype.Service;
import project.dto.CheckDayRequest;
import project.dto.CheckDayResponse;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Service
public class CalendarServiceImpl implements CalendarService {

    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    @Override
    public CheckDayResponse checkDay(CheckDayRequest request) {
        LocalDate date = LocalDate.parse(request.getDate(), DATE_FORMATTER);

        DayOfWeek dayOfWeek = date.getDayOfWeek();
        boolean isWorking = !(dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY);
        String dayType = isWorking ? "WORKING" : "WEEKEND";

        return new CheckDayResponse(request.getDate(), dayType, isWorking);
    }
}
