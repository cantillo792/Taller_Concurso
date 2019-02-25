package Taller;

import java.util.HashSet;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Collections;



public class Concurso {
    private String Nombres;
    private final Integer N_Problemas;
    private LinkedList<Envio> Respuestas;
    private HashSet<String> Lista_Equipos;
    
    public Concurso(String Nombres, Integer N_Problemas) {
        this.Nombres = Nombres;
        this.N_Problemas = N_Problemas;
        this.Lista_Equipos = new HashSet<>();
        this.Respuestas = new LinkedList<>();
    }
    
   
    public Concurso(String Nombres) {
        this(Nombres, 5);
    }
    
   
    public String getNombres() { return Nombres; }
    public Integer getN_Problemas() { return N_Problemas; }
    public HashSet<String> getLista_Equipos() { return Lista_Equipos; }
    
    
    
    public int getNumEquipos() { return this.Lista_Equipos.size(); }
    
    
    public void Agregar_Equipo(String... str) {
        Collections.addAll(Lista_Equipos, str);
    }
    
    boolean Elim_Equipo(String equipo) {
        
        LinkedList<Envio> envios = new LinkedList<>();
        for(Envio x : this.Respuestas) {
            if(x.getNombre_Equipo().equals(equipo)) {
                envios.add(x);
            }
        }
      
        this.Respuestas.removeAll(envios);
        return this.Lista_Equipos.remove(equipo);
    }
    
    public Envio Registro_Envio(String Lista_Equipos, Integer N_Problemas, String Respuestas) {
        if(this.Lista_Equipos.contains(Lista_Equipos)) { 
            if(!(N_Problemas < 0) && (N_Problemas <= N_Problemas)) {
                if((Respuestas != null) && !(Respuestas.isEmpty())) {
                    Envio x = new Envio(Lista_Equipos, N_Problemas, Respuestas);
                    this.Respuestas.add(x);
                    return x;
                }
            }
        }
        return null;
    }
}
