import { BrowserRouter, Routes, Route} from 'react-router-dom'
import './TodoApp.css'
import LoginComponent from './Todo-Components/LoginComponent'
import WelcomeComponent from './Todo-Components/WelcomeComponent'
import ListTodoComponent from './Todo-Components/ListTodoComponent'
import ErrorComponent from './Todo-Components/ErrorComponent'
import LogoutComponent from './Todo-Components/LogoutComponent'
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