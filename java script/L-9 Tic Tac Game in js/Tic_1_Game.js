 let boxes = document.querySelectorAll(".box");
 let resetbtn = document.querySelector("#reset-btn");
 let msgcontainer = document.querySelector(".msg-container");
 let msg = document.querySelector("#winner");
 let newgamebtn = document.querySelector("#newGame");
 let nowinning = document.querySelector(".nowinner");
 let nowinmsg = document.querySelector("#nowin-msg");
 let nowin_newbtn = document.querySelector("#nowin-newGame")

 let turnO = true; //playerxX,playerY.

 const winPatterns = [
    [0, 1, 2],
    [0, 3, 6],
    [0, 4, 8],
    [1, 4, 7],
    [2, 5, 8],
    [2, 4, 6],
    [3, 4, 5],
    [6, 7, 8],
 ];

 const resetgame = () => {
    turnO = true;
    enableboxes();
    msgcontainer.classList.add("hide");
    nowinning.classList.add("nowin-hide");
 };

 let count =0;

 boxes.forEach((box) => {
    box.addEventListener("click", ()=>{
        console.log("box was clicked");
        if(turnO){
            //player O.
            box.innerText = "O";
            turnO = false;
        }else{
            //player X.
            box.innerText = "X";
            turnO = true;
        }
        box.disabled = true;
        count++;
console.log(count);
        checkWinner();
    });
 });

 const disableboxes = () => {
    for(let box of boxes){
        box.disabled = true;
    }
};

    const enableboxes = () => {
        for(let box of boxes){
            box.disabled = false;
            box.innerText = "";
        }
 };

 const showWinner = (Winner) => {
    msg.innerText =`Congratulations, Winner is ${Winner}`;
    msgcontainer.classList.remove("hide");
    count = 0;
    disableboxes();
 };

 const noWinner = () => {
   nowinmsg.innerText =`No Winner is decleared Here`;
    nowinning.classList.remove("nowin-hide");
    count = 0;
};

 const checkWinner = () => {
  for(let pattern of winPatterns){
   let pos1val = boxes[pattern[0]].innerText;
   let pos2val = boxes[pattern[1]].innerText;
   let pos3val = boxes[pattern[2]].innerText;

   if(pos1val != "" && pos2val != "" && pos3val != ""){
    if(pos1val === pos2val && pos2val ===  pos3val){
        showWinner(pos1val);
    }else if(count == 9){
        noWinner();
       }
   }
  }  
 };

 newgamebtn.addEventListener("click", resetgame);
 resetbtn.addEventListener("click", resetgame);
 nowin_newbtn.addEventListener("click",resetgame);
