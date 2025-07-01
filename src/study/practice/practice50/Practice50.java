package study.practice.practice50;

import java.util.List;

public class Practice50 {

//	public static void main(String[] args) {
//		StudentDAO studentdao = new StudentDAO();
//		List<StudentDTO>studentList = studentdao.findStudentList();
//		if(studentList.size()>0) {
//			for(StudentDTO s : studentList) {
//				System.out.println(s);
//			}
//		}
//		System.out.println("------------------------------------");
//		List<StudentDTO>studentList2 = studentdao.findStudentByGrade(1);
//		if(studentList2.size()>0) {
//			for(StudentDTO s : studentList2) {
//				System.out.println(s);
//			}
//		}
//	}
//	public static void main(String[] args) {
//		StudentDAO studentDAO = new StudentDAO();
//		List<StudentDTO>list = studentDAO.findStudentList();
//		for(StudentDTO s : list) {
//			System.out.println(s);
//		}
//		System.out.println("------------------------------------");
//		List<StudentDTO>studentList2 = studentdao.findStudentByGrade(1);
//		if(studentList2.size()>0) {
//			for(StudentDTO s : studentList2) {
//				System.out.println(s);
//			}
//		}
//	}
	public static void main(String[] args) {
		StudentDAO studentDAO = new StudentDAO();
		StudentDTO studentDTO = new StudentDTO(9901,"Jun","hsj1128",1,"9811281111111","2000-05-31","053) 321-1559",176,86,901,902,9001);
		int rs3 = studentDAO.saveStudent(studentDTO);
		if(rs3>0) {
			System.out.println("삽입성공 : rs3 : "+rs3);
		}
	}
}
