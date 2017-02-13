import java.util.ArrayList;

public class Classroom{
  private ArrayList<Person> students;

  public Classroom(){
    this.students = new ArrayList<Person>();
  }

  public int studentCount(){
    return students.size();
  }

  public boolean isEmpty(){
    return students.isEmpty();
  }

  public void addStudent(Person person){
    students.add(person);
  }
}