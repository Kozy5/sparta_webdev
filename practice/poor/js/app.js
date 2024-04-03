const mainbtn = document.querySelector("#main-button");
const hragentbtn = document.querySelectorAll(".partner-button");
const plusmenubtn = document.querySelectorAll(".powerup-button");
const money = document.querySelector("#money-box h5");
const partnerbox = document.querySelector("#partner-box");
const dangermsg = document.querySelector(".danger-message");

setInterval(begging, 1000);

var moneyauto = 1;
var moneycliced = 1;
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
