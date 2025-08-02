package controller;

import service.DetailsService;
import service.RegistrationService;

import java.util.Scanner;

public class StudentController {
    RegistrationService registrationService;
    DetailsService detailsService;
    Scanner scn;

    public StudentController() {
        this.registrationService =new  RegistrationService();
        this.detailsService = new DetailsService();
        this.scn = new Scanner(System.in);
    }

    public void takeUserInput(){
        while(true){

            System.out.println("what you want to do ?\n if want to see Student details Enter 1 ! or Register Enter 2");
            int input=scn.nextInt();
            if(input ==1){
                // Bring Student Details
                System.out.println("Enter Student id");
                int id=scn.nextInt();
              String name=  detailsService.getStudentDetailsById(id);
              System.out.println(name);
              System.out.println("Student details fetch sucsesfully");

            }else{
                // Create Student
                System.out.println("enter the whose name you want to insert");
                String name=scn.next();
                registrationService.saveStudent(name);
                System.out.println("Student save sucessfully");
                // Save Student
            }
        }
    }
}
