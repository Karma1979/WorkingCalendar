package project.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.dto.CheckDayRequest;
import project.dto.CheckDayResponse;
import project.service.CalendarService; // <-- ВАЖНО: зависимость от интерфейса!
import project.service.CalendarServiceImpl;

@RestController
@RequestMapping("/api/v1/calendar")
@RequiredArgsConstructor
public class CalendarController {

    private final CalendarServiceImpl calendarService;

    @PostMapping("/check-day")
    public ResponseEntity<CheckDayResponse> checkDay(@RequestBody CheckDayRequest request) {
        CheckDayResponse response = calendarService.checkDay(request);
        return ResponseEntity.ok(response);
    }
}