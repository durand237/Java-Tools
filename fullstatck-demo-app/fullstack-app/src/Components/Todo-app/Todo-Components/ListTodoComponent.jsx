export default function ListTodoComponent() {

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