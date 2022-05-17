package hash.maps.dictionaryofmany;

import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    public HashMap<String, ArrayList<String>> hashmap;

    public DictionaryOfManyTranslations(){
        this.hashmap = new HashMap<>();
    }

    public static void main(String[] args) {
        DictionaryOfManyTranslations dictionary = new DictionaryOfManyTranslations();
        dictionary.add("lie", "maata");
        dictionary.add("lie", "valehdella");

        System.out.println(dictionary.translate("lie"));
        dictionary.remove("bow");
        System.out.println(dictionary.translate("bow"));

    }
    public void add(String word, String translation){
        this.hashmap.putIfAbsent(word, new ArrayList<>());
        this.hashmap.get(word).add(translation);
    }

    public ArrayList<String> translate(String word){
        ArrayList<String> list = new ArrayList<>();
        if(this.hashmap.containsKey(word)){
            list = this.hashmap.get(word);
        }

        return list;
    }

    public void remove(String word){
        this.hashmap.remove(word);
    }
}
