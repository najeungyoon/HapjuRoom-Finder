import React from 'react';
import './Studio.css'

const Studio = (params) => {

    return (
        <div className={"studio-item"}>
            <h1>{params.studioData.name}</h1>
            <p>{params.studioData.placeKey}</p>
        </div>
    );
};

export default Studio;