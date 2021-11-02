//Author: Sacha Ponniah

function palindrome(str) {
  let lowerStr = str.toLowerCase();
  let regex = /[a-zA-Z0-9]/g;
  const forwards = Array
                   .from(lowerStr)
                   .filter(value => {
                   	return value.match(regex) !== null;
                   })
                   .join("");
  console.log(forwards);
  let backwards = [];
  for(let i = forwards.length - 1; i >= 0; i--){
    backwards.push(forwards[i]);
  }
  backwards = backwards.join("");
  console.log(backwards);
  if (forwards === backwards) {
    return true;
  }
  else {
    return false;
  }
}

palindrome("A man, a plan, a canal. Panama");