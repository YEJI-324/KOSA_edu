<template>

  <!-- <div :class="filter" class="filter-item"></div> -->
  <div @click="fire" :class="filter + ' filter-item'" :style="`background-image:url(${myimage})`" >  
      <slot :msg="msg"></slot>

      <!-- <slot :자식데이터="자식데이터"></slot> -->
      
      <!-- slot 여러개 사용하는 법 
      <slot name="x"></slot>
      <slot name="y"></slot> -->
      <!-- <button @click="fire">변경</button> -->


      
  </div>  

</template>

<script>
export default {
    name: 'filterbox',
    methods: {
        fire() {
            //this.emitter.emit('name','data')
            this.emitter.emit('boxclick', this.filter)
        }
    },
    data(){
        return{
            msg: 'hello 2342842' // 자손이 갖고 있는 데이터를 부모가 사용하고자 할때
        }
    },
    props:{
        myimage: String,
        filter: String,
    }
    
}
</script>

<style>
.filter-item {
  width: 100px;
  height: 100px;
  margin: 10px 10px 10px auto;
  padding: 8px;
  display: inline-block;
  color : white;
  background-size: cover;
  background-position : center;
}
</style>