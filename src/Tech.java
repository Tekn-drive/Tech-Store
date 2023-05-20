//This is an abstract class, it serves as a blueprint for the creation of an object as it can't be directly used to create an object.
//A class is able to inherit from this class in order to use this class as a blueprint.

abstract class Tech {
    String name,screen_resolution,processor;
    int ram_capacity,rom_capacity,year_released;
    double price, screen_size;

    public Tech(String name, String screen_resolution, String processor, int ram_capacity, int rom_capacity, int year_released, double price, double screen_size){
        this.name=name;
        this.screen_resolution=screen_resolution;
        this.processor=processor;
        this.ram_capacity=ram_capacity;
        this.rom_capacity=rom_capacity;
        this.year_released=year_released;
        this.price=price;
        this.screen_size=screen_size;
    }
}
