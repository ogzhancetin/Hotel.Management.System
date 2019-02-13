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
public class SuperLux extends Luxury{
    private double price ;
    private final double ex1price = 100;
    private  int f1 = 0;
    private final double ex2price = 150;
    private  int f2 = 0;
    private final double ex3price = 210;
    private  int f3 = 0;
    public SuperLux(int day) {
        super(day,175);
    }
     @Override
    public double getTotalprice() {
        this.totprice = 175 * super.getDay();
        if(f1 == 1)
        SuperLux.totprice += ex1price;
        if(f2 == 1)
        SuperLux.totprice += ex2price;
        if(f3 == 1)
        SuperLux.totprice += ex3price;
        
        return totprice;

    }

     @Override
    public void addEx1() {
        SuperLux.totprice = totprice + ex1price;
        f1 = 1;
    }

    @Override
    public void addEx2() {
        SuperLux.totprice = totprice + ex1price;
        f2 = 1;
    }

   @Override
    public void addEx3() {
        SuperLux.totprice = totprice + ex1price;
        f3 = 1;
    }
     
}
