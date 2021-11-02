PROJECT TITLE: Cash Register

PURPOSE OF PROJECT: 

This was my solution to one of the five problems to obtain the FreeCodeCamp.org JavaScript 
Algorithms and Data Structures certification.

The problem was defined on FreeCodeCamp.org as:

Design a cash register drawer function checkCashRegister() that accepts purchase price as the first argument (price), 
payment as the second argument (cash), and cash-in-drawer (cid) as the third argument.

cid is a 2D array listing available currency.

The checkCashRegister() function should always return an object with a status key and a change key.

Return {status: "INSUFFICIENT_FUNDS", change: []} if cash-in-drawer is less than the change due, 
or if you cannot return the exact change.

Return {status: "CLOSED", change: [...]} with cash-in-drawer as the value for the key change if it is equal to 
the change due.

Otherwise, return {status: "OPEN", change: [...]}, with the change due in coins and bills, 
sorted in highest to lowest order, as the value of the change key.