-- Table Utilisateur
CREATE TABLE Utilisateur (
    id_utilisateur INT PRIMARY KEY AUTO_INCREMENT,
    email VARCHAR(100) UNIQUE NOT NULL,
    mot_de_passe VARCHAR(255) NOT NULL,
    type_utilisateur ENUM('demandeur', 'recruteur') NOT NULL,
    nom VARCHAR(50) NOT NULL,
    prenom VARCHAR(50) NOT NULL,
    date_inscription TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    telephone VARCHAR(20),
    cv_path VARCHAR(255)
);

-- Table Offre_Emploi
CREATE TABLE Offre_Emploi (
    id_offre INT PRIMARY KEY AUTO_INCREMENT,
    titre_poste VARCHAR(100) NOT NULL,
    description TEXT NOT NULL,
    entreprise VARCHAR(100) NOT NULL,
    date_publication TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    secteur_activite VARCHAR(50) NOT NULL,
    localisation VARCHAR(100) NOT NULL,
    salaire_min DECIMAL(10,2),
    salaire_max DECIMAL(10,2),
    type_contrat ENUM('CDI', 'CDD', 'Freelance', 'Stage', 'Alternance') NOT NULL,
    statut ENUM('Actif', 'Cloturé') DEFAULT 'Actif'
);

-- Table Candidature
CREATE TABLE Candidature (
    id_candidature INT PRIMARY KEY AUTO_INCREMENT,
    id_utilisateur INT NOT NULL,
    id_offre INT NOT NULL,
    date_candidature TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    statut_candidature ENUM('En attente', 'Accepté', 'Refusé', 'En cours') DEFAULT 'En attente',
    lettre_motivation TEXT,
    FOREIGN KEY (id_utilisateur) REFERENCES Utilisateur(id_utilisateur),
    FOREIGN KEY (id_offre) REFERENCES Offre_Emploi(id_offre)
);
