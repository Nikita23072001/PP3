import java.util.Arrays;

public class StudentGrades {

    String studentName;
    double[] grades;

    StudentGrades(String name, double[] grades) {
        this.studentName = name;
        this.grades = grades;
    }
    StudentGrades(String name, int numberOfGrades){
        this.studentName = name;
        double[] grades = new double[numberOfGrades];
        for (int i = 0; i < numberOfGrades; i++) {
            grades[i] = (double)(((int)(Math.random()*7))+4)/2;
        }
        this.grades = grades;
    }

    double Lowest(){
        Arrays.sort(grades);
       return grades[0];
    }
    double Highest(){
        Arrays.sort(grades);
        return grades[grades.length-1];
    }
    int NumberOfGrades(){
        return grades.length;
    }
    double Average(){
        double sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];

        }
        return sum / grades.length;
    }
    void Display(){
        System.out.print(studentName + " : ");
        for (int i = 0; i < grades.length; i++) {
            System.out.print(grades[i] + " ");
        }
        System.out.println("\nlowest grade :" + Lowest());
        System.out.println("Highest grade :" + Highest());
        System.out.println("Average: " + Average());
    }
}
