// router.js
import { createWebHashHistory, createRouter } from "vue-router";
import List from '../components/List.vue';
import Home from '../components/Home.vue';


const routes = [
    {
        path: "/list",
        component: List,
    },
    {
        path: "/",
        component: Home,
    }
];

const router = createRouter({
    history: createWebHashHistory(),
    routes,
});

export default router;


// import { createWebHashHistory, createRouter } from "vue-router";

// const routes = [
//     {
//         path: "/경로",
//         component: import 해온 컴포넌트,

//     },

// ];
// const router = createRouter({
//     history: createWebHashHistory(),
//     routes,
// });

// export default router;