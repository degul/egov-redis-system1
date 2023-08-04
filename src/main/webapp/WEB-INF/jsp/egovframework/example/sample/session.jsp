<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ page import="java.util.Date"%>
<%

        out.println("<br><h3>Session Informations</h3>");
        out.println("<table border=\"0\" cellpadding=\"5\">");
        out.println("<tr><td bgcolor=\"#FFFFFF\"><b>HttpSession APIs</b></td><td></td></tr>");
        out.println("<tr><td bgcolor=\"#B0E2FF\">Session ID</td><td>");
        out.println(session.getId() + "</td></tr>");
        out.println("<tr><td bgcolor=\"#B0E2FF\">Creation Time</td><td>");
        out.println(new Date(session.getCreationTime()) + "</td></tr>");
        out.println("<tr><td bgcolor=\"#B0E2FF\">Last Access Time</td><td>");
        out.println(new Date(session.getLastAccessedTime()) + "</td></tr>");
        out.println("<tr><td bgcolor=\"#B0E2FF\">is New</td><td>");
        out.println(session.isNew() + "</td></tr>");
        out.println("<tr><td bgcolor=\"#B0E2FF\">Max Inactive Interval(seconds)</td><td>");
        out.println(session.getMaxInactiveInterval() + "</td></tr>");
        out.println("<tr><td bgcolor=\"#B0E2FF\">request.getRemoteAddr</td><td>");
        out.println(request.getRemoteAddr() + "</td></tr>");
        out.println("<tr><td bgcolor=\"#B0E2FF\">request.getLocalAddr</td><td>");
        out.println(request.getLocalAddr() + "</td></tr>");
        out.println("<tr><td bgcolor=\"#B0E2FF\">request.getLocalPort</td><td>");
        out.println(request.getLocalPort() + "</td></tr>");

        request.setCharacterEncoding("utf-8");

        out.println("sess idKey: " + session.getAttribute("idKey") + "</br>");
        out.println("userVO: " + session.getAttribute("userVO").toString() );
        session.setAttribute("idKey", "AAA");	//session 속성은 어느 Servlet파일에서든 유효함 (request로 담으면 그 파일에서만 유효)
        
        session.setMaxInactiveInterval(100);

%>