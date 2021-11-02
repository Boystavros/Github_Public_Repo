//Author: Sacha Ponniah

function convertToRoman(num) {
    let numStr = num.toString();
    let singles = 0;
    let tens = 0;
    let hundreds = 0;
    let thousands = 0;

    if (num > 0) {
        singles = numStr.slice(-1)
    }
    if (num > 9) {
        tens = numStr.slice(-2, -1)
    }
    if (num > 99) {
        hundreds = numStr.slice(-3, -2);
    }
    if (num > 999) {
        thousands = numStr.slice(0, -3)
    }

    let convertS = {
      0: '',
      1: 'I',
      2: 'II',
      3: 'III',
      4: 'IV',
      5: 'V',
      6: 'VI',
      7: 'VII',
      8: 'VIII',
      9: 'IX'
    };

    let convertT = {
      0: '',
      1: 'X',
      2: 'XX',
      3: 'XXX',
      4: 'XL',
      5: 'L',
      6: 'LX',
      7: 'LXX',
      8: 'LXXX',
      9: 'XC'
    };

    let convertH = {
      0: '',
      1: 'C',
      2: 'CC',
      3: 'CCC',
      4: 'CD',
      5: 'D',
      6: 'DC',
      7: 'DCC',
      8: 'DCCC',
      9: 'CM' 
    };

    return ('M'.repeat(thousands) 
            + convertH[hundreds] 
            + convertT[tens] 
            + convertS[singles]);
}

convertToRoman(3099);