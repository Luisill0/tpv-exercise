package oop.inheritance.verifone.v240m;

public class VerifoneV240mGPS {

    private VerifoneV240mGPS(){}

    private static class GPSHolder{
        private static final VerifoneV240mGPS INSTANCE = new VerifoneV240mGPS();
    }

    public static VerifoneV240mGPS getInstance(){
        return GPSHolder.INSTANCE;
    }

    /**
     * Opens a connection using the GPS device
     *
     * @return true if the connection was successfully opened
     */
    public boolean open() {

        return true;
    }

    /**
     * Sends a message to the server
     *
     * @param message message to be sent to the server
     * @return true if the message was sent successfully, false otherwise
     */
    public boolean send(byte[] message) {
        return true;
    }

    /**
     * Method blocks until host send a response or until a timeout is reached.
     *
     * @return Message received from the host. In case of timeout it returns null
     */
    public byte[] receive() {
        return "response".getBytes();
    }

    /**
     * Closes the channel releasing every used resources
     */
    public void close() {

    }
}
