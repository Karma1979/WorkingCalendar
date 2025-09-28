package project.service;

import org.springframework.stereotype.Service;
import project.model.CheckDayRequest;
import project.model.CheckDayResponse;
import project.model.UpdateDayRequest;
import project.entity.DayType;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class CalendarServiceImpl implements CalendarService {

    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    private final Map<LocalDate, DayType> specialDays = new ConcurrentHashMap<>();

    public CalendarServiceImpl() {
        specialDays.put(LocalDate.of(2025, 1, 1), DayType.DAY_OFF);
        specialDays.put(LocalDate.of(2025, 1, 7), DayType.DAY_OFF);
        specialDays.put(LocalDate.of(2025, 5, 9), DayType.DAY_OFF);
    }

    @Override
    public CheckDayResponse checkDay(CheckDayRequest request) {
        LocalDate date = LocalDate.parse(request.getDate(), DATE_FORMATTER);

        if (specialDays.containsKey(date)) {
            DayType dayType = specialDays.get(date);
            boolean isWorking = (dayType == DayType.WORKING);
            return new CheckDayResponse(request.getDate(), dayType.toString(), isWorking);
        }

        DayOfWeek dayOfWeek = date.getDayOfWeek();
        if (dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY) {
            return new CheckDayResponse(request.getDate(), DayType.DAY_OFF.toString(), false);
        }

        return new CheckDayResponse(request.getDate(), DayType.WORKING.toString(), true);
    }

    @Override
    public void updateDay(UpdateDayRequest request) {
        LocalDate date = LocalDate.parse(request.getDate(), DATE_FORMATTER);
        DayType dayType = request.getDayType();

        specialDays.put(date, dayType);

        System.out.println("Календарь обновлен. Дата: " + date + ", новый тип: " + dayType);
    }
}
