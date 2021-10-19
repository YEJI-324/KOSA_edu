import { createStore } from 'vuex'
import postdata from './postdata'

const store = createStore({ // 데이터 저장할 공간
    state() { // 보관하고 싶은 데이터
        return {
            name: 'yeji',
            age: 20,
            liks: postdata.likes,
            liked: postdata.liked,   
        }
    },
    mutations: { // 변경하고 싶은 데이터
        namechange(state) {
            state.name='안녕'
        },
        agechange(state){
            state.age++
        },
        likeschange(state){
            if(!this.liked) {
                state.likes++
                this.liked=true
            }
            else{
                state.likes--
                this.liked=false
            }
        }
    }
})

export default store