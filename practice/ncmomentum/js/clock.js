const clock = document.querySelector("#clock-box h1")

function timetime(){
    const date = new Date();
    const hours = date.getHours();
    const minutes = date.getMinutes();
    const seconds = date.getSeconds();
    
    clock.innerText = `${hours}`.padStart(2,"0")+":"+`${minutes}`.padStart(2,"0")+":"+ `${seconds}`.padStart(2,"0");
}

timetime()
setInterval(timetime,1000)


