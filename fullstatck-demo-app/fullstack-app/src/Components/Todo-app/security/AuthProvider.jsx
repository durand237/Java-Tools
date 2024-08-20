import { useContext, useState } from "react";
import AuthContext from "./AuthContext";



export const useAuth = () => useContext(AuthContext);

export default function AuthProvider({ children }) {
    
    const [myContext, setMyContext] = useState(AuthContext);
    //setNumb(0);

    return(
        <AuthContext.Provider value={{ myContext, setMyContext }}>
            {children}
        </AuthContext.Provider>
    )
}


