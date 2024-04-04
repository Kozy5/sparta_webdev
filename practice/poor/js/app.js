const mainbtn = document.querySelector("#main-button");
const hragentbtn = document.querySelectorAll(".partner-button");
const plusmenubtn = document.querySelectorAll(".powerup-button");
const money = document.querySelector("#money-box h5");
const partnerbox = document.querySelector("#partner-box");
const dangermsg = document.querySelector(".danger-message");
var peerage = document.querySelector("#peerage");


setInterval(begging, 1000);

var moneyauto = 1;
var moneycliced = 100;
var moneyDefault = 0;
var intervalValue = 1000;

function begging() {
  moneyDefault += moneyauto;
  money.innerText = moneyDefault;
}

function directBegging() {
  moneyDefault += moneycliced;
  money.innerText = moneyDefault;
}

function addClassHidden() {
  dangermsg.classList.add("hidden")
}
function plusHrAgent(event) {
  event.preventDefault();
  var buymoney = parseInt(event.target.id);
  var plusAutoMoney = parseInt(event.target.parentElement.id);
  var ptnname = event.target.parentElement.parentElement.firstElementChild.innerHTML;
  if (moneyDefault >= buymoney) {
    moneyDefault -= buymoney;
    money.innerText = moneyDefault;
    moneyauto += plusAutoMoney;
    var temp = document.createElement("h4")
    temp.innerHTML = ptnname
    temp.classList.add("addparteners")
    partnerbox.append(temp)
    event.target.parentElement.parentElement.classList.add("hidden");
  } else {
    dangermsg.classList.remove("hidden");
    setTimeout(addClassHidden,2000);
  }
}

function plusMenu(event) {
  event.preventDefault();
  var buymoney = parseInt(event.target.id);
  var plusmenuvalue = parseInt(event.target.parentElement.id);
  if (moneyDefault >= buymoney) {
    moneyDefault -= buymoney;
    money.innerText = moneyDefault;
    moneycliced += plusmenuvalue;
    event.target.parentElement.parentElement.classList.add("hidden");
  } else {
    dangermsg.classList.remove("hidden");
    setTimeout(addClassHidden,2000);
  }
}

mainbtn.addEventListener("click", directBegging);

hragentbtn.forEach.call(hragentbtn, function (col) {
  col.addEventListener("click", plusHrAgent);
});

plusmenubtn.forEach.call(plusmenubtn, function (col) {
  col.addEventListener("click", plusMenu);
});

function peerageChange(Changepeerage) {
  peerage.innerText = Changepeerage;
}
function peerageChangefun(){
  if(money.innerText >= 0 && money.innerText < 999){
    peerageChange("첼자르");
  }else if(money.innerText > 1000 && money.innerText < 4999){
    peerageChange("주급 도둑");
  }else if(money.innerText > 5000 && money.innerText < 9999){
    peerageChange("햄버거먹다 5000억");
  }else if(money.innerText > 10000 && money.innerText < 50000){
    peerageChange("햄버거먹고 조를 벌어본");
  }else{
    peerageChange("황제");
  }
}


setInterval(peerageChangefun,1000);




