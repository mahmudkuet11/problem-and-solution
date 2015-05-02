$(".edit_seat_plan").click(function(e){
	if($(e.target).is('.single_seat')){
		$(this).draggable();
	}else{
		var posX = e.pageX - $(this).offset().left - 15;
		var posY = e.pageY - $(this).offset().top - 15;
		var new_seat = $("<div class=\"single_seat\" style=\"position:absolute;top:"+ posY +"px;left:"+ posX +"px;\">1</div>").draggable().resizable();
		$(this).append(new_seat);
	}
	
});