package TallerEjercicio2;

public class Libro {
    private String Titulo;
    private String  Autor;
    private int Precio;

    public Libro(String titulo, String autor, int precio) {
        Titulo = titulo;
        Autor = autor;
        Precio = precio;
    }

    public Libro() {
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int precio) {
        Precio = precio;
    }

    
    
}
