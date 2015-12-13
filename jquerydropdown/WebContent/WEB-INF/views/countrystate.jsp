<%
       <@ page import="java.util.LinkedHashSet" >
       <@ page import="java.util.LinkedHashMap" >
       <@ page import="org.json.model.HTMLOption" >
       <%
        System.out.println("CountryID-----------"+request.getParameter("countryId"));
        response.setContentType("text/javascript");
        response.addHeader("Content-Disposition", "attachment; filename="
          + "states.js");
        LinkedHashSet statesSet = new LinkedHashSet<htmloption>();
        statesSet.add(new HTMLOption("1", "Kerala"));
        statesSet.add(new HTMLOption("2","Karnataka"));
        statesSet.add(new HTMLOption("3", "Delhi"));
        System.out.println("Linked Hash Map:"+statesSet);
        out.println(statesSet);
%>
</htmloption>