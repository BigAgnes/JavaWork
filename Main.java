import java.sql.*;

public class Main {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:./src/main/resources/test.db");
            Statement statement = connection.createStatement();
            statement.executeUpdate("drop table if exists EMPLOYEES");
            statement.executeUpdate("create table EMPLOYEES(EMPLOYEE_ID integer primary key autoincrement," +
                    "FIRST_NAME string not null," +
                    "LAST_NAME string not null," +
                    "DEPARTMENT string not null," +
                    "SALARY integer not null);");
            statement.executeUpdate("insert into EMPLOYEES values(null, 'John', 'Smith', 'Development', 5000);");
            statement.executeUpdate("insert into EMPLOYEES values(null, 'Nick', 'Johnson', 'Development', 6000);");
            statement.executeUpdate("insert into EMPLOYEES values(null, 'Mary', 'Johnson', 'Sales', 4000);");
            statement.executeUpdate("insert into EMPLOYEES values(null, 'Cristopher', 'Robin', 'Sales', 4000);");
            statement.executeUpdate("insert into EMPLOYEES values(null, 'Harry', 'Gates', 'Management', 8000);");

            ResultSet rs = statement.executeQuery("SELECT DEPARTMENT, SUM(SALARY) AS SALARY FROM EMPLOYEES GROUP BY DEPARTMENT;");
            while (rs.next()){
                System.out.println();
                System.out.println(rs.getString("DEPARTMENT") + ": " + rs.getInt("SALARY"));
            }

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        finally {
            try {
                if(connection != null){
                    connection.close();
                }
            }
            catch (SQLException ex){
                System.err.println(ex.getMessage());
            }
        }
    }
}
