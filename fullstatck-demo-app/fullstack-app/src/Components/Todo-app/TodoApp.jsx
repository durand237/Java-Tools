import { BrowserRouter, Routes, Route, useParams, Link} from 'react-router-dom'
import './TodoApp.css'
import LoginComponent from './LoginComponent'
import AuthProvider from './security/AuthProvider'

export default function TodoApp() {
    return (
        <div>
            <AuthProvider>
                <h1>Welcome to todo</h1>
            
                <BrowserRouter>
                    <Routes>
                        <Route path='/' element={<LoginComponent />}></Route>
                        <Route path='/login' element={<LoginComponent />}></Route>
                        <Route path='/logout' element={<LogoutComponent/>}></Route>
                        <Route path='/home/:username' element={<WelcomeComponent/>}></Route>
                        <Route path='/list' element={<ListTodoComponent/>}></Route>


                        <Route path='*' element={<ErrorComponent/>}></Route>
                    </Routes>
                </BrowserRouter>
            </AuthProvider>
            {/*<LogoutComponent />
            <WelcomeComponent/>*/}
        </div>
    )
}


/*
each component should always be in its own component
*/

function WelcomeComponent() {

    const {username} = useParams() // use to catch url parmeters can also be access as array with the singleKots

    return(
    
        <div>
            welcome To the home {username} - <Link to="/list">go to todo list</Link>
        </div>
    )
}



function LogoutComponent() {
    return(
        <>
            <hr/>
            <br/>
            Logout Component
        </>
    )
}

function ErrorComponent() {
    return (
        <>
            <h1>Sorry we arre working very Hard </h1>
            <h1>404</h1>
        </>
    )
}

function ListTodoComponent() {

    const today = new Date()
    const targetDate =new Date(today.getFullYear(), today.getMonth(), today.getDay())
    

    const list = [{id: 1, description: "Learn React", targetDates: targetDate},
        {id: 2, description: "Learn React     ", targetDates: targetDate},
        {id: 3, description: "Learn AWS     ", targetDates: targetDate},
        {id: 4, description: "Learn NodJs     ", targetDates: targetDate}

    ]
    //console.log(list)
    return (
        <div className="m-r-l">
            <h1>list of ToDo</h1>
            <div>
                <table className="table">
                    <thead>
                        <tr>
                            <td>ID</td>
                            <td>DESCRIPTION</td>
                            <td>DATE</td>
                        </tr>
                    </thead>
                    <tbody>
                        {
                            list.map(element => (
                                <tr key={element.id}>
                                    <td>{element.id}</td>
                                    <td>{element.description}</td>
                                    <td>{element.targetDates.toDateString()}</td>
                                </tr>
                            )) 
                        }
                        
                    </tbody>

                </table>
            </div>
        </div>
    )
}
