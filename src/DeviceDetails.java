//This is an interface, it contains all of the abstract methods which can be implemented across classes.

/*In this case, it contains 2 abstract methods which are deviceType and deviceInfo. 
  deviceType is used to tell the type of the device and deviceInfo is used to tell the necessary information about the device being inspected.
*/

interface DeviceDetails {
    public abstract void deviceType();
    public abstract void deviceInfo();
}
