const square={
    side: 1,
    area(){
        console.log('area');
    }
};
console.log("content of square :"+ square);
console.log(square);
var clonesquare ;
console.log("content of clonesquare before copy : "+ clonesquare);
clonesquare = Object.assign({},square);
console.log("content of clonesquare after copy : "+ clonesquare);
console.log(clonesquare);





