var btn = document.createElement("BUTTON");        // Create a <button> element
var t = document.createTextNode("See Reviews");       // Create a text node
var asinText = document.createElement("INPUT");
asinText.setAttribute("type", "text");
asinText.setAttribute("value", "<Type asin ID here>");
document.body.appendChild(asinText);

// btn.addEventListener("click", myFunction);
btn.addEventListener("click", requestReviews);

function myFunction() {
    $.get('hello', function(data) {
    	document.getElementById("demo").innerHTML = data;
        alert(data);	
    });
}

function requestReviews()
{
    $.post("hello",
    {
      asin: asinText.value,
    },
    function(data, status){
        // alert("Data: " + data + "\nStatus: " + status);
        document.getElementById("demo").innerHTML = data;
    });
}


btn.appendChild(t);                                // Append the text to <button>
document.body.appendChild(btn);                    // Append <button> to <body>