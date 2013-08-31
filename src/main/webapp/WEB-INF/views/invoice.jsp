<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
  <meta charset="utf-8">
  <title>Anna McGregor's Invoices</title>


  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
  <script src="<c:url value="/resources/js/slides.min.jquery.js" />"></script>
    <script src="<c:url value="/resources/bootstrap/datepicker/js/bootstrap-datepicker.js" />"></script>
  
    <link rel="stylesheet" href="<c:url value="/resources/burnstudio/style.css" />"/>
    <link rel="stylesheet" href="<c:url value="/resources/jqgrid/css/style.css"/>"/>
    <link rel="stylesheet" href="<c:url value="/resources/jqgrid/css/redmond/jquery-ui.css"/>"/>
    <link rel="stylesheet" href="<c:url value="/resources/jqgrid/css/redmond/jquery.ui.theme.css"/>"/>
    <link rel="stylesheet" href="<c:url value="/resources/jqgrid/css/jqgrid/ui.jqgrid.css"/>"/>
    
    <link rel="stylesheet" href="<c:url value="/resources/bootstrap/css/bootstrap.css"/> "/>
    <link rel="stylesheet" href="<c:url value="/resources/bootstrap/css/bootstrap-responsive.css"/> "/>
    <link rel="stylesheet" href="<c:url value="/resources/bootstrap/datepicker/css/datepicker.css"/> "/>
  
	<!--[if IE]>
	<script type="text/javascript">
	(function(){
	var html5elmeents = "address|article|aside|audio|canvas|command|datalist|details|dialog|figure|figcaption|footer|header|hgroup|keygen|mark|meter|menu|nav|progress|ruby|section|time|video".split('|');
	for(var i = 0; i < html5elmeents.length; i++){
	document.createElement(html5elmeents[i]);
	}
	}
	)();
	</script>
	<![endif]-->
	
	<script type="text/javascript" src="http://jzaefferer.github.com/jquery-validation/jquery.validate.js"></script>
	  <script type="text/javascript">
	  $(document).ready(function(){
			$('#registerHere input').hover(function()
			{
			$(this).popover('show');
		});
			$('#date').datepicker({
				  format: 'dd/mm/yyyy'
				});
			
		
			
			
			$("#registerHere").validate({
				rules:{
					date:"required",
					company:"required",
					id: "required",
					rate: {
						required:true,
						number:true						
					},
					typeRate:"required",
					paymentRate: {
						required:true,
						number:true						
					}
				},
				messages:{
					date:"Enter invoice date",
					company:"Enter company name",
					id:"Enter ID",
					rate:"Enter rate, only numbers",
					paymentRate:"Enter rate, only numbers",
					cpwd:{
						required:"Enter confirm password",
						equalTo:"Password and Confirm Password must match"
					},

				},
				errorClass: "help-inline",
				errorElement: "span",
				highlight:function(element, errorClass, validClass) {
					$(element).parents('.control-group').addClass('error');
				},
				unhighlight: function(element, errorClass, validClass) {
					$(element).parents('.control-group').removeClass('error');
					$(element).parents('.control-group').addClass('success');
				}
			});
			
			
		});
	  </script>
	  
	  <script type="text/javascript">
	    $('.datepicker').datepicker();
		
		$(function() {
			var addDiv = $('#addinput');
			var i = $('#addinput p').size() + 1;
			
			$('#addNew').live('click', function() {
			$('<p>Date Worked: <input type="text" class="datepicker" id="p_daysCompleted'+ i +'" name="daysCompleted[]" value="" placeholder="dd/mm/yyyy" /> </br>' +
			   'Description: <input type="text" class="input-xlarge" id="p_desc'+ i +'" name="description[]" placeholder="Graphic Design Services"></br>'+
			   'Hours/Units <input type="text" class="input-xlarge" id="p_quantityTime'+ i +'" name="quantityTime[]" placeholder="Amount of Time or Units"></br>' +
			   '<a href="#" id="remNew">Remove</a></p>').appendTo(addDiv);
			
			i++;
			
			return false;
			});
			
			$('#remNew').live('click', function() {
			if( i > 2 ) {
			$(this).parents('p').remove();
			i--;
			}
			return false;
			});
		});
</script>
	
</head>

<body>
	<div id="header-wrap">
		<header class="group">
			<h2><a href="/home" title="Anna McGregor">Anna McGregor</a></h2>
			<div id="call">
			<h3>Anna McGregor</h3>
				<h4 class="green"><strong>Invoices</strong></h4>
			
			</div><!-- end call -->
			<nav class="group">
				<ul>
					<li class="home"><a href="#" title="">Home</a></li>
					<li><a href="#" title="">New Invoice</a></li>
					<li><a href="#" title=""></a></li>
					<li><a href="#" title=""></a></li>
					<li class="last">
						<div>
						</div>
					</li>
				</ul>
			</nav>
		</header>
	</div><!-- end header wrap -->
	
	
<div id="container">
		<div class="row">
	
	
  <div class="span8">
	<div class="alert alert-success">
	  Hola! Insert the information and create your Invoice.
	</div>

	<form class="form-horizontal" id="registerHere" method='get' action='createInvoice'>
	  <fieldset>
	    <legend>Creation New Invoice</legend>
	      <div class="control-group">
	      <label class="control-label" for="input01">Invoice ID</label>
	      <div class="controls">
	        <input type="text" class="input-xlarge" id="id" name="id" rel="popover" data-content="Enter ID ." data-original-title="LA100">
		  </div>
	    </div>
	
	   <div class="control-group">
	      <label class="control-label" for="input01">Date</label>
	      <div class="controls">
	        <input type="text" class="input-xlarge" id="date" name="date" rel="popover" data-content="Enter invoice date." data-original-title="dd/mm/yyyy">
	        
	      </div>
	</div>
	  <div class="control-group">
	      <label class="control-label" for="input01">Company</label>
	      <div class="controls">
	        <input type="text" class="input-xlarge" id="company" name="company" rel="popover" data-content="Enter company name." data-original-title="Landor">
	        
	      </div>
	</div>
	
	
	 <div class="control-group">
		<label class="control-label" for="input01">Rate</label>
	      <div class="controls">
	        <input type="text" class="input-xlarge" id="rate2" name="rate" rel="popover" data-content="Rate per hour or units" data-original-title="Only numbers Ex. (7.5, 1 )">
	       
	      </div>
	</div>
	
	<div class="control-group">
		<label class="control-label" for="input01">Rate Type</label>
	      <div class="controls">
	        <select name="typeRate" id="typeRate" >
            				<option value="">Type Rate</option>
			                <option value="hour">Hour</option>
			                <option value="day">Day</option>
			</select>
	       
	      </div>
	
	</div>
	
	
	  <div class="control-group">
	      <label class="control-label" for="input01">Payment Term</label>
	      <div class="controls">
	        <input type="text" class="input-xlarge" id="paymentTerm" name="paymentTerm" rel="popover" data-content="Payment Term." data-original-title="30">
	        
	      </div>
	</div>
	
	<div class="control-group">
		<label class="control-label" for="input01">Work Done</label>
	      <div class="controls">
	     	 <div id="addinput">
				<p>
				<a href="#" id="addNew">Add</a>
				</p>
			</div>
			    
	      </div>
	</div>
	
	
	<div class="control-group">
		<label class="control-label" for="input01"></label>
	      <div class="controls">
	       <button type="submit" class="btn btn-success" rel="tooltip" title="first tooltip">Create Invoice</button>
	       
	      </div>
	
	</div>
	
	
	   
	  </fieldset>
	</form>
	</div>
	
		</div>
        
        
          </div><!--/row-->
        </div><!--/span-->

	</div> <!--! end container -->
	
	<div id="widget-wrap" class="group">
		<div id="widget">
			<div id="links" class="group">
				<h4 class="white">Other<strong>Links</strong></h4>
				<ul>
					<li><a href="#">www.annamcgregor.com.au</a></li>
					<li><a href="#">www.hueandawe.com</a></li>
				</ul>
			</div>
			
			<div id="blog">
			</div><!-- end blog -->
			
			<div id="location">
			</div><!-- end location -->
		</div><!-- end widget -->
	</div> <!--! end widget-wrap -->
	
	<footer class="group">
		<div id="footer-left">
			<p>Copyright <a href="#" class="green">Love Design</a> </br>
			Designed by <a href="#" class="green">Alvaro :)</a></p>
		</div>
		
		<div id="footer-right">
			<ul>
				<li><a href="#">New Invoice</a></li>
				<li><a href="#"></a></li>
				<li><a href="#"></a></li>
				<li><a href="#"></a></li>
				<li><a href="#"></a></li>
			</ul>
		</div>
				
		<a href="#header-wrap"><img src="<c:url value="/resources/burnstudio/images/back-top.png"/>" alt="back-top" class="back-top" /></a>		
	</footer>

</body>
</html>
