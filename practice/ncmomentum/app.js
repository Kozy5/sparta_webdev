const loginForm = document.querySelector("#login-form");
const loginInput = document.querySelector("input");
const greeting = document.querySelector("h1");
const initialbutton = document.querySelector("#initialbutton")


function handleSubmit(event){
    event.preventDefault();
    loginForm.classList.add("hidden");
    greeting.classList.remove("hidden")
    const username = loginInput.value
    greeting.innerText = `${username} ..! 멋진 이름이네!`;
    localStorage.setItem("username",`${username}`);
    initialbutton.classList.remove("hidden")

}
function greetingA(evnet){
    
    if(localStorage.key.length >= 1) {
        loginForm.classList.add("hidden");
        greeting.classList.remove("hidden");
        initialbutton.classList.remove("hidden")
        const storagename = localStorage.getItem("username");
        greeting.innerText = `다시 돌아왔군! ${storagename}`;
    }else{
        console.log("good")
    }
    
}

function handleNickname(){
    loginForm.classList.remove("hidden");
    greeting.classList.add("hidden");
    initialbutton.classList.add("hidden");
    localStorage.removeItem("username");
}
initialbutton.addEventListener("click",handleNickname)
loginForm.addEventListener("submit",handleSubmit)
greetingA()