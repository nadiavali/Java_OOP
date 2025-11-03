package Polymorphism;

public class Movie {

    private String title;

    public Movie() {}
    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie(){
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instanceType + " film.");
    }

    public static Movie getMovie(String type, String title) {
        return switch(type.toUpperCase().charAt(0)) {
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new SienceFiction(title);
            
            default -> new Movie(title);          
            
        };
    }
}


class Adventure extends Movie {

    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("...%s %n".repeat(3),
        "Pleseant Scence",
        "Scary Music",
        "Something bad happens");
    }

    public void watchAdventure() {
        System.out.println("Watching adventure Movie");
    }
    
}



class Comedy extends Movie {

    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("...%s %n".repeat(3),
        "Something funny happend",
        "Funny Music",
        "happy ending...");
    }

    public void watchComedy() {
        System.out.println("Watching Funny movies");
    }
    
}


class SienceFiction extends Movie {

    public SienceFiction(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("...%s %n".repeat(3),
        "Aliens are fighting",
        "Alien Music",
        "Humen won the war...");
    }

    public void watchSceinceFiction() {
        System.out.println("Watching Some Aliens movie");
    }
    
}