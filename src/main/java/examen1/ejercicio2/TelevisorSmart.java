package examen1.ejercicio2;

import prototype.structure.ConcretePrototype1;

public class TelevisorSmart implements IPrototype{

    public String os;
    public String osVersion;
    public int inches;
    public int resolution;
    public boolean hdmiPort;
    public int usbPorts;
    public boolean remote;
    public boolean bluetooth;
    public int serial;

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

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public void showInfo() {

    }

    @Override
    public Object clone() {
        ConcretePrototype1 clone = new ConcretePrototype1();
        clone.setAttribute1(this.getAttribute1());
        clone.setAttribute2(this.getAttribute2());
        clone.setAttribute3(this.getAttribute3());
        clone.setAttribute4(this.getAttribute4());
        clone.setAttribute5(this.getAttribute5());
        clone.setAttribute6(this.getAttribute6());
        clone.setAttribute7(this.getAttribute7());
        return clone;
    }
}
