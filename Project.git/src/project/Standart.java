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
public class Standart extends HotelSchedule {
    
     private final double ex1price = 80;
    private  int f1 = 0;
    private final double ex2price = 140;
    private  int f2 = 0;
    private final double ex3price = 200;
    private  int f3 = 0;
    public Standart( int day) {
        super("Standart", day, 70);
    }
 

    @Override
    public double getTotalprice() {
        this.totprice = 70 * super.getDay();
        if(f1 == 1)
        Standart.totprice += ex1price;
        if(f2 == 1)
        Standart.totprice += ex2price;
        if(f3 == 1)
        Standart.totprice += ex3price;
        
        return totprice;

    }

     @Override
    public void addEx1() {
Standart.totprice = totprice + this.ex1price;
f1=1;
    }

     @Override
    public void addEx2() {
Standart.totprice = totprice + this.ex1price;
f2=1;
    }

     @Override
    public void addEx3() {
Standart.totprice = totprice + this.ex1price;
f3=1;
    }
    
    
    
}
