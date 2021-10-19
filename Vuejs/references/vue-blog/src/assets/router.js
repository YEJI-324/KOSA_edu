// router.js
import { createWebHashHistory, createRouter } from "vue-router";
import List from '../components/List.vue';
import Home from '../components/Home.vue';
import Detail from '../components/Detail.vue';
import Author from '../components/Author.vue';
import Comment from '../components/Comment.vue';


const routes = [
    {
        path: "/detail/:id",  // url의 파라미터 문법 , "/detail/:id/:id2/:id3",
        // path: "/detail/:id(\\d+)",  // 정규식 표현도 가능 - 숫자만~
        // path: "/detail/:id*",   // "/detail/:id/:id2/:id3"  이런형태로 몇번이고 중복가능
        component: Detail,
        // nested routes 만드는법, children:{} 안에 만든다.
        children: [
           {
            path: "author",    // 상대경로
            component: Author
           },
           {
            path: "comment",
            component: Comment
           },
        ]
    },
    {
        path: "/list",     // 순서도 중요!! 순서대로 걸리는걸 먼저 실행한다.
        component: List,
    },
    {
        path: "/",
        component: Home,
    },
    {
        // path: "/:sdifjskdjf",  // 아무거나 치면 이쪽으로 들어온다. 404페이지도 만들수 있다.
        path: "/:anything(.*)",  //모든분자가 들어오면,....  모든 문자라는 정규식문법
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