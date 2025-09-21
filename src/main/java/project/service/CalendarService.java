package project.service;

import project.dto.CheckDayRequest;
import project.dto.CheckDayResponse;

public interface CalendarService {
    CheckDayResponse checkDay(CheckDayRequest request);
}
