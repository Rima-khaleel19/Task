package Test;

import java.io.FileNotFoundException;
import java.util.List;

public class ReadCSV {

    public static final String fileName = "Test\\NetworkDevice.csv";

    public static void main(String[] args) throws FileNotFoundException {

        List<NetworkDevice> networkDevicesList = Helper.getNetworkDevicesList(fileName);

        for (NetworkDevice networkDevice : networkDevicesList) {
            System.out.print(networkDevice);
        }

    }
}

