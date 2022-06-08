import axios from 'axios';

const SESSION_REST_API_URL = 'http://localhost:8080/api/createSession';

class SessionService {
    getSession(){
        return axios.get(SESSION_REST_API_URL);
    }
}

export default new SessionService();