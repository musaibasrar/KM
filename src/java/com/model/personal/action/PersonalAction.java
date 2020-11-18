/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model.personal.action;

import com.model.currentIssue.service.CurrentIssueService;
import com.model.personal.service.PersonalService;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author CPEDUR1P5
 */
public class PersonalAction {

    HttpServletRequest request;
    HttpServletResponse response;
    HttpSession httpSession;
    String url;

    public PersonalAction(HttpServletRequest request, HttpServletResponse response) {

        this.request = request;
        this.response = response;
        this.httpSession = request.getSession();
    }

    public String execute(String action,String page) {
        if (action.equalsIgnoreCase("dashBoard")) {
            System.out.println("Action is dashBoard");
            url = dashBoard();
        } else if (action.equalsIgnoreCase("viewAll")) {
            System.out.println("Action is ViewAll");
            url = viewAll();
        } else if (action.equalsIgnoreCase("ViewAllGo")) {
            System.out.println("Action is ViewAll");
            url = viewAllGo();
        } else if (action.equalsIgnoreCase("AddContact")) {
            System.out.println("add Contact");
            url = AddContact();
        } else if (action.equalsIgnoreCase("viewDetails")) {
            System.out.println("viewDetails");
            url = viewDetails();

        } else if (action.equalsIgnoreCase("viewDetailsCS")) {
            System.out.println("viewDetailsCS");
            url = viewDetailsCS();

        } else if (action.equalsIgnoreCase("updateContactDetails")) {
            System.out.println("updateContactDetails");
            url = updateContactDetails();

        } else if (action.equalsIgnoreCase("updateContactDetailsCS")) {
            System.out.println("updateContactDetailsCS");
            url = updateContactDetailsCS();

        } else if (action.equalsIgnoreCase("update")) {
            System.out.println("M in Update Action");
            url = updateContact();
        } else if (action.equalsIgnoreCase("expire")) {
            System.out.println("expire");
            url = expire(page);

        } else if (action.equalsIgnoreCase("viewAllComplementary")) {
            System.out.println("viewAllComplementary");
            url = viewAllComplementary();

        } else if (action.equalsIgnoreCase("complementarysubscription")) {
            System.out.println("complementarysubscription");
            url = complementarysubscription();

        } else if (action.equalsIgnoreCase("subscribe")) {
            System.out.println("subscribe");
            url = subscribe();

        } else if (action.equalsIgnoreCase("updateComplsubscriber")) {
            System.out.println("updateComplsubscriber");
            url = updateComplsubscriber();

        } else if (action.equalsIgnoreCase("print")) {
            System.out.println("In print");
            url = print(page);

        } else if (action.equalsIgnoreCase("printCompl")) {
            System.out.println("In printCompl");
            url = printCompl();

        }else if (action.equalsIgnoreCase("viewAllconfirmPrint")) {
            System.out.println("In viewAllconfirmPrint");
            url = viewAllconfirmPrint(page);

        }else if (action.equalsIgnoreCase("confirmPrint")) {
            System.out.println("In confirmPrint");
            url = confirmPrint();

        } else if (action.equalsIgnoreCase("printpreview")) {
            System.out.println("In PrintPreview");
            url = printpreview();

        } else if (action.equalsIgnoreCase("printpreviewCS")) {
            System.out.println("In PrintPreviewCS");
            url = printpreviewCS();

        } else if (action.equalsIgnoreCase("archiveMultiple")) {
            System.out.println("complementarysubscription");
            url = archiveMultiple();

        } else if (action.equalsIgnoreCase("viewAllArchive")) {
            System.out.println("Action is ViewAllArchive");
            url = viewAllArchive();
        } else if (action.equalsIgnoreCase("deleteMultiple")) {
            System.out.println("Action is deleteMultiple");
            url = deleteMultiple();
        } else if (action.equalsIgnoreCase("restore")) {
            System.out.println("Action is restore");
            url = restore();
        } else if (action.equalsIgnoreCase("redirect")) {
            System.out.println("Action is restore");
            url = redirect();
        } else if (action.equalsIgnoreCase("redirectPrint")) {
            System.out.println("Action is redirectPrint");
            url = redirectPrint();
        } else if (action.equalsIgnoreCase("backup")) {
            System.out.println("Action is backup");
            url=backup();
        }else if (action.equalsIgnoreCase("addIssue")) {
            System.out.println("Action is addIssue");
            url=addIssue();
        }else if (action.equalsIgnoreCase("distList")) {
            System.out.println("Action is distList");
           url=distList();
        }else if (action.equalsIgnoreCase("searchby")) {
           
           url=searchBy(page);
        }else if (action.equalsIgnoreCase("searchbycredits")) {
           
           url=searchByCreditS(page);
        }else if (action.equalsIgnoreCase("searchforcompls")) {
           
           url=searchForComplS(page);
        }else if (action.equalsIgnoreCase("searchforcomplsstate")) {
           
           url=searchForComplSState(page);
        }else if (action.equalsIgnoreCase("searchforcomplssubscribedby")) {
           
           url=SearchForComplSSubcribedby(page);
        }else if (action.equalsIgnoreCase("searchbydates")) {
            System.out.println("Action is searchbydates");
           url=searchByDates();
        }else if (action.equalsIgnoreCase("searchbydatescompls")) {
            System.out.println("Action is searchbydates");
           url=searchByDatesComplS();
        }else if (action.equalsIgnoreCase("searchbydatescredits")) {
            System.out.println("Action is searchbydatescredits");
           url=searchByDatesCreditS();
        }else if (action.equalsIgnoreCase("AddContactCreditS")) {
            System.out.println("AddContactCreditS");
            url = AddContactCreditS();
        } else if (action.equalsIgnoreCase("viewAllCreditS")) {
            System.out.println("Action is viewAllCreditS");
            url = viewAllCreditS();
        } else if (action.equalsIgnoreCase("viewDetailsCreditS")) {
            System.out.println("viewDetailsCreditS");
            url = viewDetailsCreditS();

        } else if (action.equalsIgnoreCase("updateContactDetailsCreditS")) {
            System.out.println("updateContactDetailsCreditS");
            url = updateContactDetailsCreditS();

        } else if (action.equalsIgnoreCase("updateCreditS")) {
            System.out.println("updateCreditS");
            url = updateCreditS();

        } else if (action.equalsIgnoreCase("subscribeCredit")) {
            System.out.println("subscribeCredit");
            url = subscribeCredit();

        } else if (action.equalsIgnoreCase("printCredit")) {
            System.out.println("printCredit");
            url = printCredit();

        } else if (action.equalsIgnoreCase("addSubscriber")) {
            System.out.println("addSubscriber");
            url = addSubscriber();

        } 
        return url;
    }

    private String viewAll() {
        new PersonalService(request, response).viewAllPersonal();
        System.out.println("IN action's view all");
        return "viewAll.jsp";
    }

    private String AddContact() {
        if (new PersonalService(request, response).addContact()) {
            return "saved.jsp";
        } else {
            return "notSaved.jsp";
        }
    }

    private String viewDetails() {
        if (new PersonalService(request, response).viewDetailsOfContact()) {
            //return "patientDetails_1.jsp";
            return "contact_details.jsp";
        } else {
            return "viewAll_1.jsp";
        }
    }

    private String updateContactDetails() {
        if (new PersonalService(request, response).viewDetailsOfContact()) {
            String userType = "admin";
            if (userType.equalsIgnoreCase("admin")) {
                System.out.println("M in admin::::::::::MUSAIB " + userType);
                return "updatecontact.jsp";
            } else {
                return "updatememberexecutive.jsp";
            }

        } else {
            return "viewAll.jsp";
        }
    }

    private String updateContact() {
        return "Controller?process=PersonalProcess&action=viewDetails&id=" + new PersonalService(request, response).updateContactInformation();
    }

    private String expire(String page) {
        new PersonalService(request, response).viewAllExpiry(page);
        System.out.println("IN action's viewAllExpiry");
        return "viewAllExpired.jsp";
    }

    private String complementarysubscription() {
        if (new PersonalService(request, response).addcomplementarysubscription()) {
            return "savedCompl.jsp";
        } else {
            return "notSaved.jsp";
        }
    }

    private String viewAllComplementary() {
        new PersonalService(request, response).viewAllCompementary();
        System.out.println("IN action's view all");
        return "viewAllCS.jsp";
    }

    private String print(String page) {
        new PersonalService(request, response).viewAllPrint(page);
        System.out.println("IN action's view all");
        return "printAll.jsp";
    }

    private String printpreview() {
        if (new PersonalService(request, response).printMultiple()) {
            return "printpreview.jsp";
        } else {
            return "printAll.jsp";
        }

    }

    private String archiveMultiple() {
        String hiddenValue = request.getParameter("hiddenChest");
        System.out.println("The Hidden value is "+hiddenValue);
        new PersonalService(request, response).archiveMultiple();
        if(hiddenValue.equals("complsubscriber")){
            return "Controller?process=PersonalProcess&action=viewAllComplementary";
        }else if(hiddenValue.equals("creditsubscriber")){
            return "Controller?process=PersonalProcess&action=viewAllCreditS";
        } else{
             return "Controller?process=PersonalProcess&action=viewAll";
        }
        
    }

    private String viewAllArchive() {
        new PersonalService(request, response).viewAllArchive();
        System.out.println("IN action's view all");
        return "viewAllArchive.jsp";
    }

    private String deleteMultiple() {
        new PersonalService(request, response).deleteMultiple();
        return "Controller?process=PersonalProcess&action=viewAllArchive";
    }

    private String restore() {
        new PersonalService(request, response).restoreMultiple();
        return "Controller?process=PersonalProcess&action=viewAllArchive";
    }

    private String viewDetailsCS() {
        if (new PersonalService(request, response).viewDetailsOfContact()) {
            //return "patientDetails_1.jsp";
            return "contact_details_CS.jsp";
        } else {
            return "viewAll.jsp";
        }
    }

    private String updateContactDetailsCS() {
        if (new PersonalService(request, response).viewDetailsOfContact()) {
            String userType = "admin";
            if (userType.equalsIgnoreCase("admin")) {
                System.out.println("M in admin::::::::::MUSAIB " + userType);
                return "updatecontactCS.jsp";
            } else {
                return "updatecontactCS.jsp";
            }

        } else {
            return "viewAll.jsp";
        }
    }

    private String updateComplsubscriber() {
        return "Controller?process=PersonalProcess&action=viewDetailsCS&id=" + new PersonalService(request, response).updateComplsubscriberContactInformation();
    }

    private String viewAllGo() {
        return "viewAll.jsp";
    }

    private String redirect() {
        return "Search.jsp";
    }

    private String redirectPrint() {
        return "printSearch.jsp";
    }

    private String subscribe() {
        return "Controller?process=PersonalProcess&action=viewDetailsCS&id=" + new PersonalService(request, response).subscribe();
    }

    private String printCompl() {

        new PersonalService(request, response).viewAllPrintCS();
        System.out.println("IN action's view all");
        return "printAllCS.jsp";

    }

    private String printpreviewCS() {
        if (new PersonalService(request, response).printMultiple()) {
            return "printpreviewCS.jsp";
        } else {
            return "printAllCS.jsp";
        }
    }

    private String backup() {
       
        String fileName = request.getParameter("filename");
       if(new PersonalService(request, response).backupData(fileName)){ 
       
        return"BackupSuccess.jsp";
       }else{
           return"BackupFailed.jsp";
       }
    }

    private String confirmPrint() {
       if(new PersonalService(request, response).confirmPrintDelete()){ 
       
        return"confirmPrint.jsp";
       }else{
           return"failConfirmPrint.jsp";
       }
    }

    private String viewAllconfirmPrint(String page) {
        new PersonalService(request, response).viewAllPersonalconfirmPrint(page);
        System.out.println("IN action's view all");
        return "printUpdate.jsp";
    }

    public String executeNextLink(String action, String first) {
        if (action.equalsIgnoreCase("viewAll")) {
            System.out.println("Action is ViewAll");
            url = viewAllNextLink(first);
        }
        return url;
    }

     private String viewAllNextLink(String first) {
       new PersonalService(request, response).viewAllPersonalNextLink(first);
        System.out.println("IN action's view all");
        return "printUpdate.jsp";
    }

    public String executePages(String page) {
        new PersonalService(request, response).viewAllPersonalPage(page);
       
        return "viewAll.jsp";
    }

    private String dashBoard() {
         new PersonalService(request, response).dashBoard();
        System.out.println("IN action's view all");
        return "dashBoard.jsp";
    }

    private String addIssue() {
        new CurrentIssueService(request, response).add();
        System.out.println("IN action's CurrentIssueService");
        return "currentIssueSuccess.jsp";
    }
    
    private String distList() {
        new PersonalService(request, response).distListView();
        System.out.println("IN action's view all");
        return "addContact.jsp";
    }

    private String searchBy(String criteria) {
        new PersonalService(request, response).searchBy(criteria);
        return "printAllSearch.jsp";
    }

    private String searchByDates() {
        new PersonalService(request, response).searchByDates();
        return "printAllSearch.jsp";
    }

    private String AddContactCreditS() {
         if (new PersonalService(request, response).addContactCreditS()) {
            return "saved_Credit.jsp";
        } else {
            return "notSaved.jsp";
        }
    }

    private String viewAllCreditS() {
        new PersonalService(request, response).viewAllCreditS();
        System.out.println("IN action's view all credit");
        return "viewAllCreditS.jsp";
    }

    private String viewDetailsCreditS() {
         if (new PersonalService(request, response).viewDetailsOfContact()) {
            //return "patientDetails_1.jsp";
            return "contact_details_CreditS.jsp";
        } else {
            return "viewAllCreditS.jsp";
        }
    }

    private String updateContactDetailsCreditS() {
        if (new PersonalService(request, response).viewDetailsOfContact()) {
            String userType = "admin";
            if (userType.equalsIgnoreCase("admin")) {
                System.out.println("M in admin::::::::::MUSAIB " + userType);
                return "updatecontactCreditS.jsp";
            } else {
                return "updatecontactCreditS.jsp";
            }

        } else {
            return "viewAllCreditS.jsp";
        }
    }

    private String updateCreditS() {
        return "Controller?process=PersonalProcess&action=viewDetailsCreditS&id=" + new PersonalService(request, response).updateCreditsubscriberContactInformation();
    }

    private String subscribeCredit() {
        return "Controller?process=PersonalProcess&action=viewDetailsCreditS&id=" + new PersonalService(request, response).subscribeCredit();
    }

    private String printCredit() {
         new PersonalService(request, response).viewAllPrintCreditS();
         return "printAllCreditS.jsp";
    }

    private String searchForComplS(String criteria) {
       
        new PersonalService(request, response).searchForComplS(criteria);
        return "printAllCS.jsp";
    
    }

    private String searchByDatesComplS() {
        new PersonalService(request, response).searchByDatesComplS();
        return "printAllCS.jsp";
    }

    private String searchForComplSState(String criteria) {
        new PersonalService(request, response).searchForComplSState(criteria);
        return "printAllCS.jsp";
    }

    private String SearchForComplSSubcribedby(String criteria) {
        new PersonalService(request, response).searchForComplSSubcribedby(criteria);
        return "printAllCS.jsp";
    }

    private String searchByCreditS(String criteria) {
        new PersonalService(request, response).searchByCreditS(criteria);
        return "printAllSearch.jsp";
    }

    private String searchByDatesCreditS() {
        new PersonalService(request, response).searchByDatesCreditS();
        return "printAllSearch.jsp";
    }

    private String addSubscriber() {
       if (new PersonalService(request, response).addSubscriber()) {
            return "addContact.jsp";
        } else {
            return "viewAll.jsp";
        }
    }

    
    
}
