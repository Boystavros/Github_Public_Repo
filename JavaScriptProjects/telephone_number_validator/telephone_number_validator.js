//Author: Sacha Ponniah

function telephoneCheck(str) {
  let nonCCRegex = /^\(?(\d{3})\)?[-\s]?(\d{3})[-\s]?(\d{4})$/;
  let ccRegex = /^1\s?\(?(\d{3})\)?[-\s]?(\d{3})[-\s]?(\d{4})$/;
  let openBracks = /\(\d{3}(?!\))|(?<!\()\d{3}\)/g;
  let result = true;
  if (ccRegex.test(str)||nonCCRegex.test(str)) {
    if (openBracks.test(str)) {
      result = false;
    }
  }
  else {
    result = false;
  }
  return result;
}

//below should return true
telephoneCheck("555-555-5555");
telephoneCheck("(555)555-5555");
telephoneCheck("(555) 555-5555");
telephoneCheck("555 555 5555");
telephoneCheck("5555555555");
telephoneCheck("1 555-555-5555");
telephoneCheck("1 (555) 555-5555");
telephoneCheck("1(555)555-5555");

//below should return false
telephoneCheck("23**&!!asdf#)");
telephoneCheck("1 555)555-5555");
telephoneCheck("(555-555-5555");
telephoneCheck("(555)5(55?)-5555");
