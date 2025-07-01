package study.db.v4;

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

public class StudentDAO {
	// DB연결 및 사용시 필요한 객체
	Connection conn; // DB 연결 객체
	PreparedStatement psmt; // DB 연결후, sql 명령 실행해주는 객체
	ResultSet rs; // sql Select 실행 후 조회 결과가 저장되는 객체
	
	public StudentMypageDTO findStudentMypageInfoByStudno(int studno) {
		conn = DBConnectionManager.connectDB();
		
		// 쿼리 준비
		//String query = "select * from professor deptno = ?";
		
		//String query = "select studno,name,id,grade,jumin,TO_CHAR(birthday,'YYYY-MM-DD') birthday, tel, height, weight,deptno1,deptno2,profno from student";
		//String query = "select * from student";
		String query = "select * "
				+ " from student s, department d "
				+ " where s.studno = ? "
				+ " AND s.deptno1 = d.deptno ";
		
		StudentMypageDTO s = null;
		
		try {
			
			psmt = conn.prepareStatement(query); // 쿼리실행 준비객체
			
			psmt.setInt(1, studno);
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
				
				
				s = new StudentMypageDTO();
				
				s.setStudno(rs.getInt("studno"));
				s.setName(rs.getString("name"));
				s.setId(rs.getString("id"));
				s.setGrade(rs.getInt("grade"));
				s.setJumin(rs.getString("jumin"));

				//s.setBirthday(ConvertDateUtil.convertTimestampToLocalDateTime(rs.getTimestamp("birthday")));
				s.setBirthday(rs.getString("birthday"));
				s.setTel(rs.getString("tel"));
				s.setHeight(rs.getInt("height"));
				s.setWeight(rs.getInt("weight"));
				s.setDeptno1(rs.getInt("deptno1"));
				s.setDeptno2(rs.getInt("deptno2"));
				s.setProfno(rs.getInt("profno"));
				
				s.setDeptno(rs.getInt("deptno"));
				s.setDname(rs.getString("dname"));
				s.setPart(rs.getInt("part"));
				s.setBuild(rs.getString("build"));
				
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		DBConnectionManager.disconnectDB(conn, psmt, rs);
		
		return s;
	}
	
	public StudentDTO findStudentByStudno(int studno) {
		conn = DBConnectionManager.connectDB();
		
		// 쿼리 준비
		//String query = "select * from professor deptno = ?";
		
		//String query = "select studno,name,id,grade,jumin,TO_CHAR(birthday,'YYYY-MM-DD') birthday, tel, height, weight,deptno1,deptno2,profno from student";
		//String query = "select * from student";
		String query = "select studno,name,id,grade,jumin,"
				+ "TO_CHAR(birthday,'YYYY-MM-DD') birthday, tel, height,"
				+ " weight, deptno1 ,deptno2 ,profno "
				+ "from student "
				+ " where studno = ? ";
		
		StudentDTO s = null;
		
		try {
			
			psmt = conn.prepareStatement(query); // 쿼리실행 준비객체
			
			psmt.setInt(1, studno);
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
				
				
				s = new StudentDTO();
				s.setStudno(rs.getInt("studno"));
				s.setName(rs.getString("name"));
				s.setId(rs.getString("id"));
				s.setGrade(rs.getInt("grade"));
				s.setJumin(rs.getString("jumin"));

				//s.setBirthday(ConvertDateUtil.convertTimestampToLocalDateTime(rs.getTimestamp("birthday")));
				s.setBirthday(rs.getString("birthday"));
				s.setTel(rs.getString("tel"));
				s.setHeight(rs.getInt("height"));
				s.setWeight(rs.getInt("weight"));
				s.setDeptno1(rs.getInt("deptno1"));
				s.setDeptno2(rs.getInt("deptno2"));
				s.setProfno(rs.getInt("profno"));
				
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		DBConnectionManager.disconnectDB(conn, psmt, rs);
		
		return s;
	}
	//insert
//	public int saveStudent(StudentDTO s) {
//		conn = DBConnectionManager.connectDB();
//
//		// 쿼리 준비
//
//		String query = "INSERT INTO STUDENT VALUES(?,?,?,?,?,?,?,?,?,?,?,?) ";
//		
//		int result = 0;
//
//		
//		
//		try {
//
//			psmt = conn.prepareStatement(query); // 쿼리실행 준비객체
//			 
//			//파라미터 세팅
//			psmt.setInt(1, s.getStudno()); //쿼리에 있는 첫번째 ? 위치에 deptno 를 세팅하겠다
//			psmt.setString(2, s.getName());
//			psmt.setString(3,s.getId());
//			psmt.setInt(4,s.getGrade());
//			psmt.setString(5, s.getJumin());
//			psmt.setString(6, s.getBirthday());
//			psmt.setString(7,s.getTel());
//			psmt.setInt(8, s.getHeight());
//			psmt.setInt(9, s.getWeight());
//			psmt.setInt(10, s.getDeptno1());
//			psmt.setInt(11, s.getDeptno2());
//			psmt.setInt(12, s.getProfno());
//			
//			
//			//psmt.executeQuery() : select 시 사용 -> return ResultSet (조회결과 데이터)
//			result = psmt.executeUpdate();
//			// psmt.executeUpdate() : insert, upedate, delete 사용 -> return int(적용된 행의 수)
//			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		finally {
//			DBConnectionManager.disconnectDB(conn, psmt, rs);
//		}
//	
//		return result;
//	}
	//insert update delete -> return int (적용된 행 수)
	public int saveStudent(StudentDTO student) {
		conn = DBConnectionManager.connectDB();

		// 쿼리 준비

		String query = "INSERT INTO STUDENT"
				+ " VALUES(?,?,?,?,?,TO_DATE(?,'YYYY-MM-DD'),?,?,?,?,?,?) ";
		
		int result = 0;

		
		
		try {

			psmt = conn.prepareStatement(query); // 쿼리실행 준비객체
			 
			//파라미터 세팅
			psmt.setInt(1, student.getStudno()); //쿼리에 있는 첫번째 ? 위치에 deptno 를 세팅하겠다
			psmt.setString(2, student.getName());
			psmt.setString(3,student.getId());
			psmt.setInt(4,student.getGrade());
			psmt.setString(5, student.getJumin());
			psmt.setString(6, student.getBirthday());
			psmt.setString(7,student.getTel());
			psmt.setInt(8, student.getHeight());
			psmt.setInt(9, student.getWeight());
			psmt.setInt(10, student.getDeptno1());
			
			//student.getDeptno2() : null
			//psmt.setInt(11, student.getDeptno2());
			if(student.getDeptno2()==null)
				psmt.setNull(11,Types.INTEGER);
			else
				psmt.setInt(11, student.getDeptno2());
			
			psmt.setInt(12, student.getProfno());
			
			
			//psmt.executeQuery() : select 시 사용 -> return ResultSet (조회결과 데이터)
			result = psmt.executeUpdate();
			// psmt.executeUpdate() : insert, upedate, delete 사용 -> return int(적용된 행의 수)
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}
	
		return result;
	}
//	public List<StudentDTO> findStudentList() {
//		conn = DBConnectionManager.connectDB();
//		
//		// 쿼리 준비
//		//String query = "select * from professor deptno = ?";
//		
//		String query = "select studno,name,id,grade,jumin,TO_CHAR(birthday,'YYYY-MM-DD') birthday, tel, height, weight,deptno1,deptno2,profno from student";
//		//String query = "select * from student";
//		
//		List<StudentDTO> studentList = new ArrayList<StudentDTO>();
//		
//		try {
//			
//			psmt = conn.prepareStatement(query); // 쿼리실행 준비객체
//			
//			rs = psmt.executeQuery(); // 쿼리 실행 후 결과 저장
//			
//			// ResultSet rs 에 담겨져있는 쿼리 수행결과 확인
//			while (rs.next()) { // 읽어온 데이터를 행 단위로 반복하면서 접근
//				// rs.next() 다음 불러올 행 데이터가 있으면 true, 없으면 false
//		
//				// 컬럼인덱스 / 컬럼명
//				// rs.getInt(1)
//				
//		//		if(deptList == null)
//		//			deptList = new ArrayList<Dept>();
//				
//				// 해당 행에 컬럼 단위로 데이터 접근
//				StudentDTO studentdto = new StudentDTO();
//				studentdto.setStudno(rs.getInt("studno"));
//				studentdto.setName(rs.getString("name"));
//				studentdto.setId(rs.getString("id"));
//				studentdto.setGrade(rs.getInt("grade"));
//				studentdto.setJumin(rs.getString("jumin"));
//				studentdto.setBirthday(rs.getString("birthday"));
//				studentdto.setTel(rs.getString("tel"));
//				studentdto.setHeight(rs.getInt("height"));
//				studentdto.setWeight(rs.getInt("weight"));
//				studentdto.setDeptno1(rs.getInt("deptno1"));
//				studentdto.setDeptno2(rs.getInt("deptno2"));
//				studentdto.setProfno(rs.getInt("profno"));
//				
//				studentList.add(studentdto);
//			}
//		
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		DBConnectionManager.disconnectDB(conn, psmt, rs);
//		
//		return studentList;
//	}
	public List<StudentDTO> findStudentList() {
		conn = DBConnectionManager.connectDB();
		
		// 쿼리 준비
		//String query = "select * from professor deptno = ?";
		
		//String query = "select studno,name,id,grade,jumin,TO_CHAR(birthday,'YYYY-MM-DD') birthday, tel, height, weight,deptno1,deptno2,profno from student";
		//String query = "select * from student";
		String query = "select studno,name,id,grade,jumin,"
				+ "TO_CHAR(birthday,'YYYY-MM-DD') birthday, tel, height,"
				+ " weight, deptno1 ,deptno2 ,profno "
				+ "from student ";
		
		List<StudentDTO> studentList = new ArrayList<StudentDTO>();
		
		try {
			
			psmt = conn.prepareStatement(query); // 쿼리실행 준비객체
			
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
				
				
				StudentDTO s = new StudentDTO();
				s.setStudno(rs.getInt("studno"));
				s.setName(rs.getString("name"));
				s.setId(rs.getString("id"));
				s.setGrade(rs.getInt("grade"));
				s.setJumin(rs.getString("jumin"));

				//s.setBirthday(ConvertDateUtil.convertTimestampToLocalDateTime(rs.getTimestamp("birthday")));
				s.setBirthday(rs.getString("birthday"));
				s.setTel(rs.getString("tel"));
				s.setHeight(rs.getInt("height"));
				s.setWeight(rs.getInt("weight"));
				s.setDeptno1(rs.getInt("deptno1"));
				s.setDeptno2(rs.getInt("deptno2"));
				s.setProfno(rs.getInt("profno"));
				
				studentList.add(s);
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		DBConnectionManager.disconnectDB(conn, psmt, rs);
		
		return studentList;
	}
//	public List<StudentDTO> findStudentByGrade(int grade) {
//		conn = DBConnectionManager.connectDB();
//		
//		// 쿼리 준비
//		//String query = "select * from professor deptno = ?";
//		
//		String query = "select studno,name,id,grade,jumin,TO_CHAR(birthday,'YYYY-MM-DD') birthday, tel, height, weight,deptno1,deptno2,profno from student where grade = ?";
//		
//		List<StudentDTO> studentList = new ArrayList<StudentDTO>();
//		
//		try {
//			
//			psmt = conn.prepareStatement(query); // 쿼리실행 준비객체
//			
//			psmt.setInt(1, grade);
//			
//			rs = psmt.executeQuery(); // 쿼리 실행 후 결과 저장
//			
//			// ResultSet rs 에 담겨져있는 쿼리 수행결과 확인
//			while (rs.next()) { // 읽어온 데이터를 행 단위로 반복하면서 접근
//				// rs.next() 다음 불러올 행 데이터가 있으면 true, 없으면 false
//		
//				// 컬럼인덱스 / 컬럼명
//				// rs.getInt(1)
//				
//		//		if(deptList == null)
//		//			deptList = new ArrayList<Dept>();
//				
//				// 해당 행에 컬럼 단위로 데이터 접근
//				StudentDTO studentdto = new StudentDTO();
//				studentdto.setStudno(rs.getInt("studno"));
//				studentdto.setName(rs.getString("name"));
//				studentdto.setId(rs.getString("id"));
//				studentdto.setGrade(rs.getInt("grade"));
//				studentdto.setJumin(rs.getString("jumin"));
//				studentdto.setBirthday(rs.getString("birthday"));
//				studentdto.setTel(rs.getString("tel"));
//				studentdto.setHeight(rs.getInt("height"));
//				studentdto.setWeight(rs.getInt("weight"));
//				studentdto.setDeptno1(rs.getInt("deptno1"));
//				studentdto.setDeptno2(rs.getInt("deptno2"));
//				studentdto.setProfno(rs.getInt("profno"));
//				
//				studentList.add(studentdto);
//			}
//		
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		DBConnectionManager.disconnectDB(conn, psmt, rs);
//		
//		return studentList;
//	}
	public List<StudentDTO> findStudentByGrade(int grade) {
		conn = DBConnectionManager.connectDB();
		
		// 쿼리 준비
		//String query = "select * from professor deptno = ?";
		
		String query = "select studno,name,id,grade,jumin,"
				+ "TO_CHAR(birthday,'YYYY-MM-DD') birthday, tel, height, "
				+ "weight,deptno1,deptno2,profno "
				+ "from student where grade = ?";
		
		List<StudentDTO> studentList = new ArrayList<StudentDTO>();
		
		try {
			
			psmt = conn.prepareStatement(query); // 쿼리실행 준비객체
			
			psmt.setInt(1, grade);
			
			rs = psmt.executeQuery(); // 쿼리 실행 후 결과 저장
			
			// ResultSet rs 에 담겨져있는 쿼리 수행결과 확인
			while (rs.next()) { // 읽어온 데이터를 행 단위로 반복하면서 접근
				// rs.next() 다음 불러올 행 데이터가 있으면 true, 없으면 false
		
				// 컬럼인덱스 / 컬럼명
				// rs.getInt(1)
				
		//		if(deptList == null)
		//			deptList = new ArrayList<Dept>();
				
				// 해당 행에 컬럼 단위로 데이터 접근
				StudentDTO s = new StudentDTO();
				s.setStudno(rs.getInt("studno"));
				s.setName(rs.getString("name"));
				s.setId(rs.getString("id"));
				s.setGrade(rs.getInt("grade"));
				s.setJumin(rs.getString("jumin"));
				s.setBirthday(rs.getString("birthday"));
				s.setTel(rs.getString("tel"));
				s.setHeight(rs.getInt("height"));
				s.setWeight(rs.getInt("weight"));
				s.setDeptno1(rs.getInt("deptno1"));
				s.setDeptno2(rs.getInt("deptno2"));
				s.setProfno(rs.getInt("profno"));
				
				studentList.add(s);
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		DBConnectionManager.disconnectDB(conn, psmt, rs);
		
		return studentList;
	}
}
