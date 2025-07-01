package study.db.v4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import study.db.v2.DBConnectionManager;

public class DepartmentDAO {
// DB연결 및 사용시 필요한 객체
	Connection conn; // DB 연결 객체
	PreparedStatement psmt; // DB 연결후, sql 명령 실행해주는 객체
	ResultSet rs; // sql Select 실행 후 조회 결과가 저장되는 객체
	
	public DepartmentDTO findDepartmentByDeptno(int deptno) {
		conn = DBConnectionManager.connectDB();
		
		// 쿼리 준비
		//String query = "select * from professor deptno = ?";
		
		//String query = "select studno,name,id,grade,jumin,TO_CHAR(birthday,'YYYY-MM-DD') birthday, tel, height, weight,deptno1,deptno2,profno from student";
		//String query = "select * from student";
		String query = "select * from department where deptno = ? ";
		
		DepartmentDTO departmentDTO = null;
		
		try {
			
			psmt = conn.prepareStatement(query); // 쿼리실행 준비객체
			
			psmt.setInt(1, deptno);
			rs = psmt.executeQuery(); // 쿼리 실행 후 결과 저장
			
			// ResultSet rs 에 담겨져있는 쿼리 수행결과 확인
			if (rs.next()) { // 읽어온 데이터를 행 단위로 반복하면서 접근
				// rs.next() 다음 불러올 행 데이터가 있으면 true, 없으면 false
		
				// 컬럼인덱스 / 컬럼명
				// rs.getInt(1)
				
		//		if(deptList == null)
		//			deptList = new ArrayList<Dept>();
				
			
				//s.setBirthday(ConvertDateUtil.convertTimestampToLocalDateTime(rs.getTimestamp("birthday")));
				//s.setBirthday(rs.getString("birthday"));
				
				
				departmentDTO = new DepartmentDTO();
				departmentDTO.setDeptno(rs.getInt("deptno"));
				departmentDTO.setDname(rs.getString("dname"));
				departmentDTO.setPart(rs.getInt("part"));
				departmentDTO.setBuild(rs.getString("build"));
				
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		DBConnectionManager.disconnectDB(conn, psmt, rs);
		
		return departmentDTO;
	}
}
