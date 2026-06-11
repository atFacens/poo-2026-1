package br.facens.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class AlunoDAO {
    static String url = "jdbc:mysql://localhost:3306/poo_facens";
    static String user = "profFacens";
    static String password = "aula";

    public static void connectBD() {
        try {
            System.out.println("Tentando conectar...");
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Conectou!");
            connection.close();
            System.out.println("Desconectado.");

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

}
