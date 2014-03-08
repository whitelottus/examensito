/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ggwlot.scnd;

import java.util.ArrayList;

/**
 *
 * @author T107
 */
public class GenerarCalificaciones {
    
    public static ArrayList<Evaluacion> generarCalificaciones(){
        ArrayList<Evaluacion> alumnos=new ArrayList<Evaluacion>();
        Evaluacion a1=new Evaluacion("Petra",  5.8f);
        Evaluacion a2=new Evaluacion("Jose", 7.4f);
        Evaluacion a3=new Evaluacion("Roberta", 8.6f);
        
        alumnos.add(a1);
        alumnos.add(a2);
        alumnos.add(a3);
        
        return alumnos;
    
}
}