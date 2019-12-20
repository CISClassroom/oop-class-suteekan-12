package com.company;

public class Main {

    public static void main(String[] args) {
	    // create Student object
        Student mark = new Student();
        Student tontan = new Student();
        Student drem = new Student();

        //input data to object
        mark.name = "X Mark";
        mark.id = "001";
        mark.majoe = " CIS ";
        tontan.name = "TonTan";
        tontan.id = "002";
        tontan.majoe = " CIS ";
        drem.name = "Drem all night";
        drem.id = "003";
        drem.majoe = " CS ";


        //get data from object
        System.out.println("1." + mark.name + "" + mark.majoe);
        System.out.println("2." + tontan.name + "" + tontan.majoe);


        //add student to array
        //array index             0     1      2
        Student[] oopStudents = {mark,tontan,drem};

        System.out.println("1."+oopStudents[0].name);
        System.out.println("2."+oopStudents[1].name);

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
