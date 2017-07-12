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
public class Car {
   String make, model;
   int year;
   boolean isOn;
   String nickname, color;
   double yearsowned;
   double miles;
    /**
     * @param args the command line arguments
     */
   public Car(String newMake, String newModel, int newYear, String newNickname, String newColor, double newYearsowned, double newMiles) {
       make=newMake;
       model=newModel;
       year=newYear;
       nickname=newNickname;
       color=newColor;
       yearsowned=newYearsowned;
       miles=newMiles;
       isOn = false;
   }
   
       public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
   
    public void turnOn() {
        isOn=true;
        System.out.println("The car is now on!");
    }
   
    public void turnOff() {
        if (isOn==true) {
            isOn=false;
            System.out.println("The car is now off!");
        } 
        else {
            System.out.println("The car is already off!");
        }
       
    }
        public String getNickname() {
        return nickname;
    }

    public String getColor() {
        return color;
    }

    public double getYearsowned() {
        return yearsowned;
    }

    public double getMiles() {
        return miles;
    }
       public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYearsowned(double yearsowned) {
        this.yearsowned = yearsowned;
    }

    public void setMiles(double miles) {
        this.miles = miles;
    }
}