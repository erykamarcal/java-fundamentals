package javastudies.poo.enumAndComposition.workerContracts.entities;

import javastudies.poo.enumAndComposition.workerContracts.entities.enums.WorkerLevel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Worker {

    private String name;
    private WorkerLevel level;
    private Double baseSlary;

    private Department department;
    private List<HourContract> contracts = new ArrayList<>();

    public Worker() {
    }

    public Worker( String name, WorkerLevel level, Double baseSlary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSlary = baseSlary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSlary() {
        return baseSlary;
    }

    public void setBaseSlary(Double baseSlary) {
        this.baseSlary = baseSlary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    public void addContract(HourContract contract) {
        contracts.add(contract);
    }

    public void removeContract(HourContract contract) {
        contracts.remove(contract);
    }

    public double income(int year, int month) {
        double sum = baseSlary;
        for (HourContract contract : contracts) {
            LocalDate date = contract.getDate();

            int contractMonth = date.getMonthValue();
            int contractYear = date.getYear();
            if (year == contractYear && month == contractMonth) {
               sum += contract.totalValue();
            }
        } return sum;
    }
}
