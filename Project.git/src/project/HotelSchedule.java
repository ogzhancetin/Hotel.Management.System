/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author oguzhan
 */
public abstract class HotelSchedule implements GetExtraPrice{
private String type;  
private int day;
private double dailyPrice;
public static double totprice;
//private int roomNumber;

    public HotelSchedule(String type, int day, double dailyPrice) {
        this.type = type;
        this.day = day;
        this.dailyPrice = dailyPrice;
     
    }

    public int getDay() {
        return day;
    }

    public String getType() {
        return type;
    }
    
public abstract double getTotalprice();

    @Override
    public void addEx1() {
        
    }

    @Override
    public void addEx2() {
        
    }
    @Override
    public void addEx3() {
        
    }
}
