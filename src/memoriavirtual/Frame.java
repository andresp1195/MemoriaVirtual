/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memoriavirtual;

import java.util.Date;

/**
 *
 * @author Adrian
 * 
 */


public class Frame {
    public static int ultimo_id;
    public int identificador;
    public Proceso contenido;
    public int tamano;
    public int[][] localizacion = new int[1][3]; //ubicacion_memoriaF
    public Date TS1;
    public Date TS2;
    public int pag;

    public Frame(Proceso contenido){
        this.identificador = ultimo_id++;
        this.contenido = contenido;
    }
    
    public Frame(int identificador, Proceso contenido, int tamano) {
        this.identificador = identificador;
        this.contenido = contenido;
        this.tamano = tamano;
    }

    public Frame(int identificador, Proceso contenido, int tamano, Date TS1, Date TS2) {
        this.identificador = identificador;
        this.contenido = contenido;
        this.tamano = tamano;
        this.TS1 = TS1; //=DateTime.parse("04/02/2011 20:27:05",DateTimeFormat.forPattern("dd/MM/yyyy HH:mm:ss"));;
        this.TS2 = TS2; //=DateTime.parse("04/02/2011 20:27:05",DateTimeFormat.forPattern("dd/MM/yyyy HH:mm:ss"));;
    }
    
}