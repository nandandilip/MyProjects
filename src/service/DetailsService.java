package service;

import repository.StudentRepositery;

public class DetailsService {

    StudentRepositery studentRepositery;

    public DetailsService() {
        this.studentRepositery = new StudentRepositery();
    }

    public String getStudentDetailsById (int id) {
        String name=studentRepositery.getStudentById(id);
        return name;



        }
    }

