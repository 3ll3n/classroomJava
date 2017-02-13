import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;

public class ClassroomTest {
  Classroom classroom;
  Person layla;
  Person ruby;
  Person jolene;

  @Before
  public void before(){
    classroom = new Classroom();
    layla = new Person("Layla");
    ruby = new Person("Ruby");
    jolene = new Person("Jolene");
  }

  @Test
  public void checkEmptyClassroom(){
    assertEquals(0, classroom.count());
  }
}

