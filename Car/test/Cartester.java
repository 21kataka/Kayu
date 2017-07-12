/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import car.Car;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Education Unlmited
 */
public class Cartester {
    double c = 1;
    Car car = new Car("Spongebob Squarepants", "Spongebob's Car", 2010, "Spongebob Showercar", "Yellow", 10, 1);
    @Test
    public void makeGetterTest() {
        assertEquals(car.getMake(), "Spongebob Squarepants");
    }
    public Cartester() {
    }
    
}
