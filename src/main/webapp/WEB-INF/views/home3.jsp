<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<meta charset="utf-8">
<head>
    <title>Jeeni Software - jqGrid Example</title>

    <link rel="stylesheet" href="<c:url value="/resources/jqgrid/css/style.css"/>"/>
    <link rel="stylesheet" href="<c:url value="/resources/jqgrid/css/redmond/jquery-ui.css"/>"/>
    <link rel="stylesheet" href="<c:url value="/resources/jqgrid/css/redmond/jquery.ui.theme.css"/>"/>
    <link rel="stylesheet" href="<c:url value="/resources/jqgrid/css/jqgrid/ui.jqgrid.css"/>"/>
    

    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.4.4/jquery.min.js" type="text/javascript"></script>
    <script src="http://www.trirand.com/blog/jqgrid/js/i18n/grid.locale-en.js" type="text/javascript"></script>
    <script src="http://www.trirand.com/blog/jqgrid/js/jquery.jqGrid.min.js" type="text/javascript"></script>
    <script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.10.0/jquery-ui.min.js"></script>

    <script type="text/javascript">

        jQuery(document).ready(function () {

            jQuery("#projectTable").jqGrid({
                url: "data/grid/BS21 7RH",
                datatype: "json",
                jsonReader: {repeatitems: false, id: "ref"},
                colNames:['First Name','Last Name', 'Address'],
                colModel:[
                    {name:'firstName',index:'firstName', width:100},
                    {name:'lastName',index:'lastName', width:100},
                    {name:'address',index:'address', width:500}
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
</head>
<body>

<div class="centreDiv">
    <div class="heading">jqGrid - Jeeni Software</div>

    <div class="floatLeftDiv">
        <div class="borderBottom" style="height:5em;">
            <div class="floatLeftDiv borderRight">
                <div class="padding">
                    <label>Postcode:</label>
                    <select id="pcSelect">
                        <option>BS21 7RH</option>
                        <option>BS1 8QT</option>
                    </select>
                </div>
            </div>
        </div>
        <div>
            <table id="projectTable"></table>
            <div id="pagingDiv"></div>
        </div>
    </div>

</div>

</body>
</html>
