package javastudies.poo.abstractClasses.taxPayers.entities;

public class Company extends TaxPayer{
    private Integer numberOfEmployees;

    public Company (){
        super();
    }

    public Company(String name, Double annualIncome, Integer numberOfEmployees) {
        super(name, annualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public Double tax() {
        double calculateTax;
        if (numberOfEmployees <= 10){
            calculateTax = getAnnualIncome() * 16 / 100;
        } else {
            calculateTax = getAnnualIncome() * 14 / 100;
        }
        return calculateTax;
    }
}
