/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memoriavirtual;

import java.util.List;


/**
 *
 * @author Jespi_000
 */
public class Main {

    public static List<String> lineas_archivos_procesos;
    public static List<String> lineas_archivos_referencias;
    public static List<Proceso> lista_Procesos;
    public static Frame[][] memoria_fisica = new Frame[10][10];
    public static Frame[][] memoria_virtual = new Frame[50][10];
    public static int tamaño_fijo; 
    
    public static void main(String[] args) {
        VentanaInicio ventana_inicio = new VentanaInicio();
        ventana_inicio.setVisible(true);
    }
    
}
