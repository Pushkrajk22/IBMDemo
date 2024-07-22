import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Bank {
	
	 private static boolean validateUser(Connection con, String username, String password) throws SQLException {
	        String sql = "SELECT password FROM login_details WHERE username = ?";
	        try (PreparedStatement pst = con.prepareStatement(sql)) {
	            pst.setString(1, username);
	            try (ResultSet rs = pst.executeQuery()) {
	                if (rs.next()) {
	                    String dbPassword = rs.getString("password");
	                    return password.equals(dbPassword);
	                } else {
	                    return false; // User not found
	                }
	            }
	        }
	    }
	 
	 void loginUser() {
		String url = "jdbc:mysql://localhost:3306/JDBCBank";
		String db_username = "root";
		String db_password = "Pushkraj@22";
			
	        try (Connection con = DriverManager.getConnection(url, db_username, db_password)) {
	            Scanner sc = new Scanner(System.in);
	            System.out.print("Enter username: ");
	            String username = sc.nextLine().trim();
	            System.out.print("Enter password: ");
	            String password = sc.nextLine().trim();

	            if (validateUser(con, username, password)) {
	                System.out.println("Login successful!");
	                // Proceed with further operations after successful login
	            } else {
	                System.out.println("Login failed. Incorrect username or password.");
	            }

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	 
	
	void registerIndividualuser() 
	{
		
	}
	
	
	void registerCorporateUser()
	{
		
	}
	
	void deleteAccount()
	{
		
	}
	
	void issueCreditCard()
	{
		
	}

}
