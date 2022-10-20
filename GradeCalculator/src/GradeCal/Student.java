package GradeCal;

import java.util.ArrayList;

public class Student {
	
	private String name;
	private int studentId;
	private Subject major;
	private ArrayList<Score> score = new ArrayList<>();
	
	public Student(int id, String name, Subject major) {
		this.name = name;
		this.studentId = id;
		this.major = major;
		this.major.setGradeType(Define.SAB_TYPE);
	}
	
	public void addSubjectScore(Score score) {
		this.score.add(score);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public Subject getMajor() {
		return major;
	}
	public void setMajor(Subject major) {
		this.major = major;
	}
	public ArrayList<Score> getScore() {
		return score;
	}
	public void setScore(ArrayList<Score> score) {
		this.score = score;
	}
	
	

}
