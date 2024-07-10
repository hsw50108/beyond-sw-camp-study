<template>
  <form>
    <div className="d-flex">
      <div className="flex-grow-1 mr-2">
        <input type="text"
               className="form-control"
               placeholder="new work...">
      </div>
      <div>
        <button className="btn btn-primary" type="submit">ADD</button>
      </div>
    </div>
    <!-- v-show 널값입력시 메시지 출력 -->
    <div className="error">
      This Field can not be empty
    </div>
  </form>
</template>
<script>
export default {}
</script>
<style>
</style>