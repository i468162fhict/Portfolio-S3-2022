import axios from 'axios';

const POKEMONS_REST_API_URL = 'http://localhost:8080/api/pokemons';

class PokemonService {
    getPokemons(){
        return axios.get(POKEMONS_REST_API_URL);
    }
}

export default new PokemonService();