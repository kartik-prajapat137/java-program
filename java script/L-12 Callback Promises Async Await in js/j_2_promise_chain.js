//1.> Promises. 

// let Promises = new Promise((resolve, reject) => {
//     console.log("promisese print");
//     resolve("bas");
// });

//2.> Promises => { promise.then() & promise.catch()}

// const getpromise = () => {
//     return new Promise((resolve, reject) => {
//         console.log("Iam a promise");
//         resolve("promise success");
//         // reject("Some error");
//     });
// };

// let promise = getpromise();
//     promise.then((res) => {
//         console.log("fullfilled",res);
//     });

//     promise.catch(() => {
//         console.log("err", err);
//     });

    //3.> Promises callback ;

    function asynchronous1() {
        return new Promise((resolve,reject) => {
            setTimeout(() => {
            console.log("data1");
            // resolve("success 1");
            reject("err1");
           },4000);
        });
    };

    function asynchronous2() {
        return new Promise((resolve,reject) => {
            setTimeout(() => {
            console.log("data2");
            resolve("sucesss 2");
            // reject("err2");
            },4000);
        });
    };

    console.log("Feaching 1......");
    let A1 = asynchronous1();
    A1.then((res) => {
        console.log(res);
        console.log("Feaching 2......");
    let A2 = asynchronous2();
    A2.then((res) => {
        console.log(res);
    });
    A2.catch((err) =>{
        console.log(err);});
    });

    A1.catch((err) => {
        console.log(err);
        console.log("Feaching 2........");
    let A2 = asynchronous2();
    A2.catch((err) => {
        console.log(err); });
        A2.then((res) => {
            console.log(res);});
    });