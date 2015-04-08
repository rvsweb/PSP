/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidorpractica;

/**
 *
 * @author InTylerWeTrust
 */
public class Paginas {
 
//  Content-Type  
// Enviar el código html de una página web el servidor
// Enviaría la línea de encabezado:
 public static final String primeraCabecera = "Content-Type:text/html;charset=UTF-8";

// Contenido Index
 public static final String html_index = "<html>"
          + "<head><title>index</title></head>"
          + "<body>"
          + "<h1>¡Enhorabuena!</h1>"
          + "<p>Tu servidor HTTP mínimo funciona correctamente</p>"
          + "</body>"
          + "</html>";
 
 
 public static final String html_quijote = "<html>"
          + "<head><title>quijote</title></head>"
          + "<body>"
          + "<h1>Así comienza el Quijote</h1>"
          + "<p>En un lugar de la Mancha, de cuyo nombre no quiero "
          + "acordarme, no ha mucho tiempo que vivía un hidalgo de los "
          + "de lanza en astillero, adarga antigua, rocín flaco y galgo "
          + "corredor. Una olla de algo más vaca que carnero, salpicón "
          + "las más noches, duelos y quebrantos (huevos con tocino) los "
          + "sábados, lentejas los viernes, algún palomino de añadidura "
          + "los domingos, consumían las tres partes de su hacienda. El "
          + "resto della concluían sayo de velarte (traje de paño fino), "
          + "calzas de velludo (terciopelo) para las fiestas con sus "
          + "pantuflos de lo mismo, y los días de entresemana se honraba "
          + "con su vellorí (pardo de paño) de lo más fino. Tenía en su "
          + "casa una ama que pasaba de los cuarenta, y una sobrina que "
          + "no llegaba a los veinte, y un mozo de campo y plaza, que "
          + "así ensillaba el rocín como tomaba la podadera...</p>"
          + "<img src=http://www.blogseitb.com/matematicas/wp-content/uploads/sites/46/2013/05/figura-de-don-quijote-y-sancho-panza-atardecer.jpg width=190 height=132 border=4 aling=center>"
          + "</body>"
          + "</html>";
 
 //contenido noEncontrado
 public static final String html_noEncontrado = "<html>"
          + "<head><title>noEncontrado</title></head>"
          + "<body>"
          + "<h1>¡ERROR! Página no encontrada</h1>"
          + "<p>La página que solicitaste no existe en nuestro "
          + "servidor</p>"
          + "</body>"
          + "</html>";
}





















