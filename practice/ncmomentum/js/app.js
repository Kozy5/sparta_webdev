const loginForm = document.querySelector("#login-form");
const loginInput = document.querySelector("input");
const greeting = document.querySelector("h1");
const initialbutton = document.querySelector("#initialbutton")
const HIDDEN_CLASSNAME = "hidden";
const USERNAME = "username";


function handleSubmit(event){
    event.preventDefault();
    loginForm.classList.add(HIDDEN_CLASSNAME);
    greeting.classList.remove(HIDDEN_CLASSNAME)
    const username = loginInput.value
    greeting.innerText = `${username} ..! 멋진 이름이네!`;
    localStorage.setItem(USERNAME,`${username}`);
    initialbutton.classList.remove(HIDDEN_CLASSNAME)

}
function greetingA(evnet){
    
    if(localStorage.getItem(USERNAME) != null) {
        loginForm.classList.add(HIDDEN_CLASSNAME);
        greeting.classList.remove(HIDDEN_CLASSNAME);
        initialbutton.classList.remove(HIDDEN_CLASSNAME)
        const storagename = localStorage.getItem(USERNAME);
        greeting.innerText = `다시 돌아왔군! ${storagename}`;
    }else{
        initialbutton.classList.add(HIDDEN_CLASSNAME)
    }
    
}

function handleNickname(){
    loginForm.classList.remove(HIDDEN_CLASSNAME);
    greeting.classList.add(HIDDEN_CLASSNAME);
    initialbutton.classList.add(HIDDEN_CLASSNAME);
    localStorage.removeItem(USERNAME);
}
initialbutton.addEventListener("click",handleNickname)
loginForm.addEventListener("submit",handleSubmit)
greetingA()