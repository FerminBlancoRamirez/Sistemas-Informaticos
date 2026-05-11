async function cargarUsuarios(){
    //Javascript vanilla(locuuuuuuraaaaaaa)
    //react, vue, ....
    //obtenemos los usuarios en modo json
    //Codigo imperativo: mal!!!!!, mejor usar codigo reactivo
    const response= await fetch("http://localhost:8080/users");//GET 1s
    const usuario= await response.json()
    const contenedor=document.getElementById("usuarios")
    contenedor.innerHTML=""

    usuario.forEach(Usuario=>{
        //Creo un div nuevo y lo creo dentro del div usuarios
        const card=document.createElement("div")
        card.className="usuario_card"
        //Meto dentro del div con id= usuarios
        contenedor.appendChild(card)
        card.innerHTML= `
            <div>${Usuario.name}</div>
            <div>${Usuario.email}</div>
        `
    })
}