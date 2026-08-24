package commandPattern;

public class ViewerApp {

    public static void main(String[] args){

        Tv tv = new Tv();

        RemoteControl rc = new RemoteControl();

        PowerOn powerOn = new PowerOn(tv);

        rc.setCommand(powerOn);

        System.out.println(rc.clickButton());

        PowerOff powerOff = new PowerOff(tv);
        System.out.println(powerOff.execute());

        rc.setCommand(powerOff);

        System.out.println(rc.clickButton());

    }
}
