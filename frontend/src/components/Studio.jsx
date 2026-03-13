import React from 'react';
import './Studio.css'

const Studio = ({studioData}) => {

    const studio_place_key = studioData.place_key;
    const studio_name = studioData.name;

    const moveReservationSite = ()=>{
        const target_url = `https://map.naver.com/p/search/%ED%99%8D%EB%8C%80%20%ED%95%A9%EC%A3%BC%EC%8B%A4
        /place/${studio_place_key}`

        window.open(target_url, '_blank');
    }


    return (
        <div className={"studio-item"} onClick={()=>moveReservationSite()}>
            <h3>{studio_name}</h3>
        </div>
    );
};

export default Studio;