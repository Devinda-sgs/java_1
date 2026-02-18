
import java.util.*;

class edge {
    String to;
    int weight;
    public edge(String to, int weight) {
        this.to = to;
        this.weight = weight;
    }

}
class graph{
    Map<String , List<edge>> map =new LinkedHashMap<>();

    void addcity(String city){
        map.putIfAbsent(city,new ArrayList<>());

    }
    void addroad(String from,String to,int distance){
        map.get(from).add(new edge(to,distance));
        map.get(to).add(new edge(from,distance));
        
    }


}

class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}