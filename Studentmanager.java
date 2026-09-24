import java.util.*;
public class Studentmanager {
  private ArrayList<Student> students;
  public Studentmanager()
  {
    students=new ArrayList<Student>();
  }
  public void add(Student student)
  {
    students.add(student);
  }
  public void view()
  {
    for(Student student:students)
    {
      student.displayStudent();
    }
    if(students.isEmpty())
    {
      System.out.println("not found");
    }
  }
  public void search(int id)
  {
    for(Student student:students)
    {
      if(student.getId()==id)
      {
        student.displayStudent();
        return ;
      }
    }
    System.out.println("not found");
  }
  public void delete(int id)
  {
    for(Student student:students)
    {
      if(student.getId()==id)
      {
        students.remove(student);
        System.out.println("deleted");
        return ;
      }
    }
    System.out.println("not found");
  }
  public void update(int id, String name, int age, String department, String email)
  {
    for(Student student:students)
    {
      if(student.getId()==id)
      {
        student.setName(name);
        student.setAge(age);
        student.setDepartment(department);
        student.setEmail(email);
        System.out.println("updated");
        return ;
      }
    }
    System.out.println("not found");
  }
}
