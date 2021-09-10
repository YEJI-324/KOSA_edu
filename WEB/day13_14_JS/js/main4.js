// 타이머 함수
// setTimeout(함수, 시간) : 일정 시간 후 함수 실행
// setInterval(함수, 시간) : 일정 시간 간격마다 함수 실행
// clearTimeout() : 설정된 timeout 함수 종료
// clearInterval : 설정된 interval 함수 종료

const timer = setTimeout(() => {
    console.log('yeji')
}, 3000);

const h1El = document.querySelector('h1')
h1El.addEventListener('click', () => {
    clearTimeout(timer)
})

//콜백함수 (Callback) : 함수의 인수로 사용되는 함수

function timeout(call) {
    setTimeout(() => {
        console.log('yeri')
        call()
    }, 1000);
}

timeout(() => {
    console.log('done')
})