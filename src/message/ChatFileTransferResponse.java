/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package message;

/**
 *
 * @author Kimmo
 */
public class ChatFileTransferResponse {
    
    private boolean isAccepted;
    
    public ChatFileTransferResponse(boolean isAccepted) {
        this.isAccepted = isAccepted;
    }
    
    public boolean isAccepted() {
        return isAccepted;
    }
    
}
