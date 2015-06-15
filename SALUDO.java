/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saludo;

/**
 *
 * @author Claudio
 */
public class SALUDO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    String nombre="Claudio";   //PRIMERO INICIALIZAMOS LA VARIABLE  TIPO STRING NOMBRE CON UN VALOR LLAMDO "CLAUDIO"
   saludo(nombre); // // DESPUES INVOCAMOS NUESTRO MEDOTO LLAMADO NOMBRE EL CUAL RECIBIRA UN VALOR TIPO STRING QUE ES NOMBRE
    
    
    }
    public static void saludo(String nombre){ //LUEGO CREAMOS NUESTRO MEDOTO LLAMADO SALUDO CON UN PARAMETRO TIPO STRING LLAMDO NOMBRE
      System.out.println(" Hola " + nombre); // POR ULTIMO MOSTRAMOS POR PANTALLA UN MENSAJE CON "HOLA" + EL PARAMETRO QUE TIENE NUESTO MEDOTO SALUDO QUE ES NOMBRE 
    
    }
    
    
}
