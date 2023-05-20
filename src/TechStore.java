import java.util.*;
public class TechStore {
    public static void main(String[] args) throws Exception {
        
        /* Abstract class properties:
          - A class which unlike regular class, can't be directly used to create an object. It serves as a blueprint in object creation. 
          - Only one abstract class can be inherited by a class, thus a class can't inherit multiple abstract classes.
          - Contains both abstract and non abstract methods.
          - Has constructors, fields, and methods with varying access modifiers.

          Interface properties:
          - A collection of abstract methods which can't be directly used but is implemented in classes.
          - Multiple interfaces can be implemented within a class.
          - Contains entirely abstract methods.
          - All methods contained are abstract thus they have no implementations.

          The abstract class being used in this program is Tech, whilst the interface which is being implemented across multiple classes (Phone, Laptop, Tablet, SmartWatch) is DeviceDetails
        */

        ArrayList<Phone> phones = new ArrayList<Phone>();
        ArrayList<Laptop> laptops = new ArrayList<Laptop>();
        ArrayList<Tablet> tablets = new ArrayList<Tablet>();
        ArrayList<SmartWatch> smartwatches = new ArrayList<SmartWatch>();
        int choice = 0;
        Scanner input = new Scanner(System.in);
        Store store = new Store("Juan's Tech Store","19th May 2023","West Jakarta, Indonesia");
        
        do{
            menu();
            System.out.print("> ");
            choice = input.nextInt();
            input.nextLine();

            switch(choice){
                case 1:
                    insertDevice(input,phones,laptops,tablets,smartwatches);
                break;

                case 2:
                    inspectDevices(input,phones,laptops,tablets,smartwatches);
                break;

                case 3:
                    removeDevice(input,phones,laptops,tablets,smartwatches);
                break;

                case 4:
                    store.printDetails();
                break;

            }
        }while(choice!=5);
        input.close();
        System.out.println("App exited successfully");
    }

    public static void menu(){
        System.out.println("Welcome to Juan's Tech Store");
        System.out.println("============================");
        System.out.println("1. Insert a new device to the list");
        System.out.println("2. Inspect devices");
        System.out.println("3. Remove a device from the list");
        System.out.println("4. About this Store");
        System.out.println("5. Exit");
    }

    public static void insertDevice(Scanner input, ArrayList<Phone> phones, ArrayList<Laptop> laptops, ArrayList<Tablet> tablets, ArrayList<SmartWatch> smartwatches){
        System.out.println("Please select one of the device category to be inserted into the list");
        System.out.println("=====================================================================");
        System.out.println("1. Phone");
        System.out.println("2. Laptop");
        System.out.println("3. Tablet");
        System.out.println("4. Smart Watch");
        System.out.print("> ");

        int insert_choice=input.nextInt();
        input.nextLine();

        switch(insert_choice){
            case 1:
                System.out.print("Please input name: ");
                String name = input.nextLine();
                System.out.print("Please input year released: ");
                int year = input.nextInt();
                input.nextLine();
                System.out.print("Please input screen size (inches): ");
                double screen_size = input.nextDouble();
                input.nextLine();
                System.out.print("Please input screen resolution: ");
                String screen_resolution=input.nextLine();
                System.out.print("Please input processor: ");
                String processor = input.nextLine();
                System.out.print("Please input RAM Capacity (GB): ");
                int ram = input.nextInt();
                input.nextLine();
                System.out.print("Please input ROM Capacity (GB): ");
                int rom = input.nextInt();
                input.nextLine();
                System.out.print("Please input Camera Resolution (MP): ");
                double camera_resolution = input.nextDouble();
                input.nextLine();
                System.out.print("Please input Battery Capacity (mAH): ");
                int battery_capacity = input.nextInt();
                input.nextLine();
                System.out.print("Please input Price ($): ");
                double price = input.nextDouble();
                input.nextLine();

                Phone p = new Phone(name,screen_resolution,processor,ram,rom,year,price,screen_size,camera_resolution,battery_capacity);
                phones.add(p);
                System.out.println("Successfully added phone: " + name);
            break;

            case 2:
                System.out.print("Please input name: ");
                name = input.nextLine();
                System.out.print("Please input year released: ");
                year = input.nextInt();
                input.nextLine();
                System.out.print("Please input screen size (inches): ");
                screen_size = input.nextDouble();
                input.nextLine();
                System.out.print("Please input screen resolution: ");
                screen_resolution=input.nextLine();
                System.out.print("Please input processor: ");
                processor = input.nextLine();
                System.out.print("Please input RAM capacity (GB): ");
                ram = input.nextInt();
                input.nextLine();
                System.out.print("Please input ROM capacity (TB): ");
                rom = input.nextInt();
                input.nextLine();
                System.out.print("Please input Graphics: ");
                String graphics = input.nextLine();
                System.out.print("Please input second hard disk type: ");
                String second_hard_disk_type = input.nextLine();
                System.out.print("Please input hard disk count: ");
                int hard_disk_count = input.nextInt();
                System.out.print("Please input second ROM Capacity (TB): ");
                int second_rom = input.nextInt();
                input.nextLine();
                System.out.print("Please input Price ($): ");
                price = input.nextDouble();
                input.nextLine();

                Laptop l = new Laptop(name,screen_resolution,processor,ram,rom,year,price,screen_size,graphics,second_hard_disk_type,hard_disk_count,second_rom);
                laptops.add(l);
                System.out.println("Successfully added laptop: " + name);
            break;

            case 3:
                System.out.print("Please input name: ");
                name = input.nextLine();
                System.out.print("Please input year released: ");
                year = input.nextInt();
                input.nextLine();
                System.out.print("Please input screen size (inches): ");
                screen_size = input.nextDouble();
                input.nextLine();
                System.out.print("Please input screen resolution: ");
                screen_resolution=input.nextLine();
                System.out.print("Please input processor: ");
                processor = input.nextLine();
                System.out.print("Please input RAM Capacity (GB): ");
                ram = input.nextInt();
                input.nextLine();
                System.out.print("Please input ROM Capacity (GB): ");
                rom = input.nextInt();
                input.nextLine();
                System.out.print("Please input Camera Resolution (MP): ");
                camera_resolution = input.nextDouble();
                input.nextLine();
                System.out.print("Please input Battery Capacity (mAH): ");
                battery_capacity = input.nextInt();
                input.nextLine();
                System.out.print("Can this tablet replace an existing PC? ");
                boolean replace_pc=input.nextBoolean();
                input.nextLine();
                System.out.print("Please input Price ($): ");
                price = input.nextDouble();
                input.nextLine();

                Tablet t = new Tablet(name,screen_resolution,processor,ram, rom,year,price,screen_size,camera_resolution,battery_capacity,replace_pc);
                tablets.add(t);
                System.out.println("Successfully added tablet: " + name);
            break;

            case 4:
                System.out.print("Please input name: ");
                name = input.nextLine();
                System.out.print("Please input year released: ");
                year = input.nextInt();
                input.nextLine();
                System.out.print("Please input screen size (millimeters): ");
                screen_size = input.nextDouble();
                input.nextLine();
                System.out.print("Please input screen resolution: ");
                screen_resolution=input.nextLine();
                System.out.print("Please input processor: ");
                processor = input.nextLine();
                System.out.print("Please input RAM Capacity (GB): ");
                ram = input.nextInt();
                input.nextLine();
                System.out.print("Please input ROM Capacity (GB): ");
                rom = input.nextInt();
                input.nextLine();
                System.out.print("Please input Battery Capacity (mAH): ");
                battery_capacity = input.nextInt();
                input.nextLine();
                System.out.print("Please input Price ($): ");
                price = input.nextDouble();
                input.nextLine();

                SmartWatch s = new SmartWatch(name,screen_resolution,processor,ram,rom,year,price,screen_size,battery_capacity);
                smartwatches.add(s);
                System.out.println("Successfully added smartwatch: " + name);
            break;
        }
    }

    public static void inspectDevices(Scanner input, ArrayList<Phone> phones, ArrayList<Laptop> laptops, ArrayList<Tablet> tablets, ArrayList<SmartWatch> smartwatches){
        System.out.println("Please select one of the device category to be inspected");
        System.out.println("========================================================");
        System.out.println("1. Phone");
        System.out.println("2. Laptop");
        System.out.println("3. Tablet");
        System.out.println("4. Smart Watch");
        System.out.print("> ");
        int inspect_choice=input.nextInt();
        input.nextLine();
        listTitle(inspect_choice,phones,laptops,tablets,smartwatches);

        switch(inspect_choice){
            case 1:
                System.out.print("Please input the number of device to be inspected: ");
                int inspect = input.nextInt();
                input.nextLine();
                ((DeviceDetails)phones.get(inspect-1)).deviceInfo();
                ((DeviceDetails)phones.get(inspect-1)).deviceType();
            break;

            case 2:
                System.out.print("Please input the number of device to be inspected: ");
                inspect = input.nextInt();
                input.nextLine();
                ((DeviceDetails)laptops.get(inspect-1)).deviceInfo();
                ((DeviceDetails)laptops.get(inspect-1)).deviceType();
            break;

            case 3:
                System.out.print("Please input the number of device to be inspected: ");
                inspect = input.nextInt();
                input.nextLine();
                ((DeviceDetails)tablets.get(inspect-1)).deviceInfo();
                ((DeviceDetails)tablets.get(inspect-1)).deviceType();
            break;

            case 4:
                System.out.print("Please input the number of device to be inspected: ");
                inspect = input.nextInt();
                input.nextLine();
                ((DeviceDetails)smartwatches.get(inspect-1)).deviceInfo();
                ((DeviceDetails)smartwatches.get(inspect-1)).deviceType();
            break;
        }
    }

    public static void removeDevice(Scanner input, ArrayList<Phone> phones, ArrayList<Laptop> laptops, ArrayList<Tablet> tablets, ArrayList<SmartWatch> smartwatches){
        System.out.println("Please select one of the device category to be removed");
        System.out.println("======================================================");
        System.out.println("1. Phone");
        System.out.println("2. Laptop");
        System.out.println("3. Tablet");
        System.out.println("4. Smart Watch");
        System.out.print("> ");

        int remove_choice=input.nextInt();
        input.nextLine();
        listTitle(remove_choice,phones,laptops,tablets,smartwatches);
        
        switch(remove_choice){
            case 1:
                System.out.print("Please input the number of device to be deleted: ");
                int delete = input.nextInt();
                input.nextLine();
                String temp = phones.get(delete-1).name;
                phones.remove(phones.get(delete-1));
                System.out.println("Phone " + temp + " is successfully deleted");
            break;

            case 2:
                System.out.print("Please input the number of device to be deleted: ");
                delete = input.nextInt();
                input.nextLine();
                temp = laptops.get(delete-1).name;
                laptops.remove(laptops.get(delete-1));
                System.out.println("Laptop " + temp + " is successfully deleted");
            break;

            case 3:
                System.out.print("Please input the number of device to be deleted: ");
                delete = input.nextInt();
                input.nextLine();
                temp = tablets.get(delete-1).name;
                tablets.remove(tablets.get(delete-1));
                System.out.println("Tablet " + temp + " is successfully deleted");
            break;

            case 4:
                System.out.print("Please input the number of device to be deleted: ");
                delete = input.nextInt();
                input.nextLine();
                temp = smartwatches.get(delete-1).name;
                smartwatches.remove(smartwatches.get(delete-1));
                System.out.println("Smartwatch " + temp + " is successfully deleted");
            break;
        }
    }

    public static void listTitle(int choice, ArrayList<Phone> phones, ArrayList<Laptop> laptops, ArrayList<Tablet> tablets, ArrayList<SmartWatch> smartwatches){
        System.out.println("========================================================");
        System.out.println("|No.|                                       Device Name|");
        System.out.println("========================================================");
        int count=0;

        switch(choice){
            case 1:
                for(Phone p:phones){
                    System.out.printf("|%3d|%50s|\n",count+1,p.name);
                    count++;
                }
            break;

            case 2:
                for(Laptop l:laptops){
                    System.out.printf("|%3d|%50s|\n",count+1,l.name);
                    count++;
                }
            break;
            
            case 3:
                for(Tablet t:tablets){
                    System.out.printf("|%3d|%50s|\n",count+1,t.name);
                    count++;
                }
            break;
            
            case 4:
                for(SmartWatch s:smartwatches){
                    System.out.printf("|%3d|%50s|\n",count+1,s.name);
                    count++;
                }
            break;
        }

        System.out.println("========================================================");
    }
}
