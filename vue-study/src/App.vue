<template>
  <div class="name">{{ name }}</div>
  <div>{{ greeting("jslim") }}</div>
  <div>{{ greet }}</div>
  
  <button class="btn btn-danger" v-on:click="updateName">Click</button>

</template>



<script>

/* 
Vue.js -> SPA(Single Page Application)
- 반응형 데이터(스크립트에서 데이터 변경 -> template)
- reactive state
- ref(), reactive() : 변수를 선언해야지만 reactive 사용 가능
composition API 사용하는 영역
- setup() 함수정의 (vue3) : 뷰에서 정의되는 변수나 함수들은 리턴을 해줘야 사용할 수 있다.
*/

import {ref} from 'vue';
export default {
  
  setup() {
    // let name = "Hanwha SW Camp 5th";
    let name = ref("Hanwha SW Camp 5th");
    
    const greeting = (name) => {
      return `Hello , ${name.value}`;
    } ;
    const greet = greeting(name);

    const updateName = () =>{
      // window.alert("event click");
      name.value = ".value를 줘야 데이터 변경";
      console.log(name);
    }

    // const greeting = () => {
    //   return "Hello";
    // } ;

    

    


    return {
      name,
      greeting,
      greet,
      updateName
    }
  }
}
</script>

// scoped 현재 파일에서만 적용
<style scoped>
  .name {
    color: red;
  }
</style>