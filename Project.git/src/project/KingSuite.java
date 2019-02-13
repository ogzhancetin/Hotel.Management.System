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
public class KingSuite extends HotelSchedule  {
    
 private final double ex1price = 175;
    private  int f1 = 0;
    private final double ex2price = 250;
    private  int f2 = 0;
    private final double ex3price = 400;
    private  int f3 = 0;
    
    public KingSuite( int day) {
        super("KingSuite", day, 200 );
    }

    
   @Override
    public double getTotalprice() {
        KingSuite.totprice = 200 * super.getDay();
        if(f1 == 1)
        KingSuite.totprice += ex1price;
        if(f2 == 1)
        KingSuite.totprice += ex2price;
        if(f3 == 1)
        KingSuite.totprice += ex3price;
        
        return totprice;

    }

    @Override
    public void addEx1() {
        KingSuite.totprice = totprice + ex1price;
        f1 = 1;
    }

   @Override
    public void addEx2() {
        KingSuite.totprice = totprice + ex1price;
        f2 = 1;
    }

    @Override
    public void addEx3() {
      KingSuite.totprice = totprice + ex1price;
        f3 = 1;
    }
    
}
