	$(document).ready(function(){
		$("h3#showForm").click(function(){
			$("form#schoolForm").toggle(1000, function() {
			  });
		});
		$("h3#showList").click(function(){
	        $("div#schoolList").toggle("slow", function(){
	        });
	    });

		$("a#all").click( function(){

			$.get("/SchoolService/rest/scholen",function(data) { 
				$("table#scholen").html("");

				$.each(data, function(index, school) {
					console.log(index);
					console.log(school);
					$("table#scholen").append("<tr><td>"  + "</td>"
							+ "<td>" + school.code + " " + school.naam+ " " + school.plaats + " " +  "</td></tr>");
				});

			});
		});

	});