<template>
  <nav class="navbar navbar-expand-lg navbar-light bg-light">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">VueBlog</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="#">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Features</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Pricing</a>
        </li>
        <li class="nav-item">
          <a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">Disabled</a>
        </li>
      </ul>
    </div>
  </div>
</nav>

<!-- <Home /> -->

<router-link to="/">HomePage</router-link>
<router-link to="/list">List Page</router-link>

<!-- 라우터로 설정한 컴포넌트를 보여줄 자리 -->
<div class="mt-4">
  <router-view :blog="blog"></router-view>
</div>
<!-- <List :blog="blog"/> -->
<!-- http://localhost:8080/#/list -->

</template>

<script>

// import List from './components/List.vue'
// import Home from './components/Home.vue'
import blog from './assets/blog.js'

export default {
  name: 'App',
  data(){
    return{
      blog: blog,

    }
  },
  components: {
    // List, 
    // Home,
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}
</style>
