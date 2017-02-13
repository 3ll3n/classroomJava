import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;

public class ClassroomTest {
  Classroom classroom;
  Person person;
  Person layla;
  Person ruby;
  Person jolene;

  @Before
  public void before(){
    classroom = new Classroom();
    person = new Person("Eileen");
    layla = new Person("Layla");
    ruby = new Person("Ruby");
    jolene = new Person("Jolene");
  }

  @Test
  public void checkEmptyClassroom(){
    assertEquals(0, classroom.studentCount());
  }

  @Test
  public void addStudent(){
    classroom.addStudent(person);
    assertEquals(1, classroom.studentCount());
  }
}

