import { useState } from 'react'
import './header.css'

function Header() {
  const [count, setCount] = useState(0)

  return (
    <>
      <head>
        <title>NewTube</title>
      </head>
      <header>
        <h1>NewTube</h1>
      </header>
    </>
  )
}

export default Header
