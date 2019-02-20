/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad2007;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Alumno
 */
public class Actividad2007 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> d=new ArrayList<>();
        d.add("Silla");
        d.add("B");
        d.add("b");
        d.add("a");
        Actividad2007 uno=new Actividad2007();
        System.out.println(uno.devolverEnOrden(d));
    }
    
    public Actividad2007(){
    
    }
     public String devolverEnOrden(ArrayList<String> palabras)
  {
    // Escribe tu código a continuación...
      String aDevolver="";
      ArrayList<String> lista=palabras;
      Collections.sort(lista);
      for(String temp:lista){
          aDevolver+=temp+",";
      }
      //Eliminamos la última coma
      aDevolver=aDevolver.substring(0,aDevolver.length()-1);
      return aDevolver;

  }
    
}
