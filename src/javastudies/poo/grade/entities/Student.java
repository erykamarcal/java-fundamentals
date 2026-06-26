package javastudies.poo.grade.entities;

public class Student {
    public String name;
    public double firstTermGrade;
    public double secondTermGrade;
    public double thirdTermGrade;

    public double finalGrade() {
        return firstTermGrade + secondTermGrade + thirdTermGrade;
    }


    public double missingPoints() {
        double finalGrade = finalGrade();
        if (finalGrade < 60) {
            return 60 - finalGrade;
        } else {
            return 0.0;
        }
    }
}
