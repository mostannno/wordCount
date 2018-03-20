<template>
  <div class="cell-container-box row">
    <v-touch @panstart="moveStart" @panend="moveOver" @swipeleft="spanDelete" @swiperight="spanAdd" class="textBox">
      <Cell Mtype="1" Mtitle="安徽合肥多个公交站被大雪压垮 致使20多名市民受伤"></Cell>
      <Cell Mtype="2" Mtitle="外卖员给自己的儿子送餐转身落泪，孩子：“很骄傲你是我的父亲"></Cell>
      <Cell Mtype="3" Mtitle="十九大后人事观察系列之八：一日之内四省份省政府“一把手”覆新"></Cell>
    </v-touch>
  </div>
</template>

<script>
  import Cell from './Cell'

  export default {
    name: 'Container',
    props:{
      Mcontent:{
        default:0
      },
      Mscroll:{
        default:0
      }
    },
    components:{Cell},
    methods:{
      spanDelete:function(){
        this.$emit('spanAdd');
      },
      spanAdd:function(){
        this.$emit('spanDelete');
      },
      moveStart:function(){
        this.$emit('stopTimer');
      },
      moveOver:function () {
        this.$emit('startTimer');
      }
    }
  }
</script>

<style>
  .cell-container-box{
    width:100%;
  }
  .textBox{
    background:#fff;
    position:absolute;
    top:120px;
    padding:0 15px 60px;
    overflow: scroll;
  }
</style>
