<template>
  <div id="app">
    <Todo />
    <footer class="info">
      <p>Based on Vue Todo Project <a href="https://vuejs.org/v2/examples/todomvc.html">here</a></p>
    </footer>
  </div>
</template>

<script>
  import Todo from './components/Todo'
  // app Vue instance
  const app = {
    name: 'app',
    components: {
      Todo
    },
    // app initial state
    data: () => {
      return {
      }
    }
  }

  export default app
</script>

<style>
  [v-cloak] { display: none; }
</style>
