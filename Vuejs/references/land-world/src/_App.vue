<template>
  
  <div>
     <!-- modal 창 띄우기 -->
      <div class="black-bg" v-if="isModalOpen">
        <div class="white-bg">
          <h4>상세페이지</h4>
          <p>상세페이지 내용</p>
          <button @click="isModalOpen = false">닫기</button>
        </div>
      </div>

    <div class="menu">
      <!-- <a v-for="변수 in 숫자">Home</a> -->
      <!-- <a v-for="(meun,i) in menus" :key="i">{{i}}</a> -->
       <a v-for="meun in menus" :key="meun">{{meun}}</a>
      <!-- <a>{{menus[0]}}</a>
      <a>Products</a>
      <a>About</a>
      <a>{{menus[3]}}</a> -->
    </div>
    <h1 class="h1">Land World 오신걸 환영합니다.</h1>
    <img alt="Vue logo" src="./assets/logo.png">
    <HelloWorld msg="Welcome to Your Vue.js App"/>

    <!-- <img src="./경로" > -->
    
    
    <div v-for="(p,i) in products" :key="i">
    
      <img src="./assets/1.jpg" >
      
      <!-- <h4 :style="type"> {{products[i]}} 원룸 </h4> -->
       <h4 @click="isModalOpen = true"> {{products[i]}} 원룸 </h4>
      <p> {{ price1 }} 만원 </p>
      <button  @click="increase(i)">허위매물신고</button>
      <span> 신고수 : {{counts[i]}} </span>
    </div>

    <!-- <div>
      <img src="./assets/2.jpg" >
      <h4> {{products[1]}}  원룸 </h4>
      <p> {{ price2 }} 만원 </p>
      <button>허위매물신고</button>
      <span> 신고수 : {{counts[1]++}} </span>
    </div>
    <div>
      <img src="./assets/3.jpg" >
      <h4> {{products[2]}}  원룸 </h4>
      <p> 30 만원 </p>
      <button>허위매물신고</button>
      <span> 신고수 : {{counts[2]++}} </span>
    </div> -->
  
  </div>
</template>


<script>
export default {
    name: 'App',
    data(){
      return{
        price1 : 70,
        price2 : 50,
        type : 'color: red',
        menus : ['Home', 'Shop', 'Products', 'About'],
        products : ['서대문구', '강남구', '강서구 천호동'],
        counts : [0, 0, 0],
        isModalOpen: false,
      }
    },
    methods: {
      increase(i){
        // this.counts[i]++
        this.$data.counts[i]+=1;
      }
      // increase(i){
      //   this.$set(this.counts,i,this.counts[i]+1)
      // }
    },
}
</script>

<style>
body {
  margin: 0;
}
div{
  box-sizing: border-box;
}

.black-bg {
  width: 100%;
  height: 100%;
  background: rgba(0,0,0,0.5);
  position: fixed;
  padding: 20px;
}
.white-bg {
  width: 100%;
  background: white;
  border-radius: 8px;
  padding: 20px;
}

/* .img { 
  width: 50px; 
  height: 50px;
  border: 1 solid blue;
} */

.menu {
  background: darkslateblue;
  padding: 15px;
  border-radius: 5px;
}
.menu a {
  color: white;
  padding: 10px;
}
.h1 {
  color: blue;
  font-family: 맑은 고딕, 궁서체, 바탕체;
}

#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
