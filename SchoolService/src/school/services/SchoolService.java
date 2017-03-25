package school.services;

import java.util.ArrayList;

import school.model.School;
import school.model.Student;

public class SchoolService {
//  private School school;

  private ArrayList<School> scholen = new ArrayList<School>();
  private ArrayList<Student> students = new ArrayList<Student>();
  private ArrayList<Student> students2 = new ArrayList<Student>();

  public SchoolService(){
      students.add(new Student("Max", "Jansen", 22, "Utrecht", true));
      students.add(new Student("John", "Bos", 20, "Nijmegen", true));
      students.add(new Student("Alex", "Bakker", 19, "Baarn", false));
      students.add(new Student("Mark", "deGroot", 22, "Maarsen", true));

      School sch1 =  new School(11, "HU", "Utrecht");
      sch1.setStudenten(students);
      scholen.add(sch1);
      
      students2.add(new Student("Mandy", "Jansen", 17, "Naarden", true));
      students2.add(new Student("Hans", "Bos", 20, "Arnhem", true));
      students2.add(new Student("Alex", "Wilks", 19, "Bussem", false));

      
      School sch2 =  new School(22, "UU", "Utrecht");
      sch2.setStudenten(students2);
      scholen.add(sch2);
      
      scholen.add(new School(33, "Radboud", "Nijmegen"));
      scholen.add(new School(44, "Hogeschool", "Amsterdam"));

//      students2.add(new Student("Mandy", "Jansen", 17, "Utrecht", true));
//      students2.add(new Student("John", "Bos", 20, "Nijmegen", true));
//      students2.add(new Student("Alex", "Bakker", 19, "Baarn", false));
//      students2.add(new Student("Mark", "deGroot", 22, "Maarsen", true));
      

  }
  public School getSchoolByCode(int code) {
	
		School result = null;
		
		for (School s : scholen) {
			if (s.getCode() == code) {
				result = s;
				break;
			}
		}
		
		return result;
	}
  public void setScholen(ArrayList<School> scholen) {
      this.scholen = scholen;
  }

  public ArrayList<School> getScholen() {
      return scholen;
  }

}

