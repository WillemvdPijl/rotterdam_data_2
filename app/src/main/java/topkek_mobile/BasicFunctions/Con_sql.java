package topkek_mobile.BasicFunctions;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//
///**
// * Created by Steven on 28-6-2016.
// */
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;
//import java.sql.Connection;
//import java.sql.SQLException;
////bananahammock
//public class Con_sql {
//    //Sets connection to the data sources
//    static Connection connection = null;
//
//    public static void main(String[] args) {
//        //Sets connection to the database
//        System.out.println("---PostgreSQL " + " JDBC connection Testing---");
//
//        try{
//            Class.forName("org.postgresql.Driver");
//        }catch(ClassNotFoundException e){
//            System.out.println("Where is your PostgreSQL JDBC Driver? " + "Include in your library path!");
//            e.printStackTrace();
//            return;
//        }
//        System.out.println("PostgreSQL JDBC Driver Registered!");
//
//        //Sets connection to the data sources
//
//        try{
//            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Project_4", "postgres", "132132");
//        }catch (SQLException e){
//            System.out.println("Connection Failed! Check output console");
//            e.printStackTrace();
//            return;
//        }
//
//        if(connection != null){
//            System.out.println("You made it, take control of your database now!");
//        }else{
//            System.out.println("Failed to make connection!");
//        }
//        try{
//            query_1();
//        }catch(SQLException e){
//            System.out.println(e);
//        }
//
//    }
//    public static void query_1() throws SQLException{
//        Statement statement = connection.createStatement();
//        String query = "select * from fietstrommels";
//        ResultSet rs = statement.executeQuery(query);
//        System.out.println(rs);
//        while(rs.next()){
//            System.out.println(rs.getString("inventarisnr"));
//
//        }
//    }
//}
//public class Con_sql {
//
//    private Connection con;
//    private Statement st;
//
//    //The connection with the server will be established in the DBConnect method, if the server fails to respond an error message will be showed.
//    public Con_sql(){
//        try {
//            String host = "jdbc:postgresql://localhost:5432/Project_4";    //Server ip + database name
//            String uName = "postgres"; //Username
//            String uPass = "132132"; //password
//            Class.forName("com.mysql.jdbc.Driver");
//            con = DriverManager.getConnection(host, uName, uPass);
//
//        } catch (Exception ex) {
//            System.out.println("error: " + ex);
//        }
//
//    }
//    public ResultSet executeQuery(String query) throws SQLException {
//        st = con.createStatement();
//        return st.executeQuery(query);
//        System.out.println(rs);
//        while(rs.next()){
//            System.out.println(st.getString("straat")+"     " +(st.getString("inventarisnr")));
////
//
//    }
//
//
//}



