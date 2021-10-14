<template>
  <dir>
    <form v-on:click="submitForm">
      <div>
        <label for="username">ID: </label>
        <input type="text" id="username" v-model="username">
      </div>
       <div>
        <label for="password">PW: </label>
        <input type="password" id="password" v-model="password">
      </div>
      <button type="submit">로그인</button>
    </form>
  </dir>
</template>

<script>
export default {
  data() {
    return {
      username: '',
      password: '',
    };
  },
  methods: {
    submitForm() {
      console.log('submitte')

    },
  },
};
</script>

<style>

</style>