package br.com.alura.bytebank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {

        public static void main(String[] args) {
            String url = "jdbc:mysql://localhost:3306/ricardo123";
            String usuario = "root";
            String senha = "Ricardinho1006+";

            try {
                Connection conexao = DriverManager.getConnection(url, usuario, senha);
                System.out.println("Conexão bem-sucedida!");
                conexao.close();
            } catch (SQLException e) {
                System.out.println("Erro ao conectar: " + e.getMessage());
        }
    }
}
