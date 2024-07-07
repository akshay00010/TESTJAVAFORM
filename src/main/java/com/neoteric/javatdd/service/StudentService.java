package com.neoteric.javatdd.service;

import com.neoteric.javatdd.model.Admission;
import com.neoteric.javatdd.model.Student;

import java.util.UUID;

public class StudentService {

    // access specifier               returntype                    methodname(parameters)
    // public/private/protected       Admission RollNumber and fee


    public Admission getAdmission(Student venkat){
       // input student

        Admission admission=null;
        //processing
        if (venkat.age>6){
            //output
            admission=new Admission();
            admission.rollNumber="TG" + UUID.randomUUID().toString();
            admission.fees=1000;
            admission.standard= venkat.standard;


        }
        return admission;

    }

}