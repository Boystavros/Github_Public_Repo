//Author: Sacha Ponniah

function rot13(str) {
  const regexAM = /[A-M]/;
  const regexNZ = /[N-Z]/;
  let result = "";
  
  for (let i = 0; i < str.length; i++) {
    if (regexAM.test(str[i])) {
      result += String.fromCharCode(str.charCodeAt(i) + 13);
    }
    else if (regexNZ.test(str[i])) {
      result += String.fromCharCode(str.charCodeAt(i) - 13);
    }
    else {
      result += str[i]
    }
  }
  
  return result;
}

rot13("GUR DHVPX OEBJA SBK WHZCF BIRE GUR YNML QBT."); // THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.