package hash.maps.abbreviations;

import java.util.HashMap;

public class Abbreviations {

    public HashMap<String, String> abbreviation;

    public Abbreviations(){
        this.abbreviation = new HashMap<String, String>();
    }

    public static void main(String[] args) {

        Abbreviations abbreviations = new Abbreviations();
        abbreviations.addAbbreviation("e.g.", "for example");
        abbreviations.addAbbreviation("e.g.", "for example");
        abbreviations.addAbbreviation("etc.", "and so on");
        abbreviations.addAbbreviation("i.e.", "more precisely");

        String text = "e.g. i.e. etc. lol";

        for (String part: text.split(" ")) {
            if(abbreviations.hasAbbreviation(part)) {
                part = abbreviations.findExplanationFor(part);
            }

            System.out.print(part);
            System.out.print(" ");
        }

        System.out.println();

    }


    public void addAbbreviation(String abbreviation, String explanation){
        this.abbreviation.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation){
        return this.abbreviation.containsKey(abbreviation);
    }

    public String findExplanationFor(String abbreviation){
        if(this.hasAbbreviation(abbreviation)){
            return this.abbreviation.get(abbreviation);
        }
        return null;

    }

}
