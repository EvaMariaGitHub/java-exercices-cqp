# java-exercices-cqp - LifeSchool
L’objectif est de créer l'application "LifeSchool" qui permet à une école de gérer ses étudiants. 

La classe Student

Un élève est caractérisé par son prénom, son nom, sa date de naissance, son âge.

Mis à part l'âge, toutes les autres propriétés ne sont pas modifiables une fois qu'un objet de type Student a été créé.

La classe doit disposer d’une méthode toString().

La classe School

L'école est représentée par une classe School. Elle est caractérisée par son nom et une liste d'élèves. Seul la liste est modifiable.

Les élèves de cette école seront référencés dans cette liste.

Une école peut accepter un élève.

La classe doit disposer d’une méthode toString().

L'application LifeSchool

1/Ecrivez un programme principal dans la classe LifeSchool, dans lequel vous créerez une école nommée InfoJava avec les étudiants suivants:

Prénom; Nom; Date de naissance; âge
Stéphanie; Durand; 12/11/1980; 37
Mamadou; Fort; 13/09/1992;25
Florence; Lune; 05/04/2001;16
Loic; Martin; 07/07/1998;19

2/Afficher toutes les informations concernant l'école Simplon et ses étudiants.

3/Ajouter une méthode permettant de connaître l'âge moyenne des étudiants. Testez cette méthode dans le programme principal.

Partie sur héritage

Nous allons continuer l’exercice précédent

Un diplômé est un élève. Il dispose d'un diplôme qui a comme caractéristique un niveau de diplôme (5:bac+5, 4:bac+4, 3:bac+3, 2:bac+2, 1:bac)

En reprenant l'exercice, créer la classe Graduate qui dérive de Student. Développer les accesseurs et ajouter aussi la méthode equals

Dans l'application LifeSchool:

1/Ajouter les diplômés suivants dans l'école:

Drake; Foudre; 11/11/1990; 27; 2
Solange; Feu; 12/12/1990; 27; 5
Johnny; Lumière; 01/10/1990; 27; 3

2/Afficher les étudiants avec son prénom, nom, date de naissance, son âge et les diplômés avec son prénom, son nom et le niveau de son diplôme. 

3/Afficher la comparaison entre l'objet Johnny et Solange.

