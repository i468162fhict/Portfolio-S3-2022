import PokemonComponent from "./PokemonComponent";
import PokemonService from "../services/PokemonService";

it("API Test",async function () {
        const response = PokemonService;
        console.warn( await response.getPokemons());

        expect("hello").toEqual("hello");
})