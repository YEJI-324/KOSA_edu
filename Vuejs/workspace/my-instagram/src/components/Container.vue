<template>
<div>
  <div v-if="step==0">      <!--postdata[i] -->
    <Post :postdata="p" v-for="(p, i) in postdata" :key="i"/>
   <!-- <Post :postdata="postdata[1]" />
   <Post :postdata="postdata[2]" /> -->
  </div> 

  <!-- 필터선택페이지 -->
  <div v-if="step == 1">
    <div :class="choicefilter" class="upload-image" :style="`background-image:url(${myimage})`"></div>
    <div class="filters">

        <FilterBox v-for="filter in filters" :key="filter" :filter="filter" :myimage="myimage" >
            <div class="text">{{filter}}</div> 
        </FilterBox>
      
    </div>
  </div>

<div v-if="step==2">
    <div :class="choicefilter" class="upload-image" :style="`background-image:url(${myimage})`"></div>
    <div class="write">
      <textarea @input="$emit('mywrite', $event.target.value)" class="write-box">글쓰는곳입니다.!!!</textarea>
    </div>
</div>

  </div>
</template>

<script>
import Post from "./Post.vue";
import FilterBox from "./FilterBox.vue";

export default {
  name: "Cotainer",
  data(){
      return{
          filters :[ "aden", "_1977", "brannan", "brooklyn", "clarendon", "earlybird", "gingham", "hudson", 
                "inkwell", "kelvin", "lark", "lofi", "maven", "mayfair", "moon", "nashville", "perpetua", 
                "reyes", "rise", "slumber", "stinson", "toaster", "valencia", "walden", "willow", "xpro2"]
      }
  },
  props: {
    postdata: Array,
    step: Number,
    myimage: String,
    choicefilter: String,
  },
  components: {
    Post,FilterBox,
  },
};
</script>

<style>
.upload-image{
width: 100%;
height: 450px;
background: cornflowerblue;
background-size : cover;
}
.filters{
overflow-x:scroll;
white-space: nowrap;
}
.filter-1 {
width: 100px;
height: 100px;
background-color: cornflowerblue;
margin: 10px 10px 10px auto;
padding: 8px;
display: inline-block;
color : white;
background-size: cover;
}
.filters::-webkit-scrollbar {
height: 5px;
}
.filters::-webkit-scrollbar-track {
background: #f1f1f1; 
}
.filters::-webkit-scrollbar-thumb {
background: #888; 
border-radius: 5px;
}
.filters::-webkit-scrollbar-thumb:hover {
background: #555; 
}
.write-box {
border: none;
width: 90%;
height: 100px;
padding: 15px;
margin: auto;
display: block;
outline: none;
}
</style>