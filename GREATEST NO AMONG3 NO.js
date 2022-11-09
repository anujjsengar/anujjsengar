var a=prompt("enter first number");
var b=prompt("enter second no.");
var c=prompt("enter third no");
var a=parseInt(a);
var b=parseInt(b);
var c=parseInt(c);
if (a>b>c){
    alert("greatest no is",a);
}
if (a<b>c){
    alert("greatest no is",b);
}
else {
    alert("greatest no is",c);
}
