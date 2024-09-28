
class Pelicula { // Creando la clase pelicula que sera el plano para crear nuestros objetos de
                 // peliculas
    String titulo;
    String genero;
    int calificacion;

    public Pelicula(String titulo, String genero, int calificacion) { // Objeto pelicula con sus parametros creado a
                                                                      // partir de la clase Pelicula
        this.titulo = titulo;
        this.genero = genero;
        this.calificacion = calificacion;
    }

    public void proyectar() {
        System.out.println("----------------------------");
        System.out.println("solo en cines");
        System.out.println("----------------------------");
        System.out.println("proyectando la pelicula de " + this.titulo);
        System.out.println("----------------------------");
        System.out.println("El genero de la pelicula es de " + this.genero);
        System.out.println("la calificacion de la pelicula es de " + this.calificacion);

    }

}

public class PeliculaTestDrive {

    public static void main(String[] args) {

        // Primera pelicula

        Pelicula uno = new Pelicula("Blanca nieves y los 7 enanitos", "Infantil", 138); // aqui se ponen los parametros
                                                                                        // que tendra el objeto
                                                                                        // pelicula1 es muy importante
                                                                                        // ponerlos en el mismo orden

        uno.proyectar(); // aqui se llama a la funcion proyectar

        Pelicula dos = new Pelicula("No habra paz para los malvados", "trihiller", 160);

        // Segunda pelicula

        dos.proyectar();

        Pelicula tres = new Pelicula("Bailando bajo la lluvia", "Musical", 100);

        // Tercera pelicula

        tres.proyectar();

    }

}
