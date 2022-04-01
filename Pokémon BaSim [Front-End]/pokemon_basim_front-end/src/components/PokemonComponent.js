import React from "react";
import PokemonService from "../services/PokemonService";
import '../CSS/Tables.css'

class PokemonComponent extends React.Component {
    constructor(props) {
        super(props);
        this.state=({ pokemons:[] })
    }

    componentDidMount() {
        PokemonService.getPokemons().then((response) => {
            this.setState({ pokemons: response.data })
        })
    }

    render() {
        return(
            <div className="table-body">
                <h1 className="table-h1 text-center">Pokémon List</h1>
                <table className="table table-stripped">
                    <thead>
                        <tr>
                            <td>Pokémon Id</td>
                            <td>Pokémon Name</td>
                            <td>Pokémon Description</td>
                            <td>Pokémon Health</td>
                            <td>Pokémon Strength</td>
                        </tr>
                    </thead>
                    <tbody>
                        {
                            this.state.pokemons.map(
                                pokemon =>
                                    <tr key={pokemon.id}>
                                        <td>{pokemon.id}</td>
                                        <td>{pokemon.name}</td>
                                        <td>{pokemon.description}</td>
                                        <td>{pokemon.hp}</td>
                                        <td>{pokemon.str}</td>
                                    </tr>
                            )
                        }
                    </tbody>
                </table>
            </div>
        )
    }
}

export default PokemonComponent