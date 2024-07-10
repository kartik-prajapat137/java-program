let userScore = 0;
let compScore = 0;

const choices = document.querySelectorAll(".choice");
const msg = document.querySelector("#msg");

const userscorepera = document.querySelector("#user-score");
const compscorepera = document.querySelector("#comp-score");

const showwinner = (userwin, userchoice, compchoice) => {
    if(userwin){
        userScore++;
        userscorepera.innerText = userScore;
        msg.innerText = `You Won!.your ${userchoice} is beat ${compchoice}`;
        msg.style.backgroundColor = "green";
    }else{
        compScore++;
        compscorepera.innerText = compScore;
        msg.innerText = `you lost!. ${compchoice} is beat your ${userchoice}`;
        msg.style.backgroundColor = "red";
    }
}

const gaincompchoice = () => {
    const gamearr = ["rock","paper","scissor",];
    const randomIdx = Math.floor(Math.random() * 3);
    return gamearr[randomIdx];
}

const drrowgame = () => {
    msg.innerText = "Game was Draw. Play agin";
    msg.style.backgroundColor ="#081b31"
}

const playGame = (userchoice) => {
    //generate computer choice.
    const compchoice = gaincompchoice();

    if(userchoice === compchoice){
        //draw Game
        drrowgame();
    }else{
        let userwin = true;
        if(userchoice === "rock"){
            userwin = compchoice === "paper" ? false : true ; 
        }else if(userchoice === "paper"){
            userwin = compchoice === "scissor" ? false : true ;
        }else{
            userwin = compchoice === "rock" ? false : true ;
        }
        showwinner(userwin, userchoice, compchoice);
    }
}

choices.forEach((choice) =>{
    choice.addEventListener("click", () =>{
        // console.log("clicked");
        const userchoice = choice.getAttribute("id");
        playGame(userchoice); 
    });
});