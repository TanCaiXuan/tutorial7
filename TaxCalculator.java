package org.caixuan;

public class TaxCalculator {
    private String name;
    private double annualIncome;

    public TaxCalculator(String name,double annualIncome){
        this.annualIncome = annualIncome;
        this.name =name;
    }

    public double calculateTax(){
        return 0;
    }

    public String getName() {
        return name;
    }

    public double getAnnualIncome() {
        return annualIncome;
    }
}
