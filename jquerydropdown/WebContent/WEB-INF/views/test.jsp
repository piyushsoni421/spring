<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<title>jQuery select / dropdown box example</title>
 
<script type="text/javascript"
        src="images/jquery-1.11.1.js"></script>
 
</head>


 
<script type="text/javascript" >
 
  $(document).ready(function(){
 
    $("#isSelect").click(function () {
 
	alert($('#country').val());
 
    });
 
    $("#selectChina").click(function () {
 
	$("#country").val("China");
 
    });
 
    $("#selectUS").click(function () {
 
	$("#country").val("United State");
 
    });
 
    $("#selectMalaysia").click(function () {
 
	$("#country").val("Malaysia");
 
    });
 
    $("#disableUS").click(function () {
 
	$("#country option[value='United State']").attr("disabled", true);
 
    });
 
    $("#enableUS").click(function () {
 
	$("#country option[value='United State']").attr("disabled", false);
 
    });
 
  });
</script>

 
<h1>jQuery select / dropdown box example</h1>
<body>
 
<select id="country">
<option value="None">-- Select --</option>
<option value="China">China</option>
<option value="United State">United State</option>
<option value="Malaysia">Malaysia</option>
</select>
 
<br/>
<br/>
<br/>
 
<input type='button' value='Display Selected' id='isSelect'>
<input type='button' value='Select China' id='selectChina'>
<input type='button' value='Select US' id='selectUS'>
<input type='button' value='Select Malaysia' id='selectMalaysia'>
<input type='button' value='Disable US' id='disableUS'>
<input type='button' value='Enable US' id='enableUS'>
</body>
</html>