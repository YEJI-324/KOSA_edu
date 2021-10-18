<template>
  <div id="app">



    <div class="menu">
      <a v-for="menu in menus" :key="menu">{{menu}} </a>
    </div>

    <!-- 애니메이션 주기 - UI  -->
    <!-- css로 애니메이션 주려면 1.시작전 class명, 2.애니메애션 끝난후 class명, 3.원할때 클래스명들 부착 -->
    <!-- class명을 조건부로 넣으려면 { 클래스명: 조건 } -->
  <!-- <div class="start" :class="{end : true }">  
     <Modal :rooms="this.rooms" 
          :roomNo="this.roomNo" 
          @child="ModalChange" 
          v-if="isModalOpen" />
  </div> -->

    <!-- Vue에서는 <transition> 이용하면 애니메이션 쉽게 줄 수 있음 -->
    <transition name="fade">
     <Modal :rooms="this.rooms" 
            :roomNo="this.roomNo" 
          @child="ModalChange" 
          v-if="isModalOpen" />
    </transition>

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

  /* .start {
    opacity: 0;
    transition: all 1s;
  }
  .end {
    opacity: 1;
  } */

  /* 
  .fade-enter-from{}
  .fade-enter-active{}
  .fade-enter-to{} */

   /* 나타나는 애니매이션 */
   .fade-enter-from{   
     opacity: 0;
   }
  .fade-enter-active{
    /* transition: all 1s; */
    transition: translateY(-1000px);
  }
  .fade-enter-to{
    opacity: 1;
  }
   /* 퇴장 애니메이션 */
 .fade-leave-from{   
     opacity: 1;
   }
  .fade-leave-active{
    /* transition: all 1s; */
     transition: translateY(0px);
  }
  .fade-leave-to{
    opacity: 0;
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