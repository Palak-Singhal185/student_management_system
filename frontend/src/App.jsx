import { useState } from 'react'
import './App.css'

function App() {
  const [student,setStudent] = useState(null);
  const getStudentData = async () => {
    const response = await fetch('http://localhost:8080/student');
    const data = await response.json();
    setStudent(data);
  }

  return (
    <div>
      <button onClick={getStudentData}> get student data</button> 
      {student && (
        <>
        <h2>{student.id}</h2>
      <p>name: {student.name}</p>
      <p>course: {student.course}</p>
        </> )}
        </div>
        
  )
}

export default App
