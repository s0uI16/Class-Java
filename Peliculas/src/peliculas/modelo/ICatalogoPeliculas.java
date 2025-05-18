
package peliculas.modelo;

public interface ICatalogoPeliculas {
    void inertarPelicula(Pelicula nombrePelicula);
    void listarPelicula();
    void buscarPelicula(String nombrePelicula);
}
