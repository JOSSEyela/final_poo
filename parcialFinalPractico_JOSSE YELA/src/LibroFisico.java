class LibroFisico extends Libro {
    private int CantPaginas;

    public LibroFisico(String titulo, String autor, int anioPublicacion,String idioma, int CantPaginas) {
        super(titulo, autor, anioPublicacion,idioma);
        this.CantPaginas = CantPaginas;
    }

    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Tipo: Libro Físico, Número de Páginas: " + CantPaginas +" || ");
    }
}
