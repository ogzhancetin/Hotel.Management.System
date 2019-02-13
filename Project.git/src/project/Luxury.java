/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author Oğuzhan
 */
public class Luxury extends HotelSchedule {
  //  public double totprice;
    private double price ;
    private final double ex1price = 95;
    private  int f1 = 0;
    private final double ex2price = 100;
    private  int f2 = 0;
    private final double ex3price = 180;
    private  int f3 = 0;
    public Luxury( int day) {
        super("Luxury", day, 125);
    }
    public Luxury( int day,int price) {
        
        super("SuperLux", day, price);
    }
    @Override
    public double getTotalprice() {
        this.totprice = 125 * super.getDay();
        if(f1 == 1)
       Luxury.totprice += ex1price;
        if(f2 == 1)
        Luxury.totprice += ex2price;
        if(f3 == 1)
        Luxury.totprice += ex3price;
        
        return totprice;

    }

     @Override
    public void addEx1() {
        Luxury.totprice = totprice + ex1price;
        f1 = 1;
    }

    @Override
    public void addEx2() {
        Luxury.totprice = totprice + ex1price;
        f2 = 1;
    }

   @Override
    public void addEx3() {
        Luxury.totprice = totprice + ex1price;
        f3 = 1;
    }
     
   
     
     
}


