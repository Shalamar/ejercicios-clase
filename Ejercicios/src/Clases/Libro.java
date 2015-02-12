package Clases;

public class Libro {

	// atributos

	private String titulo;
	private String autor;
	private int anyo;
	private String editorial;
	private String isbn;

	// constructores

	public Libro(String ISBN) {
		
		isbn = ISBN;

	}

	public Libro(String titulo, String autor, int anyo, String editorial,
			String isbn) {
		
		this.titulo = titulo;
		this.autor = autor;
		this.anyo = anyo;
		this.editorial = editorial;
		this.isbn = isbn;

	}

	// metodos
	
	public String getTitulo(){
		
		return titulo;
		
	}
	public void setTitulo(String titulo_){
		
		this.titulo = titulo_; 
		
	}
	public String getAutor(){
		
		return autor;
		
	}
	public void setAutor(String autor_){
		
		this.autor = autor_;
		
	}
	public int getAnyo(){
		
		return anyo;
		
	}
	public void setAnyo(int anyo_){
		
		this.anyo = anyo_;
		
	}
	public String getEditorial(){
		
		return editorial;
		
	}
	public void getEditorial(String editorial_){
		
		this.editorial=editorial_;
		
	}
	public String getIsbn(){ 
		
		return isbn;
		
	}
	public String toString(){
		
		String datos = titulo +" "+ autor +" "+ anyo +" "+ editorial +" "+ isbn;
		
		return datos;
		
	}


}
