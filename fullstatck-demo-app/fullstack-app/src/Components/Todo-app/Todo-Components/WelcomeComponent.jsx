import axios from 'axios'
import { useParams, Link} from 'react-router-dom'

export default function WelcomeComponent() {

    const {username} = useParams() // use to catch url parmeters can also be access as array with the singleKots

    function callHelloWorldRestApi() {

        console.log('called')

        axios.get('http://localhost:8084/welcome')
        .then((response)=> successfullResponse(response))
        .catch((error) => errorresponse(error))
        .finally(()=>console.log('cleanup'))
    }

    function successfullResponse(response) {
        console.log(response)
    }

    function errorresponse(error) {
        console.warn(error)
    }

    return(
    
        <div>
            <div>welcome To the home {username} - <Link to="/list">go to todo list</Link></div>
            <div className="btn btn-success" onClick={callHelloWorldRestApi}> api call</div>
        </div>
    )
}