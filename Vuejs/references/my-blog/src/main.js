import { createApp } from 'vue'
import App from './App.vue'

import myrouter from './assets/router.js'

// import 'bootstrap'
// import 'bootstrap/dist/css/bootstrap.min.css'

createApp(App).use(myrouter).mount('#app')
