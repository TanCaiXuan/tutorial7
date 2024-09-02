package org.caixuan;

import java.util.ArrayList;

public class ProgressiveTaxCalculator extends TaxCalculator {
    private ArrayList<TaxBracket> taxBrackets;

    protected ProgressiveTaxCalculator(String name, double annualIncome) {
        super(name, annualIncome);
        this.taxBrackets = new ArrayList<>();
    }

    public void addTax(TaxBracket taxBracket){
        taxBrackets.add(taxBracket);
    }


    @Override
    public double calculateTax(){
        double totalTax = 0.0;
        double remainingIncome = getAnnualIncome();

        for (int i = taxBrackets.size() - 1; i >= 0; i--) {
            TaxBracket bracket = taxBrackets.get(i);
            if (remainingIncome > bracket.getMinIncome()) {
                double taxableIncome = remainingIncome - bracket.getMinIncome();
                double tax = taxableIncome * bracket.getTaxRate();
                totalTax += tax;
                remainingIncome = bracket.getMinIncome();
            }
        }

        return totalTax;
    }

    public ArrayList<TaxBracket> getTaxBrackets() {
        return taxBrackets;
    }
}
