package org.caixuan;

public class FlatTaxCalculator extends TaxCalculator{

    double flatTaxRate;
    protected FlatTaxCalculator(String name, double annualIncome) {
        super(name, annualIncome);
    }

    @Override
    public double calculateTax(){
        return getAnnualIncome() *flatTaxRate;
    }
}
