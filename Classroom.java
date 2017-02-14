import java.util.ArrayList;

public class Classroom{
  private ArrayList<Person> students;
  private int capacity;

  public Classroom(int capacity){
    this.students = new ArrayList<Person>();
    this.capacity = capacity;
  }

  public int studentCount(){
    return students.size();
  }

  public void addStudent(Person person){
    students.add(person);
  }

  public boolean isEmpty(){
    return students.isEmpty();
  }

  public boolean isClassroomFull(){
    return (studentCount() >= this.capacity);
    // if (studentCount() >= this.capacity){
    //   return true;
  // }
    // else{
    //   return false;
  // }
  }

}