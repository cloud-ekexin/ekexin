<template>
  <div class="app-container">
    <div class="app-aside">
      <MenuComponent :menu-list="menuList"/>
    </div>
    <div class="app-right">
      <div class="header">青岛小分号商贸有限公司</div>
      <div class="main">
        <RouterView/>
      </div>
      <div class="footer">青岛小分号商贸有限公司</div>
    </div>
  </div>
</template>

<script setup lang="ts">
import MenuComponent from './components/MenuComponent.vue'
import {RouterView} from 'vue-router'
import request from '@/utils/request.js'
import {ref} from "vue";

const menuList = ref()

const getMenuList = () => {
  request.post('/sysMenu/getSysMenuForShowList', null)
      .then((response: Object) => {
        menuList.value = response
      })
};

getMenuList();
</script>

<style scoped>
.app-container {
  width: 100vw;
  height: 100vh;
  display: flex;
  flex-direction: row;
  place-items: flex-start;
}

.app-container .app-aside {
  height: 100vh;
}

/* 右侧布局 */
.app-right {
  height: 100%;
  display: flex;
  flex-direction: column;
}

.app-right .header {
  width: 100%;
  height: 60px;
  background-color: #ffffff;
}

.app-right .main {
  width: 100%;
  flex: 1;
}

.app-right .footer {
  width: 100%;
  height: 25px;
  text-align: center;
}
</style>
