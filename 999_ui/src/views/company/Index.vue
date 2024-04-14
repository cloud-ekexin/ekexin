<template>
  <PanelFormComponent :form-list="formList as []" :button-list="buttonList">
    <PanelTableComponent :column-list="columnList as []" :table-data="tableData"/>
  </PanelFormComponent>
</template>

<script setup lang="ts">
import PanelFormComponent from "@/components/PanelFormComponent.vue";
import PanelTableComponent from "@/components/PanelTableComponent.vue";
import request from "@/utils/request.js";
import {ref} from "vue";
import {keysOf} from "element-plus/es/utils";

const formList = ref([
  {
    name: 'codeLike',
    label: '公司编号',
    type: 'input',
    value: '',
    placeholder: '请输入公司编号'
  },
  {
    name: 'nameLike',
    label: '公司名称',
    type: 'input',
    value: '',
    placeholder: '请输入公司名称'
  },
  {
    name: 'companyType',
    label: '公司类型',
    type: 'input',
    value: '',
    placeholder: '请输入公司类型'
  },
  {
    name: 'addressLike',
    label: '公司地址',
    type: 'input',
    value: '',
    placeholder: '请输入公司地址'
  },
  {
    name: 'linkManLike',
    label: '联系人',
    type: 'input',
    value: '',
    placeholder: '请输入联系人'
  },
  {
    name: 'linkManPhone',
    label: '联系人电话',
    type: 'input',
    value: '',
    placeholder: '请输入联系人电话'
  }
])

const columnList = ref([
  {
    prop: 'code',
    label: '公司编号',
  },
  {
    prop: 'name',
    label: '公司名称',
  },
  {
    prop: 'companyTypeName',
    label: '公司类型',
  },
  {
    prop: 'address',
    label: '公司地址',
  },
  {
    prop: 'linkMan',
    label: '联系人',
  },
  {
    prop: 'linkManPhone',
    label: '联系人电话',
  }
])

const tableData = ref()

const formData = ref({})

const getTableData = (param: Object) => {
  request.post("/invCompany/getPagedInvCompany", param ?? {})
      .then((response: { recordList: Object }) => tableData.value = response.recordList)
}

getTableData({});

const buttonList = ref([
  {
    name: '查询',
    method: () => {
      formList.value.forEach((form: { name: string, value: any }) => {
        const key = form.name;
        formData.value[key] = form.value
      })
      console.log(formData.value)
      getTableData(formData.value)
    }
  }
])
</script>

<style scoped>

</style>