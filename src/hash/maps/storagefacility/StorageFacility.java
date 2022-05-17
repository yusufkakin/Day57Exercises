package hash.maps.storagefacility;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {

    public HashMap<String, ArrayList<String>> hashmap;

    StorageFacility(){
        this.hashmap = new HashMap<>();
    }

    public static void main(String[] args) {
        StorageFacility facility = new StorageFacility();
        facility.add("a14", "ice skates");
        facility.add("a14", "ice hockey stick");
        facility.add("a14", "ice skates");

        facility.add("f156", "rollerblades");
        facility.add("f156", "rollerblades");

        facility.add("g63", "six");
        facility.add("g63", "pi");

        facility.remove("f156", "rollerblades");

        System.out.println(facility.contents("f156"));

        facility.remove("f156", "rollerblades");

        System.out.println(facility.storageUnits());



    }

    public void add(String unit, String item){
        hashmap.putIfAbsent(unit, new ArrayList<>());
        hashmap.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit){
        ArrayList<String> list = new ArrayList<>();
        if(hashmap.containsKey(storageUnit)){
            list = hashmap.get(storageUnit);
        }
        return list;
    }

    public void remove(String storageUnit, String item){

        ArrayList<String> listItems = new ArrayList<>();
            for (String itemUnit : hashmap.get(storageUnit)) {
                if (item.equals(itemUnit)) {
                    hashmap.get(storageUnit).remove(itemUnit);
                    break;
                }
            }
            if (hashmap.get(storageUnit).isEmpty()) {
                hashmap.remove(storageUnit);
            }

    }

    public ArrayList<String> storageUnits(){
        ArrayList<String> list = new ArrayList<>();
        for(String key : hashmap.keySet()){
            list.add(key);
        }
        return list;
    }
}
