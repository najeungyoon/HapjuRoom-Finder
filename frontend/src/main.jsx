import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import './index.css'
import StudioList from "./components/StudioList.jsx";

createRoot(document.getElementById('root')).render(
    <StudioList></StudioList>
)
