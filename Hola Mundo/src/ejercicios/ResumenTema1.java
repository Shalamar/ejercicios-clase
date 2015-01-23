/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//Un paquete Java es un contendor de clases.
//Si nuestro paquete tiene como nombre DefaultPackage no hace falta 
//que importemos nada. 
//Si nuestro paquete tiene un nombre donde están los ficheros .java. 
//hay que incluir el paquete escribiendo la siguiente instrucción como 
//primera línea de código:
//package nombre_del_paquete;
package ejercicios;

//Después de los paquetes se pueden escribir instrucciones que importen
//las librerías que necesitaremos en nuestro programa. 
//Nosotros vamos a importar la librería java.util. 
//Importamos esta librería porque vamos a utilizar la clase Scanner
//para leer los datos que el usuario introduce por pantalla. La clase 
//Scanner tiene unos métodos ya implementados que nos facilitarán la lectura
//de los datos.
//Para importar una librería hay que escribir la siguiente instrucción:
//import nombre_de_la_librería;
import java.util.*;

/**
 *
 * @author edelval
 * @description Esta clase es un resumen de lo que hemos trabajado en el 
 * Tema 1.
 * IMPORTANTE: El NOMBRE de la CLASE tiene que ser IGUAL que el NOMBRE del FICHERO .java!!!
 * IMPORTANTE: Java distingue entre MAYÚSCULAS Y MINÚSCULAS!!!
 */
public class ResumenTema1 {
    //Este es el método principal, es público y no devuelve nada
    //IMPORTANTE: Dentro de una clase SÓLO PUEDE HABER UN MÉTODO MAIN!!!
    
    public static void main(String args[]){
        //Las instrucciones Java que escribamos tienen que estar DENTRO
        //de un BLOQUE, es decir, DENTRO DE { }
        
        //PASOS A SEGUIR...
        //-------------
        //1er PASO
        //-------------
        //DECLARAR LAS VARIABLES
        //pensar qué tipo de información queremos guardar
        //en base al tipo de información decidiremos el tipo
        //de las variables:
            //si es un CAR�?CTER: 'A' ---->tipo char
            //si es una CADENA: "Lunes" ---->tipo String
            String nombre;
            //si almacenamos true ó false: ----> tipo boolean
            boolean matriculado;
            //si almacenamos un valor numérico:
                  //¿es un número entero?
                  //¿qué rango de valores debería poder contener?
                  //tipos posibles: byte, short, int ó long
                  int edad;
                  int anyoFin;
                  int meses;
                  //¿es un número con decimales?
                  //¿qué rango de valores debería poder contener?
                  //tipos posibles: float, double
                  float nota;
        
        //-------------
        //2ºPASO
        //-------------
        //INICIALIZAR LAS VARIABLES
        //Existen tres opciones
            //OPCION 1: Vamos a pedirle al usuario que introduzca los valores
            //que utilizaremos para inicializar la variables
            
                //para leer los datos que el usuario introduce por medio
                //del teclado tenemos que declarar una variable del 
                //tipo Scanner. Este tipo NO ES UN TIPO B�?SICO. Lo veremos
                //más adelante.
                    //PASO 1: 
                    //------
                    //Para declarar una variable de tipo Scanner hay que hacer 
                    //lo siguiente:
                    Scanner teclado = new Scanner(System.in);
                    //PASO 2:
                    //------
                    //PEDIR los VALORES imprimiendo un mensaje por pantalla
                    System.out.println("Introduzca los siguientes valores: ");
                    //LEER los VALORES que el usuario ha introducido y 
                    //GUARDARLOS en las VARIABLES correspondientes que anteriormente
                    //hemos declarado.
                    //Dependiendo del tipo de información que va a introducir el
                    //usuario utilizaremos un método u otro para leer el valor:
                        //Si el usuario va a introducir una cadena:
                        System.out.println("Nombre: ");
                        nombre = teclado.nextLine();
                        //Si el usuario va a introducir un número:
                        System.out.println("Edad: ");
                        edad = teclado.nextInt();
                        //OJO! si la nota es con decimales utilizar , en lugar de .
                        System.out.println("Nota: ");
                        nota = teclado.nextFloat();
                        //Si el usuario va a introducir un booleano:
                        System.out.println("Está matriculado: ");
                        matriculado = teclado.nextBoolean();
                        
            //OPCION 3: Nosotros le asignamos un valor a la variable
            //podemos declarar una variable e inicializarla en cualquier punto 
            //del programa
            String asignatura = "Programación";
            int anyoInicio = 2014;
            int duracion = 2;
          
        
            //OPCION 3: Durante el programa se inicializa como resultado de 
            //alguna operación
            anyoFin = anyoInicio + duracion;
        

        //-------------
        //3ºPASO
        //-------------
            
        //OTRAS INSTRUCCIONES que hagan operaciones y modifiquen valores de
        //las variables... 
        meses = duracion *24;    
            
        //-------------
        //4ºPASO (OPCIONAL)
        //-------------
            
        //Mostrar el resultado por pantalla:
        //para mostrar el resultado por pantalla tenemos dos opciones:
        //SYSTEM.OUT.PRINTLN que muestra el mensaje CON un SALTO DE LINEA
        System.out.println("Ficha de matrícula con PRINTLN: ");
        System.out.println("--------------------");
        System.out.println("Alumno: "+ nombre);
        System.out.println("Edad: "+ edad);
        System.out.println("Esta matriculado: "+ matriculado+ " de la asignatura: "+asignatura);
        System.out.println("Año de incio: "+ anyoInicio);
        System.out.println("Año de fin: "+ anyoFin);
        System.out.println("Duración en meses: "+ meses);
        
        
        //SYSTEM.OUT.PRINTF que muestra el mensaje SIN SALTO DE LINEA
        //si queremos añadir un salto de línea tendremos que utilizar \n
        //La estructura del printf es:
            //CADENA: 
            //Escribiremos la cadena que queremos que se muestre por pantalla
            //y si queremos imprimir el valor de alguna variable, entonces utilizaremos:
                //%s ---> para variables de tipo cadenas
                //%d ---> para variables de tipo entero 
                //%f ---> para variables de tipo float o double
            //VARIABLES: (Las variables están separadas de la cadena por una ,)
            //Escribiremos las variables que queremos que se muestre su valor.
            //La primera variable se imprimirá en el lugar donde aparezca el primer %
            //la segunda variable se imprimirá en el lugar donde apareza el segudo %
            //y así sucesivamente.
        
        System.out.printf("Ficha de matrícula con PRINT: \n");
        System.out.printf("--------------------\n");
        System.out.printf("Alumno: %s\n", nombre);
        System.out.printf("Edad: %d\n", edad);
        System.out.printf("Esta matriculado: %b de la asignatura %s\n", matriculado, asignatura);
        System.out.printf("Asignatura: %s \n", asignatura);
        System.out.printf("Año de incio: %d \n", anyoInicio);
        System.out.printf("Año de fin: %d \n", anyoFin);
        System.out.printf("Duración en meses: %d", meses);

        
    }
}
