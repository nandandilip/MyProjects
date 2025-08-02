package repository;

import java.util.HashMap;

public class StudentRepositery {
    HashMap<Integer,String> studentDB;

    public StudentRepositery() {
        this.studentDB = new HashMap<>();

    }
    public void saveStudent(int id,String name){
        studentDB.put(id,name);
    }
    public String getStudentById(int id){
        String name=studentDB.get(id);
        return name;
    }
    public int gettotalStudent(){
        return studentDB.size();
    }


}
