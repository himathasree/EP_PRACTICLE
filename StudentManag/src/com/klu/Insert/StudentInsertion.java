package com.klu.Insert;
import com.klu.Bean.StudentBean;
import com.klu.Connections.DBUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class StudentInsertion 
{
		public int StudentInsert(StudentBean Student) throws SQLException, ClassNotFoundException {
			Connection con=DBUtil.DBConnection();
			PreparedStatement ps1=con.prepareStatement("insert into Student values(?,?,?)");
			ps1.setInt(1,Student.getRegno());
			ps1.setString(2,Student.getName());
			ps1.setString(3,Student.getEmail());
			int i=ps1.executeUpdate();
			con.close();
			return i;
		}
		
		public int StudentDelete(StudentBean student)throws SQLException, ClassNotFoundException{
			Connection con=DBUtil.DBConnection();
			PreparedStatement ps2=con.prepareStatement("delete from Student where regno=101");
			int j=ps2.executeUpdate();
			con.close();
			return j;
		}
		
		public int StudentUpdate(StudentBean student)throws SQLException, ClassNotFoundException{
			Connection con=DBUtil.DBConnection();
			PreparedStatement ps3=con.prepareStatement("update Student set email='vhyma@co.in' where regno=101");
			int k=ps3.executeUpdate();
			con.close();
			return k;
		}
		
		public boolean StudentDisplay(StudentBean student)throws SQLException, ClassNotFoundException{
			Connection con=DBUtil.DBConnection();
			PreparedStatement ps4=con.prepareStatement("select * from Student");
			boolean l=ps4.execute();
			con.close();
			return l;
		}
}

