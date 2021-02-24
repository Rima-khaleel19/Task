package Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Helper {

    public static List<NetworkDevice> getNetworkDevicesList(String filename) {
//An Objectt
        ArrayList< NetworkDevice> networkDeviceList = new ArrayList<NetworkDevice>();
        Path pathToFile = Paths.get(filename);

        try (Scanner scan = new Scanner(pathToFile)) {
            String row;
            scan.next();

            while (scan.hasNext()) {
                row = scan.next();
                String[] values = row.split(",");
                NetworkDevice networkDevice = getNetworkDevice(values);
                networkDeviceList.add(networkDevice);

            }

        } catch (Exception ex) {
            System.out.print("ErrorFileNotFound: " + ex);
        }

        return networkDeviceList;
    }

    private static NetworkDevice getNetworkDevice(String[] values) {

        String device = values[0];
        String pid = values[1];
        String name = values[2];
        String ipAddress = values[3];
        String username = values[4];
        String password = values[5];
        String snmpReadCommunity = values[6];

        return new NetworkDevice(device, pid, name, ipAddress, username, password, snmpReadCommunity);
    }

}
