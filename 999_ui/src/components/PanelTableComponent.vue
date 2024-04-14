<template>
  <div class="panel-component">
    <div class="panel-table">
      <el-table :data="tableData"
                highlight-current-row
                border
                fit
                show-overflow-tooltip>
        <el-table-column :fixed="column.fixed ?? false" :prop="column.prop" :label="column.label" :width="column.width ?? 200" v-for="column in columnList"/>
      </el-table>
    </div>
    <div class="panel-pagination">
      <el-pagination v-model:current-page="currentPage"
                     v-model:page-size="pageSize"
                     :page-sizes="[10, 50, 100]"
                     layout="total, sizes, prev, pager, next, jumper"
                     :total="400"
                     @size-change="handleSizeChange"
                     @current-change="handleCurrentChange"/>
    </div>
  </div>
</template>

<script setup lang="ts">
import {ref} from "vue";

type Column = {
  fixed: String,
  prop: String,
  label: String,
  width: Number
}

interface Props {
  columnList: Array<Column>,
  tableData: Array<Object>,
}

withDefaults(defineProps<Props>(), {
  columnList: () => [{
    fixed: 'false',
    prop: '',
    label: '',
    width: 220
  }],
  tableData: () => [{}]
})

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
.panel-component {
  width: 100%;
  height: 100%;
  display: flex;
  flex-direction: column;
  flex: 1;
}

.panel-table {
  width: 100%;
  flex: 1;
}

.panel-pagination {
  width: 100%;
  height: 40px;
  display: inline-block;
}

.panel-pagination .el-pagination {
  float: right;
}
</style>
