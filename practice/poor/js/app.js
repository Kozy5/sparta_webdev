const mainbtn = document.querySelector("#main-button");
const hragentbtn = document.querySelectorAll(".partner-button");
const plusmenubtn = document.querySelectorAll(".powerup-button");
const money = document.querySelector("#money-box h5");
const partnerbox = document.querySelector("#partner-box");
const dangermsg = document.querySelector(".danger-message");
var peerage = document.querySelector("#peerage");


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

function peerageChange(Changepeerage) {
  peerage.innerText = Changepeerage;
}
peerageChange("첼자르");
function peerageChangefun(){
  if(money.innerText >= 0 && money.innerText < 10){
    peerageChange("첼자르");
  }else if(money.innerText > 11 && money.innerText < 99){
    peerageChange("맥너겟 도둑");
  }else if(money.innerText > 100 && money.innerText < 299){
    peerageChange("맥도날드 좀 먹어본");
  }else if(money.innerText > 300 && money.innerText < 499){
    peerageChange("맥도날드에서 스카웃 제의가 온");
  }else if(money.innerText > 500 && money.innerText < 999){
    peerageChange("쓰루패스식 드라이브 쓰루");
  }else if(money.innerText > 1000 && money.innerText < 2999){
    peerageChange("맘스터치에 감동을 느낀");
  }else if(money.innerText > 3000 && money.innerText < 4999){
    peerageChange("맘스터치에 희열을 느낀");
  }else if(money.innerText > 5000 && money.innerText < 7999){
    peerageChange("맘스터치에 유희열");
  }else if(money.innerText > 8000  && money.innerText < 9999){
    peerageChange("프린세스 맥도날드");
  }else if(money.innerText > 10000 && money.innerText < 14999){
    peerageChange("수학시간 때 졸은");
  }else if(money.innerText > 15000 && money.innerText < 19999){
    peerageChange("롯데리아 케찹도둑");
  }else if(money.innerText > 20000 && money.innerText < 24999){
    peerageChange("롯데리아 빠모스 빠모스~");
  }else if(money.innerText > 25000 && money.innerText < 29999){
    peerageChange("호나우두가 극찬한 자기관리");
  }else if(money.innerText > 30000 && money.innerText < 34999){
    peerageChange("감독님 주급을 케찹으로 주시면 안되는?");
  }else if(money.innerText > 35000 && money.innerText < 39999){
    peerageChange("롯데리아 영구결번");
  }else if(money.innerText > 40000 && money.innerText < 44999){
    peerageChange("롯데리아 앰버서더");
  }else if(money.innerText > 45000 && money.innerText < 49999){
    peerageChange("롯데리아 G.O.A.T");
  }else if(money.innerText > 50000 && money.innerText < 54999){
    peerageChange("속보 롯데리아 아자리아로 개명");
  }else{
    peerageChange("골 D 버 거 해저버거는 존재한다!!");
  }
}



setInterval(peerageChangefun,1000);




