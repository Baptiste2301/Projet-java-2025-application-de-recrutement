import java.sql.Connection;
import java.sql.DriverManager;

public class TestConnexion {
    public static void main(String[] args) {
        // URL corrigée : utilisez le bon format pour MySQL
        String url = "jdbc:mysql://localhost:3306/projet";
        String utilisateur = "root"; // généralement "root" pour PhpMyAdmin local
        String motDePasse = ""; // souvent vide sur les installations locales

        try {
            // Charger le driver JDBC MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Tenter de se connecter
            Connection connexion = DriverManager.getConnection(url, utilisateur, motDePasse);

            // Si la connexion réussit
            System.out.println("OK");

            // Fermer la connexion
            connexion.close();
        } catch (Exception e) {
            // En cas d'erreur
            System.out.println("PAS OK");
            // Afficher le détail de l'erreur
            e.printStackTrace();
        }
    }
}