<template>
  <div id="app" class="container">
    <h1 class="text-center">Todo App</h1>
    <label>
      <input v-model="todoText" type="text" class="w-100 p-2" placeholder="Type Todo"
             @keyup.enter="addTodo"/>
    </label>
    <hr>
    <Todo v-for="todo in todos" :key="todo.id" :todo="todo" @toggle-checkbox="toggleCheckbox"
    @click-delete="deleteTodo"
    ></Todo>
  </div>
</template>
import Todo from '@/components/Todo.vue';

<script>
import Todo from '@/components/Todo.vue';

export default {
  components: {Todo},
  comments: {
    Todo
  },
  data() {
    return {
      todoText: '',
      todos: [
        {id: 1, text: 'buy a car', checked: false},
        {id: 2, text: 'take a shower', checked: false}

      ]
    }
  },
  methods: {
    addTodo(e) {
      this.todos.push({
        id: Math.random(),
        text: e.target.value,
        checked: false
      });
      this.todoText = '';
    },
    toggleCheckbox({id, checked}) {
      const index = this.todos.findIndex(todo => {
        return todo.id === id;
      });
      this.todos[index].checked = checked;
    },
    deleteTodo(id){
    /*  const index = this.todos.findIndex(todo => {
        return todo.id === id;
      });
      this.todos.splice(index,1);*/
      this.todos = this.todos.filter(todo => todo.id !== id);
    }

  }

}
</script>
