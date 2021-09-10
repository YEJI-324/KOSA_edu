const result = 'Hello World!'.indexOf('World')
console.log(result)

const str = 'kej980324@gmail.com'
console.log(str.match(/.+(?=@)/)[0])

let msg = '          Hello World      '
console.log(msg)
console.log(msg.length)
msg = msg.trim()
console.log(msg)
console.log(msg.length)

const pi = 3.141592
console.log(pi)

const s1 = pi.toFixed(2)
console.log(s1)
console.log(typeof(s1))

const integer = parseInt(s1)
const float = parseFloat(s1)
console.log(integer)
console.log(float)

// array
const cars = ["Saab", "Volve", "BMW"]
const numbers = [1,2,3]
console.log(cars)
console.log(numbers)

const ages = [3, 10,18,20]

function checkAge(age){
    return age >18
}

function myFunction(){
    document.getElementById("demo").innerHTML = ages.find(checkAge);
}

// cars.forEach(function(element, index, array) {
//     console.log(element, index, array)
// })

const arr = cars.forEach(function(car, index) {
    return `${car}-${index}`
})
console.log(arr)

// map()
const arrMap = cars.map(function(car, index) {
    return `${car}-${index}`
})
console.log(arrMap)