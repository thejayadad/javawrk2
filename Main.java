import java.util.LinkedList;

record Place (String name, int distance){
    @Override
    public String toString(){
        return String.format("%s (%d)", name, distance);
    }
}
public class Main {


    public static void main(String[] args) {
        LinkedList<Place> grandTour = new LinkedList<>();

        Place knoxville = new Place("Knoxville", 365);
        addPlace(grandTour, knoxville);
        System.out.println(grandTour);


    }

    public static void addPlace(LinkedList<Place> list, Place place){
        if(list.contains(place)){
            System.out.println("Found duplicate: " + place);
        }
        list.add(place);
    }
    
}
