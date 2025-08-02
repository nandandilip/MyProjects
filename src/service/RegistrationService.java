package service;

import repository.StudentRepositery;

public class RegistrationService {
    StudentRepositery studentRepositery;

    public RegistrationService() {
        this.studentRepositery = new StudentRepositery();
    }

    public void saveStudent(String name) {
        int id=studentRepositery.gettotalStudent()+1;
        studentRepositery.saveStudent(id,name);

    }
}
