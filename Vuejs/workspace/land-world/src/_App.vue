<template>
  <div id="app">
    <modal :rooms="rooms" :roomNo="roomNo" v-if="isModalOpen" @modal="isModalOpen=false"/>
    <div class="menu">
      <!-- <a v-for="반복할 변수 in 숫자"></a> -->
      <a v-for="(menu, i) in menus" :key="i">{{menu}}</a>
    </div>

    <discount/>

    <h1 class="title">Welcome</h1>
    <img alt="Vue logo" src="./assets/logo.png">
    <HelloWorld msg="Welcome to Your Vue.js App"/>

    <Card @openModal="isModalOpen=true; roomNo=i" :rooms="rooms[i]" v-for="(r, i) in rooms" :key="i"></Card>
<!-- 
    <div v-for="(r,i) in rooms" :key="i">
      <button @click="increase(i)">허위매물신고</button>
        <span> 신고수 : {{counts[i]}}</span>
    </div> -->

  </div>
</template>

<script>
import roomdata from './assets/roomdata.js'
import discount from './components/Discount.vue'
import modal from './components/Modal.vue'
import card from './components/_Card.vue'

export default {
  name: 'App',
  data() {
    return {
      roomNo : 0,
      rooms : roomdata,
      price1: 70,
      price2: 50,
      type : 'color:red',
      menus : ['Home', 'Shop', 'Products', 'About'],
      products : ['송파구', '강남구', '광진구'],
      counts :[0,0,0],
      isModalOpen: false,
    }
  },
  components: {
    discount: discount,
    Modal: modal,
    card: card,
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

.img {
  width: 50px;
  height:50px;
  border: 1px solid blue;
}

.menu {
  background: darkslateblue;
  padding: 15px;
  border-radius: 5px;
  top : 0;
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
