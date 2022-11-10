var a=prompt("enter first side");
var b=prompt("enter second side");
var c=prompt("enter third side");
var a=Number(a);
var b=Number(b);
var c=Number(c);
if (a+b>c & a+c>b & b+c>a){
  alert("its triangle");
}
else{
  alert("not a triangle");
}
