package org.caixuan;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        ProgressiveTaxCalculator progressiveTaxCalculator = new ProgressiveTaxCalculator("Ali", 123000);


        TaxBracket gateA = new TaxBracket(0,0);
        TaxBracket gateB = new TaxBracket(5000,0.01);
        TaxBracket gateC = new TaxBracket(20000,0.03);
        TaxBracket gateD = new TaxBracket(35000,0.06);
        TaxBracket gateE = new TaxBracket(50000,0.11);
        TaxBracket gateF = new TaxBracket(70000,0.19);
        TaxBracket gateH = new TaxBracket(100000,0.25);
        TaxBracket gateI= new TaxBracket(400000,0.26);
        TaxBracket gateJ = new TaxBracket(600000,0.28);
        TaxBracket gateK = new TaxBracket(2000000,0.30);

        // Add tax brackets to the calculator
        progressiveTaxCalculator.addTax(gateA);
        progressiveTaxCalculator.addTax(gateB);
        progressiveTaxCalculator.addTax(gateC);
        progressiveTaxCalculator.addTax(gateD);
        progressiveTaxCalculator.addTax(gateE);
        progressiveTaxCalculator.addTax(gateF);
        progressiveTaxCalculator.addTax(gateH);
        progressiveTaxCalculator.addTax(gateI);
        progressiveTaxCalculator.addTax(gateJ);
        progressiveTaxCalculator.addTax(gateK);

        double progressiveTax = progressiveTaxCalculator.calculateTax();
        System.out.println("Progressive Tax for " + progressiveTaxCalculator.getName() + ": " + progressiveTax);



    }
}