checkoutdiv.style.display = "none"

var x = document.getElementsByClassName("product");

x[0].onmouseover = myfunction1;
x[1].onmouseover = myfunction2;
x[2].onmouseover = myfunction3;

var countItems = 0;

function myfunction1() {
	var i = Math.floor((Math.random() * 3) + 1);
	x[0].firstElementChild.src = "laptops/apple/apple" + i + ".jpg";
}

function myfunction2() {
	var i = Math.floor((Math.random() * 3) + 1);
	x[1].firstElementChild.src = "laptops/dell/dell" + i + ".jpg";
}

function myfunction3() {
	var i = Math.floor((Math.random() * 3) + 1);
	x[2].firstElementChild.src = "laptops/hp/hp" + i + ".jpg";
}

x[0].onclick = myfunction11;
x[1].onclick = myfunction22;
x[2].onclick = myfunction33;

function myfunction11() {
	countItems++;
	// to check if no items message is present
	if (document.getElementById("noItemMsg"))
		document.getElementById("noItemMsg").remove();
	var p = x[0].children[1];
	var p1 = document.createElement("input")
	p1.setAttribute("type", "number")
	var p2 = document.createElement("img")
	p2.setAttribute("id", "cancelItem")
	p2.setAttribute("src", "images/invalid.png")
	var xt = document.getElementById("cart-content")
	var li = document.createElement("li")
	li.appendChild(p2);
	li.appendChild(document.createTextNode(p.childNodes[1].innerHTML + " "
			+ x[0].children[2].innerHTML))
	li.appendChild(p1);
	xt.firstElementChild.appendChild(li);
	p2.addEventListener("click", function() {
		var t = p2.parentNode;
		xt.firstElementChild.removeChild(t);
		countItems--;
		console.log(countItems)
		if (countItems == 0) {
			var li = document.createElement("li")
			var label = document.createElement("label")
			label.setAttribute("id", "noItemMsg");
			label.appendChild(document
					.createTextNode("You have no items in your cart."))
			li.appendChild(label)
			xt.appendChild(label)
		}
	}, true)

}

function myfunction22() {
	countItems++;
	if (document.getElementById("noItemMsg"))
		document.getElementById("noItemMsg").remove();
	var p = x[1].children[1];
	var p1 = document.createElement("input")
	p1.setAttribute("type", "number")
	var p2 = document.createElement("img")
	p2.setAttribute("id", "cancelItem")
	p2.setAttribute("src", "images/invalid.png")

	var xt = document.getElementById("cart-content")
	var li = document.createElement("li")
	li.appendChild(p2);
	li.appendChild(document.createTextNode(p.childNodes[1].innerHTML + " "
			+ x[1].children[2].innerHTML))
	li.appendChild(p1);
	xt.firstElementChild.appendChild(li);
	p2.addEventListener("click", function() {

		var t = p2.parentNode;
		xt.firstElementChild.removeChild(t);
		countItems--;
		console.log(countItems)
		if (countItems == 0) {
			var li = document.createElement("li")
			var label = document.createElement("label")
			label.setAttribute("id", "noItemMsg");
			label.appendChild(document
					.createTextNode("You have no items in your cart."))
			li.appendChild(label)
			xt.appendChild(label)
		}
	}, true)

}

function myfunction33() {
	countItems++;
	if (document.getElementById("noItemMsg"))
		document.getElementById("noItemMsg").remove();
	var p = x[2].children[1];
	var p1 = document.createElement("input")
	p1.setAttribute("type", "number")
	var p2 = document.createElement("img")
	p2.setAttribute("id", "cancelItem")
	p2.setAttribute("src", "images/invalid.png")

	var xt = document.getElementById("cart-content")
	var li = document.createElement("li")
	li.appendChild(p2);
	li.appendChild(document.createTextNode(p.childNodes[1].innerHTML + " "
			+ x[2].children[2].innerHTML))
	li.appendChild(p1);
	xt.firstElementChild.appendChild(li);
	p2.addEventListener("click", function() {

		var t = p2.parentNode;
		xt.firstElementChild.removeChild(t);
		countItems--;
		console.log(countItems)
		if (countItems == 0) {
			var li = document.createElement("li")
			var label = document.createElement("label")
			label.setAttribute("id", "noItemMsg");
			label.appendChild(document
					.createTextNode("You have no items in your cart."))
			li.appendChild(label)
			xt.appendChild(label)
		}
	}, true)

}
document.getElementById("remove").onclick = removeItems;

function removeItems() {
	if (!document.getElementById("noItemMsg")) {
		var xt = document.getElementById("cart-content").firstElementChild
		while (xt.hasChildNodes()) {
			xt.removeChild(xt.lastChild);
		}
		countItems = 0;
		console.log(countItems)
		var li = document.createElement("li")
		var label = document.createElement("label")
		label.setAttribute("id", "noItemMsg");
		label.appendChild(document
				.createTextNode("You have no items in your cart."))
		li.appendChild(label)
		xt.appendChild(li)
	}

}

document.getElementById("checkout").onclick = checkOut;
function checkOut() {

	checkoutdiv.style.display = "block"

}

document.getElementById("submit").onclick = getDetails;

function getDetails() {
	checkoutdiv.style.display = "none"
	xmlhttp = new XMLHttpRequest();

	var url = "jsp/userDetails.jsp";
	var uid = document.getElementById('txtUserName').value;
	var pwd = document.getElementById('txtPwd').value;
	xmlhttp.open("POST", url, true);
	xmlhttp.setRequestHeader("Content-Type",
			"application/x-www-form-urlencoded");

	xmlhttp.onreadystatechange = handleResponse;

	var data = "name=" + uid + "&pwd=" + pwd;
	xmlhttp.send(data);
}

function handleResponse() {
	if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
		var response = JSON.parse(xmlhttp.responseText);
		alert("Your order will reach at " + response.Delivery_City
				+ " You have chosen your payment mode to  "
				+ response.Payment_mode)
	}
}
