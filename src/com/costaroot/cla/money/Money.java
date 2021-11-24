package com.costaroot.cla.money;

public class Money {
    private long dollar;
    private short cents;

    public Money(long dollar, short cents){
        this.dollar = dollar;
        this.cents = cents;
    }

    public void showBalance(){
        System.out.println("You have on your balance: "+dollar+","+cents);
    }

    public long getDollar(){
        return dollar;
    }

    public short getCents(){
        return cents;
    }

    public void setDollar(long dollar){
        this.dollar = dollar;
    }

    public void setCents(short cents){
        this.cents = cents;
    }

    public void addMoney(Money amount){
        int buf;
        buf = this.cents + amount.cents;
        if ( buf < 100 ){
            this.cents = (short) buf;
        } else {
            this.dollar += 1;
            this.cents = (short) ( buf - 100 );
        }
        this.dollar += amount.dollar;
    }
}
