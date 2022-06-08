import React from "react";
import './Game.css';

class GameComponent extends React.Component {
    constructor(props) {
        super(props);
    }

    render() {
        return (
            <div className="Game-body">
                <div className="App">
                    <div className="App-top-text">Game Page</div>
                </div>
                <div className="Game-game">
                    <div className="Game-visuals">

                    </div>
                    <div className="Game-moves">

                    </div>
                    <div className="Game-log">

                    </div>
                </div>
            </div>
        )
    }
}

export default GameComponent;