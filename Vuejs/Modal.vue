<template>
  <div class="black-bg">
      <div class="white-bg">
        <img :src=rooms[roomNo].image>
        <h4>{{rooms[roomNo].title}}</h4>
        <p>{{rooms[roomNo].content}}</p>

        <!-- 사용자가 <input>에 입력한 값 -> 데이터로 저장하는 법 -->
        <!-- <input @input="month=$event.target.value"> -->
        <!-- 사용자가 입력 박스에 입력한 값은 전부 문자자료형임 -->
         <input v-model="month"> <br />
         <input type="checkbox" v-model="month"> <br />
         <input type="range" min="1" max="12"><br />
         <!-- <textarea v-model="month">  select, input type 등등 모두 사용 가능 -->
        {{month}}개월 선택함
        <p> {{rooms[roomNo].price  * month}}만원</p>  
        <Discount />
        <button @click="isModalOpen">닫기</button>
      </div>
    </div>
</template>

<script>
import Discount from './Discount.vue'
export default {
    name:'Modal',
    data(){
      return{
        month : 1,   //초기데이터 
        //data: 'kbs',
      }
    },   
    // 감시가 필요한 것이 있으면 넣으면 됨. 이메일형식, 패스워드 대소문자구분 등등 
    // 너무 많아서  Vue 전용 form validation 라이브러리 설치해서 사용함.
    watch:{    // 데이터감시 - watch: { 감시할데이터(){ 내용기재 } }
      month(num){  // month(num, su){ }
        // if( num > 12) {
        //   alert('13이상 입력하지 마세요.')
        // }
        //문제] 문자 들어왔을때 처리방법
        if(isNaN(num) === true){
          alert('문자입력하지 마세요!!');
          this.month = 1;  // 다시 초기화
        }
      },
      // data() {
      //   //감시할 내용
      // }
    } ,
    components:{
      Discount
    },
    props:{
      rooms:Array,
      roomNo:Number,
      
    },
    methods:{
      isModalOpen(){
        this.$emit("child",false)
      }
    }
}
</script>

<style>
.black-bg {
    width: 100%;
    height: 100%;
    background: rgb(0, 0, 0, 0.5);
    position: fixed;
    padding: 20px;
  }

  .white-bg {
    width: 100%;

    background-color: whitesmoke;
    border-radius: 8px;
    padding: 20px;

  }
</style>