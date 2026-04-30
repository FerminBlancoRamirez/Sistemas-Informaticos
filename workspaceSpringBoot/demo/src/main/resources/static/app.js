async function cargarUsuarios(){
    //Javascript vanilla(locuuuuuuraaaaaaa)
    //react, vue, ....
    //obtenemos los usuarios en modo json
    const response= await fetch("http://localhost:8080");//GET
    const usuario= await response.json()
    usuario.forEach(usuario=>{
        //Creo un div nuevo y lo creo dentro del div usuarios
        const card=document.createElement("div")
    })
}