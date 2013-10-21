$(function() {
	$("#login").click(function() {
		/*var mydata = {
				name : "Yuerwu",
				age : 20
		};*/
		$.ajax({
			type : 'POST',
			contentType : 'application/json',
			url : 'http://localhost:8083/GuzzMavenEmptyProject/userController/helloWorld.do',
			processData : false,
			dataType : 'json',
			//data : JSON.stringify(mydata),
			data : '{"name":"' + $('#name').val() + '","id":"'  
			            + $('#id').val() + '","status":"' + $('#status').val() + '"}',
			success : function(data) {
				console.log(data);
			},
			error : function() {
				alert('Err...');
			}
		});
	});
});