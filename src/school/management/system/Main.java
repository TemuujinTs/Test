package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Teacher> list;
        Teacher lizzy = new Teacher(1,"Lizzy",500);
        Teacher dulmaa = new Teacher(2,"Dulmaa",700);
        Teacher ganaa = new Teacher(3,"Ganaa",800);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(dulmaa);
        teacherList.add(ganaa);

        Student boris = new Student(1,"Boris",1);
        Student boldoo = new Student(2,"Boldoo",4);
        Student baldan = new Student(3,"Baldan",12);

        List<Student> studentList = new ArrayList<>();
        studentList.add(boris);
        studentList.add(boldoo);
        studentList.add(baldan);

        School ider = new School(teacherList,studentList);

        boris.payFees(5000);
        boldoo.payFees(6000);
        System.out.println("Ider has earned money : "+ider.getTotalMoneyEarned());

        System.out.println("-------Making School Pay Salary-------");
        lizzy.recieveSalary(lizzy.getSalary());
        System.out.println("Ider has spent for salary $"+lizzy.getSalary()+" to "+ lizzy.getName()+" and now has $"+ ider.getTotalMoneyEarned());

        System.out.println(boris);
        System.out.println("----------------");
        System.out.println(dulmaa);


    }
}
