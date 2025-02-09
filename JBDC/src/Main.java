import java.sql.*;

public class Main {
    public static void main(String[] args) {
        /*
            import package
            load and register
            create connection
            create statement
            execute statement
            close
         */
        try {
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=demo;encrypt=true;trustServerCertificate=true";
            String username = "sa";
            String password = "2124243730z@X";
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to SQL Server successfully!");

            Statement st = con.createStatement();
//            String sql = "SELECT name FROM student WHERE sid = 1";
//            String sql = "SELECT * FROM student";
//            String sql = "INSERT INTO student (name, marks) VALUES('River', 100)";
//            int sid = 5;
//            String sql = "UPDATE student SET name = 'River Tran' WHERE sid = " + sid; // SQL injection

            String sql = "";

            // executeQuery use for GET
            // execute use for CREATE, UPDATE, DELETE
//            ResultSet rs = st.executeQuery(query);

//            rs.next();
//            String name = rs.getString("name");
//            System.out.println(name);

//            while (rs.next()) {
//                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
//            }

            st.execute(sql);

            int sid = 5;
            String query = "UPDATE student SET name = 'River Tran' WHERE sid = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, sid);
            ps.execute();


            con.close();
            System.out.println("Connection closed!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}