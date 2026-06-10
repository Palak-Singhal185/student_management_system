import { useState } from 'react'
import './App.css'

function App() {
  const [student,setStudent] = useState([]);
  const getStudentData = async () => {
    const response = await fetch('http://localhost:8080/student');
    const data = await response.json();
    setStudent(data);
  }

  return (
    <div>
      <button onClick={getStudentData}>
        Get Student Data
      </button>

      {student.map((s) => (
        <div key={s.id}>
          <h2>{s.id}</h2>
          <p>Name: {s.name}</p>
          <p>Course: {s.course}</p>
        </div>
      ))}
    </div>
      
  )
}

export default App
