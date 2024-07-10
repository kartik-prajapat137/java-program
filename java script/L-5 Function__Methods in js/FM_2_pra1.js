function countvowels(str){
    let sum=0;
    
    for(const char of str){
        if(char==="a" || char==="i" || char==="o" || char==="u" || char=="e"){
            console.log(char);
            sum++;
       
    }
}
    return sum;
}

val = countvowels("kaliya");
console.log(val);