package project.service;

import project.model.CheckDayRequest;

public class CountSquareService {
    private CountSquareService() {}

    public static int calculateSquare(int lenght, int width) {
        return lenght * width;
    }
}
