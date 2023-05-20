public class Store {
    String name, date_founded, location;

    public Store(String name, String date_founded, String location){
        this.name = name;
        this.date_founded = date_founded;
        this.location = location;
    }

    public void printDetails(){
        System.out.println("Store Name: " + name);
        System.out.println("Date Founded: " + date_founded);
        System.out.println("Location: " + location);
    }
}
