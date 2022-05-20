import logo from './logo.svg';
import './App.css';
import PokemonComponent from "./components/PokemonComponent";

function App() {
  return (
    <div>
      <div>
        <ul className="App-ul">
          <li className="App-ul-li"><a className="App-ul-li-a" href="">Home</a> </li>
          <li className="App-ul-li"><a className="App-ul-li-a" href="">About</a> </li>
        </ul>
      </div>
        <div className="App-Body">
          <div className="App">
            <PokemonComponent />
          </div>
          <div className="App">
            <header className="App-header">
              <img src={logo} className="App-logo" alt="logo" />
              <p>
                Edit <code>src/App.js</code> and save to reload.
              </p>
              <a
                className="App-link"
                href="https://reactjs.org"
                target="_blank"
                rel="noopener noreferrer"
              >
                Learn React
              </a>
            </header>
          </div>
        </div>
    </div>
  );
}

export default App;
