import React from 'react';
import {ComponentPreview, Previews} from '@react-buddy/ide-toolbox';
import {PaletteTree} from './palette';
import App from "../App";
import PokemonService from "../services/PokemonService";

const ComponentPreviews = () => {
    return (
        <Previews palette={<PaletteTree/>}>
            <ComponentPreview path="/App">
                <App/>
            </ComponentPreview>
            <ComponentPreview path="/new">
                <new/>
            </ComponentPreview>
            <ComponentPreview path="/PokemonService">
                <PokemonService/>
            </ComponentPreview>
        </Previews>
    );
};

export default ComponentPreviews;