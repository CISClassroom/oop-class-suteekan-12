package com.company;

public class Main {

    public static void main(String[] args) {

        Student mark = new Student();
        Student tontan = new Student();
        Student dream = new Student();

        mark.name = "X Mark";
        mark.id = "001";
        mark.majoe = "CIS";
        mark.sex = "MAN";
        tontan.name = "Tan Ton";
        tontan.id = "002";
        tontan.majoe = "CIS";
        tontan.sex = "MAN";
        dream.name = "dream or night";
        dream.id = "003";
        dream.majoe = "CS";
        dream.sex = "WOMAN";


        //get data from object
        System.out.println("1." + mark.name + " " + mark.majoe +" "+ mark.sex);
        System.out.println("2." + tontan.name + " " + tontan.majoe +" "+ tontan.sex);
        System.out.println("3." + dream.name + " " + dream.majoe +" "+ dream.sex);


        //add student to array
        //array index             0     1      2
        Student[] oopStudents = {mark,tontan,dream};

        System.out.println("1."+oopStudents[0].name);
        System.out.println("2."+oopStudents[1].name);
        System.out.println("2."+oopStudents[2].name);

        find_CIS_Student(oopStudents);
    }
    // To find CIS Student
    public static void find_CIS_Student(Student[] Students){
        for(int i = 0; i < Students.length; i++){
            //Check students.major is "CIS"
            if(Students[i].majoe == "CIS"){
                System.out.println(i+1+"."+ Students[i].name);
            }

        }


    }
}
