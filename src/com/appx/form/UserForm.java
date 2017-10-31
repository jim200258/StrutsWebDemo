package com.appx.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class UserForm extends ActionForm{

	private String username; 
    private String password;
     
    public void setUsername(String username) { 
        this.username = username; 
    } 
    
    public void setPassword(String password) { 
        this.password = password; 
    } 
    
    public String getUsername() { 
        return username; 
    }
    
    public String getPassword() {
        return password;
    } 
    
    public void reset(ActionMapping mapping,
                      HttpServletRequest request) {
        username = null;
        password = null;
    } 
    
}
