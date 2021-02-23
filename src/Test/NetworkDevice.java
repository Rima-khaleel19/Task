package Test;

public class NetworkDevice {

   
    String deviceType;
    String pid;
    String name;
    String ipAddress;
    String username;
    String password;
    String snmpReadCommunity;

   
    public NetworkDevice(String deviceType, String pid, String name, String ipAddress, String username, String password, String snmpReadCommunity) {
        this.deviceType = deviceType;
        this.pid = pid;
        this.name = name;
        this.ipAddress = ipAddress;
        this.password = password;
        this.snmpReadCommunity = snmpReadCommunity;
        this.username = username;
    }

    
    public void setDeviceType(String DeviceType) {
        this.deviceType = DeviceType;
    }

    public void setPid(String PID) {
        this.pid = PID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIpAddress(String IpAddress) {
        this.ipAddress = IpAddress;
    }

    public void setUsername(String Username) {
        this.username = Username;
    }

    public void setPassword(String Password) {
        this.password = Password;
    }

    public void setSnmpReadCommunity(String SnmpReadCommunity) {
        this.snmpReadCommunity = SnmpReadCommunity;
    }

  
    public String getDeviceType() {
        return deviceType;
    }

    public String getPid() {
        return pid;
    }

    public String getName() {
        return name;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getSnmpReadCommunity() {
        return snmpReadCommunity;
    }

    //Method toString
    @Override
    public String toString() 
    {
        return deviceType + ",  " + name + ",  " + pid
                + ",  " + name + ",  " + ipAddress + ",  " + username
                + ",  " + password + ",  " + snmpReadCommunity + "\n";
    }

}
