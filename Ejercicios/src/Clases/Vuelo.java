package Clases;

import java.io.*;

public class Vuelo {
   
	public String ident;
	public String origen;
	public String destino;
	public String hsalida;
	public String hllegada;
	public int reservadas;
	
	 public static final int MAX_PLAZAS = 52;  
	 String[] plazas;
			 
    
    
    public Vuelo(String id, String orig, String dest, String hsal, String hlleg) {
        
    	ident=id;
        origen=orig;
        destino=dest;
        hsalida=hsal;
        hllegada=hlleg;
        reservadas=0;
        
        plazas = new String[MAX_PLAZAS+1];
    }
    
      
    public String getIdentificador() { 
    	return ident; }
    
    
    public String getOrigen() { 
    	return origen; }
    
      
    public String getDestino() { 
    	return destino; }
    
    
     public int getReservadas() { 
    	 
    	 return reservadas; }
    
    
    public boolean hayPlazas() { 
    	
    	boolean plazasLibres = true;
    	if (reservadas >= MAX_PLAZAS ) {
    		plazasLibres = false;	
    	}else{
    		plazasLibres = true;
    	}
    	return plazasLibres;
   }
    
	
    private int primeraLibre(char pref) {
		int i;
		int libre=-1;
		
    	if(pref=='P'){
    		for(i=2;i<plazas.length; i=i+2){
    			if(plazas[i]== null){
    				libre=i;
    				break;
    			}
    		}
    	}
    	
    	if(pref=='V'){
    		for(i=1;i<plazas.length; i=i+2){
    			if(plazas[i]== null){
    				libre=i;
    				break;
    			}
    		}
    	};
    	
    	return libre;
	} 
	
    
    public void reservar(String pas, int numP) { 
         
    	
         int nump;
         
         plazas[numP] = pas; 
         reservadas++; 
    }  
    
    /** 
     *  Dado un pasajero {@code pas} y un tipo de plaza {@code pref}, si el vuelo no esta completo, 
	 *  se reserva al pasajero {@code pas} la primera plaza libre en {@code pref}. 
	 *  El caracter {@cope pref} es `P' o `V' en funcion de que el pasajero desee una plaza de pasillo o de ventanilla. 
	 *  En caso de que no quede ninguna plaza libre en la preferencia indicada {@code pref}, se reserva
     *  la primera plaza libre de la otra preferencia. Devuelve un {@code String} indicando que plaza se ha reservado. 
	 *  Por ejemplo, si se ha solicitado una plaza de una preferencia con plazas libres, devuelve:
     *  "Su reserva:"
     *  "Pepe Garcia   22P  DL101     Valencia        Paris    10:30    16:45" 
	 *  
     *  Si no quedan plazas libres en la preferencia solicitada, devuelve:
     *  "No quedan plazas libres en ventanilla"
     *	
	 *  "Su reserva:"
     *  "Pepe Garcia   22P  DL101     Valencia        Paris    10:30    16:45" 
	 *
     *  Si el vuelo ya esta completo, no se puede realizar la reserva y devuelve el {@code String}:	
     *  "Imposible realizar la reserva: vuelo completo"
	 *
     *  @param pas String.
     *  @param pref char.
     *  @return String.
     */    
    public String reservar(String pas, char pref) {        
	    String str = "";
		
        /* COMPLETAR */
	    //si hay sitio 
	    
	    		//preferencias
	    			//primeraLibre(pref)
	    
	    //si no hay sitio
	    		//sms ""
		
		return str;
    } // de reservar
       
    /** 
     *  Dado un numero de plaza valida {@code numP} ({@code 1<=numP<=MAX_PLAZAS}),
     *  si esta ocupada, se cancela la reserva de dicha plaza y devuelve el {@code String}:
	 *  "Reserva cancelada"
     *  En caso contrario, la cancelacion no es posible y devuelve el {@code String}:
     *  "Imposible realizar la cancelacion: la plaza " numP " no esta ocupada"
	 *  
     *  @param numP int.
	 *  @return String.
     */ 
    public String cancelar(int numP) { 
        String str = "";
		
        /* COMPLETAR */
        
		return str;   
    } // de cancelar
    
    /** 
     *  Devuelve un {@code String} con los datos del vuelo (el identificador, la ciudad de origen, 
	 *  la ciudad de destino, la hora de salida y la hora de llegada).
     *  @return String.
     */
    public String toString() {
        String str = "";
		str = str + str.format("%8s %12s %12s %8s %8s",ident,origen,destino,hsalida,hllegada);
		return str;               
    } // de toString
    
    /**
     *  Devuelve un {@code String} con los datos del vuelo y el listado de reservas del mismo.
     *  Se utiliza el siguiente formato (ejemplo): 
     *     IB101     Valencia        Paris    10:30    16:45
     *  Luisa Millar (1V)
     *  Paco Gomez (2P)
     *  Marta Lopez (3V)
     * 
     *  @return String.
     */
    public String listarReservas() {
        String str = "\n" + toString() + "\n";
		
        /* COMPLETAR */    
        
		return str;
    } // de listarReservas
    
    /** 
     *  Escribe en {@code fich} toda la informacion del {@code Vuelo}. 
     *  @param fich PrintWriter.
     */
    public void guardar(PrintWriter fich) throws Exception {
        /* Se invoca desde el metodo guardar de la clase Aerolinea */        
        fich.println(ident + " " + origen + " " + destino + " " + hsalida + " " + hllegada);
        fich.println(reservadas);
        for(int i=1; i<=MAX_PLAZAS; i++)
            if (plazas[i]!=null) fich.println(i + " " + plazas[i]);            
    } // de guardar

} // de Vuelo
