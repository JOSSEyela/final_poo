class Libro {
    private String titulo;
    private String autor;
    private String idioma;
    private int anioPublicacion;

    public Libro(String titulo, String autor, int anioPublicacion, String idioma) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.idioma = idioma;
    }

    public void imprimirInformacion() {
        System.out.println("Libro: " + titulo +" || " + ", Autor: " + autor +" || "+ ", Año de Publicación: " + anioPublicacion+" || "+", idioma: " + idioma+" || ");
    }
}