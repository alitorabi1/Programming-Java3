import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class Database {

    private static final String DB_USER = "people";
    private static final String DB_NAME = "people";
    private static final String DB_PASS = "9J22a3p25PKw5wpH";
    
    Connection conn;
    Database () throws SQLException {
        conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3333/people", DB_USER, DB_PASS);
    }
    
    // CRUD (Create, Retrieve, Update, Delete)
    public ArrayList<Person> getAllPerson() {
        throw new UnsupportedOperationException("Unimplemented");
    }

    public Person getPersonByID() {
        throw new UnsupportedOperationException("Unimplemented");
    }
    
    public int addPerson(Person p) throws SQLException {
        String query1 = "INSERT INTO person VALUES(NULL, ?, ?)";
        PreparedStatement ps = conn.prepareStatement(query1);
        ps.setString(1, p.name);
        ps.setInt(2, p.age);
        ps.execute();
        String query2 = "SELECT ID FROM person WHERE name = ? and age = ?)";
        ps.setString(1, p.name);
        ps.setInt(2, p.age);
        return Integer.parseInt(query2);
    }

    public void deletePerson(int ID) {
        throw new UnsupportedOperationException("Unimplemented");
    }

    public void updatePerson(Person p) {
        throw new UnsupportedOperationException("Unimplemented");
    }
}
