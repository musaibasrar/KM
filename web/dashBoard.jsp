<%-- 
    Document   : notSaved
    Created on : Jan 5, 2012, 1:11:53 PM
    Author     : Mayur
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dash Board</title>
        <style type="text/css" title="currentStyle">
            @import "css/dataTable/css/demo_page.css";
            @import "css/dataTable/css/jquery.dataTables.css";
        </style>
        <link rel="stylesheet" href="css/datePicker/jquery-ui-1.8.17.custom.css">
        <link rel="stylesheet" href="css/datePicker/demos.css">
        <!--<script type="text/javascript" language="javascript" src="js/dataTable/jquery.js"></script>-->
        <script type="text/javascript" src="js/datePicker/jquery-1.7.1.js"></script>
        <script type="text/javascript" language="javascript" src="js/dataTable/jquery.dataTables.js"></script>
        <script type="text/javascript" src="js/datePicker/ui/jquery-ui-1.8.17.custom.js"></script>
        <script type="text/javascript" src="js/datePicker/ui/jquery.ui.core.js"></script>
        <script type="text/javascript" src="js/datePicker/ui/jquery.ui.widget.js"></script>
        <script type="text/javascript" src="js/datePicker/ui/jquery.ui.button.js"></script>
        
        
        
        
        <style type="text/css">
<!--
.divCSS {
	height: 40px;
	width: 200px;
	border: 1px solid #305876;
	
}
.tableCSS {
	background-position: center center;
	vertical-align: middle;
	height: 140px;
	width: 100%;
}
.style1 {
	font-family: Tahoma;
	font-weight: bold;
	color: #5E87B0;
        font-size: 12px;
}
.style2 {
	font-size: 12px;
	color: #000000;
}
-->
        </style>

        <script type="text/javascript">
            $(function(){
                $("#view").button()
                
                $("#addnew").button()

                });

            function ViewAll(){
                var form1=document.getElementById("form1");
                form1.action="Controller?process=PersonalProcess&action=viewAll";
                form1.submit();
            }
        </script>
</head>
    <body background="images/bg.jpg" >
        <form id="form1" method="post">
            
          <!--  <table height="462" class="tableCSS"  >
    <tr>
        <td height="250" align="center" valign="middle"><p class="style1"> Registration Successful</p>
        <p class="style1">
            <label>${noOfRecordsOfSubscribers}</label>
            <input type="button" id="view" value="View All " onClick="ViewAll()">
            <input type="button" value="Add New" id="addnew" onClick="JavaScript:window.location='addContact.jsp';">
        </p></
            </table> -->
            
      <div align="center">
          <label   style="font-family: Tahoma;
	font-weight: bolder;
	color: #383838;
        font-size: 20px;"> DASH BOARD </label> 
          <br/><br/>
          <table  border="0" cellpadding="10">
  <tr>
      <td align="right" valign="middle"><p class="style1">Total Number Of Subscribers</p> </td>
    <td align="center" valign="middle"><p class="style1">${noOfRecordsOfSubscribers}</td>
  </tr>
  
  <tr>
    <td align="right" valign="middle"><p class="style1">Total Number Of Complimentary Subscribers</p></td>
    <td align="right" valign="middle"><p class="style1">${noOfRecordsOfComplSubscribers}</p></td>
  </tr>
   <tr>
    <td align="right" valign="middle"><p class="style1">Total Number Of Credit Subscribers</p></td>
    <td align="right" valign="middle"><p class="style1">${noOfCreditSubscribers}</p></td>
  </tr>
  
  <tr>
    <td align="right" valign="middle"><p class="style1">Total Number Of Expiring Subscribers</p></td>
    <td align="right" valign="middle"><p class="style1">${noOfRecordsOfExpiringSubscribers}</p></td>
  </tr>
  <tr>
    <td align="right" valign="middle"><p class="style1">Total Number Of Executives</p></td>
    <td align="right" valign="middle"><p class="style1">${noOfExecutives}</p></td>
  </tr>
  <tr>
    <td align="right" valign="middle"><p class="style1">Total Number Of Archive Items</p></td>
    <td align="right" valign="middle"><p class="style1">${noOfArchive}</p></td>
  </tr>
</table>
</div>
            </form>
    </body>
</html>
