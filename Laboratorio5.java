/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.laboratorio5;

/**
 *
 * @author User
 */
  import java.util.Scanner; 
public class Laboratorio5 {

    public static void main(String[] args) {
         
           while (a <= empleados){
               a = a + 1 ; 
              if (sueldo < 10000){
                  System.out.println("su nuevo suedo es");
                  b = sueldo (0.20) ; 
                  
              } else {  if (sueldo > 10000){
                  c =  sueldo (0.10); 
              }
              
                  
              }
             
            int canest = 1 ; //cantidad estudiante. 
          
          int suma = 0 ;
          int cantest = 0;
          int cal; 
          int sumcal = 0 ; 
          int Promedio;
          
 
        System.out.println("ingrese la cntidadade calificaciones ");
          cantest = entrada.nextInt();
          
          while (canest < cantest ){
              System.out.println("ingrese la calificacion ");
              cal = entrada.nextInt(); 
              
               sumcal = sumcal + cal;
                canest = canest + 1 ;      
          }
          System.out.println("calificacion total " + sumcal);
          
          // promedio 
               Promedio  = sumcal / cantest ; 
          
          System.out.println("el promedio es " + Promedio );
    
}
}
