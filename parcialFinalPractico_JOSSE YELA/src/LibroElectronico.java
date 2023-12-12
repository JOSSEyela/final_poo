class LibroElectronico extends Libro {
    private String formato;

    public LibroElectronico(String titulo, String autor, int anioPublicacion,String idioma, String formato) {
        super(titulo, autor, anioPublicacion,idioma);
        this.formato = formato;
    }

    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Tipo: Libro Electrónico, Formato: " + formato +" || ");
    }
}
