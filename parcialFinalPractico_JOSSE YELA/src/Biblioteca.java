class Biblioteca {
    private Libro[] libros;

    public Biblioteca(Libro[] libros) {
        this.libros = libros;
    }

    public void imprimirInformacionBiblioteca() {
        System.out.println("Información de la Biblioteca:");
        System.out.println("");
        System.out.println("================================================");
        for (Libro libro : libros) {
            libro.imprimirInformacion();
            System.out.println("================================================");
            System.out.println("");
            System.out.println("================================================");

        }
    }
}
