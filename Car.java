public class Car extends AVehicle {
    public Driver fl ;

    public ITransportable  fr ;
    public ITransportable bl ;
    public ITransportable br ;

    ///####   COMMON GETTER AND SETTER  ############

    public ITransportable getThingFromPlace (String place){
        if (place.equals("Front Left")){
            return fl;
        }else if (place.equals("Front right")) {
            return fr;
        }else if (place.equals("Back left")) {
            return br;
        }else if (place.equals("Back right")) {
            return br;
        } 
        return null;
    }

    public void setThingToPlace(String place, ITransportable thing){
        if (place.equals("Front Left")){
            fl = (Driver)thing;
        }else if (place.equals("Front right")) {
             fr = thing;
        }else if (place.equals("Back right")) {
             br = thing;
        }else if (place.equals("Back left")) {
             bl = thing;
        } 
    }
    //##############################################

    public String toString(){
        String out;

        out = 

            "+------Object<Car>-------+\n" +
            "|                        |\n" +
            "|  +----+        +----+  |\n" +
            "|  |"+fl+"|        |"+fr+"|  |\n" +
            "|  +----+        +----+  |\n" +
            "|                        |\n" +
            "|                        |\n" +
            "|  +----+        +----+  |\n" +
            "|  |"+bl+"|        |"+br+"|  |\n" +
            "|  +----+        +----+  |\n" +
            "|                        |\n" +
            "+------------------------+\n";

        return out;

    }
}

