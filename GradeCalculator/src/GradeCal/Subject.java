package GradeCal;

import java.util.ArrayList;

public class Subject {

	private int subId;		// 과목 고유 번
	private String subName; // 과목 이름
	private int gradeType;	// 과목 성적 산출 방식
	
	ArrayList<Student> studentList = new ArrayList<>();
	
	public Subject(String title, int idType) {
		this.subName = title;
		this.subId = idType;
		this.gradeType = Define.AB_TYPE; // 기본적인 성적 채점 방법
	}
	
	public void register(Student student) {
		studentList.add(student);
	}

	public int getSubId() {
		return subId;
	}

	public void setSubId(int subId) {
		this.subId = subId;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	public int getGradeType() {
		return gradeType;
	}

	public void setGradeType(int gradeType) {
		this.gradeType = gradeType;
	}

	public ArrayList<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}
	

	
	
}
