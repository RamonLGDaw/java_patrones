package com.ejemplo1;

public class AzucarDecorator implements Cafe {
    protected Cafe cafe;

    public AzucarDecorator(Cafe cafe){
        this.cafe = cafe;
    }

    @Override
    public double costo(){
        return cafe.costo() + 0.5;
    }
}
