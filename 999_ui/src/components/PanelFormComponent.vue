<template>
  <div class="panel-form-container">
    <div class="panel-form">
      <el-form :inline="true">
        <el-form-item :label="form.label" label-width="100px" v-for="form in formList">
          <el-input v-model="form.value" :placeholder="form.placeholder ?? ''" clearable style="width: 220px"/>
        </el-form-item>
      </el-form>
      <el-button @click="button.method" v-for="button in buttonList">{{button.name}}</el-button>
    </div>
    <div class="panel-form-slot">
      <slot/>
    </div>
  </div>
</template>

<script setup lang="ts">
type Form = {
  label: String,
  type: String,
  value: Object,
  placeholder: String
}

type Button = {
  name: String,
  method: any,
}

interface Props {
  formList: Array<Form>,
  buttonList: Array<Button>
}

withDefaults(defineProps<Props>(), {
  formList: () => [{
    label: '',
    value: {},
    type: '',
    placeholder: ''
  }],
  buttonList: () =>[{
    name: '',
    method: ''
  }]
})
</script>

<style scoped>
.panel-form-container {
  width: 100%;
  height: 100%;
  display: flex;
  flex-direction: column;
}

.panel-form-container .panel-form {
  padding: 10px;
  border-bottom: 1px solid #000;
}

.panel-form-container .panel-form-slot {
  margin: 5px;
  border: 2px solid #969696;
  flex: 1;
}
</style>