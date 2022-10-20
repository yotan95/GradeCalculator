package GradeCal;

import java.util.ArrayList;

public class GenerateGradeReport {
	
	School school = School.getInstance();
	private static final String title = " 수강색 학점\n";
	private static final String header = "이름  |  학번 |중점과목| 점수\n";
	private static final String line = "-----------------------------\n";
	private StringBuffer buffer = new StringBuffer();
	
	public String getReport() {
		ArrayList<Subject> list = school.getSubject();
		for(Subject sub : list) {
			makeHeader(sub);
			makeBody(sub);
			makeFooter();
		}
		return buffer.toString();
	}
	
	public void makeHeader(Subject sub) {
		buffer.append(GenerateGradeReport.line);
		buffer.append("\t" + sub.getSubName() + title);
		buffer.append(GenerateGradeReport.header);
		buffer.append(GenerateGradeReport.line);
	}
	
	public void makeBody(Subject sub) {
		
		ArrayList<Student> student = sub.getStudentList();
		for(Student st : student) {
			buffer.append(st.getName());
			buffer.append(" | ");
			buffer.append(st.getStudentId());
			buffer.append(" | ");
			buffer.append(st.getMajor().getSubName());
			buffer.append(" | ");
			getScoreGrade(st, sub);
			makeFooter();
		}
	}
	
	public void getScoreGrade(Student student, Subject sub) {
		
		ArrayList<Score> score = student.getScore();
		int majorId = student.getMajor().getSubId();
		
		GradeEvaluation ge[] = {new BasicEvaluation(), new MajorEvaluation(), new PassFailEvaluation()};
		
		for(int i = 0 ; i < score.size(); i++) {
			Score s = score.get(i);
			String grade;
			
			if(sub.getSubId() == s.getSubject().getSubId()) {
				
				if(s.getSubject().getSubId() == majorId) {
					grade = ge[Define.SAB_TYPE].getGrade(s.getPoint());
				}
				else if(Define.DANCE == s.getSubject().getSubId()) {
					grade = ge[Define.PF_TYPE].getGrade(s.getPoint());
				}
				else {
					grade = ge[Define.AB_TYPE].getGrade(s.getPoint());
				}
				
				buffer.append(s.getPoint());
				buffer.append(":");
				buffer.append(grade);
				buffer.append("|");
			}
		}
	}
	
	
	public void makeFooter() {
		buffer.append("\n");
	}

}
