package org.caixuan;

public  class TaxBracket {

    private  double minIncome;
    private double taxRate;


    protected TaxBracket(double minIncome,double taxRate){
        this.taxRate =taxRate;
        this.minIncome = minIncome;
    }



    public double getTaxRate() {
        return taxRate;
    }

    public double getMinIncome() {
        return minIncome;
    }
}
