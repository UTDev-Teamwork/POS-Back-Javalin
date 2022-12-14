package mx.edu.utdev.context;

import java.sql.Connection;
import java.sql.DriverManager;

public class PostgreSQLJDBC {

    public Connection c = null;

    public PostgreSQLJDBC() {
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/pos_admin",
                            "postgres", "1234");
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Opened database successfully");
    }

}
