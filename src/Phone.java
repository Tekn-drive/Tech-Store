public class Phone extends Tech implements DeviceDetails {
    private double camera_resolution;
    private int battery_capacity;
    
    public Phone(String name, String screen_resolution, String processor, int ram_capacity, int rom_capacity, int year_released, double price, double screen_size, double camera_resolution, int battery_capacity){
        super(name,screen_resolution,processor,ram_capacity, rom_capacity,year_released,price,screen_size);
        this.camera_resolution=camera_resolution;
        this.battery_capacity=battery_capacity;

    }
    
    public void deviceType() {
        System.out.println("This is a phone device");    
    }

    public void deviceInfo(){
        System.out.println("Name: " + name);
        System.out.println("Year Released: " + year_released);
        System.out.printf("Screen Size: %.1f inches\n",screen_size);
        System.out.println("Screen Resolution: " + screen_resolution);
        System.out.println("Processor: " + processor);
        System.out.println("RAM Capacity: " + ram_capacity + "GB");
        System.out.println("ROM Capacity: " + rom_capacity + "GB");
        System.out.printf("Camera Resolution: %.1fMP\n", camera_resolution);
        System.out.println("Battery Capacity: " + battery_capacity + "mAH");
        System.out.printf("Price: $%.2f\n",price);
    }
}
