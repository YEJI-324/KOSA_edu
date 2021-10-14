<template>
  <dir>
    <form v-on:submit.prevent="submitForm">
      <dir>
        <label for="username">ID: </label>
        <input type="text" id="username" v-model="username" 
          class="username-input"
          v-bind:class="{'error': isError}">
      </dir>
      <dir>
        <label for="password">PW: </label>
        <input type="password" id="password" v-model="password">
      </dir>
      <button v-bind:disabled="!isUserNameValid" type="submit">Log In</button>
      <!-- <p v-if="isError">올바르지 않은 ID 입니다.</p> -->
      <p v-if="!isUserNameValid">아이디가 이메일 형식이 아닙니다.</p>
    </form>    
    <p v-if="isSuccess">로그인 되었습니다.</p>
    <toast-popup 
        v-bind:open="isSuccess"
        v-on:close="isSuccess=false"
      ></toast-popup>
  </dir>
</template>

<script>
import ToastPopup from '@/components/ToastPopup.vue';
// email validation check
function validateEmail(email) {
    const re = /^(([^<>()[\]\\.,;:\s@"]+(\.[^<>()[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
    return re.test(String(email).toLowerCase());
}

export default {
  components: {
    ToastPopup // 내부적으로 스네이크 표기법으로 변환됨. 파스칼, 스네이크 모두 사용 가능
  },
  data() {
    return{
      username: '',
      password: '',
      isError: false,
      isSuccess: false
    };
  },
  computed: {
    isUserNameValid() {
      if (validateEmail(this.username)) {
          this.isError = false;
          return true;
        } else {
          this.isError = true;
          return false;
        }
      // return validateEmail(this.username);
    }
  },
  methods: {
   submitForm() {
    //  submitForm(event){
    //    event.preventDefault();
     console.log('로그인')
    
    //  asios.post()
    //       .then()
    //       .catch( error => {
    //         this.isError=true;
    //       }); // asios는 통신할 때 사용.

    this.isError = false;
    this.initForm();
   },
   initForm() {
     this.username='';
     this.password='';
     this.isSuccess=true;
   }
  },
};
</script>

<style>
  .username-input {
    outline:none;
  }
  .username-input.error {
    border: 1px solid red;
  }
</style>