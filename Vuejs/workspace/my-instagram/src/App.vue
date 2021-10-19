<template>
<div id="app">
  <div class="header">
    <ul class="header-button-left">
      <li>Cancel</li>
    </ul>
    <ul class="header-button-right">
      <li v-if="step==1" @click="step++">Next</li>
      <li v-if="step==2" @click="publish">발행</li>
    </ul>
    <img src="./assets/logo.png" class="logo" />
  </div>

  <h4>반가워요 {{$store.state.name}} {{$store.state.age}}</h4>
  <button @click="$store.commit('namechange')">이름변경</button>
  <button @click="$store.commit('agechange')">나이변경</button>

  <!-- Get 요청: 데이터 서버에서 가져올때
  Post 요청: 서버로 데이터를 보낼때 -->

  <Container :choicefilter="choicefilter" :postdata="postdata" :step="step" :myimage="myimage" @mywrite="mywrite=$event"/>
  <button @click="more">더보기</button>

<!-- 파일 업로드 -->
  <div class="footer">
    <ul class="footer-button-plus">
      <input @change="upload" type="file" id="file" class="inputfile" />
      <label for="file" class="input-plus">+</label>
    </ul>
 </div>

<!-- <div v-if="step == 0">content0</div>
<div v-if="step == 1">content1</div>
<div v-if="step == 2">content2</div>
<button @click="step = 0">button0</button>
<button @click="step = 1">button1</button>
<button @click="step = 2">button2</button> -->

 </div>
</template>

<script>
import postdata from './assets/postdata.js';
import Container from './components/Container.vue';
import axios from 'axios';


export default {
  name: 'App',
  data(){
    return {
      postdata : postdata,
      morecount : 0,
      step:0,
      myimage:'',
      mywrite:'',
      choicefilter:'',
    }
  },
  mounted() {
    this.emitter.on('boxclick', (data) => {
        this.choicefilter=data
        console.log(data)
    })
  },
  methods: {
    more() {

        // axios.post('URL', {name:'doyeon'}).then().catch((err)=>{
        //   err
        // });

          // axios.get('https://raw.githubusercontent.com/ai-edu-pro/busan/main/more1.json')
          //   // .then(function(result){
          //   .then(result=> {
          //      console.log(result.data); 
          //      this.postdata.push(result.data);
          //   })
            // .catch(function(err){
            //   예외(에러)발생하면 처리할 내용
            // })

            axios.get(`https://raw.githubusercontent.com/ai-edu-pro/busan/main/more${this.morecount}.json`)
              .then( result => {
                this.postdata.push(result.data);
                this.morecount++;
              })

      // axios.get('url')
      // .then(function(){
      //   정상처리되면 처리할 내용
      // })
      // .catch(function(){
      //   예외(에러)발생하면 처리할 내용
      // })
    },
    upload(e) {
      let file = e.target.files
      
      let url = URL.createObjectURL(file[0])
      console.log(url)
      this.myimage=url;
      this.step++;
    },
    publish() {
      var myboard = {
          name: "Kim Hyun",
          userImage: "https://placeimg.com/100/100/arch",
          postImage: this.myimage,
          likes: 36,
          date: "May 15",
          liked: false,
          content: this.mywrite,
          filter: this.choicefilter
      }
      // var myboard = {}
      this.postdata.unshift(myboard)
      this.step=0
    }
  },
  components: {
    Container,
  }
}
</script>

<style>
body {
  margin: 0;
}
ul {
  padding: 5px;
  list-style-type: none;
}
.logo {
  width: 22px;
  margin: auto;
  display: block;
  position: absolute;
  left: 0;
  right: 0;
  top: 13px;
}
.header {
  width: 100%;
  height: 40px;
  background-color: white;
  padding-bottom: 8px;
  position: sticky;
  top: 0;
}
.header-button-left {
  color: skyblue;
  float: left;
  width: 50px;
  padding-left: 20px;
  cursor: pointer;
  margin-top: 10px;
}
.header-button-right {
  color: skyblue;
  float: right;
  width: 50px;
  cursor: pointer;
  margin-top: 10px;
}
.footer {
  width: 100%;
  position: sticky;
  bottom: 0;
  padding-bottom: 10px;
  background-color: white;
}
.footer-button-plus {
  width: 80px;
  margin: auto;
  text-align: center;
  cursor: pointer;
  font-size: 24px;
  padding-top: 12px;
}
.sample-box {
  width: 100%;
  height: 600px;
  background-color: bisque;
}
.inputfile {
  display: none;
}
.input-plus {
  cursor: pointer;
}
#app {
  box-sizing: border-box;
  font-family: "consolas";
  margin-top: 60px;
  width: 100%;
  max-width: 460px;
  margin: auto;
  position: relative;
  border-right: 1px solid #eee;
  border-left: 1px solid #eee;
}
</style>
