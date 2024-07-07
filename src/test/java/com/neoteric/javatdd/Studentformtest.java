package com.neoteric.javatdd;

import com.neoteric.javatdd.model.Address;
import com.neoteric.javatdd.model.Admission;
import com.neoteric.javatdd.model.Student;
import com.neoteric.javatdd.service.StudentService;
import org.junit.jupiter.api.Assertions;

public class Studentformtest {

    public void test(){

        Student student1=new Student();;
        student1.firstName="venkat";
        student1.age=7;
        student1.standard="1";
        Address student1Address=new Address();
        student1Address.area="miyapur";
        student1Address.city="hyd";
        student1Address.flatNo="101";
        student1Address.pincode="500060";
        student1Address.street="kphb";

        student1Address.address=student1Address;

        StudentService service=new StudentService();


        Admission admission= service.getAdmission(student1);
        Assertions.assertEquals( 1000,admission.fees);
        Assertions.assertNotNull(admission.rollNumber);




    }


}
