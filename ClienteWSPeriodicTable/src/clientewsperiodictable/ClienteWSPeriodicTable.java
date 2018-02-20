/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientewsperiodictable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class ClienteWSPeriodicTable {

    public static void main(String[] args) throws IOException, Exception {
        while(true){
            String op = Menu();
            String ele;
            BufferedReader br;
            switch (op) {
                case "1":   System.out.println("Por favor, ingrese el elemento en cuestión: ");  
                            br = new BufferedReader(new InputStreamReader(System.in));
                            ele = br.readLine();
                            System.out.println(getAtomicNumber(ele));                            
                            break;
                case "2":   System.out.println("Por favor, ingrese el elemento en cuestión: ");                 
                            br = new BufferedReader(new InputStreamReader(System.in));
                            ele = br.readLine();  
                            System.out.println(getAtomicWeight(ele));
                            break;
                case "3":   System.out.println(getAtoms());
                            break;
                case "4":   System.out.println("Por favor, ingrese el elemento en cuestión: ");  
                            br = new BufferedReader(new InputStreamReader(System.in));
                            ele = br.readLine();   
                            System.out.println(getElementSymbol(ele));
                            break;
                default:    System.out.println("Opción incorrecta");
                            break;
            }
        }   
    }
    
    
    private static String Menu() throws IOException{
        System.out.println("---------------------Menu-------------------------------");       
        System.out.println("Ponga un número del 1 al 4 con las siguientes opciones: ");
        System.out.println("1. Obtener el número atómico");
        System.out.println("2. Obtener el peso atómico");
        System.out.println("3. Obtener una tabla con todos los elementos");
        System.out.println("4. Obtener el símbolo del elemento");
        System.out.println("--------------------------------------------------------");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String op = br.readLine();       
        return op;
    }

    private static String getAtomicWeight(java.lang.String elementName) {
        net.webservicex.Periodictable service = new net.webservicex.Periodictable();
        net.webservicex.PeriodictableSoap port = service.getPeriodictableSoap();
        return port.getAtomicWeight(elementName);
    }

    private static String getAtoms() {
        net.webservicex.Periodictable service = new net.webservicex.Periodictable();
        net.webservicex.PeriodictableSoap port = service.getPeriodictableSoap();
        return port.getAtoms();
    }

    private static String getElementSymbol(java.lang.String elementName) {
        net.webservicex.Periodictable service = new net.webservicex.Periodictable();
        net.webservicex.PeriodictableSoap port = service.getPeriodictableSoap();
        return port.getElementSymbol(elementName);
    }

    private static String getAtomicNumber(java.lang.String elementName) {
        net.webservicex.Periodictable service = new net.webservicex.Periodictable();
        net.webservicex.PeriodictableSoap port = service.getPeriodictableSoap();
        return port.getAtomicNumber(elementName);
    }
    
}
