/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package message;

import java.util.ArrayList;

/**
 *
 * @author Ohjelmistokehitys
 */
public class ChatConnectResponse extends Chat {
    
    private boolean connected;
    private boolean nameChanged;
    
    public boolean isConnected() {
        return connected;
    }
    
    public boolean isNameChanged() {
        return nameChanged;
    }

    public void setConnected(boolean connected) {
        this.connected = connected;
    }

    public void setNameChanged(boolean nameChanged) {
        this.nameChanged = nameChanged;
    }

}
