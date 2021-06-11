package xinrenlei.net;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;


public class Example {

    public static void main(String[] args) throws FileNotFoundException {
        Student[] students = null;
        InputStream is = new FileInputStream("data/info");
        Scanner scanner = new Scanner(is, "utf-8");
        int count = Integer.parseInt(scanner.nextLine());
        students = new Student[3];

        for (int i = 0; i < count; i++) {
            String line = scanner.nextLine();
            String[] tokens = line.split(",");
            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);
            Double grade = Double.valueOf(tokens[2]);
            students[i] = new Student(name, age, grade);
        }

        System.out.println(Arrays.toString(students));
        scanner.close();
    }
}

@Getter
@Setter
class Student implements Person {
    protected String name;
    protected int age;
    protected Double grade;

    public Student(){

    }
    public Student(@NonNull String name, int age, Double grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }

    @Override
    public void run() {
        System.out.println("Hello World");
    }
}


class PrimaryStudent extends Student{
    private String sugar;

    public PrimaryStudent(){

    }

    public PrimaryStudent(String name, int age, Double grade, String sugar){
        super(name, age, grade);
        this.sugar = sugar;

    }

    @Override
    public String toString() {
        return "PrimaryStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                ", sugar='" + sugar + '\'' +
                '}';
    }
}