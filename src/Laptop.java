public class Laptop extends Tech implements DeviceDetails{
    private String graphics, second_hard_disk_type;
    private int hard_disk_count, second_rom_capacity;

    public Laptop(String name, String screen_resolution, String processor, int ram_capacity, int rom_capacity, int year_released, double price, double screen_size, String graphics, String second_hard_disk_type, int hard_disk_count, int second_rom_capacity){
        super(name,screen_resolution,processor,ram_capacity, rom_capacity,year_released,price, screen_size);
        this.graphics=graphics;
        this.second_hard_disk_type=second_hard_disk_type;
        this.hard_disk_count=hard_disk_count;
        this.second_rom_capacity=second_rom_capacity;
    }

    public void deviceType() {
        System.out.println("This is a laptop device");    
    }

    public void deviceInfo(){
        System.out.println("Name: " + name);
        System.out.println("Year Released: " + year_released);
        System.out.printf("Screen Size: %.1f inches\n",screen_size);
        System.out.println("Screen Resolution: " + screen_resolution);
        System.out.println("Processor: " + processor);
        System.out.println("RAM Capacity: " + ram_capacity + "GB");
        System.out.println("ROM Capacity: " + rom_capacity + "TB");
        System.out.println("Graphics: " + graphics);
        System.out.println("Second Hard Disk Type: " + second_hard_disk_type);
        System.out.println("Hard Disk Count: " + hard_disk_count);
        System.out.println("Second ROM Capacity: " + second_rom_capacity + "TB");
        System.out.printf("Price: $%.2f\n",price);
    }
}
