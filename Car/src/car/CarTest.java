/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

/**
 *
 * @author Education Unlmited
 */
public class CarTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String make1 = "Spongebob Squarepants";
        String model1 = "Spongebob's car";
        int year1= 2010;
        String nickname1 = "Spongebob Showercar";
        String color1= "Yellow";
        double yearsowned1 = 10;
        double miles1 = 1;
        
       Car car1= new Car(make1, model1, year1, nickname1, color1, yearsowned1, miles1);
       
       System.out.println("Car 1: " + car1.getMake() + ", " + car1.getModel() + ", from: " + car1.getYear() + ", nickname: " + car1.getNickname()
        + ", color: " + car1.getColor() + ", years owned: " + car1.getYearsowned() + ", and goes: " + car1.getMiles() + " mile");
       
       car1.turnOn();
       car1.turnOff();
       car1.turnOff();
       
    }
    
}
