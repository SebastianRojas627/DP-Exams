package examen1.ejercicio2;

public class Client {

    public static void main(String[] args) {
        TelevisorSmart template = new TelevisorSmart();
        
        template.setOs("android");
        template.setOsVersion("11.0");
        template.setInches(80);
        template.setResolution(50);
        template.setHdmiPort(true);
        template.setUsbPorts(4);
        template.setRemote(true);
        template.setBluetooth(true);

        TelevisorSmart t1 = template.clone();
        t1.setSerial("4671839185");

        TelevisorSmart t2 = template.clone();
        t2.setSerial("4897612354");

        TelevisorSmart t3 = template.clone();
        t3.setSerial("5134789642");

        TelevisorSmart t4 = template.clone();
        t4.setSerial("7894563789");

        TelevisorSmart t5 = template.clone();
        t5.setSerial("1452369784");

        t1.showInfo();
        t2.showInfo();
        t3.showInfo();
        t4.showInfo();
        t5.showInfo();

    }
}
