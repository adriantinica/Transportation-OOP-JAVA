public class Car extends AVehicle {
    public Driver fl ;

    public ITransportable  fr ;
    public ITransportable bl ;
    public ITransportable br ;

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
