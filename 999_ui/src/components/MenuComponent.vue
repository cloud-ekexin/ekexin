<template>
  <el-menu class="el-menu-vertical-demo"
           :collapse="isCollapse"
           router>
    <el-button @Click="() => { isCollapse=!isCollapse }" :style="{ width: '100%' }">{{ isCollapse ? '>>' : '<<' }}</el-button>
    <el-sub-menu :key="index" :index="index+''" v-for="(menu, index) in menuList">
      <template #title>
        <el-icon>
          <location/>
        </el-icon>
        <span>{{ menu.description }}</span>
      </template>
      <template v-for="subMenu in menu.children">
        <el-menu-item :index="subMenu.url">{{ subMenu.description }}</el-menu-item>
      </template>
    </el-sub-menu>

  </el-menu>
</template>

<script setup lang="ts">
import {ref} from 'vue'
import {
  Location,
} from '@element-plus/icons-vue'

const isCollapse = ref(false)

defineProps<{
  menuList?: [
    {
      description: String,
      url: String,
      children: [
        {
          description: String,
          url: String
        }
      ]
    }
  ]
}>()
</script>

<!-- 样式 -->
<style>
.el-menu-vertical-demo {
  height: 100%;
}
</style>
