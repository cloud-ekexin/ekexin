<template>
    <el-pagination v-model:current-page="currentPage"
                   v-model:page-size="pageSize"
                   :page-sizes="[10, 50, 100]"
                   layout="total, sizes, prev, pager, next, jumper"
                   :total="400"
                   @size-change="handleSizeChange"
                   @current-change="handleCurrentChange"
    />
</template>

<script setup lang="ts">
import {ref} from "vue";

const currentPage = ref(1)
const pageSize = ref(10)

const handleSizeChange = (val: number) => {
  console.log(`${val} items per page`)
}
const handleCurrentChange = (val: number) => {
  console.log(`current page: ${val}`)
}
</script>

<style scoped>

</style>