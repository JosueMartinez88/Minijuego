/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Minijuego;

//Martínez Vera Josué Aldair
//Solís Contreras Darian Giselle 



import java.awt.event.ActionListener;
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

public class Ventana extends JFrame {
    //Constructor para inicializar la ventana principal
    public Ventana(int alto, int largo, String titulo) {
        this.setSize(alto, largo); //Establece el tamaño de la ventana
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Configura la operación de cierre
        this.setLocationRelativeTo(null); //Centra la ventana en la pantalla
        this.setTitle("Minijuego"); //Establece el título de la ventana
        this.setLayout(new GridLayout(2, 2)); //Configura el diseño de la ventana principal
        Ventana_inicio(); //Carga los componentes de la ventana
        this.setVisible(true); //Hace visible la ventana
        
    }
    
    private void Ventana_inicio() {
        //Crear etiqueta con mensaje en el mero centro de la ventana inicial
        JLabel mensaje_principal = new JLabel("Este es un quiz para ver tus conocimientos en diferentes materias", SwingConstants.CENTER);
        mensaje_principal.setFont(new Font("Arial", Font.BOLD, 20)); //Texto grande y en negrita y de este tamaño
        mensaje_principal.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); //Margen alrededor del texto

        //Crear botón que nos indique que ya va a comenzar
        JButton boton_iniciar_quiz = new JButton("Comenzar el quiz");
        boton_iniciar_quiz.setFont(new Font("Arial", Font.BOLD, 18)); //Tamaño de fuente grande

        //Creamos un panelque nos guarde el botón que instanciamos antes
        JPanel panelBoton = new JPanel();
        panelBoton.add(boton_iniciar_quiz); //Agregamos el botón al panel

        //Agregar componentes a la ventana
        this.setLayout(new BorderLayout());
        //La etiqueta que instanciamos antes la agregamos y la colocamos en el centro de la ventana 
        this.add(mensaje_principal, BorderLayout.CENTER);
        //El botón que instanciamos antes la agregamos a la ventana y la colocamos abajito
        this.add(panelBoton, BorderLayout.SOUTH);
        
        //Usamos el método "addActionListener" para que cuanto apretamos el boton haga una acción
        boton_iniciar_quiz.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                //La acción que va a realizar es el abrir el método llamado "ventana_materias" que hicimos abajos
                ventana_materias();
            }
        });
        
        
    }
    // Método para cargar los componentes de la ventana principal
    public void ventana_materias() {
        //Creamos una lista que decimos como se llamaria el título de cada boton
        String[] botones = {"Español", "Matemáticas", "Historia", "Geografia"};
        
        JFrame operationWindow = new JFrame("Opción"); //Crear una nueva ventana con el título correspondiente
        operationWindow.setSize(600, 400); //Establecer el tamaño de la nueva ventana
        operationWindow.setLocationRelativeTo(null); //Centrar la nueva ventana en la pantalla
        operationWindow.setLayout(new GridLayout(4, 1)); //Configurar el diseño de la nueva ventana
        
        //Hacemos un ciclo que nos indica que comienza desde 0 hasta la longitud de la lista que hicimos antes
        for (int i = 0; i < botones.length; i++) {
            JButton boton_opc = new JButton(botones[i]); //Crear un nuevo botón
            int opcion = i; //Índice de la opcion correspondiente
            //Cuando le apretemos el boton de acuerdo al título del botón va a hacer una acción
            boton_opc.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    //Lo que va a hacer es abrir el método "abrir_quiz"
                    abrir_quiz(opcion);
                }
            });
            //A la ventana le agregamos los botones que hicimos
            operationWindow.add(boton_opc);
            
        }
        //Le ponemos que la ventana sea visible
        operationWindow.setVisible(true);
    }

    private void abrir_quiz(int opcion) {
        //Dependiendo la opción que elijamos nos va a abrir las preguntas (quiz) de la materia deseada
        switch(opcion){
            case 0: //En caso de la opción 0 entonces va a instanciar la clase "Español" y va abrirse a dicha ventana
                Español español = new Español(800,600,"Quiz de Español");
                break;
            case 1: //En caso de la opción 1 entonces va a instanciar la clase "Matematicas" y va abrirse a dicha ventana
                Matematicas matematicas = new Matematicas(800,600,"Quiz de Matemáticas");
                break;
            case 2: //En caso de la opción 2 entonces va a instanciar la clase "Historia" y va abrirse a dicha ventana
                Historia historia = new Historia(800,600,"Quiz de Historia");
                break;
            case 3: //En caso de la opción 3entonces va a instanciar la clase "Geografia" y va abrirse a dicha ventana
                Geografia geografia = new Geografia(800,600,"Quiz de Geografía");
                break;
        }
    }
    
    
}
