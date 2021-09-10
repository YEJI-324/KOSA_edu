function scope() {
    if(true){
        var a = 123
        console.log(a)
    }

}

scope()

// function sum(x, y){
//     // console.log(x+y)
//     return x+y
// }

// console.log(sum(1,3) + sum(10,20))
// const b = sum(1,4)
// console.log(b)

const sum = function(x,y) {
    return x+y
}
console.log(sum(30,20))

function foo(x,y){
    if(x<2){
        return x +2
    }
    return x+y
}
console.log(foo(1,4))

function foo2(){
    console.log(arguments)
    return arguments[0]
}
console.log(foo2(7,3))

const doubleFunc = function(x, y){
    return x * 2
}

console.log('doubleFunc : ', doubleFunc(3))
console.log('doubleFunc : ', doubleFunc(3,7))
console.log('doubleFunc : ', doubleFunc(3,7,8))

const doubleArrow = (x, y) => {
    return 2*x
}

console.log('doubleArrow : ', doubleArrow(3))

// const doubleArrow2 = x => x*2 
// const doubleArrow2 = x => 12.3
// const doubleArrow2 = x => 1234
// const doubleArrow2 = x => [1,2,3]
const doubleArrow2 = x => ({name:'YEJI'})

console.log('doubleArrow2 : ', doubleArrow2(3));

const d = 3

(function() {
    console.log(d*2)
})();