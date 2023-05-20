public class SmartWatch extends Tech implements DeviceDetails{
    int battery_capacity;

    public SmartWatch(String name, String screen_resolution, String processor, int ram_capacity, int rom_capacity, int year_released, double price, double screen_size, int battery_capacity){
        super(name,screen_resolution,processor,ram_capacity, rom_capacity,year_released,price,screen_size);
        this.battery_capacity=battery_capacity;
    }

    public void deviceType() {
        System.out.println("This is a smart watch device");    
    }

    public void deviceInfo(){
        System.out.println("Name: " + name);
        System.out.println("Year Released: " + year_released);
        System.out.printf("Screen Size: %.1f millimeters\n",screen_size);
        System.out.println("Screen Resolution: " + screen_resolution);
        System.out.println("Processor: " + processor);
        System.out.println("RAM Capacity: " + ram_capacity + "GB");
        System.out.println("ROM Capacity: " + rom_capacity + "GB");
        System.out.println("Battery Capacity: " + battery_capacity + "mAH");
        System.out.printf("Price: $%.2f\n",price);
    }
}
