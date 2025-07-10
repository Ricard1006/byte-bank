package ricardo.products.bytebank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public Connection recuperarConexao() {
            String url = "jdbc:mysql://localhost:3306/ricardo123";
            String usuario = "root";
            String senha = "Ricardinho1006+";

            try {
                return DriverManager
                        .getConnection(url, usuario, senha);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
