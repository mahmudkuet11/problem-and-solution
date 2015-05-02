	function seat(name,price){
		this.name = name;
		this.price = price;
	}
	var a = [];
	a[0] = new seat("1","100");
	a[1] = new seat("2","200");
	alert(JSON.stringify(a));