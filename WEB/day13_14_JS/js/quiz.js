// 문제] Emp 클래스 - 사번, 사원명, output 메소드(전체 출력)
// 출력메소드 안에 일정 시간 뒤에 setTimeout으로 새로 객체 만들기
let num = 1

function emp(name) {
    this.empNo = num++
    // this.empName = prompt('name')
    this.empName = name
    
    this.output = () => {
        console.log(`사번 : ${this.empNo}, 사원명 : ${this.empName}`)
    }
}

const emp1 = new emp('yeji')
emp1.output()
const emp2 = new emp('예지')
emp2.output()

const timer = {
    name : 'YeJi',
    timeout: function() {
        setTimeout(() => {
            console.log(this.name)
            // ci()
        }, 2000);
    }
}

// timer.timeout(
//     clearInterval()
// )


class Vehicle {
    constructor(name, wheel){
        this.name = name
        this.wheel = wheel
    }
}

const myVehicle = new Vehicle('운송수단', 2)
console.log(myVehicle)

class Bicycle extends Vehicle {
    constructor(name) {
        super(name, 2)
    }
}

class Car extends Vehicle {
    constructor(name, license){
        super(name,4)
        this.license = license
    }
}

const myBicycle = new Bicycle('오토바이')
console.log(myBicycle)

const myCar = new Car('자동차', '운전면허')
console.log(myCar)

