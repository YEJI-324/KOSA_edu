<template>
    <div>
        <!-- {{rooms}} -->
    
        <img :src="rooms.image" alt="">
        <h4 @click="$emit('openModal', rooms.id)">{{rooms.title}} 원룸</h4>
        <p>{{rooms.price}} 원</p>
        
    </div>
</template>

<script>
export default {
    name: 'Card',
    props: {
        rooms:Object,
        roomNo:Number,
    }
}
</script>

<style>

</style>