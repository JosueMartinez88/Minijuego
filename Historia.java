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

public class Historia extends JFrame {

    public Historia(int alto, int largo, String titulo) {
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
        JLabel pregunta_1 = new JLabel("1. ¿En que año llegó Cristobal Colon a América?");
        pregunta_1.setFont(new Font("Arial", Font.BOLD, 16));

        //A los 4 botones intstanciados antes les damos un valor refiriendose a las opciones multiples que tiene
        boton_1 = new JButton("a) 1492"); boton_2 = new JButton("b) 1510"); 
        boton_3 = new JButton("c) 1600"); boton_4 = new JButton("d) 1810");

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
            respuesta.setText("Correcto: Se descubrió América en 1492");
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
        JLabel pregunta_2 = new JLabel("2. ¿En qué país ocurrió la Revolución Industrial?");
        pregunta_2.setFont(new Font("Arial", Font.BOLD, 16));

        boton_1 = new JButton("a) Francia"); boton_2 = new JButton("b) Alemania"); 
        boton_3 = new JButton("c) Inglaterra");   boton_4 = new JButton("d) España");

        JPanel panel_respuestas_2 = new JPanel();
        panel_respuestas_2.setLayout(new GridLayout(1, 2));
        panel_respuestas_2.add(boton_1);
        panel_respuestas_2.add(boton_2);
        panel_respuestas_2.add(boton_3);
        panel_respuestas_2.add(boton_4);
        
        JLabel respuesta_2 = new JLabel("");
        boton_3.addActionListener(e -> {
            respuesta_2.setText("Correcto: La Revolución Industrial tuvo lugar en Inglaterra");
            respuesta_2.setVisible(true);
            panel_respuestas_2.setVisible(false);
        });

        panel_2.add(pregunta_2);         panel_2.add(respuesta_2);
        panel_2.add(panel_respuestas_2);
        this.add(panel_2);

        //Pregunta 3
        JPanel panel_3 = new JPanel();
        panel_3.setLayout(new GridLayout(3, 2));
        JLabel pregunta_3 = new JLabel("3. ¿Qué civilización construyó las pirámides de Egipto?");
        pregunta_3.setFont(new Font("Arial", Font.BOLD, 16));

        boton_1 = new JButton("a) Romanos");    boton_2 = new JButton("b) Mayas"); 
        boton_3 = new JButton("c) Egipcios");   boton_4 = new JButton("d) Griegos");

        JPanel panel_respuestas_3 = new JPanel();
        panel_respuestas_3.setLayout(new GridLayout(1, 2));
        panel_respuestas_3.add(boton_1);
        panel_respuestas_3.add(boton_2);
        panel_respuestas_3.add(boton_3);
        panel_respuestas_3.add(boton_4);
        
        JLabel respuesta_3 = new JLabel("");
        boton_3.addActionListener(e -> {
            respuesta_3.setText("Correcto: Las pirámides de Egipto fueron construida por los egipcios, ya sería mucho que no supieras");
            respuesta_3.setVisible(true);
            panel_respuestas_3.setVisible(false);
        });

        panel_3.add(pregunta_3);         panel_3.add(respuesta_3);
        panel_3.add(panel_respuestas_3);
        this.add(panel_3);

        //Pregunta 4
        JPanel panel_4 = new JPanel();
        panel_4.setLayout(new GridLayout(3, 2));
        JLabel pregunta_4 = new JLabel("4. ¿Quién fue el líder de la independencia de México?");
        pregunta_4.setFont(new Font("Arial", Font.BOLD, 16));

        boton_1 = new JButton("a) Benito Juárez");     boton_2 = new JButton("b) Guadalupe Victoria"); 
        boton_3 = new JButton("c) Agustin de Iturbide");   boton_4 = new JButton("d) Ninguna de las anteriores");

        JPanel panel_respuestas_4 = new JPanel();
        panel_respuestas_4.setLayout(new GridLayout(1, 2));
        panel_respuestas_4.add(boton_1);
        panel_respuestas_4.add(boton_2);
        panel_respuestas_4.add(boton_3);
        panel_respuestas_4.add(boton_4);
        
        JLabel respuesta_4 = new JLabel("");
        boton_4.addActionListener(e -> {
            respuesta_4.setText("Correcto: Ninguna de las anteriores, el líder de la indendependencia de México fue Miguel Hidalgo");
            respuesta_4.setVisible(true);
            panel_respuestas_4.setVisible(false);
        });

        panel_4.add(pregunta_4);         panel_4.add(respuesta_4);
        panel_4.add(panel_respuestas_4);
        this.add(panel_4);
        
        //Pregunta 5
        JPanel panel_5 = new JPanel();
        panel_5.setLayout(new GridLayout(3, 2));
        JLabel pregunta_5 = new JLabel("5. ¿Qué civilización construyó la ciudad de Tenochtitlan?");
        pregunta_5.setFont(new Font("Arial", Font.BOLD, 16));

        boton_1 = new JButton("a) Mayas"); boton_2 = new JButton("b) Aztecas"); 
        boton_3 = new JButton("c) Incas");boton_4 = new JButton("d) Olmecas");

        JPanel panel_respuestas_5 = new JPanel();
        panel_respuestas_5.setLayout(new GridLayout(1, 2));
        panel_respuestas_5.add(boton_1);
        panel_respuestas_5.add(boton_2);
        panel_respuestas_5.add(boton_3);
        panel_respuestas_5.add(boton_4);
        
        JLabel respuesta_5 = new JLabel("");
        boton_2.addActionListener(e -> {
            respuesta_5.setText("Correcto: Los aztecas construyeron la ciudad de Tenochtitlan, andas con todo");
            respuesta_5.setVisible(true);
            panel_respuestas_5.setVisible(false);
        });

        panel_5.add(pregunta_5);         panel_5.add(respuesta_5);
        panel_5.add(panel_respuestas_5);
        this.add(panel_5);
        
        //Pregunta 6
        JPanel panel_6 = new JPanel();
        panel_6.setLayout(new GridLayout(3, 2));
        JLabel pregunta_6 = new JLabel("6. ¿Quién fue el primer presidente de México?");
        pregunta_6.setFont(new Font("Arial", Font.BOLD, 16));

        boton_1 = new JButton("a) Porfirio Díaz"); boton_2 = new JButton("b) Benito Juárez"); 
        boton_3 = new JButton("c) Vicente Fox de Quesada");boton_4 = new JButton("d) Guadalupe victoria");

        JPanel panel_respuestas_6 = new JPanel();
        panel_respuestas_6.setLayout(new GridLayout(1, 2));
        panel_respuestas_6.add(boton_1);
        panel_respuestas_6.add(boton_2);
        panel_respuestas_6.add(boton_3);
        panel_respuestas_6.add(boton_4);
        
        JLabel respuesta_6 = new JLabel("");
        boton_4.addActionListener(e -> {
            respuesta_6.setText("Correcto: Guadalupe Victoria fue oficialmente el primre presidente de México");
            respuesta_6.setVisible(true);
            panel_respuestas_6.setVisible(false);
        });

        panel_6.add(pregunta_6);         panel_6.add(respuesta_6);
        panel_6.add(panel_respuestas_6);
        this.add(panel_6);
        
        //Pregunta 7
        JPanel panel_7 = new JPanel();
        panel_7.setLayout(new GridLayout(3, 2));
        JLabel pregunta_7 = new JLabel("7. ¿En qué año fecha se celebra la independencia de México?");
        pregunta_7.setFont(new Font("Arial", Font.BOLD, 16));


        boton_1 = new JButton("a) 20 Noviembre"); boton_2 = new JButton("b) 5 de Mayo"); 
        boton_3 = new JButton("c) 16 de Septiembre");boton_4 = new JButton("d) 15 de Agosto");

        JPanel panel_respuestas_7= new JPanel();
        panel_respuestas_7.setLayout(new GridLayout(1, 2));
        panel_respuestas_7.add(boton_1);
        panel_respuestas_7.add(boton_2);
        panel_respuestas_7.add(boton_3);
        panel_respuestas_7.add(boton_4);
        
        JLabel respuesta_7 = new JLabel("");
        boton_3.addActionListener(e -> {
            respuesta_7.setText("Correcto: La revolución de México fue el 16 de Septiembre de 1810");
            respuesta_7.setVisible(true);
            panel_respuestas_7.setVisible(false);
        });

        panel_7.add(pregunta_7);         panel_7.add(respuesta_7);
        panel_7.add(panel_respuestas_7);
        this.add(panel_7);
        
        //Pregunta 8
        JPanel panel_8 = new JPanel();
        panel_8.setLayout(new GridLayout(3, 2));
        JLabel pregunta_8 = new JLabel("8. ¿Qué fecha es el día de la bandera?");
        pregunta_8.setFont(new Font("Arial", Font.BOLD, 16));


        boton_1 = new JButton("a) 24 de Febrero");            boton_2 = new JButton("b) 20 de Noviembre "); 
        boton_3 = new JButton("c) 5 de Mayo");                boton_4 = new JButton("d) 15 de Agosto");

        JPanel panel_respuestas_8= new JPanel();
        panel_respuestas_8.setLayout(new GridLayout(1, 2));
        panel_respuestas_8.add(boton_1);
        panel_respuestas_8.add(boton_2);
        panel_respuestas_8.add(boton_3);
        panel_respuestas_8.add(boton_4);
        
        JLabel respuesta_8 = new JLabel("");
        boton_1.addActionListener(e -> {
            respuesta_8.setText("Correcto: El 24 de Febrero es el día de la bandera");
            respuesta_8.setVisible(true);
            panel_respuestas_8.setVisible(false);
        });

        panel_8.add(pregunta_8);         panel_8.add(respuesta_8);
        panel_8.add(panel_respuestas_8);
        this.add(panel_8);
        
        //Pregunta 9
        JPanel panel_9 = new JPanel();
        panel_9.setLayout(new GridLayout(3, 2));
        JLabel pregunta_9 = new JLabel("9. ¿Qué imperio construyó la Muralla China?");
        pregunta_9.setFont(new Font("Arial", Font.BOLD, 16));


        boton_1 = new JButton("a) Romano"); boton_2 = new JButton("b) Persa"); 
        boton_3 = new JButton("c) Mongo");  boton_4 = new JButton("d) Chino");

        JPanel panel_respuestas_9= new JPanel();
        panel_respuestas_9.setLayout(new GridLayout(1, 2));
        panel_respuestas_9.add(boton_1);
        panel_respuestas_9.add(boton_2);
        panel_respuestas_9.add(boton_3);
        panel_respuestas_9.add(boton_4);
        
        JLabel respuesta_9 = new JLabel("");
        boton_4.addActionListener(e -> {
            respuesta_9.setText("Correcto: Como su nombre lo dice, la Muralla China fue creada por el imperio chino");
            respuesta_9.setVisible(true);
            panel_respuestas_9.setVisible(false);
        });

        panel_9.add(pregunta_9);         panel_9.add(respuesta_9);
        panel_9.add(panel_respuestas_9);
        this.add(panel_9);
        
        //Pregunta 10
        JPanel panel_10 = new JPanel();
        panel_10.setLayout(new GridLayout(3, 2));
        JLabel pregunta_10 = new JLabel("10. ¿Qué peste mató a millones de personas en Europa durante la Edad Media? ");
        pregunta_10.setFont(new Font("Arial", Font.BOLD, 16));


        boton_1 = new JButton("a) Viruela"); boton_2 = new JButton("b) Cólera"); 
        boton_3 = new JButton("c) Peste negra");boton_4 = new JButton("d) Peste blanca");

        JPanel panel_respuestas_10= new JPanel();
        panel_respuestas_10.setLayout(new GridLayout(1, 2));
        panel_respuestas_10.add(boton_1);
        panel_respuestas_10.add(boton_2);
        panel_respuestas_10.add(boton_3);
        panel_respuestas_10.add(boton_4);
        
        JLabel respuesta_10 = new JLabel("");
        boton_3.addActionListener(e -> {
            respuesta_10.setText("Correcto: Fue la peste negra la que mató a millones de personas en la Edad Media en Europa");
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
