import React from "react";
import './NewGame.css'
import NewGameService from "../services/NewGameService";
import PokemonComponent from "../PokemonComponent/PokemonComponent";
import SessionService from "../services/SessionService";

class NewGameComponent extends React.Component {
    constructor(props) {
        super(props);
    }

    newGame() {
        NewGameService.createNewGame().then((response) => {
            console.log(response.data);
        })
    }

    session() {
        SessionService.getSession().then((response) => {
            console.log(response.data);
        })
    }

    render(){
        this.session();
        return(
            <div className="App-Body">
                <div className="App">
                    <header className="App-header">
                        <div className="App-top-text">Pokémon BaSim!</div>
                        <div className="App-bottom-text">The new Pokémon Battle Simulator!</div>
                        <br/>
                        <div>
                            <button className="new-game-button" onClick={this.newGame}>New Game</button>
                            <div className="new-game-error">We had trouble creating a new game</div>
                        </div>
                    </header>
                </div>
                <div className="App">
                    <PokemonComponent />
                </div>
            </div>
        )
    }
}

export default NewGameComponent;