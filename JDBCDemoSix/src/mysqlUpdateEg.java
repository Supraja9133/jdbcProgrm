import java.sql.*;
import java.util.Scanner;
public class mysqlUpdateEg {

	public static void main(String[] args)throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int rollNo;
		String name;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ABC","root","Supri@91332211");
			Statement st=con.createStatement();
			System.out.println("enter the rollNo of project");
			rollNo=sc.nextInt();
			name=sc.nextLine();
			System.out.println("Enter the name of new project");
			name=sc.nextLine();
			st.executeUpdate("UPDATE project SET name='"+name+"' WHERE rollNo='"+rollNo+"'");
			con.close();
		}catch(SQLException eeeeee) {
			System.out.println(eeeeee);
		}
	}

}
