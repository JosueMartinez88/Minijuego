package Minijuego;



//Martínez Vera Josué Aldair
//Solís Contreras Darian Giselle 

/*
Usamos la libreria awt ya que es una libreria nativa de java y es famosa porque
ocupa menos recursos ya que los componentes que ocupa  son los del sistema.
También es conocida porque tiene clases para manipular los eventos del usuario
como lo son los clicks o teclas presionadas
*/
import java.awt.*;

//Aqui es un ajemplo ya que esta clase nos permite que el programa genere una
//reacción a base de un evento que haga el usuario
import java.awt.event.ActionEvent;

/*
Esta libreria a pesar de consumir un poco más de recursos nos permite tener un
mayor control sobre la apariencia y el diseño, aparte como no es como tal un componente
nativo la interfaz se va a ver igual en cualquier sistema operativo
*/
import javax.swing.*;

public class Matematicas extends JFrame {

    public Matematicas(int alto, int largo, String titulo) {
        this.setSize(alto, largo); //Establece el tamaño de la ventana
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Configura la operación de cierre
        this.setLocationRelativeTo(null); //Centra la ventana en la pantalla
        this.setTitle("Matemáticas"); //Establece el título de la ventana
        this.setLayout(new BorderLayout(2, 2));// Configura el diseño de la ventana principal
        preguntas(); //Carga los componentes de la ventana
        this.setVisible(true); //Hace visible la ventana
    }

    public void preguntas() {
        //Instanciamos los botones sin colocar nada aún
        JButton boton_1;
        JButton boton_2;
        JButton boton_3;
        JButton boton_4;
        //Declaramos las columnas y finas, en este caso hay 11 columnas y 1 fila, una columna para cada pregunta (son 10) y una para el boton de regresar al menú
        this.setLayout(new GridLayout(11, 1));

        //Creamos el panel para la primera pregunta
        JPanel panel_1 = new JPanel();
        //Al igual que anteriormente indicamos cual va a ser  las columnas y filas
        panel_1.setLayout(new GridLayout(3, 2));
        
        //Agregamos una etiqueta para la primera pregunta y le damos un diseño con el método "SetFont"
        JLabel pregunta_1 = new JLabel("1. ¿Cúal de los siguientes números es un número par?");
        pregunta_1.setFont(new Font("Arial", Font.BOLD, 16));

        //A los 4 botones intstanciados antes les damos un valor refiriendose a las opciones multiples que tiene
        boton_1 = new JButton("a) 15"); boton_2 = new JButton("b) 21"); 
        boton_3 = new JButton("c) 36"); boton_4 = new JButton("d) 57");

        //Cremos un panel para añadir especificamente las respuestas
        JPanel panel_respuestas = new JPanel();
        //Al igual que antes diseñamos el panel para las respuestas
        panel_respuestas.setLayout(new GridLayout(1, 2));
        //Al panel le agregamos los botones con las opciones
        panel_respuestas.add(boton_1);
        panel_respuestas.add(boton_2);
        panel_respuestas.add(boton_3);
        panel_respuestas.add(boton_4);
        
        //Creamos una etiqueta que este vacia, esto para que cuando este la opción correcta nos la diga
        JLabel respuesta = new JLabel("");
        //Le ponemos "false" para que no nos lo muestre hasta el final
        respuesta.setVisible(false);
        //A la respuesta correcta le añadimos el método "addActionListener" para que cuando sea apretado nos diga que acertamos
        boton_3.addActionListener(e -> {
            //A la etiqueta de respuesta que estaba vacia le ponemos un texto que nos diga que esta correcto junto con la respuesta
            respuesta.setText("Correcto: El número par es 36");
            //Hacemos que la etiqueta sea visible para el usuario
            respuesta.setVisible(true);
            //Ocultamos los botones al usuario para que ya no tenga necesidad de ver las respuestas cuando acertó
            panel_respuestas.setVisible(false);
        });
        //Al panel de la primera pregunta le añadimos la pregunta, la respuesta y el panel con los botones
        panel_1.add(pregunta_1);         panel_1.add(respuesta);
        panel_1.add(panel_respuestas);
        //A nuestra ventana de la materia le agregamos la pregunta
        this.add(panel_1);

        //Creamos el panel de la pregunta 2 y basicamente los pasos son lo mismos entonces no creo que sea necesario
        //La demás documentación está después de la pregunta 10
        JPanel panel_2 = new JPanel();
        panel_2.setLayout(new GridLayout(3, 2));
        JLabel pregunta_2 = new JLabel("2. ¿Cúal de los siguientes números es primo?");
        pregunta_2.setFont(new Font("Arial", Font.BOLD, 16));

        boton_1 = new JButton("a) 21"); boton_2 = new JButton("b) 10"); 
        boton_3 = new JButton("c) 5");   boton_4 = new JButton("d) 15");

        JPanel panel_respuestas_2 = new JPanel();
        panel_respuestas_2.setLayout(new GridLayout(1, 2));
        panel_respuestas_2.add(boton_1);
        panel_respuestas_2.add(boton_2);
        panel_respuestas_2.add(boton_3);
        panel_respuestas_2.add(boton_4);
        
        JLabel respuesta_2 = new JLabel("");
        boton_3.addActionListener(e -> {
            respuesta_2.setText("Correcto: 5 es un número primo");
            respuesta_2.setVisible(true);
            panel_respuestas_2.setVisible(false);
        });

        panel_2.add(pregunta_2);         panel_2.add(respuesta_2);
        panel_2.add(panel_respuestas_2);
        this.add(panel_2);

        //Pregunta 3
        JPanel panel_3 = new JPanel();
        panel_3.setLayout(new GridLayout(3, 2));
        JLabel pregunta_3 = new JLabel("3. ¿Cúal es el valor de 4²?");
        pregunta_3.setFont(new Font("Arial", Font.BOLD, 16));

        boton_1 = new JButton("a) 10");    boton_2 = new JButton("b) 20"); 
        boton_3 = new JButton("c) 25");   boton_4 = new JButton("d) 26");

        JPanel panel_respuestas_3 = new JPanel();
        panel_respuestas_3.setLayout(new GridLayout(1, 2));
        panel_respuestas_3.add(boton_1);
        panel_respuestas_3.add(boton_2);
        panel_respuestas_3.add(boton_3);
        panel_respuestas_3.add(boton_4);
        
        JLabel respuesta_3 = new JLabel("");
        boton_4.addActionListener(e -> {
            respuesta_3.setText("Correcto: 4² = 16");
            respuesta_3.setVisible(true);
            panel_respuestas_3.setVisible(false);
        });

        panel_3.add(pregunta_3);         panel_3.add(respuesta_3);
        panel_3.add(panel_respuestas_3);
        this.add(panel_3);

        //Pregunta 4
        JPanel panel_4 = new JPanel();
        panel_4.setLayout(new GridLayout(3, 2));
        JLabel pregunta_4 = new JLabel("4. ¿Cuál es la mitad de 1/2?");
        pregunta_4.setFont(new Font("Arial", Font.BOLD, 16));

        boton_1 = new JButton("a) 1/4");     boton_2 = new JButton("b) 1/3"); 
        boton_3 = new JButton("c) 2/4");   boton_4 = new JButton("d) 1");

        JPanel panel_respuestas_4 = new JPanel();
        panel_respuestas_4.setLayout(new GridLayout(1, 2));
        panel_respuestas_4.add(boton_1);
        panel_respuestas_4.add(boton_2);
        panel_respuestas_4.add(boton_3);
        panel_respuestas_4.add(boton_4);
        
        JLabel respuesta_4 = new JLabel("");
        boton_1.addActionListener(e -> {
            respuesta_4.setText("Correcto: 1/4 es la mitad de 1/2");
            respuesta_4.setVisible(true);
            panel_respuestas_4.setVisible(false);
        });

        panel_4.add(pregunta_4);         panel_4.add(respuesta_4);
        panel_4.add(panel_respuestas_4);
        this.add(panel_4);
        
        //Pregunta 5
        JPanel panel_5 = new JPanel();
        panel_5.setLayout(new GridLayout(3, 2));
        JLabel pregunta_5 = new JLabel("5. ¿Cúanto es 1/3 + 1/3?");
        pregunta_5.setFont(new Font("Arial", Font.BOLD, 16));

        boton_1 = new JButton("a) 1/6"); boton_2 = new JButton("b) 2/6"); 
        boton_3 = new JButton("c) 2/3");boton_4 = new JButton("d) 1");

        JPanel panel_respuestas_5 = new JPanel();
        panel_respuestas_5.setLayout(new GridLayout(1, 2));
        panel_respuestas_5.add(boton_1);
        panel_respuestas_5.add(boton_2);
        panel_respuestas_5.add(boton_3);
        panel_respuestas_5.add(boton_4);
        
        JLabel respuesta_5 = new JLabel("");
        boton_3.addActionListener(e -> {
            respuesta_5.setText("Correcto: 1/3 + 1/3 = 6/9 = 2/3");
            respuesta_5.setVisible(true);
            panel_respuestas_5.setVisible(false);
        });

        panel_5.add(pregunta_5);         panel_5.add(respuesta_5);
        panel_5.add(panel_respuestas_5);
        this.add(panel_5);
        
        //Pregunta 6
        JPanel panel_6 = new JPanel();
        panel_6.setLayout(new GridLayout(3, 2));
        JLabel pregunta_6 = new JLabel("6. ¿Cúantos grados tiene un ángulo recto?");
        pregunta_6.setFont(new Font("Arial", Font.BOLD, 16));

        boton_1 = new JButton("a) 45°"); boton_2 = new JButton("b) 60°"); 
        boton_3 = new JButton("c) 180°");boton_4 = new JButton("d) 90°");

        JPanel panel_respuestas_6 = new JPanel();
        panel_respuestas_6.setLayout(new GridLayout(1, 2));
        panel_respuestas_6.add(boton_1);
        panel_respuestas_6.add(boton_2);
        panel_respuestas_6.add(boton_3);
        panel_respuestas_6.add(boton_4);
        
        JLabel respuesta_6 = new JLabel("");
        boton_4.addActionListener(e -> {
            respuesta_6.setText("Correcto: Un ángulo recto es un ángulo de 90°");
            respuesta_6.setVisible(true);
            panel_respuestas_6.setVisible(false);
        });

        panel_6.add(pregunta_6);         panel_6.add(respuesta_6);
        panel_6.add(panel_respuestas_6);
        this.add(panel_6);
        
        //Pregunta 7
        JPanel panel_7 = new JPanel();
        panel_7.setLayout(new GridLayout(3, 2));
        JLabel pregunta_7 = new JLabel("7. En un triángulo isósceles hay:");
        pregunta_7.setFont(new Font("Arial", Font.BOLD, 16));


        boton_1 = new JButton("a) Tres lados iguales"); boton_2 = new JButton("b) Dos lados iguales y uno diferente"); 
        boton_3 = new JButton("c) Los tres lados son diferentes");boton_4 = new JButton("d) Ninguna de las anteriores");

        JPanel panel_respuestas_7= new JPanel();
        panel_respuestas_7.setLayout(new GridLayout(1, 2));
        panel_respuestas_7.add(boton_1);
        panel_respuestas_7.add(boton_2);
        panel_respuestas_7.add(boton_3);
        panel_respuestas_7.add(boton_4);
        
        JLabel respuesta_7 = new JLabel("");
        boton_2.addActionListener(e -> {
            respuesta_7.setText("Correcto: Un triangulo isósceles esta compuesto por 2 lados iguales y uno diferente");
            respuesta_7.setVisible(true);
            panel_respuestas_7.setVisible(false);
        });

        panel_7.add(pregunta_7);         panel_7.add(respuesta_7);
        panel_7.add(panel_respuestas_7);
        this.add(panel_7);
        
        //Pregunta 8
        JPanel panel_8 = new JPanel();
        panel_8.setLayout(new GridLayout(3, 2));
        JLabel pregunta_8 = new JLabel("8. En un triangulo escaleno hay");
        pregunta_8.setFont(new Font("Arial", Font.BOLD, 16));


        boton_1 = new JButton("a) Tres lados iguales"); boton_2 = new JButton("b) Dos lados iguales y uno diferente"); 
        boton_3 = new JButton("c) Los tres lados son diferentes");boton_4 = new JButton("d) Ninguna de las anteriores");

        JPanel panel_respuestas_8= new JPanel();
        panel_respuestas_8.setLayout(new GridLayout(1, 2));
        panel_respuestas_8.add(boton_1);
        panel_respuestas_8.add(boton_2);
        panel_respuestas_8.add(boton_3);
        panel_respuestas_8.add(boton_4);
        
        JLabel respuesta_8 = new JLabel("");
        boton_3.addActionListener(e -> {
            respuesta_8.setText("Correcto: Un triángulo escaleno tiene todos sus lados diferentes");
            respuesta_8.setVisible(true);
            panel_respuestas_8.setVisible(false);
        });

        panel_8.add(pregunta_8);         panel_8.add(respuesta_8);
        panel_8.add(panel_respuestas_8);
        this.add(panel_8);
        
        //Pregunta 9
        JPanel panel_9 = new JPanel();
        panel_9.setLayout(new GridLayout(3, 2));
        JLabel pregunta_9 = new JLabel("9. ¿Cual es el área de un romboide?");
        pregunta_9.setFont(new Font("Arial", Font.BOLD, 16));


        boton_1 = new JButton("a) b x h"); boton_2 = new JButton("b) (D x d) / 2"); 
        boton_3 = new JButton("c) ((B x b) / 2) x h");boton_4 = new JButton("d) (P x a) / 2");

        JPanel panel_respuestas_9= new JPanel();
        panel_respuestas_9.setLayout(new GridLayout(1, 2));
        panel_respuestas_9.add(boton_1);
        panel_respuestas_9.add(boton_2);
        panel_respuestas_9.add(boton_3);
        panel_respuestas_9.add(boton_4);
        
        JLabel respuesta_9 = new JLabel("");
        boton_1.addActionListener(e -> {
            respuesta_9.setText("Correcto: La respuesta es b x h, la misma que para un rectángulo");
            respuesta_9.setVisible(true);
            panel_respuestas_9.setVisible(false);
        });

        panel_9.add(pregunta_9);         panel_9.add(respuesta_9);
        panel_9.add(panel_respuestas_9);
        this.add(panel_9);
        
        //Pregunta 10
        JPanel panel_10 = new JPanel();
        panel_10.setLayout(new GridLayout(3, 2));
        JLabel pregunta_10 = new JLabel("10. Resuelve la siguiente operación:  -5 +{8 x 3² - (3 - √144) - 86}  ");
        pregunta_10.setFont(new Font("Arial", Font.BOLD, 16));


        boton_1 = new JButton("a) 405"); boton_2 = new JButton("b) -10"); 
        boton_3 = new JButton("c) -135");boton_4 = new JButton("d) Ninguna de las anteriores");

        JPanel panel_respuestas_10= new JPanel();
        panel_respuestas_10.setLayout(new GridLayout(1, 2));
        panel_respuestas_10.add(boton_1);
        panel_respuestas_10.add(boton_2);
        panel_respuestas_10.add(boton_3);
        panel_respuestas_10.add(boton_4);
        
        JLabel respuesta_10 = new JLabel("");
        boton_4.addActionListener(e -> {
            respuesta_10.setText("Lero lero, ninguna es la respuestas anteriores era la correcta");
            respuesta_10.setVisible(true);
            panel_respuestas_10.setVisible(false);
        });

        panel_10.add(pregunta_10);         panel_10.add(respuesta_10);
        panel_10.add(panel_respuestas_10);
        this.add(panel_10);
        
        //Creamos un panel que me permita regresar al menú y lo llamamos "menú"
        JPanel menú = new JPanel();
        //Creamos un botón que lo llamamos "regresar" que nos diga en este mismo "Regresar al menú) y lo diseñamos con el método "SentFont"
        JButton regresar = new JButton("Regresar al menú");
        regresar.setFont(new Font("Arial", Font.BOLD, 11));
        
        //De la clase llamada Ventana la instanciamos como ventana y le damos el tamaño y nombre que va a tener la ventana
        Ventana ventana = new Ventana(800,600,"Menú");
        //El boton que creamos algo le ponemos que una vez le demos click sobre este entonces va a entrar al metodo ventana en donde se visualizan las materias
        regresar.addActionListener(e->{ventana.ventana_materias();});
        //Al panel menú le agremamos el botón de regresar
        menú.add(regresar);
        //A la ventana de la materia le agregamos el panel, este sería la 11va columna que mencionamos al principio
        this.add(menú);
    }
}
