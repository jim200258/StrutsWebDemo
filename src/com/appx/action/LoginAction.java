package com.appx.action;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.springframework.beans.factory.annotation.Autowired;

import com.appx.form.UserForm;

public class LoginAction extends Action{
	
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
        if( ((UserForm) form).getUsername().equals("test") && ((UserForm) form).getPassword().equals("test")  ){
    	    request.setAttribute("message", "Hi~~" + ((UserForm)form).getUsername());
    	    return mapping.findForward("helloUser");
        }else{
    	    request.setAttribute("message", "帳號或密碼錯誤請重新輸入！！！");
    	    return mapping.findForward("loginUser");        	
        }
		
	}
}
