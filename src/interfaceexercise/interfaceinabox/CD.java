package interfaceexercise.interfaceinabox;

public class CD implements Packable {

    String artist;
    String nameOfCD;
    int publicationYear;
    double weight;

    public CD(String artist, String nameOfCD, int publicationYear){
        this.artist = artist;
        this.nameOfCD = nameOfCD;
        this.publicationYear = publicationYear;
        this.weight = 0.1;
    }

    @Override
    public double weight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return this.artist + ": " +  this.nameOfCD + " (" + this.publicationYear +")" ;
    }
}
