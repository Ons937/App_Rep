## 🎯 Objectif de l’activité

Étendre l’application Client/Serveur développée dans l’Activité 1-1 pour ajouter un traitement côté serveur :  
> Le client envoie un entier **x** au serveur, qui retourne le résultat de **x × 5**.

---


## 🔧 Fonctionnement du service

### Côté Client
- Saisie d’un entier **x** via le clavier
- Envoi de **x** au serveur via un socket
- Réception du résultat **x × 5** depuis le serveur
- Affichage du résultat

### Côté Serveur
- Attente de la connexion du client
- Réception de l’entier **x**
- Calcul de **x × 5**
- Envoi du résultat au client

