package Student.Registration.Driver;

/*
 * CAROLINE RICHARDSON
 * 13358846
 * 4BCT
 * 
 */


import java.util.ArrayList;
import StudentRegistration.*;
import org.joda.time.DateTime;


public class Driver 
{

	 public static void main(String[] args)
	 {
		
		 Student Rick = new Student("Rick", 40, new DateTime("1976-05-12"));
		 Student Michonne = new Student("Michonne", 36, new DateTime("1980-05-18"));
		 Student Negan = new Student("Negan", 42, new DateTime("1974-08-11"));
		 Student Daenerys = new Student("Daenerys", 21, new DateTime("1995-04-19"));
		 Student Tyrion = new Student("Tyrion", 35, new DateTime("1981-10-05"));
		 
		 ArrayList<Module> TWDModules = new ArrayList<Module>();
		 ArrayList<Module> GOTModules = new ArrayList<Module>();
		 
		 Module CT427 = new Module("Survival Skills","CT427");
		 Module MA924 = new Module("Walker Killing 101", "MA924");
		 
		 TWDModules.add(CT427);
		 TWDModules.add(MA924);
		 
		 Module DA900 = new Module("Dragon Training","DA900");
		 Module DK425 = new Module("Dothraki", "DK425");
		 
		 GOTModules.add(DA900);
		 GOTModules.add(DK425);
	
		 CT427.registerStudent(Rick);
		 CT427.registerStudent(Michonne);
		 CT427.registerStudent(Negan);
		 MA924.registerStudent(Michonne);
		 MA924.registerStudent(Negan);
		 DA900.registerStudent(Daenerys);
		 DA900.registerStudent(Tyrion);
		 DK425.registerStudent(Daenerys);
		 
		 CourseProgramme TWD = new CourseProgramme("The Walking Dead", new DateTime("2016-10-05") ,new DateTime("2020-10-05"));
		 TWD.setModules(TWDModules);
		 
		 CourseProgramme GOT = new CourseProgramme("Game of Thrones", new DateTime("2016-10-05") ,new DateTime("2020-10-05"));
		 GOT.setModules(GOTModules);
		 
		 TWD.printCourseDetails();
		 GOT.printCourseDetails();

	 }
	
}
