const mainbutton = document.querySelector("#main-button")
const goyongbutton = document.querySelectorAll("#store-detail-list > div > div > button")
const money = document.querySelector("#money-box h5")
setInterval(gugul,1000)

var moneyDefault = 0
var intervalValue = 1000

function gugul(){
    
    moneyDefault += 1
    money.innerText = moneyDefault;
}

function gumae(event){
    event.preventDefault();
    var gumaemoney = parseInt(event.target.innerHTML)
    var chodang = parseInt(event.target.parentElement.id)
    if(moneyDefault >= gumaemoney){
        moneyDefault -= gumaemoney
    money.innerText = moneyDefault;
    setInterval(gugul,chodang)
    }else{
        alert("돈이 부족하네요")
    }
}
mainbutton.addEventListener("click",gugul);
goyongbutton.forEach.call(goyongbutton,function(col){ 
	col.addEventListener("click",gumae); 
}); 
