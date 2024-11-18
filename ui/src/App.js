import React, { useState } from 'react';
import axios from 'axios';

function App() {
    const getPlantByIdRequest = (id) => {
        return {
            id: id
        };
    };

    const [response, setResponse] = useState(null);

    axios.get('http://localhost:8080/api/getById', {params : getPlantByIdRequest(2)})
        .then((res) => {setResponse(res.data);})
        .catch(() => {console.log("failure")});

    return (
        <div>
            <h1>Response:</h1>
            {response ? <pre>{JSON.stringify(response, null, 2)}</pre> : 'No response yet'}
        </div>
        );
}



export default App;