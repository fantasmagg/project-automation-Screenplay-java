package Actions;

import java.sql.*;

public class SelectFrom_baseDeJava_Sqlserver {

    public static void sqlserv() throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL = "jdbc:sqlserver://LAPTOP-4JLOV31H\\SQLEXPRESS:1433;databaseName=Mercado;user=usuarioSQL;password=123;";

        Connection con = DriverManager.getConnection(connectionURL);
        System.out.println("nos conectamos");

        Statement st = con.createStatement();
         ResultSet rs = st.executeQuery("select * from baseDeJava");

        Statement instrucion = con.createStatement();
        instrucion.execute("insert into baseDeJava values('google','https://www.google.com/')");

         while (rs.next()){

             int ID = rs.getInt(1);
             String name = rs.getString(2);
             String url = rs.getString(3);
             System.out.println(ID+" "+name+" "+" "+url);

         }

        con.close();

    }

}
