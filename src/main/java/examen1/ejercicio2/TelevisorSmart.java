package examen1.ejercicio2;

public class TelevisorSmart implements IPrototype{

    public String os;
    public String osVersion;
    public int inches;
    public int resolution;
    public boolean hdmiPort;
    public int usbPorts;
    public boolean remote;
    public boolean bluetooth;
    public String serial;

    public TelevisorSmart() {}

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public int getInches() {
        return inches;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public boolean isHdmiPort() {
        return hdmiPort;
    }

    public void setHdmiPort(boolean hdmiPort) {
        this.hdmiPort = hdmiPort;
    }

    public int getUsbPorts() {
        return usbPorts;
    }

    public void setUsbPorts(int usbPorts) {
        this.usbPorts = usbPorts;
    }

    public boolean isRemote() {
        return remote;
    }

    public void setRemote(boolean remote) {
        this.remote = remote;
    }

    public boolean isBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public void showInfo() {
        System.out.println("\n *** TELEVISOR SMART ***");
        System.out.println("OS: " + this.getOs());
        System.out.println("OS version: " + this.getOsVersion());
        System.out.println("Pulgadas: " + this.getInches());
        System.out.println("Resolucion: " + this.getResolution());
        System.out.println("Puerto HDMI: " + this.isHdmiPort());
        System.out.println("Puertos USB: " + this.getUsbPorts());
        System.out.println("Control remoto: " + this.isRemote());
        System.out.println("Bluetooth: " + this.isBluetooth());
        System.out.println("Serial: " + this.getSerial());
    }

    @Override
    public TelevisorSmart clone() {
        TelevisorSmart clone = new TelevisorSmart();
        clone.setOs(this.getOs());
        clone.setOsVersion(this.getOsVersion());
        clone.setInches(this.getInches());
        clone.setResolution(this.getResolution());
        clone.setHdmiPort(this.isHdmiPort());
        clone.setUsbPorts(this.getUsbPorts());
        clone.setRemote(this.isRemote());
        clone.setBluetooth(this.isBluetooth());
        clone.setSerial(this.getSerial());
        return clone;
    }
}
