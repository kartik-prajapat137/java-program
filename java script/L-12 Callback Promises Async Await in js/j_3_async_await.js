//Async & Awit  Keywords

function getData(dataId) {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            console.log("Data =",dataId);
            resolve("success");
        },2000);
    });
};

async function allData(){
    await getData(0);
    await getData(1);
    await getData(2);
    await getData(3);
    await getData(4);
    await getData(5);
    await getData(6);
    await getData(7);
}

///IFES is a function used to for directaly used without calling of function;

(async function allData(){
    await getData(0);
    await getData(1);
    await getData(2);
    await getData(3);
})();