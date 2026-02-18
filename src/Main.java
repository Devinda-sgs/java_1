
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
    void printgraph(){
        for(Map.Entry<String,List<edge>> entry: map.entrySet()){
            System.out.println("city "+entry.getKey()+" is connected to:");
            for(edge e : entry.getValue()){
                System.out.println("  "+ e.to+" with distance "+ e.weight);
            }
        }
    }


}

class Main {
    public static void main(String[] args) {
        graph g = new graph();
        g.addcity("A");
        g.addcity("B");
        g.addcity("C");
        g.addroad("A","B",5);
        g.addroad("B","C",10);
        g.addroad("A","C",15);
        g.printgraph(); 
    }
}