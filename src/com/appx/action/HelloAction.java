package com.appx.action;


import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class HelloAction extends Action{

	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		// get information from request object
		String username = request.getParameter("userInfo");

		// prepare model
		Map model = new HashMap();
		if (username != null)
			model.put("username", username);
		else
			model.put("username", "nobody");

		// pass information to View by using reqeust object
		request.setAttribute("message", "Hello World!!!");

		return mapping.findForward("helloUser");
	}
	
}
