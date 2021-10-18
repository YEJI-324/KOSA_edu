<template>
  <div class="black-bg">
      <div class="white-bg">
        <img :src=rooms[roomNo].image>
        <h4>{{rooms[roomNo].title}}</h4>
        <p>{{rooms[roomNo].content}}</p>
        <p> {{rooms[roomNo].price}}만원</p>
        <Discount />
        <button @click="isModalOpen">닫기</button>
      </div>
    </div>
</template>

<script>
import Discount from './Discount.vue'
export default {
    name:'Modal',
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