<template>
  <div id="app">
    <div class="black-bg" v-if="isModalOpen">
        <div class="white-bg">
          <h4>{{products[i]}}상세페이지</h4>
          <p>상세페이지 내용</p>
          <button @click="isModalOpen = false">닫기</button>
        </div>
      </div>
    <div class="menu">
      <!-- <a v-for="반복할 변수 in 숫자"></a> -->
      <a v-for="(menu, i) in menus" :key="i">{{menu}}</a>
    </div>
    <h1 class="title">Welcome</h1>
    <img alt="Vue logo" src="./assets/logo.png">
    <HelloWorld msg="Welcome to Your Vue.js App"/>

    <div v-for="(p,i) in products" :key="i">
      
      <img src="./assets/1.jpg" alt="">
      <h4 @click="isModalOpen = true">{{products[i]}} 원룸</h4>
      <p>{{price1}} 만원</p>
      <button @click="increase(i)">허위매물신고</button>
      <span> 신고수 : {{counts[i]}}</span>
    </div>
  </div>
</template>

<script>
export default {
  name: 'App',
  data() {
    return {
      price1: 70,
      price2: 50,
      type : 'color:red',
      menus : ['Home', 'Shop', 'Products', 'About'],
      products : ['송파구', '강남구', '광진구'],
      counts :[0,0,0],
      isModalOpen: false,
    }
  },
  methods : {
    increase(i) {
      this.$set(this.counts, i, this.counts[i]+1)
      // this.$data.counts[i]+=1;
      // this.counts[i] += 1;
      console.log(this.products[i] + " 신고 증가 " + this.counts[i])
    }
  }
}
</script>

<style>

body {
  margin: 0;
}

div {
  box-sizing: border-box;
}

.black-bg {
  width: 100%;
  height: 100%;
  background: rgba(0,0,0,0.5);;
  position: fixed;
  padding: 20px;
}

.white-bg {
  width: 100%;
  background: rgb(225,225, 225);
  border-radius: 8px;
  padding: 20px;
}

.img {
  width: 50px;
  height:50px;
  border: 1px solid blue;
}

.menu {
  background: darkslateblue;
  padding: 15px;
  border-radius: 5px;
}

.menu a {
  color: white;
  padding: 10px;
}

.title {
  color : blue;
  font-family: 'Courier New', Courier, monospace;
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
