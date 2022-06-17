import React, {useState} from "react";
import './Game.css';
import {over} from 'stompjs';
import SockJS from 'sockjs-client';
import Game from "../routes/GameRoute";
import Cookies from "js-cookie";


var stompClient = null;
var Log = [];
var UserData = {
    username: '',
    receivername: '',
    connected: false,
    message: ''
}

class GameComponent extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            ws: null,
        };
    }

    componentDidMount() {
        this.connect();
    }

    connect = () => {
        let Sock = new SockJS('http://localhost:8080/ws');
        stompClient = over(Sock);
        stompClient.connect({}, this.onConnected, this.onError);
    }

    onConnected = () => {
        UserData.connected = true;
        stompClient.subscribe("/log", this.onMessageReceived);
        this.userJoin();
    }

    userJoin = () => {
        var chatMessage = {
            senderName: Cookies.get('JSESSIONID'),
            status:"JOIN"
        };
        stompClient.send("/log", {}, JSON.stringify(chatMessage));
    }

    onMessageReceived = (payload) => {
        var payloadData = JSON.parse(payload.body);
        const menu = document.getElementById('log-msg-box');
        switch(payloadData.status){
            case "JOIN":
                menu.appendChild(this.createDiv(payloadData.senderName + "Joined the game!"));
                break;
            case "MESSAGE":
                console.log(payloadData)
                menu.appendChild(this.createDiv(payloadData.senderName + ": " + payloadData.message));
                Log.push(payloadData);
                break;
            default:
                console.log("error on receiving end")
                break;
        }
    }

    onError = (err) => {
        console.log(err);
    }

    sendValue = (event) => {
        var {value} = event.target;
        if (stompClient) {
            var chatMessage = {
                senderName: "player",
                message: "msg",
                status: "MESSAGE"
            };
            switch(value){
                case "ATTACK":
                    chatMessage = {
                        senderName: Cookies.get('JSESSIONID'),
                        message: "Has used an Attack!",
                        status: "MESSAGE"
                    };
                    break;
                case "ITEM":
                    chatMessage = {
                        senderName: Cookies.get('JSESSIONID'),
                        message: "Has used an Item!",
                        status: "MESSAGE"
                    };
                    break;
                case "QUIT":
                    chatMessage = {
                        senderName: Cookies.get('JSESSIONID'),
                        message: "Has chickened out!",
                        status: "MESSAGE"
                    };
                    break;
                default:
                    break;
            }

            stompClient.send("/log", {}, JSON.stringify(chatMessage));
            UserData.message = "";
        }
    }

    handleUsername = (event) => {
        const {value}=event.target;
        UserData.username =value;
    }

    registerUser=()=>{
        this.connect();
    }

    createDiv(message) {
        let div = document.createElement('div');
        div.innerHTML = (message);
        return div;
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
                            <button className="action-btn atk-btn" value="ATTACK" onClick={this.sendValue}>Attack</button>
                            <button className="action-btn item-btn" value="ITEM" onClick={this.sendValue}>Item</button>
                            <button className="action-btn quit-btn" value="QUIT" onClick={this.sendValue}>Quit</button>
                        </div>
                    </div>
                    <div className="Game-log">
                        <div className="log-msg-box" id="log-msg-box">
                            <div>Game log:</div>
                            <div></div>
                        </div>
                    </div>
                </div>
            </div>
        )
    }
}

export default GameComponent;