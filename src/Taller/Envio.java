package Taller;

public class Envio {
    private final String Nombre_Equipo;
    private final String Respuestas;
    private final int N_Problemas;
    

    public Envio(String Nombre_Equipo, int N_problemas, String Respuestas) {
        this.Nombre_Equipo = Nombre_Equipo;
        this.N_Problemas = N_problemas;
        this.Respuestas = Respuestas;
    }    
    
    
    public String getNombre_Equipo() { return Nombre_Equipo; }
    public int getN_Problemas() { return N_Problemas; }
    public String getRespuestas() { return Respuestas; }
}