package Herencia;

	public class Mamifero {
		private String habitat;
		public Mamifero (String h){
		habitat=h;
		}
		public Mamifero(){
		this("terrestre");
		}
		public String tipo (){
		return "mamífero "+habitat;
		}
		
	
	}


