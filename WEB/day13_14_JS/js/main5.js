// > class
// 1) 리터럴 방식
// 2) 함수 방식
// 3) 프로토타입 방식

// 1) 리터럴 방식
const c1 = {
    firstName : 'Yeji',
    lastName : 'Kim',
    getFullName : function() {
        return `${this.firstName} ${this.lastName}`
    }
}

console.log(c1)
console.log(c1.getFullName())

console.log('--------------------------------------------------------')

// 2) 함수 방식
function user(first, last){
    this.firstName = first
    this.lastName = last
    // this.getFullName = function() {
    //     return `${this.firstName} ${this.lastName}`
    // }
    this.getFullName = () => `${this.firstName} ${this.lastName}`
}

const yeji = new user('yeji', 'kim')
console.log(yeji.getFullName())

// 3) 
function person(first, last) {
    this.firstName = first
    this.lastName = last
}

person.prototype.getFullName = function() {
    return `${this.firstName} ${this.lastName}`
}

const person1 = new person('yeji', 'kim')
const person2 = new person('yeji', 'kim')
const person3 = new person('yeji', 'kim')

console.log(person1)
console.log(person1.getFullName())
console.log(person2.getFullName())
console.log(person3.getFullName())

// 어떤 '' selector에 {} 적용
// new Swiper('', {})
