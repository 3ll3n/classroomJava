import java.util.ArrayList;

public class Classroom {
  private ArrayList<Person> students;

  public Classroom (){
    this.students = new ArrayList<Person>();
  }

  public int count(){
    return students.size();
  }

}