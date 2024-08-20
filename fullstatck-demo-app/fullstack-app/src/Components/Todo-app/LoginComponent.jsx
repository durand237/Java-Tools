import { useContext, useState } from 'react'
import {useNavigate} from 'react-router-dom'
import AuthContext from './security/AuthContext'

function LoginComponent() {


    const authContext = useContext(AuthContext)
    console.log(authContext)


    const [succesMsg, setSuccesMsg]=useState(false)
    const [errorMsg, setErrorMsg]=useState(false)
    const [userName, setUserName]=useState("")
    const [password, setPassword] = useState("")
    const navigate = useNavigate()

    function handleUserName(event) {
        setUserName(event.target.value)
    }

    function handlePassword(event) {
        setPassword(event.target.value)
    }

    function SubmitEvent() {

        if (userName=="harold" && password == 1234) {
            setSuccesMsg(true)
            setErrorMsg(false)
            navigate(`/home/${userName}`) // use `` instead of regular ''
        } else {
            setErrorMsg(true)
            setSuccesMsg(false)
            console.warn("hey:" + userName + "  " + password)
        }
        
    }

    /*function UpDateSucces() {
        if(succesMsg) {
            return 
        } else {
            return false
        }
    }

    function UpDateError() {
        if(errorMsg) {
            return 
        } else {
            return false
        }
    }*/

    return(
        <div className="container block-field">

            {succesMsg && <div><h1>hello au was successfull</h1></div>}
            {errorMsg && <div><h1>OOOPs error</h1></div>}
            {/* this could be a solution but the erro and success Message are to samll for a component
            <UpDateError />
            <UpDateSucces />*/}
            {/*<form action="" method="Post" name="form">*/}
                <div className="container">
                    <label className="d-block" htmlFor="login">username</label>
                    <input className="mrg" type="text" id="login" name="login" value={userName} placeholder="enter your username" onChange={handleUserName}/>
                </div>
                <div className="block-field">
                    <label className="d-block" htmlFor="password">password</label>
                    <input className="mrg" type="password" id="password" name="password" value={password} placeholder="enter your password" onChange={handlePassword}/>
                </div>
                <div className="block-field">
                    <input className="mrg btn btn-success" type="submit" onClick={SubmitEvent}/>
                </div>
            {/*</form>*/}
        </div>
        
    )
}


export default LoginComponent;