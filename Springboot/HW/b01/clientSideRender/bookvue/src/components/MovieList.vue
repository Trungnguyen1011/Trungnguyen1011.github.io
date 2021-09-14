<template>
  <ul id="array-rendering">
    <li v-for="(movie, index) in movies" :key="index" :movie="movie">
      {{
        movie.title +
        " : " +
        movie.director +
        " : " +
        movie.publishedYear
      }}
    </li>
 
  </ul>
</template>

<script>
export default {
  props: {
    movies: {
      type: Array,
      required: true,
    },
  },
};
</script>

<style scoped>
a {
  color: #42b983;
}
li {
  list-style-type: decimal ;
}
</style>
