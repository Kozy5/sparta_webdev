const mainbutton = document.querySelector("#main-button")
const goyongbutton = document.querySelectorAll(".partner-button")
const powerbutton = document.querySelectorAll(".powerup-button")
const money = document.querySelector("#money-box h5")
setInterval(gugul,1000)
var moneyauto = 1
var moneycliced = 10
var moneyDefault = 0
var intervalValue = 1000


function gugul(){
    
    moneyDefault += moneyauto
    money.innerText = moneyDefault;
}

function directGugul(){
    moneyDefault += moneycliced
    money.innerText=moneyDefault;
}
function buyPowerUpAuto(event){
    event.preventDefault();
    var gumaemoney = parseInt(event.target.innerHTML)
    var chodang = parseInt(event.target.parentElement.id)
    if(moneyDefault >= gumaemoney){
        moneyDefault -= gumaemoney
    money.innerText = moneyDefault;
    moneyauto = chodang
    }else{
        alert("돈이 부족하네요")
    }
}

function buyPowerUpClick(event){
    event.preventDefault();
    var gumaemoney = parseInt(event.target.innerHTML)
    var powervalue = parseInt(event.target.parentElement.id)
    if(moneyDefault >= gumaemoney){
        moneyDefault -= gumaemoney
    money.innerText = moneyDefault;
    moneycliced = powervalue
    }else{
        alert("돈이 부족하네요")
    }
}

mainbutton.addEventListener("click",directGugul);
goyongbutton.forEach.call(goyongbutton,function(col){ 
	col.addEventListener("click",buyPowerUpAuto); 
}); 
powerbutton.forEach.call(powerbutton,function(col){ 
	col.addEventListener("click",buyPowerUpClick); 
}); 

