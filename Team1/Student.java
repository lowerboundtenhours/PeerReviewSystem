import java.util.ArrayList;
class Student{
    Student(String _id){
        id = _id;
    }
    public addHomework(Homework h){
        homeworks.add(h);
    }
    public String getId(){
        return id;
    }

    public ArrayList<Homework> getHomeworks(){
        return homeworks;
    }
    public String id;
    public ArrayList<Homework> homeworks;
}
