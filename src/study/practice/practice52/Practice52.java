package study.practice.practice52;

import java.util.List;

public class Practice52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentMyScoreANDHakjumDAO sdao = new StudentMyScoreANDHakjumDAO();
		List<StudentMyScoreANDHakjumDTO>StudentMyScoreANDHakjumDTOList = sdao.findStudentMyScoreANDHakjumByDeptno1(101);
		if(StudentMyScoreANDHakjumDTOList.size()>0) {
			for(StudentMyScoreANDHakjumDTO sl : StudentMyScoreANDHakjumDTOList) {
				System.out.println(sl);
			}
		}
		List<StudentMyScoreANDHakjumDTO>StudentMyScoreANDHakjumDTOList2 = sdao.findStudentMyScoreANDHakjumByDeptno1(102);
		if(StudentMyScoreANDHakjumDTOList2.size()>0) {
			for(StudentMyScoreANDHakjumDTO sl : StudentMyScoreANDHakjumDTOList2) {
				System.out.println(sl);
			}
		}
	}

}
