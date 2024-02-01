package com.test;

import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
//        for (int i = 1; i <= 5; i++) {
//
//            // Press Shift+F9 to start debugging your code. We have set one breakpoint
//            // for you, but you can always add more by pressing Ctrl+F8.
//            System.out.println("i = " + i);
//        }
        Employee e1= new Employee();
        e1.setEmpId(1);
        e1.setEmpName("Umesh");
        e1.setEmpAge(30);
        e1.setEmpSalary(10000.00);

        Employee e2= new Employee();
        e2.setEmpId(2);
        e2.setEmpName("Umesh2");
        e2.setEmpAge(31);
        e2.setEmpSalary(20000.00);

        Employee e3= new Employee();
        e3.setEmpId(3);
        e3.setEmpName("Umesh3");
        e3.setEmpAge(33);

        Employee e4= new Employee();
        Employee e5= null;

        List<Employee> list  = new ArrayList<Employee>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e1);
        list.add(e4);
        list.add(e5);

        Set<Employee> s1;
       s1 = list.stream().filter(Objects::nonNull).collect(Collectors.toSet());
        s1.stream().filter(Objects::nonNull).filter(E -> E.getEmpName()!=null && E.getEmpName().startsWith("Um")).forEach(name-> {
            System.out.println("Id =" + name.getEmpId() +", Name ="+ name.getEmpName() +", Age"+ name.getEmpAge() +", Salary ="+ name.getEmpSalary());
        });

        Set<String> set1 = Set.of("apple", "banana", "banana");
        Set<String> set2 = Set.of("cherry", "date");
        //1
        Set<String> combinedSet = new HashSet<>(Set.copyOf(set1));
        combinedSet.addAll(set2);
        String [] a = combinedSet.toArray(new String[0]);
//        Arrays.stream(a).forEach(System.out::println);
//        combinedSet.forEach(System.out::println);

        //or 2
          combinedSet = Stream.concat(set1.stream(), set2.stream()).collect(Collectors.toUnmodifiableSet());
        combinedSet.forEach(System.out::println);

//        Employee.listPlanProductVariation(planCpid)
//                .stream()
//                .filter(Objects::nonNull)
//                .filter(PlanProductVariation::getDefaultVariation)
//                .forEach(variation -> {
//                    variation.setDefaultVariation(false);
//                    variation.setModifiedDate(new Date());
//                    variation.setModifiedBy(accessId);
//                    planProductVariationDao.save(variation);
//                })
    }
}