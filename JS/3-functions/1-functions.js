
//funtion Statement or function declaration

function a() {
    console.log("a is called");
}

// function expression
let b = function () {
    console.log("b is called");
}

// Anonymous function

//when functions are used as value we use anonymous fun
let c = function () {
    console.log("c is called");
}

a();
b();
c();
// Named function expression
let d = function xyz() {
    console.log("xyz is called");
    console.log(xyz);// we can access xyz here
}
// xyz();// error 
d();

// difference b/w Prameter and Arguments?
// Parameter:- Function defination
// Arguments:- Function call

// -------------First Class function-----------
// The ability of function to be used as funtion and can be passed as arguments
// and can be returned from a funtion this is called as Firstclass funtion

//first class citizens
let e = function (fun) {
    console.log("e is called");
    console.log(fun);
}
function s() { }
e(s);

//--------------Arrow function----------

let f = () => {
    console.log('Arrow function')
}