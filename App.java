public class App {

    public static void main(String[] args) {
        
        AVehicle mercedes = new Car();
        Driver brother = new Driver();
        ABeing cat = new Cat();
        ABeing dog  = new Dog(); 

        ((Car)mercedes).fl= brother;
        ((Car)mercedes).fr=cat;
        ((Car)mercedes).bl= new Box();
        ((Car)mercedes).br= dog;


        System.out.println(mercedes);




    }
}