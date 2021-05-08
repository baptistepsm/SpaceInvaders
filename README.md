# SpaceInvaders

- [Semaine n°1 : du 26 au 30 avril](#semaine1)
- [Glossaire](#glossaire)

## Semaine n°1 : du 26 au 30 avril <a id="semaine1"></a>

### Fonctionnalité en cours d’implémentation : 

#### Fonctionnalité n°1 : Déplacer un vaisseau dans l'espace de jeu (en cours)

- Story n°1 : Créer un espace de jeu  
Un espace de jeu est créé aux dimensions données (2D) 
Cet espace de jeu est vide

-  Story n°2 : Positionner un nouveau vaisseau dans l’espace de jeu  
Un nouveau vaisseau est créé
Le vaisseau est positionné aux coordonnées transmises
Si un nouveau vaisseau essaye d’être positionné en dehors des limites de l’espace jeu, alors une exception devra être levée.
 Contraintes :
La position souhaitée est transmise par ses coordonnées x et y.
Le coin supérieur gauche de l’espace jeu (point en haut à gauche) a pour coordonnées (0,0)
La taille du vaisseau est réduite pour l'instant à son minimum (1 seul point)    

- Story n°3 : Déplacer le vaisseau vers la droite dans l'espace de jeu (en cours d'implémentation)
Le vaisseau se déplace d'un pas vers la droite 
Si le vaisseau se trouve sur la bordure droite de l'espace de jeu, le vaisseau doit rester immobile (aucun déplacement, aucune exception levée : le vaisseau reste juste à sa position actuelle).


### Diagramme de classes 

![Diagrammes de classes de la semaine 1](images/diagramme_S1.jpg)

### Nuage de mots du projet spaceinvaders (semaine n°1)  

![Nuage de mots de la semaine 1](images/nuageMots_S1.png)


### Difficultés rencontrées 
Dans la story n°2, j'ai eu un problème lors du refactoring de la méthode aUnVaisseauQuiOccupeLaPosition car mon IDE avait inversé le x et le y en paramètres et je n'y avait pas fait attention. Je me suis donc retrouvé à avoir des tests qui ne marchaient pas.

### Remarques diverses
 Pour pouvoir, mettre en place les tests, il a été nécessaire d’ajouter une fonctionnalité supplémentaire qui permet de représenter l’espace de jeu dans une chaîne ASCII.




## Glossaire <a id="glossaire"></a>

* **Vaisseau** :  véhicule commandé par le joueur, pouvant se déplacer de droite à gauche et ayant la possibilité de lancer des missiles destinés à détruire le(s) envahisseurs.

* **Envahisseur**  :  ennemi qui apparaît à l'écran, se déplace automatiquement et qui doit être détruit par un missile lancé depuis le vaisseau du joueur.


* **Missile** :  projectile envoyé à la verticale par le vaisseau vers l'envahisseur dans le but de le détruire.

------------- 
