//Author: Sacha Ponniah

function checkCashRegister(price, cash, cid) {
  var changeObj;
  let changeSub = Number.parseFloat(cash - price);
  // console.log("change required total: $" + changeSub);
  
  let cidTotal = totalArr(cid);
  // console.log("cid total: $" + cidTotal);

  let cidObj = cid.reduce((next, current) => ({
      ...next,
      [current[0]]: current[1]}), {});

  let changeNeeded = idealChange(changeSub);  
  
  let insuff = {
    status: "INSUFFICIENT_FUNDS",
    change: []
  };
  
  let closed = {
    status: "CLOSED",
    change: Object.assign(cid)
  };
  // console.log(JSON.stringify(closed));

  let open = {
    status: "OPEN",
    change: []
  };
  
  if (cidTotal < changeSub) {
    changeObj = insuff;
  }
  else if (cidTotal == changeSub) {
    changeObj = closed;
  }
  else {
    open['change'] = collateChange(changeNeeded, cidObj);
    let changeTotal  = totalArr(open['change']);
    if (changeTotal == changeSub) {
      changeObj = open;
    }
    else {
      changeObj = insuff;
    }
  }
  // console.log("object returned: " + JSON.stringify(changeObj));
  return changeObj;
};

//totalArr function totals the values of a an array where the values are the second element of each sub-array
function totalArr(arr) {
  return arr.map(element => element[1])
                 .reduce((previous, current) => previous + current)
                 .toFixed(2);
}


//idealChange function computes the optimal breakdown of change required and returns it as an object
function idealChange(changeSub) {
    let changeReq = {
      'ONE HUNDRED': 0,
      'TWENTY': 0,
      'TEN': 0, 
      'FIVE': 0,
      'ONE': 0,
      'QUARTER': 0,
      'DIME': 0,
      'NICKEL': 0,      
      'PENNY': 0,       
    };
    
    if (changeSub >= 100) {
      changeReq['ONE HUNDRED'] = Math.round(Math.floor(changeSub / 100) * 100);
      changeSub -= changeReq['ONE HUNDRED'];    
    }
    if (changeSub >= 20) {
      changeReq['TWENTY'] = Math.round(Math.floor(changeSub / 20) * 20);
      changeSub -= changeReq['TWENTY'];
    }
    if (changeSub >= 10) {
      changeReq['TEN'] = Math.round(Math.floor(changeSub / 10) * 10);
      changeSub -= changeReq['TEN'];
    }
    if (changeSub >= 5) {
      changeReq['FIVE'] = Math.round(Math.floor(changeSub / 5) * 5);
      changeSub -= changeReq['FIVE'];
    }
    if (changeSub >= 1) {
      changeReq['ONE'] = Math.round(Math.floor(changeSub));
      changeSub -= changeReq['ONE'];
    }
    if (changeSub >= 0.25) {
      changeReq['QUARTER'] = Math.floor(changeSub / 0.25) * 0.25;
      changeSub -= changeReq['QUARTER'];
    }
    if (changeSub >= 0.1) {
      changeReq['DIME'] = Math.floor(changeSub / 0.1) * 0.1;
      changeSub -= changeReq['DIME'];
    }
    if (Math.round(changeSub * 100) / 100 >= 0.05) {
      changeReq['NICKEL'] = Math.floor(Math.round(changeSub * 100) / 100 / 0.05) 
                                        * 0.05;
      changeSub -= changeReq['NICKEL'];
    }
    if (Math.round(changeSub * 100) / 100 >= 0.005) {
      changeReq['PENNY'] = Math.round(changeSub * 100) / 100;
      changeSub -= changeReq['PENNY'];
    }
    return changeReq;
};

/*
collateChange function takes a changeNeeded object and a cid object and returns an array listing the 
change that can be returned
*/
function collateChange(changeNeeded, cid) {
    let changeReturned = [];
    let nextSmallest = {
              'ONE HUNDRED': 'TWENTY',
              'TWENTY': 'TEN',
              'TEN': 'FIVE',
              'FIVE': 'ONE',
              'ONE': 'QUARTER',
              'QUARTER': 'DIME',
              'DIME': 'NICKEL',
              'NICKEL': 'PENNY',
              'PENNY': null
    };

    for (const currency in changeNeeded) {
          let currencyTotal = 0;
          if (cid[currency] >= changeNeeded[currency]) {
            currencyTotal = [currency, changeNeeded[currency]];
          }
          else {
            currencyTotal = [currency, cid[currency]];
            changeNeeded[nextSmallest[currency]] += changeNeeded[currency] 
                                                    - cid[currency];
          }
          if (currencyTotal[1] > 0) {
          changeReturned.push(currencyTotal);
          }
      };
    return changeReturned;
};

checkCashRegister(19.5, 20, [["PENNY", 1.01], ["NICKEL", 2.05], ["DIME", 3.1], ["QUARTER", 4.25], 
["ONE", 90], ["FIVE", 55], ["TEN", 20], ["TWENTY", 60], ["ONE HUNDRED", 100]]);