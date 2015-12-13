<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
          <script type="text/javascript"
        src="images/jquery-1.11.1.js"></script>
   
 

        <script type="text/javascript">
        
        $(document).ready(function(){
        	  $("button").live("click",function(){
        	    $("p").slideToggle();
        	  });
        	});
        
        $().ready(
        		 function() {
alert("hi");
        		  $('#category_list_d').change(
        		    function() {
        		     $.getJSON('products_ajax', {
        		      categoryId : $(this).val(),
        		      ajax : 'true'
        		     }, function(data) {
        		      var html = '<option value="">Select Product</option>';
        		      var len = data.length;
        		      
        		      for ( var i = 0; i < len; i++) {
        		       html += '<option value="' + data[i].productId + '">'
        		         + data[i].productName + '</option>';
        		      }
        		      html += '</option>';
        		   
        		      $('#product_list_d').html(html);
        		     });
        		    });

        		});
            
            function loadStateFromJSON(JSON){
                clearDD();
                for(var i=0;i<JSON.length;i++){
                    var state=JSON[i];
                    appendState(state.id,state.value);
                }
            }
            function clearDD(){
                $('#stateDD').find('option').remove();
            }
            function appendState(id,state){
                $('#stateDD').append($("<option id='"+id+"'>" + state + "</option>"));
            }
</script>
    </head>
    <body>
   <p>This is a paragraph.</p>
<button>Click me!</button>
<br><br> 
   
<b>Country :</b>
      <select class="select-width" id="category_list_d">
<option value="">Select Category</option> 
  <c:forEach var="l" items="${l}">
   <option value="${l.name}">${l.name }</option>
  </c:forEach>
</select>

<select class="select-width" id="product_list_d">
<option value="">Select Product</option> 
</select>
    </body>
</html>