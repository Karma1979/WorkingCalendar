package project;

import org.junit.jupiter.api.Test;
import project.service.CountSquareService;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountSquareServiceTest {
    @Test
    public void test1(){
        int c = CountSquareService.calculateSquare(5, 5);
        assertEquals(25, c);
    }

    @Test
    public void test2(){
        int c = CountSquareService.calculateSquare(5, 6);
        assertEquals(30, c);
    }

    @Test
    public void test3(){
        int c = CountSquareService.calculateSquare(10, 10);
        assertEquals(100, c);
    }
}
