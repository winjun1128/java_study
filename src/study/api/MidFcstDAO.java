package study.api;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import study.db.v2.DBConnectionManager;
import study.db.v2.Dept;

public class MidFcstDAO {
	
//	Create table MID_TA
//	(
//	    tm_fc VARCHAR2(16),
//	    reg_id VARCHAR2(8),
//	    taMin4 NUMBER,
//	    taMax4 NUMBER,
//	    taMin5 NUMBER,
//	    taMax5 NUMBER,
//	    CONSTRAINT MID_TA_PK PRIMARY KEY(tm_fc,reg_id)
//	);
	
//	CREATE TABLE MID_TA_REG_ID
//	(
//	    reg_id VARCHAR2(8),
//	    reg_name VARCHAR2(32)
//	);
	
	// DB연결 및 사용시 필요한 객체
		Connection conn; // DB 연결 객체
		PreparedStatement psmt; // DB 연결후, sql 명령 실행해주는 객체
		ResultSet rs; // sql Select 실행 후 조회 결과가 저장되는 객체
		
	//insert
	public int saveMidTa(MidTaDTO midTaDTO) {
		conn = DBConnectionManager.connectDB();

		// 쿼리 준비

		String query = "INSERT INTO mid_ta VALUES(?,?,?,?,?,?) ";
		
		int result = 0;

		
		
		try {

			psmt = conn.prepareStatement(query); // 쿼리실행 준비객체
			 
			//파라미터 세팅
			psmt.setString(1, midTaDTO.getTmFc()); //쿼리에 있는 첫번째 ? 위치에 deptno 를 세팅하겠다
			psmt.setString(2, midTaDTO.getRegId());
			psmt.setInt(3,midTaDTO.getTaMin4());
			psmt.setInt(4,midTaDTO.getTaMax4());
			psmt.setInt(5,midTaDTO.getTaMin5());
			psmt.setInt(6,midTaDTO.getTaMax5());
			
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
}
