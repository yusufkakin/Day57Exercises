package hash.maps.nicknamesexercise;

import java.util.HashMap;

public class Nicknames
{
    public static void main(String[] args) {
        HashMap<String, String> nicknames = new HashMap<>();
        nicknames.put("Matthew", "Matt");
        nicknames.put("Mix", "Artie");
        nicknames.put("Arthur", "Artie");

        System.out.println(nicknames.get("Matthew"));
    }
}
