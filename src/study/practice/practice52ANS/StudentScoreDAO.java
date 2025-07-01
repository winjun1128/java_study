package study.practice.practice52ANS;

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

public class StudentScoreDAO {
	// DB연결 및 사용시 필요한 객체
	Connection conn; // DB 연결 객체
	PreparedStatement psmt; // DB 연결후, sql 명령 실행해주는 객체
	ResultSet rs; // sql Select 실행 후 조회 결과가 저장되는 객체
	
	public List<StudentScoreDTO> findStudentScoreListByDeptno(int deptno) {
		conn = DBConnectionManager.connectDB();
		
		// 쿼리 준비
		//String query = "select * from professor deptno = ?";
		
		//String query = "select studno,name,id,grade,jumin,TO_CHAR(birthday,'YYYY-MM-DD') birthday, tel, height, weight,deptno1,deptno2,profno from student";
		//String query = "select * from student";
		String query = "select st.studno, st.name, sc.total, hj.grade "
				+ " from student st, score sc, hakjum hj"
				+ " where st.studno = sc.studno"
				+ " AND sc.total BETWEEN hj.min_point AND hj.max_point"
				+" AND st.deptno1 = ?";
		
		List<StudentScoreDTO> sList = new ArrayList<StudentScoreDTO>();
		
		try {
			
			psmt = conn.prepareStatement(query); // 쿼리실행 준비객체
			
			psmt.setInt(1, deptno);
			rs = psmt.executeQuery(); // 쿼리 실행 후 결과 저장
			
			// ResultSet rs 에 담겨져있는 쿼리 수행결과 확인
			while(rs.next()) { // 읽어온 데이터를 행 단위로 반복하면서 접근
				// rs.next() 다음 불러올 행 데이터가 있으면 true, 없으면 false
		
				// 컬럼인덱스 / 컬럼명
				// rs.getInt(1)
				
		//		if(deptList == null)
		//			deptList = new ArrayList<Dept>();
				
			
				//s.setBirthday(ConvertDateUtil.convertTimestampToLocalDateTime(rs.getTimestamp("birthday")));
				//s.setBirthday(rs.getString("birthday"));
				StudentScoreDTO s = new StudentScoreDTO();
				
				s = new StudentScoreDTO();
				
				s.setStudno(rs.getInt("studno"));
				s.setName(rs.getString("name"));
				s.setTotal(rs.getInt("total"));
				s.setGrade(rs.getString("grade"));
				
				sList.add(s);
				
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		DBConnectionManager.disconnectDB(conn, psmt, rs);
		
		return sList;
	}
	
}
