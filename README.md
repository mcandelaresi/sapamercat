#SapaMercat
SAPAMERCAT és una aplicació en Java per gestionar un carret de la compra en temps real, seguint el model MVC.

Característiques

Permet gestionar productes de tres tipus: Alimentació, Tèxtil i Electrònica.

Calcula el preu final segons regles específiques per a cada tipus de producte.

Limita el carret a un màxim de 100 productes.

Implementa un menú interactiu per gestionar el magatzem, afegir productes, passar per caixa i mostrar el carret.

Inclou interfícies per organitzar millor la funcionalitat i obtenir punts extra.

Estructura del projecte

El projecte està organitzat en els següents paquets:

controlador: Conté la classe principal Sapamercat.java, que gestiona la lògica del programa i la interacció amb l'usuari.

model.producte: Defineix la jerarquia de classes per als diferents tipus de productes:

Producte.java (classe abstracta)

Alimentacio.java

Textil.java

Electronica.java

Model.java (gestió dels productes i càlculs necessaris)

vista: Conté la classe Vista.java, que gestiona la visualització del menú i les opcions disponibles.

Funcionament

Gestió del magatzem i compres

Llistar productes per data de caducitat.

Generar un tiquet de compra.

Mostrar la composició dels productes tèxtils.

Afegir productes

Alimentació: Nom, preu, codi de barres i data de caducitat.

Tèxtil: Nom, preu, codi de barres i composició.

Electrònica: Nom, preu, codi de barres i dies de garantia.

Passar per caixa

Calcula el total de la compra i buida el carret.

Controla que no se superi el límit de productes.

Mostrar carret de la compra

Llista els productes actuals afegits al carret.
