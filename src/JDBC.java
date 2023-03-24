import java.sql.*;
public class JDBC {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String user = "root";
        String password = "lak170BG@";
        String query = "SELECT * FROM users";

                //Other function can run in here.
        //String query = "INSERT INTO users VALUES ('Gayan',25)";
        //String query = "DELETE FROM users WHERE age=24";
        //String query = "UPDATE users SET age=39 WHERE name='Kamal";
        //String query = "CREATE TABLE subjects ( Code VARCHAR(10), Name VARCHAR(20)";
        //String query = "DROP TABLE subjects";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(query);

            //statement.executeUpdate(query);
            //down  25/26/27/28/29/30/31 these code lines must remove to run above code and functions

            String name;
            int age;
            while(result.next()){
                name = result.getString(1);
                age = result.getInt(2);
                System.out.println(name + " " + age);
            }

            connection.close();

        }catch(Exception e){
            System.out.println(e);
        }

    }
}
