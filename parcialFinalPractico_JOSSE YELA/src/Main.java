public class Main {
    public static void main(String[] args) {

        LibroFisico libroFisico1 = new LibroFisico("Clean Code: A Handbook of Agile Software Craftsmanship", "Robert C. Martin", 2008, "ingles",464);
        LibroFisico libroFisico2 = new LibroFisico("Eloquent JavaScript: A Modern Introduction to Programming", "Marijn Haverbeke", 2011, "ingles",472);
        LibroFisico libroFisico3 = new LibroFisico("Learning Python", "Mark Lutz", 1999, "ingles",1648);

        LibroElectronico libroElectronico1 = new LibroElectronico("The Pragmatic Programmer: Your Journey To Mastery", "Andrew Hunt y David Thomas", 1999, "ingles","PDF");
        LibroElectronico libroElectronico2 = new LibroElectronico("JavaScript: The Good Parts", " Douglas Crockford", 2008, "ingles","PDF");
        LibroElectronico libroElectronico3 = new LibroElectronico("Design Patterns: Elements of Reusable Object-Oriented Software", "Erich Gamma", 1994, "ingles","PDF");


        Libro[] librosEnBiblioteca = {
                libroFisico1, libroFisico2, libroFisico3,
                libroElectronico1, libroElectronico2, libroElectronico3
        };

        Biblioteca biblioteca = new Biblioteca(librosEnBiblioteca);


        biblioteca.imprimirInformacionBiblioteca();
    }
}
