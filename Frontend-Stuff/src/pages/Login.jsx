import React, { useState} from 'react';
import { Link } from 'react-router-dom';
import { useStateContext } from '../contexts/ContextProvider';

export default function Login() {
    const { setEmail, setPassword } = useStateContext();
    const [inputEmail, setInputEmail] = React.useState("");
    const [inputPassword, setInputPassword] = React.useState("");
    const setInfo=() => {
        setEmail(inputEmail);
        setPassword(inputPassword);
    }
  return (
    <div className='grid grid-cols-1 sm:grid-cols-2 h-screen w-full'>
        <div className='hidden sm:block'/>

        <div className='bg-gray-800 flex flex-col justify-center'>
            <form className='max-w-[400px] w-full mx-auto rounded-lg bg-gray-900 p-8 px-8'>
                <h2 className='text-4xl dark:text-white font-bold text-center'>SIGN IN</h2>
                <div className='flex flex-col text-gray-400 py-2'>
                    <label>Email</label>
                    <input onChange={e => setInputEmail(e.target.value)} className='rounded-lg bg-gray-700 mt-2 p-2 focus:border-blue-500 focus:bg-gray-800 focus:outline-none' type="email"  required="required" />
                </div>
                <div className='flex flex-col text-gray-400 py-2'>
                    <label>Password</label>
                    <input onChange={e => setInputPassword(e.target.value)} className='p-2 rounded-lg bg-gray-700 mt-2 focus:border-blue-500 focus:bg-gray-800 focus:outline-none' type="password"  required="required" />
                </div>
                <div className='flex justify-between text-gray-400 py-2'>
                    <p className='flex items-center'><input className='mr-2' type="checkbox" /> Remember Me</p>
                    <p>Forgot Password</p>
                </div>
                <button onClick={() => setInfo()} className='w-full my-5 py-2 bg-teal-500 shadow-lg shadow-teal-500/50 hover:shadow-teal-500/40 text-white font-semibold rounded-lg'>
                      <Link to="/dashboard">Log In</Link>
                </button>
                <button className='w-full my-5 py-2 bg-teal-500 shadow-lg shadow-teal-500/50 hover:shadow-teal-500/40 text-white font-semibold rounded-lg'>
                      <Link to="/signin">Sign Up</Link>
                </button>
            </form>
        </div>
    </div>
  )
}