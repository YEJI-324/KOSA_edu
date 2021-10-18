<template>
  <div class="black-bg">
        <div class="white-bg">
            <img :src="rooms[roomNo].image" alt="">
            <h4>{{rooms[roomNo].title}}상세페이지</h4>
            <p>{{rooms[roomNo].content}}</p>
            <input @input="$event">
            <p>{{rooms[roomNo].price}} 원</p>
          <button>닫기</button>
        </div>
    </div>
</template>

<script>
export default {
    name: 'Modal',
    props:{
        rooms: Object, // props: { 데이터 이름:자료형}
        roomNo: Number,
    }
}
</script>

<style>
.black-bg {
  width: 100%;
  height: 100%;
  background: rgba(0,0,0,0.5);;
  position: fixed;
  padding: 20px;
  top: 0;
}

.white-bg {
  width: 100%;
  background: rgb(225,225, 225);
  border-radius: 8px;
  padding: 20px;
}
</style>