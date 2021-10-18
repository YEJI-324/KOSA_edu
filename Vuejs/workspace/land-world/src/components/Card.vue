<template>
    <div>
        <div v-for="(room, i) in rooms" :key="i">
            <img :src=room.image>
            <h4 @click="isModalOpen(i)"> {{room.title}}원룸 </h4>
            <p> {{room.price}}만원</p>
            <button @click="countsUp(i)">허위매물신고</button>
            <span>신고수:{{counts[i]}}</span>
        </div>
    </div>
</template>

<script>
    export default {
        name: 'Card',
        props: {
            rooms: Array,
            counts: Array

        },
        methods: {
            countsUp(i) {
                this.$emit("countsUp", i)
            },
            isModalOpen(i){
                this.$emit("isModalSelected",i)
            }
        }

    }
</script>

<style>

</style>