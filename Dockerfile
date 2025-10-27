# Étape 1 : Utiliser une image Java officielle
FROM openjdk:21-jdk-slim

# Étape 2 : Définir le répertoire de travail
WORKDIR /app

# Étape 3 : Copier le fichier JAR généré dans le conteneur
COPY target/democyber-0.0.1-SNAPSHOT.jar app.jar

# Étape 4 : Exposer le port 8080
EXPOSE 8080

# Étape 5 : Lancer l’application
ENTRYPOINT ["java", "-jar", "app.jar"]
