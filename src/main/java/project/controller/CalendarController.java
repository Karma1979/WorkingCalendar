package project.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.dto.CheckDayRequest;
import project.dto.CheckDayResponse;
import project.service.CalendarService;

@RestController
@RequestMapping("/api/v1/calendar")
@RequiredArgsConstructor
public class CalendarController {

    private final CalendarService calendarService;

    @PostMapping("/check-day")
    public ResponseEntity<CheckDayResponse> checkDay(@RequestBody CheckDayRequest request) {
        return ResponseEntity.ok(calendarService.checkDay(request));
    }
}