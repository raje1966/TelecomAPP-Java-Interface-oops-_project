public class MobilePhone implements Telephone {

    private String myNumber;
    private boolean isRinging;
    private boolean isPowerOn;

    public MobilePhone(String myNumber)
    {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Phone Power On");
    }

    @Override
    public void dial(String phoneNumber) {
        System.out.println("Now Ringing " + phoneNumber + "on Desk phone");
        isRinging = false;
    }

    @Override
    public void answer() {
        if (isRinging && isPowerOn)
        {
            System.out.println("Answering the phone");
            isRinging = false;
        } else
        {
        }
    }

    @Override
    public boolean callPhone(String phoneNumber) {
        if (phoneNumber == myNumber && isPowerOn)
        {
            isRinging = true;
            System.out.println("phone ringing");
        } else
        {
            System.out.println("Either wrong number or phone is off");
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
