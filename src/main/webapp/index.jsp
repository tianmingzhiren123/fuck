<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<select onchange="selectAll()">
	<option id="ar1" value="0">未选择</option>
	<option id="ar2" value="甘井子">甘井子</option>
	<option id="ar3" value="沙河口">沙河口</option>
	</select>
	<select onchange="selectAll()">
	<option id="ho1" value="0">未选择</option>
	<option id="ho2" value="2厅">2厅</option>
	<option id="ho3" value="3厅">3厅</option>
	<option id="ho4" value="4厅">4厅</option>
	</select>
	<select onchange="selectAll()">
	<option id="pr1" value="0">未选择</option>
	<option id="pr2" value="2000">2000~3000</option>
	<option id="pr3" value="3000">3000~4000</option>
	<option id="pr4" value="4000">4000~5000</option>
	</select>
	<!-- <button onclick="selectAll()" >查找</button> -->
	
	<div id="box1">
	</div>
	
<script>

function selectAll(){
	var sel = document.getElementsByTagName("select")[0];
	var sel1 = document.getElementsByTagName("select")[1];
	var sel2 = document.getElementsByTagName("select")[2];
	var xmlHttp = null;
	if(window.XMLHttpRequest){
		xmlHttp = new XMLHttpRequest();
	}else{
		xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
	}

	xmlHttp.onreadystatechange = function(){
		if(xmlHttp.status == 200 && xmlHttp.readyState == 4){
			var box = document.getElementById("box1");
			box.innerHTML="";
			var houses = eval("("+xmlHttp.responseText +")");
			
			for(var i=0;i<houses.length;i++)
			{
				box.innerHTML += "area="+houses[i]["areA"] +
				",houses="+houses[i]["houseS"]+",PRICE="
				+houses[i]["pricE"]+"<br/>";
			}
		}
	}
	xmlHttp.open("get", "selectAll.do?areA="+sel.value+"&houseS="+sel1.value+"&pricE="+sel2.value, true);
	xmlHttp.send();
}
</script>
</body>
</html>
