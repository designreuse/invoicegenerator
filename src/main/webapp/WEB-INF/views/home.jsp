<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
  <meta charset="utf-8">
  <title>Anna McGregor's Invoices</title>
  <link rel="stylesheet" href="<c:url value="/resources/burnstudio/style.css" />"/>
  
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
  <script src="<c:url value="/resources/js/slides.min.jquery.js" />"></script>
  
    <link rel="stylesheet" href="<c:url value="/resources/jqgrid/css/style.css"/>"/>
    <link rel="stylesheet" href="<c:url value="/resources/jqgrid/css/redmond/jquery-ui.css"/>"/>
    <link rel="stylesheet" href="<c:url value="/resources/jqgrid/css/redmond/jquery.ui.theme.css"/>"/>
    <link rel="stylesheet" href="<c:url value="/resources/jqgrid/css/jqgrid/ui.jqgrid.css"/>"/>
    
    <script src="http://www.trirand.com/blog/jqgrid/js/i18n/grid.locale-en.js" type="text/javascript"></script>
    <script src="http://www.trirand.com/blog/jqgrid/js/jquery.jqGrid.min.js" type="text/javascript"></script>
    <script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.10.0/jquery-ui.min.js"></script>
  <script type="text/javascript">

        jQuery(document).ready(function () {
            jQuery("#projectTable").jqGrid({
                url: "data/grid/1",
                datatype: "json",
                jsonReader: {repeatitems: false, id: "ref"},
                colNames:['First Name','Last Name', 'Address'],
                colModel:[
                    {name:'firstName',index:'firstName', width:320},
                    {name:'lastName',index:'lastName', width:320},
                    {name:'address',index:'address', width:320}
                ],
                rowNum:20,
                rowList:[20,60,100],
                height:460,
                pager: "#pagingDiv",
                viewrecords: true,
                caption: "Projects"
            });

            $("#pcSelect").change(function(){
                var postcode = $("#pcSelect").val();
                jQuery("#projectTable").jqGrid(
                        "setGridParam",{
                            url:"data/grid/"+ postcode,
                            page:1})
                        .trigger("reloadGrid");
            });
        });
    </script>
	
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
		<div id="slides">
				<div class="borderBottom" style="height: 5em;">
					<div class="borderRight">
						<div class="padding">
							<label>Postcode:</label> <select id="pcSelect">
								<option>1</option>
								<option>2</option>
							</select>
						</div>
					</div>
				</div>
				<div>
					<table id="projectTable"></table>
					<div id="pagingDiv"></div>
				</div>
		</div>
		<!-- end slides -->
		
		<div id="service">
			
				<div id="web">
					<img src="<c:url value="/resources/burnstudio/images/web.png"/>" />
					<h3>New <strong><span class="green">Invoices</span></strong></h3>	
					<p>Create your new invoices, just from here.</p>
					<p><a href="#" class="readmore">New Invoice</a></p>
				</div><!-- end web -->
				
				<div id="vector">
					<img src="<c:url value="/resources/burnstudio/images/vector.png"/>" />
					<h3>Future <strong><span class="green">functionality</span></strong></h3>	
					<p>Reserved for futures changes</p>
					<p><a href="#" class="readmore">nothing here</a></p>
				</div><!-- end vector -->
		
		</div><!-- end service-->
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
