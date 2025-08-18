package game_project.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import game_project.util.DBConnect;

public class UserDAO implements IUserDAO{
	// 유저 DAO
	
	@Override
	public boolean insertUser(UserDTO dto) throws Exception {
		// 유저정보 저장 시도
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String id = dto.getId();
		String pass = dto.getPass();
	    String name = dto.getName();
		
		try {
		    con = DBConnect.getConnection();
		    
		    // 아이디 중복 검사
		    pstmt = con.prepareStatement("select * from users where id = ?");
		    pstmt.setString(1, id);
		    rs = pstmt.executeQuery();
		    if (rs.next()) {
		    	System.out.println("중복된 아이디입니다.");
		    	return false;
		    }
		    else {
		    	// 아이디와 이름 중복 검사
		    	pstmt = con.prepareStatement("select * from users where id = ? and name = ?");
		    	pstmt.setString(1, id);
		    	pstmt.setString(2, name);
			    rs = pstmt.executeQuery();
			    if (rs.next()) {
			    	System.out.println("이미 존재하는 사용자입니다.");
			    	return false;
			    }
		    }
		    
		    // 중복 검사 끝난 뒤 회원가입 시도
		    pstmt = con.prepareStatement("insert into users values(?,?,?)");
		    pstmt.setString(1, id);
	    	pstmt.setString(2, pass);
	    	pstmt.setString(3, name);
		    
		    int result = pstmt.executeUpdate();
			if (result == 0) { // 회원가입이 안됐는데 오류 안나면 여기로
				System.out.println("회원가입에 실패했습니다. 다시 시도해주세요.");
				return false;
			}
		    
		} catch(Exception e) {
			throw e;
			
		} finally {
			DBConnect.close(con, pstmt, rs);
		}
		
		// 회원가입에 성공하면 여기로
		return true;
	}
	
	@Override
	public boolean updateUser(UserDTO dto) throws Exception {
		// 회원정보 수정 시도
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DBConnect.getConnection();
			String sql = "update users set pass = ?, name = ? where id = ?";
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, dto.getPass());
			pstmt.setString(2, dto.getName());
	    	pstmt.setString(3, dto.getId());
			
			int result = pstmt.executeUpdate();
			
			if (result == 0) {
				System.out.println("회원정보 수정에 실패했습니다. 다시 시도해주세요.");
				return false;
			}
			
		} catch(Exception e) {
			throw e;
			
		} finally {
			DBConnect.close(con, pstmt);
		}
		return true;
	}

	@Override
	public boolean deleteUser(UserDTO dto) throws Exception {
		// 회원탈퇴 시도
		Connection con = null;
		PreparedStatement pstmt = null;
		
		String id = dto.getId();
		
		try {
			con = DBConnect.getConnection();
			pstmt = con.prepareStatement("delete users where id = ?");
			pstmt.setString(1, id);
			
			int result = pstmt.executeUpdate();
			if (result == 0) {
				System.out.println("회원가입에 실패했습니다. 다시 시도해주세요.");
				return false;
			}
			
		} catch(Exception e) {
			throw e;
			
		} finally {
			DBConnect.close(con, pstmt);
		}
		
		// 회원탈되 성공
		return true;
	}

	@Override
	public UserDTO loginCheck(UserDTO dto) throws Exception {
		// 로그인 시도
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String id = dto.getId();
		String pass = dto.getPass();
		
		try {
			con = DBConnect.getConnection();
			pstmt = con.prepareStatement("select * from users where id = ?");
			pstmt.setString(1, id);
		    rs = pstmt.executeQuery();
		    
		    if (rs.next()) { 
		    	if (pass.equals(rs.getString(2))) {
		    		dto.setName(rs.getString(3));
		    		System.out.println("로그인 성공");
					System.out.println(dto.getName() + "님 반갑습니다!");
					return dto;
		    	}
		    	else {
		    		System.out.println("비밀번호가 틀렸습니다.");
		    		return null;
		    	}
		    }
		    else {
		    	System.out.println("해당 아이디의 사용자가 존재하지 않습니다.");
				return null;
		    }
			
		} catch(Exception e) {
			throw e;
			
		} finally {
			DBConnect.close(con, pstmt, rs);
		}
		
	}

}
