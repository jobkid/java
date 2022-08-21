package DAO;
import java.sql.*;
import java.util.ArrayList;

import beans.StoryBean;

public class StoryDAO {

	private StoryDAO() {
		
	}// �ٸ� ������ �����ڸ� ���� ���ϰ� ���´�. �̱����� �����ϱ� ����
	
	
	private static StoryDAO Instance = new StoryDAO();
	//�����ڴ� �ϳ� �ۿ� ������ ���Ѵ�. �׷��� �����ڸ� ����ϱ� ������ static���� ��´�.
	
	public static StoryDAO getInstance() {
		return Instance;
	}
	
	//connection ����
	public Connection getConnection(){//connection ��ü �����ϱ�
		Connection conn=null;
		String url = "jdbc:mysql://127.0.0.1:3306/againstory";
		String dbid = "root";
		String dbpw = "iotiot";
		String driver = "com.mysql.cj.jdbc.Driver";
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url,dbid, dbpw);
		}catch(Exception e) {
			System.out.println("connection ��ü ���� �� ���� �߻�"+e);
		}
		return conn;
	}
	
	
	//�Խñ� ����
	public int insertStory(StoryBean sb) {
		int result = -1;
		String sql = "insert into shortboard(nickname, pass, title, content) values (?,?,?,?);";
		Connection conn=null;
		PreparedStatement pstmt=null;
		
		try {
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, sb.getNickname());
			pstmt.setString(2, sb.getPass());
			pstmt.setString(3, sb.getTitle());
			pstmt.setString(4, sb.getContent());
			result=pstmt.executeUpdate();
		}catch(Exception e) {
			System.out.println("StoryDAO.insertStory() ���� �� ���� �߻� : "+e);
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception ex){
				System.out.println("StoryDAOinsertStory() ���� �� ���� �߻� : "+ex);
			}
		}
		return result;
	}
	
	//�Խñ� ��� ����
	public ArrayList <StoryBean> getStoryList(int currentPage, int recordsPerPage){
		ArrayList <StoryBean> storyList = new ArrayList<StoryBean>();;
		int start = currentPage*recordsPerPage-recordsPerPage;
		StoryBean story = null;
		String sql = "select * from shortboard limit ?, ?;";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, start);
			pstmt.setInt(2, recordsPerPage);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				story = new StoryBean();
				story.setNum(rs.getInt("num"));
				story.setTitle(rs.getString("title"));
				story.setNickname(rs.getString("nickname"));
				story.setWritingdate(rs.getString("writingdate"));
				storyList.add(story);
			}
		}catch(Exception e) {
			System.out.println("�� ��� ��ȸ �� ���� �߻�"+e);
		}finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception ex) {
				System.out.println("�� ��� ��ȸ �� ���� �߻�"+ex);
			}
		}
		return storyList;
	}
	
	//�Խñ� �� ���� ����
	public int getNumberOfRows() {
		String sql = "select count(num) from page;";
		int numberOfRows = 0;//�� �� �����Ͱ� �ִ����� ������ ����
		
		return numberOfRows;
	}
	
}
