package Polymorphism;

public class NextMain {
    public static void main(String[] args) {
        Movie movie = Movie.getMovie("C", "Some comedy days");
        movie.watchMovie();

        Adventure cloudAtlas = (Adventure) Movie.getMovie("A", "Cloud Atlas"); //casting
        cloudAtlas.watchMovie();

        Object alien = Movie.getMovie("S", "Aliens on Earth");

        SienceFiction alienMovie = (SienceFiction) alien;

        alienMovie.watchSceinceFiction();

        var alienasVar = Movie.getMovie("C", "Aliens on Earth");
        alienasVar.watchMovie();


        var alienVar = new Adventure("Aliens on Earth");
        alienVar.watchAdventure();
        alienVar.watchMovie();

        // testing runtime type
        Object unkownObject = Movie.getMovie("A", "Cloud Atlas");
        if(unkownObject.getClass().getSimpleName().equals("Adventure")) {
            Adventure adventureMovie = (Adventure) unkownObject;
            adventureMovie.watchAdventure();
        }else if (unkownObject instanceof Comedy) {
            ((Comedy) unkownObject).watchComedy();
            
        }else if (unkownObject instanceof SienceFiction syphy) { // data assigend to var if true without casting
            syphy.watchSceinceFiction();
            
        }
    }
}
