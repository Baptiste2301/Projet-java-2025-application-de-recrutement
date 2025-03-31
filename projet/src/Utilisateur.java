public class Utilisateur {
    // Attributs correspondant à la table Utilisateur
    private int idUtilisateur;
    private String email;
    private String motDePasse;
    private String typeUtilisateur;
    private String nom;
    private String prenom;
    private String telephone;
    private String cvPath;
    private java.util.Date dateInscription;

    // Constructeur par défaut
    public Utilisateur() {
    }

    // Constructeur avec tous les paramètres
    public Utilisateur(int idUtilisateur, String email, String motDePasse,
                       String typeUtilisateur, String nom, String prenom) {
        this.idUtilisateur = idUtilisateur;
        this.email = email;
        this.motDePasse = motDePasse;
        this.typeUtilisateur = typeUtilisateur;
        this.nom = nom;
        this.prenom = prenom;
    }

    // Getters et Setters
    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public String getTypeUtilisateur() {
        return typeUtilisateur;
    }

    public void setTypeUtilisateur(String typeUtilisateur) {
        this.typeUtilisateur = typeUtilisateur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getCvPath() {
        return cvPath;
    }

    public void setCvPath(String cvPath) {
        this.cvPath = cvPath;
    }

    public java.util.Date getDateInscription() {
        return dateInscription;
    }

    public void setDateInscription(java.util.Date dateInscription) {
        this.dateInscription = dateInscription;
    }

    // Méthode toString pour affichage et débogage
    @Override
    public String toString() {
        return "Utilisateur{" +
                "idUtilisateur=" + idUtilisateur +
                ", email='" + email + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", typeUtilisateur='" + typeUtilisateur + '\'' +
                '}';
    }
}