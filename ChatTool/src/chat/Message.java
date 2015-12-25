/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat;

/**
 *
 * @author Dung Trinh
 */
public class Message {
    /**
     * The actual messgae 
     */
    private String message;
    
    /**
     * The time that the message is sent
     */
    private int createTime;
    
    /**
     * Encrypted message
     */
    
    public Message(String msg)
    {
        this.message = msg;
    }
    
    public String getMessage()
    {
        return this.message;
    }
}
