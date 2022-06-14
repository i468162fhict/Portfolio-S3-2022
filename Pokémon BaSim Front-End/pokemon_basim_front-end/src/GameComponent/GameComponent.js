import React from "react";
import './Game.css';

class GameComponent extends React.Component {
    constructor(props) {
        super(props);
    }

    render() {
        return (
            <div className="Game-body">
                <div className="Game-game">
                    <div className="Game-area">
                        <div className="Game-visuals">
                            <img className="p1-pokemon" src={process.env.PUBLIC_URL+"Assets/arceus-back.gif"} alt="Arceus-back"/>
                            <img className="p2-pokemon" src={process.env.PUBLIC_URL+"Assets/arceus-front.gif"} alt="Arceus-front"/>
                        </div>
                        <div className="Game-moves">
                            <div className="action-btn atk-btn">Attack</div>
                            <div className="action-btn item-btn">Item</div>
                            <div className="action-btn quit-btn">Quit</div>
                        </div>
                    </div>
                    <div className="Game-log">
                        <div className="log-msg-box">
                            <div>Test</div>
                        </div>
                    </div>
                </div>
            </div>
        )
    }
}

export default GameComponent;