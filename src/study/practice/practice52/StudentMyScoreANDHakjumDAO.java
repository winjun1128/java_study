package study.practice.practice52;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import study.db.v2.DBConnectionManager;
import study.db.v2.Dept;
import study.db.v3.ConvertDateUtil;
import study.db.v3.Professor;

public class StudentMyScoreANDHakjumDAO {
	// DB연결 및 사용시 필요한 객체
	Connection conn; // DB 연결 객체
	PreparedStatement psmt; // DB 연결후, sql 명령 실행해주는 객체
	ResultSet rs; // sql Select 실행 후 조회 결과가 저장되는 객체
	
	public List<StudentMyScoreANDHakjumDTO> findStudentMyScoreANDHakjumByDeptno1(int deptno1) {
		conn = DBConnectionManager.connectDB();
		
		// 쿼리 준비
		//String query = "select * from professor deptno = ?";
		
		//String query = "select studno,name,id,grade,jumin,TO_CHAR(birthday,'YYYY-MM-DD') birthday, tel, height, weight,deptno1,deptno2,profno from student";
		//String query = "select * from student";
		String query = "select s.studno 학번, s.name 이름, sc.total 점수, h.grade 학점 "
				+ " from student s, score sc, hakjum h "
				+ " where s.deptno1 = ? "
				+ " AND s.studno = sc.studno "
				+ " AND sc.total BETWEEN h.min_point AND h.max_point";
		
		List<StudentMyScoreANDHakjumDTO>StudentMyScoreANDHakjumDTOList = new ArrayList<StudentMyScoreANDHakjumDTO>();
		
		try {
			
			psmt = conn.prepareStatement(query); // 쿼리실행 준비객체
			
			psmt.setInt(1, deptno1);
			rs = psmt.executeQuery(); // 쿼리 실행 후 결과 저장
			
			// ResultSet rs 에 담겨져있는 쿼리 수행결과 확인
			while (rs.next()) { // 읽어온 데이터를 행 단위로 반복하면서 접근
				// rs.next() 다음 불러올 행 데이터가 있으면 true, 없으면 false
		
				// 컬럼인덱스 / 컬럼명
				// rs.getInt(1)
				
		//		if(deptList == null)
		//			deptList = new ArrayList<Dept>();
				
			
				//s.setBirthday(ConvertDateUtil.convertTimestampToLocalDateTime(rs.getTimestamp("birthday")));
				//s.setBirthday(rs.getString("birthday"));
				
				StudentMyScoreANDHakjumDTO s = new StudentMyScoreANDHakjumDTO();

				s.setStudno(rs.getInt("학번"));
				s.setName(rs.getString("이름"));
				s.setTotal(rs.getInt("점수"));
				s.setHgrade(rs.getString("학점"));
				
				StudentMyScoreANDHakjumDTOList.add(s);
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		DBConnectionManager.disconnectDB(conn, psmt, rs);
		
		return StudentMyScoreANDHakjumDTOList;
	}
	
	
}
