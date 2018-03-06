package network;

public interface TCPConnectionListener {

    void onConnectionReady(TCPConnection topConnection);
    void onReceiveString(TCPConnection topConnection, String value);
    void onDisconnect(TCPConnection topConnection);
    void onException(TCPConnection topConnection, Exception e);
}
