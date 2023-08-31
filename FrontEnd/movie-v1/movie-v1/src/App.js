// import logo from './logo.svg';
// import './App.css';
// import api from './api/axiosConfig.js';
// import { useState,useEffect } from 'react';

// function App() {

//   const [movies, setMovies] = useState();

//   const getMovies = async () => {

//     try{

//       const response = await api.get("/api/v1/movies")
    
//       console.log(response.data);

//       setMovies(response.data);

//     } catch(err) {
      
//       console.log(err);
//     }

//   }

//   useEffect (() => {

//     getMovies();

//   },[])

//   return (
//     <div className="App">
//       <h1>Movies List</h1>
//       <ul>
//         {movies.map(movie => (
//           <li key={movie.id}>{movie.title}</li>
//         ))}
//       </ul>
//     </div>
//   );
// }

// export default App;


import logo from './logo.svg';
import './App.css';
import { useState, useEffect } from 'react';

function App() {
  const [movies, setMovies] = useState([]);

  const getMovies = async () => {
    try {
      const response = await fetch("http://localhost:8080/api/v1/movies");
      if (response.ok) {
        const data = await response.json();
        setMovies(data);
      } else {
        console.error('Failed to fetch movies:', response.status);
      }
    } catch (err) {
      console.error('Error fetching movies:', err);
    }
  };

  useEffect(() => {
    getMovies();
  }, []);

  return (
    <div className="App">
      <h1>Movies List</h1>
      <ul>
        {movies.map(movie => (
          <li key={movie.id}>{movie.title}</li>
        ))}
      </ul>
    </div>
  );
}

export default App;
