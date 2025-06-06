package xyz; 
import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.PreparedStatement; 
import java.sql.ResultSet; 
import java.sql.Statement; 

public class JDBCTASK { 
    public static void main(String[] args) { 
        try { 
            Class.forName("com.mysql.cj.jdbc.Driver"); 

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test", "root", "Bhar@Bhar@333"); 

            
            String insertSql = "REPLACE INTO stu VALUES (?, ?, ?)"; 
            PreparedStatement pstmt = con.prepareStatement(insertSql); 

            Object[][] stu = { 
                {1, "Alice", 10}, 
                {2, "Bob", 20}, 
                {3, "Can", 30}, 
                {4, "David", 40}, 
                {5, "Eve", 50}, 
                {6, "Fimona", 60}, 
            }; 

            for (Object[] student : stu) { 
                pstmt.setInt(1, (int) student[0]); 
                pstmt.setString(2, (String) student[1]); 
                pstmt.setInt(3, (int) student[2]); 
                pstmt.executeUpdate(); 
            } 

            pstmt.close(); 

            Statement stmt = con.createStatement(); 
            ResultSet rs = stmt.executeQuery("SELECT * FROM stu");

            System.out.println("Student List:"); 
            while (rs.next()) { 
                System.out.println(rs.getInt("id") + " " + rs.getString("name") + " " + rs.getInt("marks")); 
            } 

            rs.close(); 
            stmt.close(); 
            con.close(); 

        } catch (Exception e) { 
            System.err.println("Database error: " + e.getMessage()); 
            e.printStackTrace(); 
        } 
    } 
}