/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Minijuego;

//Martínez Vera Josué Aldair
//Solís Contreras Darian Giselle 


/*
Bueno, este es un minijuego, en realidad se basa más en un quiz que contiene 4 opciones, uno por materia
Español, Matemáticas, Historia y Greografía, cada una tiene 10 preguntas y su sistema es simple, si aciertas
te dice que esta correcto, sino aciertas no te dice nada y puedes elegir otra opción, esto con el fin de que 
se nos quede mejor en la memoria en vez de que solo me diga cual es, sino que ya más o menos te dé una idea
*/

import Minijuego.Ventana;

public class Main {
    public static void main(String[] args) {
        //Esta es la main y basicamente creamos una ventana principal con esas dimensiones y la ventana es de nuesra clase ventana
        new Ventana(800, 600, "Minijuego");
    }
}

