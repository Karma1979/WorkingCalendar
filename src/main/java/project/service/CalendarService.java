package project.service;

import project.model.CheckDayRequest;
import project.model.CheckDayResponse;
import project.model.UpdateDayRequest;

public interface CalendarService {

    CheckDayResponse checkDay(CheckDayRequest request);

    void updateDay(UpdateDayRequest request);
}
