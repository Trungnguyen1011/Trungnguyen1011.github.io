<template>
  <div id="app">
    <h1>Movie List</h1>
    <MovieList :movies="movies"/> 
  </div>
</template>

<script>

import MovieList from "./components/MovieList.vue";
import axios from "axios";
export default {
  components: {
    MovieList,
  },
  data() {
    return {
      books: [],
      loading: false,
      error: null,
      movies: [],
    };
  },
  methods: {
    async fetchBooks() {
      try {
        this.error = null;
        this.loading = true;
        const url = `http://localhost:8080/api/movies`;
        const response = await axios.get(url);
        this.movies = response.data;
      } catch (err) {
        console.log(err);
      }
      this.loading = false;
    },
  },
  mounted() {
    this.fetchBooks();
  },
};
</script>

<style>
#app {
  font-family: "SF Mono", Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: left;
  color: #2c3e50;
  margin-top: 20px;
}
</style>
