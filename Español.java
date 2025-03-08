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

public class Español extends JFrame {

    public Español(int alto, int largo, String titulo) {
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
        JLabel pregunta_1 = new JLabel("1. ¿Qué es un verbo?");
        pregunta_1.setFont(new Font("Arial", Font.BOLD, 16));

        //A los 4 botones intstanciados antes les damos un valor refiriendose a las opciones multiples que tiene
        boton_1 = new JButton("a) Acción"); boton_2 = new JButton("b) Sustantivo"); 
        boton_3 = new JButton("c) Objeto"); boton_4 = new JButton("d) Sujeto");

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
        boton_1.addActionListener(e -> {
            //A la etiqueta de respuesta que estaba vacia le ponemos un texto que nos diga que esta correcto junto con la respuesta
            respuesta.setText("Correcto: El verbo es una acción");
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
        JLabel pregunta_2 = new JLabel("2. ¿Qué tipo de palabra es comer?");
        pregunta_2.setFont(new Font("Arial", Font.BOLD, 16));

        boton_1 = new JButton("a) Sustantivo"); boton_2 = new JButton("b) Verbo"); 
        boton_3 = new JButton("c) Adverbio");   boton_4 = new JButton("d) Adjetivo");

        JPanel panel_respuestas_2 = new JPanel();
        panel_respuestas_2.setLayout(new GridLayout(1, 2));
        panel_respuestas_2.add(boton_1);
        panel_respuestas_2.add(boton_2);
        panel_respuestas_2.add(boton_3);
        panel_respuestas_2.add(boton_4);
        
        JLabel respuesta_2 = new JLabel("");
        boton_2.addActionListener(e -> {
            respuesta_2.setText("Correcto: Comer es un verbo");
            respuesta_2.setVisible(true);
            panel_respuestas_2.setVisible(false);
        });

        panel_2.add(pregunta_2);         panel_2.add(respuesta_2);
        panel_2.add(panel_respuestas_2);
        this.add(panel_2);

        //Pregunta 3
        JPanel panel_3 = new JPanel();
        panel_3.setLayout(new GridLayout(3, 2));
        JLabel pregunta_3 = new JLabel("3. ¿Qué palabra está escrita correctamente?");
        pregunta_3.setFont(new Font("Arial", Font.BOLD, 16));

        boton_1 = new JButton("a) revicion");    boton_2 = new JButton("b) revisión"); 
        boton_3 = new JButton("c) rrevisión");   boton_4 = new JButton("d) rebisión");

        JPanel panel_respuestas_3 = new JPanel();
        panel_respuestas_3.setLayout(new GridLayout(1, 2));
        panel_respuestas_3.add(boton_1);
        panel_respuestas_3.add(boton_2);
        panel_respuestas_3.add(boton_3);
        panel_respuestas_3.add(boton_4);
        
        JLabel respuesta_3 = new JLabel("");
        boton_2.addActionListener(e -> {
            respuesta_3.setText("Correcto: Es 'revisión'");
            respuesta_3.setVisible(true);
            panel_respuestas_3.setVisible(false);
        });

        panel_3.add(pregunta_3);         panel_3.add(respuesta_3);
        panel_3.add(panel_respuestas_3);
        this.add(panel_3);

        //Pregunta 4
        JPanel panel_4 = new JPanel();
        panel_4.setLayout(new GridLayout(3, 2));
        JLabel pregunta_4 = new JLabel("4. ¿Cuál es el antónimo de la palabra 'generoso'?");
        pregunta_4.setFont(new Font("Arial", Font.BOLD, 16));

        boton_1 = new JButton("a) Egoísta");     boton_2 = new JButton("b) Amable"); 
        boton_3 = new JButton("c) Bondadoso");   boton_4 = new JButton("d) Cariñoso");

        JPanel panel_respuestas_4 = new JPanel();
        panel_respuestas_4.setLayout(new GridLayout(1, 2));
        panel_respuestas_4.add(boton_1);
        panel_respuestas_4.add(boton_2);
        panel_respuestas_4.add(boton_3);
        panel_respuestas_4.add(boton_4);
        
        JLabel respuesta_4 = new JLabel("");
        boton_1.addActionListener(e -> {
            respuesta_4.setText("Correcto: El antónimo de generoso es 'egoista'");
            respuesta_4.setVisible(true);
            panel_respuestas_4.setVisible(false);
        });

        panel_4.add(pregunta_4);         panel_4.add(respuesta_4);
        panel_4.add(panel_respuestas_4);
        this.add(panel_4);
        
        //Pregunta 5
        JPanel panel_5 = new JPanel();
        panel_5.setLayout(new GridLayout(3, 2));
        JLabel pregunta_5 = new JLabel("5. ¿Qué tipo de oración es: '¡Qué sorpresa verte aquí!'?");
        pregunta_5.setFont(new Font("Arial", Font.BOLD, 16));

        boton_1 = new JButton("a) Enunciativa"); boton_2 = new JButton("b) Imperativa"); 
        boton_3 = new JButton("c) Exclamativa");boton_4 = new JButton("d) Interrogativa");

        JPanel panel_respuestas_5 = new JPanel();
        panel_respuestas_5.setLayout(new GridLayout(1, 2));
        panel_respuestas_5.add(boton_1);
        panel_respuestas_5.add(boton_2);
        panel_respuestas_5.add(boton_3);
        panel_respuestas_5.add(boton_4);
        
        JLabel respuesta_5 = new JLabel("");
        boton_3.addActionListener(e -> {
            respuesta_5.setText("Correcto: Es una oración de tipo exclamativa");
            respuesta_5.setVisible(true);
            panel_respuestas_5.setVisible(false);
        });

        panel_5.add(pregunta_5);         panel_5.add(respuesta_5);
        panel_5.add(panel_respuestas_5);
        this.add(panel_5);
        
        //Pregunta 6
        JPanel panel_6 = new JPanel();
        panel_6.setLayout(new GridLayout(3, 2));
        JLabel pregunta_6 = new JLabel("6. ¿Qué tipo de palabra es 'alto'?");
        pregunta_6.setFont(new Font("Arial", Font.BOLD, 16));

        boton_1 = new JButton("a) Sustantivo"); boton_2 = new JButton("b) Verbo"); 
        boton_3 = new JButton("c) Adverbio");boton_4 = new JButton("d) Adjetivo");

        JPanel panel_respuestas_6 = new JPanel();
        panel_respuestas_6.setLayout(new GridLayout(1, 2));
        panel_respuestas_6.add(boton_1);
        panel_respuestas_6.add(boton_2);
        panel_respuestas_6.add(boton_3);
        panel_respuestas_6.add(boton_4);
        
        JLabel respuesta_6 = new JLabel("");
        boton_4.addActionListener(e -> {
            respuesta_6.setText("Correcto: La palabra 'alto' es un adjetivo");
            respuesta_6.setVisible(true);
            panel_respuestas_6.setVisible(false);
        });

        panel_6.add(pregunta_6);         panel_6.add(respuesta_6);
        panel_6.add(panel_respuestas_6);
        this.add(panel_6);
        
        //Pregunta 7
        JPanel panel_7 = new JPanel();
        panel_7.setLayout(new GridLayout(3, 2));
        JLabel pregunta_7 = new JLabel("7. ¿Cuál es el sustantivo de la oración: 'Los niños juegan en el parque'?");
        pregunta_7.setFont(new Font("Arial", Font.BOLD, 16));


        boton_1 = new JButton("a) Niños"); boton_2 = new JButton("b) Parque"); 
        boton_3 = new JButton("c) Juegan");boton_4 = new JButton("d) En");

        JPanel panel_respuestas_7= new JPanel();
        panel_respuestas_7.setLayout(new GridLayout(1, 2));
        panel_respuestas_7.add(boton_1);
        panel_respuestas_7.add(boton_2);
        panel_respuestas_7.add(boton_3);
        panel_respuestas_7.add(boton_4);
        
        JLabel respuesta_7 = new JLabel("");
        boton_4.addActionListener(e -> {
            respuesta_7.setText("Correcto: El sustantivo es 'niños'");
            respuesta_7.setVisible(true);
            panel_respuestas_7.setVisible(false);
        });

        panel_7.add(pregunta_7);         panel_7.add(respuesta_7);
        panel_7.add(panel_respuestas_7);
        this.add(panel_7);
        
        //Pregunta 8
        JPanel panel_8 = new JPanel();
        panel_8.setLayout(new GridLayout(3, 2));
        JLabel pregunta_8 = new JLabel("8. ¿Cúal de las siguientes palabras no lleva tilde?");
        pregunta_8.setFont(new Font("Arial", Font.BOLD, 16));


        boton_1 = new JButton("a) Arbol"); boton_2 = new JButton("b) Cafe"); 
        boton_3 = new JButton("c) Cancion");boton_4 = new JButton("d) Guion");

        JPanel panel_respuestas_8= new JPanel();
        panel_respuestas_8.setLayout(new GridLayout(1, 2));
        panel_respuestas_8.add(boton_1);
        panel_respuestas_8.add(boton_2);
        panel_respuestas_8.add(boton_3);
        panel_respuestas_8.add(boton_4);
        
        JLabel respuesta_8 = new JLabel("");
        boton_4.addActionListener(e -> {
            respuesta_8.setText("Correcto: De todas las opciones 'guion' es la única palabra que no lleva tilde");
            respuesta_8.setVisible(true);
            panel_respuestas_8.setVisible(false);
        });

        panel_8.add(pregunta_8);         panel_8.add(respuesta_8);
        panel_8.add(panel_respuestas_8);
        this.add(panel_8);
        
        //Pregunta 9
        JPanel panel_9 = new JPanel();
        panel_9.setLayout(new GridLayout(3, 2));
        JLabel pregunta_9 = new JLabel("9. ¿Cúal es la palabra correcta del verbo 'hay'?");
        pregunta_9.setFont(new Font("Arial", Font.BOLD, 16));


        boton_1 = new JButton("a) Haver"); boton_2 = new JButton("b) Haber"); 
        boton_3 = new JButton("c) A ver");boton_4 = new JButton("d) Abver");

        JPanel panel_respuestas_9= new JPanel();
        panel_respuestas_9.setLayout(new GridLayout(1, 2));
        panel_respuestas_9.add(boton_1);
        panel_respuestas_9.add(boton_2);
        panel_respuestas_9.add(boton_3);
        panel_respuestas_9.add(boton_4);
        
        JLabel respuesta_9 = new JLabel("");
        boton_2.addActionListener(e -> {
            respuesta_9.setText("Correcto: La respuesta es 'Haber");
            respuesta_9.setVisible(true);
            panel_respuestas_9.setVisible(false);
        });

        panel_9.add(pregunta_9);         panel_9.add(respuesta_9);
        panel_9.add(panel_respuestas_9);
        this.add(panel_9);
        
        //Pregunta 10
        JPanel panel_10 = new JPanel();
        panel_10.setLayout(new GridLayout(3, 2));
        JLabel pregunta_10 = new JLabel("10. ¿Cúal de las siguientes opciones es un sustantivo?");
        pregunta_10.setFont(new Font("Arial", Font.BOLD, 16));


        boton_1 = new JButton("a) Saltar"); boton_2 = new JButton("b) Mesa"); 
        boton_3 = new JButton("c) Hermoso");boton_4 = new JButton("d) Lentamente");

        JPanel panel_respuestas_10= new JPanel();
        panel_respuestas_10.setLayout(new GridLayout(1, 2));
        panel_respuestas_10.add(boton_1);
        panel_respuestas_10.add(boton_2);
        panel_respuestas_10.add(boton_3);
        panel_respuestas_10.add(boton_4);
        
        JLabel respuesta_10 = new JLabel("");
        boton_2.addActionListener(e -> {
            respuesta_10.setText("Correcto: La repuesta es 'Mesa' ya que es una cosa");
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
