import React, {useEffect, useState} from 'react';
import './Studio.css'
import Studio from "./Studio.jsx";

const StudioList = () => {

    const [studios, setStudios] = useState([]);

    useEffect(() => {
        const fetchData = async ()=>{
            const response = await fetch('http://localhost:8080/studio/findAll')
            const studiosData = await response.json();
            setStudios(studiosData);
        }
        fetchData();
    }, []);

    return (
        <div className="studio-container">
            <h2>홍대 합주실 리스트</h2>
            {studios.map((studio)=>{
                return <Studio key={studio.id} studioData ={studio}></Studio>
            })}
        </div>
    );
};

export default StudioList;