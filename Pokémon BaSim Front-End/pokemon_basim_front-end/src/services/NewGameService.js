import axios from 'axios';
import Cookies from 'js-cookie';

const GAME_REST_API_URL = 'http://localhost:8080/api/newgame';

class NewGameService {
    createNewGame(){
        return axios.get(GAME_REST_API_URL, { params: { jSessionId: this.getSessionId() } });
    }

    getSessionId(){
        return Cookies.get('JSESSIONID')
    }
}

export default new NewGameService();