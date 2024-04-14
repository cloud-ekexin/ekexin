import axios from 'axios'

const instance = axios.create({
    baseURL: '/api',
    timeout: 60000,
    headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
    }
})

const request = {
    get(url, paramData) {
        return instance.get(url, paramData)
            .then(response => response.data.data);
    },
    post(url, paramData) {
        return instance.post(url, paramData)
            .then(response => response.data.data);
    }
}

export default request;