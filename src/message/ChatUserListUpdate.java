/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package message;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Ohjelmistokehitys
 */
public class ChatUserListUpdate extends Chat {
    
    private ArrayList<String> users;
    
    public ChatUserListUpdate(ArrayList<String> users) {
        this.users = users;
    }
    
    public ArrayList<String> getUserList() {
        return users;
    }
    
}
