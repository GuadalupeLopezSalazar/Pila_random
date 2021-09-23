
package ejercicio_pilarandom;

/**
 * @Guadalupe Lopez Salazar
 */
import java.util.Scanner; /*Libreria de introduccion de datos*/
import java.util.Random;  /*Libreria para agregar valores random*/
public class Ejercicio_pilarandom {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);    /*Permite ingresar datos por teclado*/
       Random random = new Random();
        int op = 0, top=0, tam=26, cont=0;     /*Declaracion de variables enteras*/ 
        char A;                  /*Declaracion de caracter*/
        char[] pilabc= new char [tam];  /*Pila*/
        
        do{ 
            
            System.out.println("ESCOJA LA OPCION QUE QUIERA REALIZAR:\n"  /*El usuario indica la actividad a realizar*/
            + "1- LLENAR \n"
            + "2- MOSTRAR \n"
            + "3- ELIMINAR \n"      /*Opciones a elegir por el usuario*/
            + "4- REPETIDOS \n"        
            + "5- SALIR \n");
            
            switch (op= sc.nextInt()) { /*Se empieza a ejecutar la accion que el usuario solicito*/
                case 1: /*Se llena la pila*/
                    for (int i= 0; i <tam; i++){      /*Condicion a cumplir*/
                   A=(char)(random.nextInt(26)+'A');
                        if (top<tam){  
                            pilabc[top]=A; 
                            top++;  
                            A++; 
                        } else { System.out.println("Pila llena"); 
                         break;} 
                    } System.out.println("Los valores se han agregado"); 
                    break; /*Se termina el primer caso*/
                    
                    
                case 2: /*Se muestran los datos de la pila*/
                    if(top>0){   /*Condicion a cumplir*/
                        for (int i=top-1; i>=0; i--) {    /*Condicion a cumplir*/
                            char aleat=(char)(Math.random()*26+'A');   /*Muestra datos aleatorios*/
                            System.out.println(aleat);
                        }
                    }else { System.out.println("Pila vacia"); 
                    } break; /*Se termina el segundo caso*/
                    
                    
                case 3: /*Se elimina algun dato de la pila*/
                   if(top>0){  /*Condicion a cumplir*/
                        System.out.println("Dato eliminado.." + top ); 
                        top--;       /*Se resta la unidad del dato eliminado*/
                    } else{ System.out.println("La pila está vacía"); 
                    } break;  /*Se termina el tercer caso*/
                    
                 case 4: /*Se muestran datos repetidos*/
                     for(int i=0;i<26;i++){
                        char aleat=(char)(Math.random()*26+'A');
                         System.out.println("La letra " + aleat + " tiene " + cont + " letas repetidas");
                        cont++;
              }        
            }
        } while(op != 5); /*Sale del programa*/
    }           
} 
    
    
    

