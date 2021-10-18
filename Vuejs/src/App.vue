<template>
  <div id="app">



    <div class="menu">
      <a v-for="menu in menus" :key="menu">{{menu}} </a>
    </div>

    <Modal :rooms="this.rooms" :roomNo="this.roomNo" @child="ModalChange" v-if="isModalOpen" />


    <h1 class="h1con"> land world 왔니? </h1>
    <img alt="Vue logo" src="./assets/logo.png">
    
    <Card :rooms="this.rooms" @countsUp="countsUp" :counts="this.counts" @isModalSelected="isModalSelected"/>

  </div>
</template>

<script>
  import roomdata from './assets/roomdata.js'
  import Modal from './components/Modal.vue'
  import Card from './components/Card.vue'
  export default {
    name: 'App',
    data() {
      return {
        roomNo: 0,
        rooms: roomdata,
        type: 'color: red',
        menus: ['home', 'shop', 'products', 'about'],
        isModalOpen: false,
        counts:[0,0,0,0,0,0]
      }
    },
    methods: {
      increase(i) {
        this.$set(this.counts, i, this.counts[i] + 1);
      },
      countsUp(num){
        this.$set(this.counts, num, this.counts[num] + 1);
      },
      ModalChange(flag) {
        this.isModalOpen = flag;
      },
      isModalSelected(num){
        this.roomNo=num
        this.isModalOpen=true
      }
    },
    components: {
      Modal,Card
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





  .menu {
    background-color: darkgoldenrod;
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