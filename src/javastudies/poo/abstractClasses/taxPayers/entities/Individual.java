package javastudies.poo.abstractClasses.taxPayers.entities;

public class Individual extends TaxPayer{
    private Double healthExpenses;

    public Individual (){
        super();
    }

    public Individual(String name, Double annualIncome, Double healthExpenses) {
        super(name, annualIncome);
        this.healthExpenses = healthExpenses;
    }

    public Double getHealthExpenses() {
        return healthExpenses;
    }

    public void setHealthExpenses(Double healthExpenses) {
        this.healthExpenses = healthExpenses;
    }

    @Override
    public Double tax() {
        double calculateTax;
        if (getAnnualIncome() < 20000) {
           calculateTax  = getAnnualIncome() * 15 / 100;
        } else {
            calculateTax  = getAnnualIncome() * 25 / 100;
        }
        if (healthExpenses > 0.0){
            calculateTax  -= healthExpenses * 50/100;
        }
        return calculateTax;
    }
}
