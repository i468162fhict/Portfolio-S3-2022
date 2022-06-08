import './App.css';
import Game from "./routes/GameRoute";
import Home from "./routes/HomeRoute";
import {
  BrowserRouter as Router,
  Routes,
  Route,
  Link,
} from "react-router-dom";


function App() {
  return (
    <div>
      <div>
          <Routes>
            <Route exact path="/" element={<Home />}/>
            <Route path="/game" element={<Game />}/>
          </Routes>
      </div>
      <div>
          <ul className="App-ul">
            <li className="App-ul-li"><Link to="/" className="App-ul-li-a">Home</Link> </li>
            <li className="App-ul-li"><Link to="/game" className="App-ul-li-a">About</Link> </li>
          </ul>
      </div>
    </div>
  );
}

export default App;
