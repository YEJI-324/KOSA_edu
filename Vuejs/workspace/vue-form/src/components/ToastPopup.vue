<template>
  <div class="toast" v-bind:class="{'open':open}">Toast Pop Up</div>
</template>

<script>
let timer;

export default {
    props:["open"],
    watch: {
        open(newValue) {
            if(newValue) {
                console.log("toast pop up open");
                // this.$emit('close');
                clearTimeout(timer);
                timer = setTimeout(() => this.$emit('close'), 2000);
            }
        }
    }
}
</script>

<style scoped>
.toast{
    width: 200px;
    height: 40px;
    background-color: black;
    color: white;
    display: flex;
    justify-content: center;
    align-items: center;
    position:fixed;
    bottom: -10%;
    left: 5%;
}
.open{
    bottom: 5%;
    transition: bottom 0.5s linear;
}
</style>