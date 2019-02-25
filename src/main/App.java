package main;

import Taller.Concurso;
import java.util.LinkedList;
import java.util.HashSet;


public class App {

    public static void main(String[] args) {
        
        Concurso concurso1 = new Concurso("Sesion 1", 2);
       
        Concurso concurso2 = new Concurso("Sesion 2", 3);

        Concurso concurso3 = new Concurso("Sesion 3", 3);
        

        LinkedList<Concurso> lista = new LinkedList<>();
        
            lista.add(concurso1);
            lista.add(concurso2);
            lista.add(concurso3);
        

        for (Concurso C : lista) {
           
            System.out.println("Nombre del Concurso: " + C.getNombres());
 
            C.Agregar_Equipo("Equipo 1", "Equipo 2", "Equipo 3");
            
            HashSet<String> equipos = C.getLista_Equipos();
            for (String S : equipos) {
                for (int i = 1; i <= C.getN_Problemas(); i++) {
                    C.Registro_Envio(S, i, "(1, 2)");
                }
            }
        }
    }
}
