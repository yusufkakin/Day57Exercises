package hash.maps.ioweyouexercise;

import java.util.HashMap;

public class IOU {
    public HashMap<String, Double> hashmap;

    public IOU(){
        this.hashmap = new HashMap<>();
    }

    public static void main(String[] args) {
        IOU mattsIOU = new IOU();
        mattsIOU.setSum("Arthur", 51.5);
        mattsIOU.setSum("Michael", 30);

        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
        System.out.println(mattsIOU.howMuchDoIOweTo("Michael"));
    }

    public void setSum(String toWhom, double amount){
        this.hashmap.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom){
        if(this.hashmap.containsKey(toWhom)){
            return this.hashmap.get(toWhom);
        }
        return 0;
    }
}
