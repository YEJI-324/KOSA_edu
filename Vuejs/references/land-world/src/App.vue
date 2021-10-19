<template>
  <div id="app">

  <div class="black-bg" v-if="isModalOpen" >
      <div class="white-bg">
        <h4>상세페이지</h4>
        <p>상세페이지 내용</p>
        <button @click="isModalOpen=false">닫기</button>
      </div>
    </div>

    <div class="menu">
      <!-- <a v-for="반복할 변수 in 숫자" :key="변수"> </a> -->
      <!-- <a v-for="i in 3" :key="i">home </a> -->
      <a v-for="menu in menus" :key="menu">{{menu}} </a>

       <!-- <a v-for="(menu,i)in menus" :key="i">{{i}} </a>
         <a v-for="(변수이름정의,인덱스번호)in 배열" :key="인덱스번호">{{인덱스번호}} </a> -->


      <!-- <a>{{menus}}</a>
      <a>{{menus[1]}}</a>
      <a>{{menus[3]}}</a> -->
      
  </div>
   <h1 class="h1con"> land world 왔니? </h1>
    <img alt="Vue logo" src="./assets/logo.png">
    <HelloWorld msg="Welcome to Your Vue.js App"/>
  

  <div v-for="(p, i) in products" :key="i">
  

    <img src= "./assets/1.jpg">
    <!-- <h4 :style="type"> {{products[i]}}원룸 </h4> 스타일 직접넣기 -->
    <h4 @click="isModalOpen =true"> {{products[i]}}원룸 </h4>
    <p> {{price}}만원</p>
    
    <button @click="increase(i)">허위매물신고</button>
    <span>신고수:{{counts[i]}}</span>

  </div>
    
   <!-- <div>
      <img src= "./assets/2.jpg">
    <h4> {{products[1]}}원룸 </h4>
    <p> {{price2}}만원</p>
    <button @click="increase()">허위매물신고</button>
    <span>신고고고수:{{counts[i]}}</span>
  </div>
  <div>
     <img src= "./assets/3.jpg">
    <h4> {{products[2]}}원룸 </h4>
    <p> 30만원</p>
    <button @click="increase()">허위매물신고</button>
    <span>신고고고수:{{counts[i]}}</span>
  </div> -->
 


  </div>
</template>

<script>


export default {
  name: 'App',
  data(){
    return {
      price: 70,
      price2: 50,
      type: 'color: red',
      menus :['home', 'shop', 'products','about'],
      products:['서대문구', '관악구','강서구'],
      counts :[0,0,0],
      isModalOpen: false,
    }
  },
  methods :{
    increase(i) {
      this.$set(this.counts,i,this.counts[i]+1);
      
       //반드시 앞에 this붙여야지 적용됨
      // this.$set(obj, key, value)
      // this.$set(arr, index, value)

    }
  },
}
  
</script>

<style>
body{
  margin: 0;
}
div{
  box-sizing: border-box;
}

.black-bg{
  width: 100%;
  height: 100%;
  background:  rgb(0, 0,0,0.5);
  position: fixed;
  padding: 20px;
}
.white-bg{
  width: 100%;
  
  background-color: whitesmoke;
  border-radius: 8px;
  padding: 20px;

}
/* .img{
  width: 50px;
  height: 50px;
} */



.menu{
  background-color: darkslateblue;
  padding: 15px;
  border-radius: 5px;
}
.menu a {
  color: aliceblue;
  padding: 10px;
}

.h1con {
  color: blue;
  font-family: 맑은 고딕;
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
