package GradeCal;

import java.util.ArrayList;

public class School {
	
	private static School instance = new School();
	
	private ArrayList<Student> students = new ArrayList<>();
	private ArrayList<Subject> subject = new ArrayList<>();
	
	
	private School() {}
	
	public static School getInstance() {
		if(instance == null) {
			instance = new School();
		}
		return instance;
	}
	
	public void addStudent(Student student) {
		this.students.add(student);
	}
	public void addSubject(Subject sub) {
		this.subject.add(sub);
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}

	public ArrayList<Subject> getSubject() {
		return subject;
	}

	public void setSubject(ArrayList<Subject> subject) {
		this.subject = subject;
	}
	
	
	
}
