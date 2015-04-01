package Examen2;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import Clases.Trabajador;


public class Taller {

    private String nombre;
    private String direccion;
    private String hora_apertura;
    private String hora_cierre;
    private int numCoches;
    private int NUM_MAX_COCHES = 50;
    private Coche coches[];
   
 
    public Taller(){
    	int i = 0;

		Scanner in = null;
		try {

			in = new Scanner(new FileReader("TallerDeCoches.txt"));
			coches = new Coche[numCoches];
			numCoches = in.nextInt();

			while (in.hasNext()) {
				
				String matriculaC = in.next();
				String modeloC = in.next();
				String colorC = in.next();
				int antiguedadC = in.nextInt();
				boolean entallerC=in.next() != null;

				Coche c = new Coche(matriculaC, modeloC, colorC,
						false, antiguedadC);
				coches[i] = c;
				i++;
			}
			numCoches = i;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			in.close();

		}
    }
    public Taller(String direccion_, String hora_apertura_, String hora_cierre_) {
    		}
        
    

    
    
    public Coche[] getCoches() {
        return coches;
    }

    
    public String getDireccion() {
        return direccion;
    }

    
    public String getHora_apertura() {
        return hora_apertura;
    }

    
    public String getHora_cierre() {
        return hora_cierre;
    }


    public boolean existeCoche(String matricula) {
        
    	int i = 0;

		boolean encontrado = false;
		while (i < numCoches && !encontrado) {

			if (matricula.equals(coches[i].getMatricula())) {
				encontrado = true;
			}
			i++;
		}

		return encontrado;
    }
    
    
   
    public String anyadirCoche(Coche coche) {
        
        String msg = "";
        boolean anyadido = false;
        if (!existeCoche(coche.getMatricula())) {
            for (int i = 0; i < coches.length && !anyadido; i++) {
                if (coches[i] == null) {
                    coches[i] = coche;
                    anyadido = true;
                    numCoches++;
                    msg = "El coche ha sido anyadido con éxito\n";
                }
            }
        } else {
            msg = "El coche ya está en el taller\n";
        }
        return msg;
    }

    
    public String borrarCoche(String matricula) {
  
        
        boolean existe = existeCoche(matricula);
		int i = 0;
		String msg = "Imposible realizar la cancelacion: el coche con la matricula "
				+ matricula + " no esta en el taller";

		if (existe) {

			while (i != NUM_MAX_COCHES) {

				if (coches[i] != null
						&& coches[i].getMatricula().equals(matricula)) {

					coches[i] = null;

					msg = "El coche ha sido eliminado con exito";

				}

				i--;
			}

        } 
        return msg;
		
    }

    public String filtroCoches(String modelo, int antiguedad) {
    	int i;
		String listaCoches = "";
		boolean encontrado = false;
		for (i = 0; i < NUM_MAX_COCHES; i++) {
			if (modelo.equals(coches[i].getModelo())) {
				encontrado = true;
	
			if (antiguedad==(coches[i].getAntiguedad())) {
				encontrado = true;
			}
			}	
				listaCoches = listaCoches + coches[i].toString() + "\n";

			}


		return listaCoches;
	}
    
    
    /** 
     *  Devuelve un {@code Coche} que tenga una matrícula igual a {@code matricula}.
     *  Si no encuentra el coche, devuelve un null.
     *  @param String matricula.
     *  @return Coche.
     */
    
    public Coche buscaCoche(String matricula){
        Coche cocheEncontrado = null;
        
        int i;
		String listaCoches = "";
		boolean encontrado = false;
		for (i = 0; i < NUM_MAX_COCHES; i++) {
			if (matricula.equals(coches[i].getMatricula())) {
				encontrado = true;
			}
		}
        return cocheEncontrado;
		
    }
    
    
    /** 
     *  Devuelve un {@code String} con un informe sobre las diferencias y las similitudes entre
     *  dos coches. El informe será un String que mostrará información sobre las antiguedades 
     *  de los coches, los colores, los modelos y los talleres. 
     *  @param Coche c1.
     *  @param Coche c2.
     *  @return String.
     */
    public String comparaCoches(Coche c1, Coche c2){
        
        String informe = "";
        
        /*COMPLETAR*/
        
        return informe;
    }
    
    
    
    
    public void guardar() {
	  
    	PrintWriter out = null;

		try {
			out = new PrintWriter("TallerDeCoches.txt");

			int i = 0;

			for (i = 0; i < coches.length; i++) {
				if (coches[i] != null) {
					out.println(coches[i].toString());
				}
			}

			out.println("");
		

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			out.close();
		}
    }
   
    /** 
     *  Lee desde fichero toda la informacion de los coches 
     *  que están o que han estado en el Taller y los va almacenando en el 
     *  array de coches {@code coches}.
     */    
    public void cargar() {
    
        /*COMPLETAR*/
    
    } // de cargar
    
    
}
