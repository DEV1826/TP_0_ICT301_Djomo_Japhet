# TP_0_ICT301 - Principes SOLID

**Nom :** DJOMO YONDJIO  
**Prénom :** Japhet MERIME
**Matricule :** 23U2296

---

## Compréhension des Principes SOLID

Les principes SOLID sont cinq principes fondamentaux de conception orientée objet qui visent à créer des logiciels plus maintenables, extensibles et robustes. Voici ma compréhension de chacun :

### 1. Single Responsibility Principle (SRP)
**Une classe = une responsabilité**

Une classe ne devrait avoir qu'une seule raison de changer. Cela signifie qu'elle ne doit gérer qu'un seul aspect du système. Par exemple, une classe `Book` ne devrait gérer que les données du livre, pas son affichage, sa sauvegarde ou sa logique métier. En séparant ces responsabilités, on obtient un code plus modulaire et plus facile à maintenir.

**Avantages :**
- Meilleure cohésion
- Facilite les tests unitaires
- Réduit les dépendances entre modules

### 2. Open/Closed Principle (OCP)
**Ouvert à l'extension, fermé à la modification**

Les entités logicielles doivent être ouvertes à l'extension mais fermées à la modification. L'utilisation de l'abstraction et du polymorphisme permet d'atteindre cet objectif. Par exemple, pour ajouter une nouvelle forme géométrique, on n'a pas besoin de modifier la classe calculatrice, on crée simplement une nouvelle classe implémentant l'interface `Shape`.

**Avantages :**
- Réduit la rigidité du code
- Limite les risques de régression
- Facilite l'évolution du système

### 3. Liskov Substitution Principle (LSP)
**Les sous-classes doivent être substituables à leurs classes parentes**

Un objet d'une classe dérivée doit pouvoir remplacer un objet de sa classe de base sans altérer le bon fonctionnement du programme. Le principe met en garde contre les héritages inappropriés : un carré qui hérite de rectangle pose problème car il ne respecte pas tout le contrat de rectangle (modifier la largeur modifie aussi la hauteur).

**Avantages :**
- Garantit la cohérence du polymorphisme
- Évite les comportements inattendus
- Renforce la fiabilité du système

### 4. Interface Segregation Principle (ISP)
**Préférer plusieurs interfaces spécifiques plutôt qu'une interface générale**

Les clients ne doivent pas être forcés à dépendre d'interfaces qu'ils n'utilisent pas. Il vaut mieux créer plusieurs petites interfaces ciblées qu'une grande interface fourre-tout. Par exemple, séparer l'interface `Workable` et `Eatable` permet aux robots de ne pas avoir à implémenter une méthode `eat()` qui n'a pas de sens pour eux.

**Avantages :**
- Interfaces plus claires et cohérentes
- Réduit les dépendances inutiles
- Facilite l'implémentation

### 5. Dependency Inversion Principle (DIP)
**Dépendre des abstractions, pas des implémentations**

Les modules de haut niveau ne doivent pas dépendre des modules de bas niveau. Les deux doivent dépendre d'abstractions. Une classe ne devrait pas instancier directement ses dépendances concrètes mais recevoir des abstractions (interfaces). Par exemple, `OrderProcessor` ne doit pas dépendre directement de `MySQLDatabase` mais d'une interface `Database`.

**Avantages :**
- Découple les modules
- Facilite les tests (injection de mock)
- Améliore la réutilisabilité
- Permet de changer facilement d'implémentation


Ces principes permettent de lutter contre la **rigidité**, la **fragilité** et l'**immobilité** du code, tout en favorisant une **forte cohésion** et un **faible couplage** entre les modules.

