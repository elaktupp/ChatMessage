/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package message;

/**
 * This class can be used as serializable object between the client
 * and server in chat program.
 * 
 * @author Kimmo T.
 */
public class ChatMessage extends Chat {
    
    private String chatMessage;
    private String messageColor;
    private int fontSize; // range 12 to 25
    private boolean isPrivate;
    private String privateName; // receiver of the private message

    public String getChatMessage() {
        return chatMessage;
    }

    public void setChatMessage(String chatMessage) {
        this.chatMessage = chatMessage;
    }

    public String getMessageColor() {
        return messageColor;
    }

    public void setMessageColor(String messageColor) {
        this.messageColor = messageColor;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        if (fontSize >= 12 || fontSize < 26) {
            this.fontSize = fontSize;
        }
    }

    public boolean isIsPrivate() {
        return isPrivate;
    }

    public void setIsPrivate(boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    public String getPrivateName() {
        return privateName;
    }

    public void setPrivateName(String privateName) {
        this.privateName = privateName;
    }
    
    
}
