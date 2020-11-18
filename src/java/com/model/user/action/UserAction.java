/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model.user.action;

import com.model.user.service.UserService;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author CPEDUR1P5
 */
public class UserAction {
    HttpServletRequest request;
    HttpServletResponse response;
    private String url;

    public UserAction(HttpServletRequest request, HttpServletResponse response) {
        this.request=request;
        this.response=response;
    }

    public String execute(String action) {
       if (action.equalsIgnoreCase("authenticateUser")) {
            url = authenticateUser();
        }else if (action.equalsIgnoreCase("logout")) {
            System.out.println("logout");
            url = logOutUser();
        }else if (action.equalsIgnoreCase("changePassword")) {
            System.out.println("changePassword");
            url = changePassword();
        }
       return url;
    }

    private String authenticateUser() {
         if (new UserService(request, response).authenticateUser()) {

            return "login.jsp?login_success=true";
        } else {
            return "login.jsp?login_success=false";
        }
    }

    private String logOutUser() {
        new UserService(request, response).logOutUser();
        return "login.html?logout=true";
    }

    private String changePassword() {
        if(new UserService(request, response).ChangePassword()){
            return "passwordSuccess.jsp";
        }else{
            return "passwordFail.jsp";
        }
        
    }
    
}
