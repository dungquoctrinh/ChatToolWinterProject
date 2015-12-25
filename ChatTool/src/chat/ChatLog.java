/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat;
import java.util.*;
/**
 *
 * @author Dung Trinh
 */
public class ChatLog {
    private ArrayList<Message> log;
    private ArrayList<String> sysLog;
    
    public ChatLog()
    {
        this.log = new ArrayList<Message>();
        this.sysLog = new ArrayList<String>();
    }
    
    public void addMessage(Message msg, String logEntry)
    {
        if(msg != null)
        {
            log.add(msg);
        }
        //add the log no matter what
        sysLog.add(logEntry);
        
        //Can save the message directly 
    }
    
    public void clear()
    {
        this.log = new ArrayList<Message>();
        this.sysLog = new ArrayList<String>();
    }
    
    /**
     * Export the whole chatlog to a file
     */
    public void exportToFile()
    {
        //Will export into two separate file
        
    }
}
